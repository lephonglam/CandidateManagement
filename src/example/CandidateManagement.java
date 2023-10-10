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
}
