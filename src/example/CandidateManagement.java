package example;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class CandidateManagement {
    private static final Scanner INPUT = new Scanner(System.in);
    private List<Candidate> candidates;

    public CandidateManagement() {
        candidates = new ArrayList<>();
    }

    public List<Candidate> getCandidates() {
        return candidates;
    }

    public void setCandidates(List<Candidate> candidates) {
        this.candidates = candidates;
    }

    public Candidate enterCandidate(){
        String id;
        do {
            System.out.print("Enter candidate' ID: ");
            id = INPUT.next();
            INPUT.nextLine();
            if(id.trim().isEmpty()){
                System.out.println("Please enter candidate' name!");
            }
        }while(id.trim().isEmpty());

        String firstname;
        do {
            System.out.print("Enter candidate's firstname: ");
            firstname = INPUT.next();
            INPUT.nextLine();
            if(firstname.trim().isEmpty()){
                System.out.println("Please enter candidate's firstname!");
            }
        }while(firstname.trim().isEmpty());

        String lastname;
        do {
            System.out.print("Enter candidate's lastname: ");
            lastname = INPUT.next();
            INPUT.nextLine();
            if(lastname.trim().isEmpty()){
                System.out.println("Please enter candidate's lastname!");
            }
        }while(lastname.trim().isEmpty());

        String dob;
        do {
            System.out.print("Enter candidate's dob: ");
            dob = INPUT.next();
            INPUT.nextLine();
            if(!dob.matches("\\d{2}\\d{2}\\d{4}")){
                System.out.println("Please enter correct dob format!");
            }
        }while(!dob.matches("\\d{2}\\d{2}\\d{4}"));

        String address;
        do {
            System.out.print("Enter candidate's address: ");
            address = INPUT.nextLine();
            if(address.trim().isEmpty()){
                System.out.println("Please enter candidate's address!");
            }
        }while(address.trim().isEmpty());

        String phone;
        do {
            try {
                System.out.print("Enter candidate's phone: ");
                phone = INPUT.next();
                INPUT.nextLine();
            }
            catch (Exception e){
                phone = "";
                INPUT.nextLine();
                System.out.println("phone is wrong!");
            }
            if(!phone.matches("\\d{10}")){
                System.out.println("phone must have 10 digits!");
            }
        }while(!phone.matches("\\d{10}"));

        String email;
        do {
            System.out.print("Enter candidate's email: ");
            email = INPUT.next();
            INPUT.nextLine();
            if(!email.matches("^[a-zA-Z0-9._-]+@[a-zA-Z0-9.-]+\\.[a-zA-Z]{2,4}$")){
                System.out.println("Please enter correect email format!");
            }
        }while (!email.matches("^[a-zA-Z0-9._-]+@[a-zA-Z0-9.-]+\\.[a-zA-Z]{2,4}$"));

        return new Candidate(id, firstname, lastname, dob, address, phone, email, 0);
    }

    public void addExperiencedCandidate(){
        do {
            Candidate candidate = enterCandidate();
            boolean found = false;
            if(!candidates.isEmpty()){
                for(Candidate c : candidates){
                    if(c.getId().equalsIgnoreCase(candidate.getId())){
                        System.out.println("Candidate is existed!");
                        found = true;
                        break;
                    }
                }
            }
            if(found){
                continue;
            }
            ExperiencedCandidate experiencedCandidate = (ExperiencedCandidate) candidate;
            experiencedCandidate.setRange(1);
            int expInYear;
            do {
                try {
                    System.out.print("Enter candidate's experience of year: ");
                    expInYear = INPUT.nextInt();
                    INPUT.nextLine();
                }
                catch (Exception e){
                    INPUT.nextLine();
                    expInYear = 0;
                    System.out.println("Candidate's experience of year is not correct format!");
                }
                if(expInYear <= 0){
                    System.out.println("Candidate's experience of year must be a positive digit!");
                }
            }while (expInYear <= 0);

            String proSkill;
            do {
                System.out.print("Enter candidate's professional skill: ");
                proSkill = INPUT.nextLine();
                if(proSkill.trim().isEmpty()){
                    System.out.println("Please enter candidate's professional skill!");
                }
            }while (proSkill.trim().isEmpty());
            experiencedCandidate.setExpInYear(expInYear);
            experiencedCandidate.setProSkill(proSkill);
            candidates.add(experiencedCandidate);

            String choose;
            do {
                System.out.print("Do you want to continue? (y/n): ");
                choose = INPUT.next();
                INPUT.nextLine();
                if(!choose.equalsIgnoreCase("y") && !choose.equalsIgnoreCase("n")){
                    System.out.println("Please choose y or n!");
                }
            }while (!choose.equalsIgnoreCase("y") && !choose.equalsIgnoreCase("n"));
            if (choose.equalsIgnoreCase("n")){
                break;
            }
        }while(true);
    }

    public void addFresherCandidate(){
        do {
            Candidate candidate = enterCandidate();
            boolean found = false;
            if(!candidates.isEmpty()){
                for(Candidate c : candidates){
                    if(c.getId().equalsIgnoreCase(candidate.getId())){
                        System.out.println("Candidate is existed!");
                        found = true;
                        break;
                    }
                }
            }
            if(found){
                continue;
            }
            FresherCandidate fresherCandidate = (FresherCandidate) candidate;
            fresherCandidate.setRange(2);
            String graduationDate;
            do {
                System.out.print("Enter candidate's graduation date: ");
                graduationDate = INPUT.next();
                INPUT.nextLine();
                if(!graduationDate.matches("\\d{2}\\d{2}\\d{4}")){
                    System.out.println("Please correctly enter candidate's graduation date!");
                }
            }while (!graduationDate.matches("\\d{2}\\d{2}\\d{4}"));
            String graduationRank;
            do {
                System.out.print("Enter candidate's graduation rank: ");
                graduationRank = INPUT.next();
                INPUT.nextLine();
                if(!graduationRank.equalsIgnoreCase("Excellent") && !graduationRank.equalsIgnoreCase("Good")
                && !graduationRank.equalsIgnoreCase("Average") && !graduationRank.equalsIgnoreCase("Poor")){
                    System.out.println("Please correctly enter candidate's graduation rank!");
                }
            }while (!graduationRank.equalsIgnoreCase("Excellent") && !graduationRank.equalsIgnoreCase("Good")
                    && !graduationRank.equalsIgnoreCase("Average") && !graduationRank.equalsIgnoreCase("Poor"));

            String education;
            do {
                System.out.print("Enter candidate's education: ");
                education = INPUT.nextLine();
                if(education.trim().isEmpty()){
                    System.out.println("Please enter candidate's education!");
                }
            }while (education.trim().isEmpty());
            fresherCandidate.setGraduation_date(graduationDate);
            fresherCandidate.setGraduation_rank(graduationRank);
            fresherCandidate.setEducation(education);
            candidates.add(fresherCandidate);

            String choose;
            do {
                System.out.print("Do you want to continue? (y/n): ");
                choose = INPUT.next();
                INPUT.nextLine();
                if(!choose.equalsIgnoreCase("y") && !choose.equalsIgnoreCase("n")){
                    System.out.println("Please choose y or n!");
                }
            }while (!choose.equalsIgnoreCase("y") && !choose.equalsIgnoreCase("n"));
            if (choose.equalsIgnoreCase("n")){
                break;
            }
        }while(true);
    }

    public void addInternCandidate(){
        do {
            Candidate candidate = enterCandidate();
            boolean found = false;
            if(!candidates.isEmpty()){
                for(Candidate c : candidates){
                    if(c.getId().equalsIgnoreCase(candidate.getId())){
                        System.out.println("Candidate is existed!");
                        found = true;
                        break;
                    }
                }
            }
            if(found){
                continue;
            }
            InternCandidate internCandidate = (InternCandidate) candidate;
            internCandidate.setRange(3);
            String major;
            do {
                System.out.print("Enter candidate's major: ");
                major = INPUT.nextLine();
                if(major.trim().isEmpty()){
                    System.out.println("Please enter candidate's major!");
                }
            }while (major.trim().isEmpty());

            int term;
            do {
                try {
                    System.out.print("Enter candidate's term: ");
                    term = INPUT.nextInt();
                    INPUT.nextLine();
                }
                catch (Exception e){
                    INPUT.nextLine();
                    term = 0;
                    System.out.println("Candidate's term is not correct format!");
                }
                if(term <= 0){
                    System.out.println("Candidate's term must be a positive digit!");
                }
            }while (term <= 0);

            String universityName;
            do {
                System.out.print("Enter candidate's university name: ");
                universityName = INPUT.nextLine();
                if(universityName.trim().isEmpty()){
                    System.out.println("Please enter university name!");
                }
            }while (universityName.trim().isEmpty());

            internCandidate.setMajor(major);
            internCandidate.setTerm(term);
            internCandidate.setUniversityName(universityName);
            candidates.add(internCandidate);

            String choose;
            do {
                System.out.print("Do you want to continue? (y/n): ");
                choose = INPUT.next();
                INPUT.nextLine();
                if(!choose.equalsIgnoreCase("y") && !choose.equalsIgnoreCase("n")){
                    System.out.println("Please choose y or n!");
                }
            }while (!choose.equalsIgnoreCase("y") && !choose.equalsIgnoreCase("n"));
            if (choose.equalsIgnoreCase("n")){
                break;
            }
        }while (true);
    }
}