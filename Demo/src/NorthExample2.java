import java.util.Scanner;

class AthleteInfo{
    private String athleteName;
    private String trainingPlan;
    private String currentWeight;
    private String competitionWeight;
    private String numOfComs;
    private boolean addPVCoaching;
    private int pVCoachingHrs;

    // Constructor with parameters and Scanner
    public AthleteInfo(Scanner scanner) {
        System.out.print("Enter athlete's name: ");
        this.athleteName = scanner.nextLine();

        System.out.print("Enter athlete's training plan: ");
        this.trainingPlan = scanner.nextLine();

        System.out.print("Enter athlete's current weight: ");
        this.currentWeight = scanner.nextLine();

        System.out.print("Enter athlete's competition weight: ");
        this.competitionWeight = scanner.nextLine();

        System.out.print("Enter athlete's number of competitions: ");
        this.numOfComs = scanner.nextLine();

        System.out.print("Does athlete want to add PV coaching? (Yes/No): ");
        String addpVCoachinghrs = scanner.nextLine();

        if(addpVCoachinghrs.equalsIgnoreCase("Yes")){
            this.addPVCoaching = true;
            System.out.println("Choose private coaching hours (1 hour, 2 hours, 3 hours, 4 hours, 5 hours)");
            String userInput = scanner.nextLine();
        } else {
            this.addPVCoaching = false;
        }
        
    }

    private int parseHours(String hrsInput) {
        switch (hrsInput.toLowerCase()) {
            case "1 hour":
            case "2 hours":
            case "3 hours":
            case "4 hours":
            case "5 hours":
                return Integer.parseInt(hrsInput.split(" ")[0]);
            default:
                System.out.println("Invalid input. Defaulting to 1 hour.");
                return 1;
        }
    }

    public String calculateFee() {
        double feePerHour = 9.00;
        double totalFee = feePerHour * pVCoachingHrs;
        return String.format("Your total fee for %d hours of private coaching is $%.2f", pVCoachingHrs, totalFee);
    }

        // Getter methods

        public String getAthleteName() {
            return athleteName;
        }
    
        public String getTrainingPlan() {
            return trainingPlan;
        }
    
        public String getCurrentWeight() {
            return currentWeight;
        }
    
        public String getCompetitionWeight() {
            return competitionWeight;
        }
    
        public String getNumOfComs() {
            return numOfComs;
        }
    
        public boolean isAddPVCoaching() {
            return addPVCoaching;
        }
        public int getpVCoachingHrs() {
            return pVCoachingHrs;
        }
    
    
        
}

public class NorthExample2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        AthleteInfo athleteInfo = new AthleteInfo(scanner);

        // Example of using the retrieved information
        System.out.println("Athlete Name: " + athleteInfo.getAthleteName());
        System.out.println("Training Plan: " + athleteInfo.getTrainingPlan());
        System.out.println("Current Weight: " + athleteInfo.getCurrentWeight());
        System.out.println("Competition Weight: " + athleteInfo.getCompetitionWeight());
        System.out.println("Number of Competitions: " + athleteInfo.getNumOfComs());
        System.out.println("Add PV Coaching: " + athleteInfo.isAddPVCoaching());
        if (athleteInfo.isAddPVCoaching()) {
            System.out.println("Private Coaching Hours: " + athleteInfo.getpVCoachingHrs());
            
        }
        // Close the scanner to release resources
        scanner.close();
    }

}
