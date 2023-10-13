package example;

public class Main {
    public static void main(String[] args) {
        CandidateManagement candidateManagement = new CandidateManagement();
        candidateManagement.addExperiencedCandidate();
        candidateManagement.addFresherCandidate();
        candidateManagement.addInternCandidate();
        System.out.println("==========Experienced Candidate==========");
        for(Candidate candidate : candidateManagement.getCandidates()){
            if(candidate instanceof ExperiencedCandidate){
                System.out.println(candidate);
            }
        }
        System.out.println("==========Fresher Candidate==========");
        for(Candidate candidate : candidateManagement.getCandidates()){
            if(candidate instanceof FresherCandidate){
                System.out.println(candidate);
            }
        }
        System.out.println("==========Intern Candidate==========");
        for(Candidate candidate : candidateManagement.getCandidates()){
            if(candidate instanceof InternCandidate){
                System.out.println(candidate);
            }
        }
    }
}