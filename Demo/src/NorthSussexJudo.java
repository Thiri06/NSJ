

import java.util.Scanner;

class AthleteInfo {
    private String athleteName;
    private int currentWeight;
    private int competitionWeight;

    // Getters
    public String getAthleteName() {
        return athleteName;
    }

    public int getCurrentWeight() {
        return currentWeight;
    }

    public int getCompetitionWeight() {
        return competitionWeight;
    }

    // Setters
    public void setAthleteName(String athleteName) {
        this.athleteName = athleteName;
    }

    public void setCurrentWeight(int currentWeight) {
        this.currentWeight = currentWeight;
    }

    public void setCompetitionWeight(int competitionWeight) {
        this.competitionWeight = competitionWeight;
    }

}

public class NorthSussexJudo {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        String trainingPlan = "";
        String athleteChoice = "";
        int numOfComs = 0;
        int coachingHours = 0;

        System.out.println("Welcome to the North Sussux Judo!!!");

        // Check if the user is a new user
        System.out.println("Are you a new user? (Yes/No)");
        String isNewUser = scan.nextLine();
        System.out.println("---------------------------------------------------------");

        if (isNewUser.equalsIgnoreCase("Yes")) {
            // Information display
            System.out.println(
                    "Do you want to look our training plan table, weight category table, and additional information? (Yes/No)");
            String infoDisplay = scan.nextLine();
            System.out.println("---------------------------------------------------------");

            if (infoDisplay.equalsIgnoreCase("Yes")) {
                // table for training plan and fees
                displayinformationTables();
            }
        } else {
            // Display already registered information
            checkOldAthlete();
            registerMore(args);

        }

        // Access from AthleteInfo class
        AthleteInfo info = new AthleteInfo();

        // Athlete information

        System.out.println("Enter your name: ");
        info.setAthleteName(scan.nextLine());
        System.out.println("---------------------------------------------------------");

        System.out.println("Enter your current weight in kilogram: ");
        info.setCurrentWeight(scan.nextInt());
        System.out.println("---------------------------------------------------------");

        System.out.println("Enter your competition weight in kilogram: ");
        info.setCompetitionWeight(scan.nextInt());
        System.out.println("---------------------------------------------------------");

        // Training Plan
        System.out.println(
                "What kind of training paln do you want from our Judo's training plans?\n-Beginner\n-Intermediate\n-Elite");
        System.out.println("Enter your training plan: ");
        scan.nextLine();

        trainingPlan = scan.nextLine().trim(); // input here training plan

        System.out.println("---------------------------------------------------------");

        // competitions entered
        if (trainingPlan.equalsIgnoreCase("Intermediate") || trainingPlan.equalsIgnoreCase("Elite")) {
            System.out.println("You are eligible to enter the competitions.");
            System.out.println("Do you want to enter the competitions held by our North Sussex Judo?(Yes/No)");
            
            athleteChoice = scan.nextLine(); //input here enterCompetition

            System.out.println("---------------------------------------------------------");
            if (athleteChoice.equalsIgnoreCase("Yes")) {
                System.out.println("How many competitions do you want to enter? (1, 2, 3)");
                
                numOfComs = scan.nextInt();  //input here numOfComs

                System.out.println("---------------------------------------------------------");
            }
        }

        // Private Coaching
        System.out.println("Do you want to get private coaching sessions?(Yes/No)");
        scan.nextLine();

        String userAns = scan.nextLine();  //input here getCoaching

        if (userAns.equalsIgnoreCase("Yes")) {
            System.out.println("---------------------------------------------------------");
            System.out.println("How many hours do you want to get? (1, 2, 3, 4, 5)");
            coachingHours = scan.nextInt();
        }

        // Display output after all inputs are gathered
        System.out.println("---------------------------------------------------------");
        System.out.println("Your new registered information:");
        System.out.println("---------------------------------------------------------");
        System.out.println("Athlete name: " + info.getAthleteName());
        System.out.println("Your current weight: " + info.getCurrentWeight() + " kg");
        System.out.println("Your competition weight: " + info.getCompetitionWeight() + " kg");

        // Compare Weight
        if (info.getCurrentWeight() > info.getCompetitionWeight()) {
            System.out.println("Your current weight is higher than your competition weight.");
        } else if (info.getCurrentWeight() < info.getCompetitionWeight()) {
            System.out.println("Your current weight is lower than your competition weight.");
        } else {
            System.out.println("Your current weight is the same as your competition weight.");
        }

        System.out.printf("Based on our Judo's weight categories table,");
        if (info.getCompetitionWeight() > 100) {
            System.out.println(" You are under Heavyweight category.");
        } else if (info.getCompetitionWeight() <= 100 && info.getCompetitionWeight() > 90) {
            System.out.println(" You are under Light-Heavyweight category.");
        } else if (info.getCompetitionWeight() <= 90 && info.getCompetitionWeight() > 81) {
            System.out.println(" You are under Middleweight category.");
        } else if (info.getCompetitionWeight() <= 81 && info.getCompetitionWeight() > 73) {
            System.out.println(" You are under Light-Middleweight category.");
        } else if (info.getCompetitionWeight() <= 73) {
            System.out.println(" You are under Lightweight category.");
        } else {
            System.out.println(" You are under Flyweight category.");
        }

        // Training Plan
        System.out.println("Training plan: " + trainingPlan); //change here
        if (!athleteChoice.isEmpty()) {
            System.out.println("Competitions entered: " + (athleteChoice.equalsIgnoreCase("Yes") ? numOfComs : "None"));  //change here
        } else {
            System.out.println("Competitions entered: None"); //change here
        }
        if (coachingHours > 0) {
            System.out.println("Private coaching hours: " + coachingHours + " hour(s)");  //change here
        } else {
            System.out.println("Private coaching hours: None"); 
        }

        // Calculate and display total cost
        double totalCost = calculateTotalCost(trainingPlan, athleteChoice, numOfComs, coachingHours); //change here
        System.out.println("Total cost: $" + totalCost);
        System.out.println("---------------------------------------------------------");

        // Ask if user wants to register more
        registerMore(args);
        scan.close();

    } // main method ends here

    // display method
    public static void displayinformationTables() {
        // Training plan table
        String[][] tableData = new String[5][2];

        tableData[0][0] = "Beginner (2 sessions per week)-weekly fee";
        tableData[0][1] = "$25.00";
        tableData[1][0] = "Intermediate (3 sessions per week)-weekly fee";
        tableData[1][1] = "$30.00";
        tableData[2][0] = "Elite (5 sessions per week)-weekly fee";
        tableData[2][1] = "$35.00";
        tableData[3][0] = "Private tuition-per hour";
        tableData[3][1] = "$9.00";
        tableData[4][0] = "Competition entry fee-per competition";
        tableData[4][1] = "$22.00";

        // Welcoming message is here.....
        System.out.println("You can choose the desired training plan from below \"Training Plan Table\" ");

        // Training plan table output
        System.out.println("Training Plan Table:");
        System.out.println("-----------------------------------------------------------------------------");
        System.out.printf("| %-50s | %-20s |\n", "Training Plan", "Prices ($USD)");
        System.out.println("-----------------------------------------------------------------------------");
        for (int i = 0; i < tableData.length; i++) {
            System.out.printf("| %-50s | %-20s |\n", tableData[i][0], tableData[i][1]);
        }
        System.out.println("-----------------------------------------------------------------------------");

        // Table for weight categories
        String[][] weightData = new String[7][2];
        weightData[0][0] = "Categories";
        weightData[0][1] = "Upper Weight Limit (Kg)";
        weightData[1][0] = "Heavyweight";
        weightData[1][1] = "Unlimited (over 100)";
        weightData[2][0] = "Light-Heavyweight";
        weightData[2][1] = "100";
        weightData[3][0] = "Middleweight";
        weightData[3][1] = "90";
        weightData[4][0] = "Light-Middleweight";
        weightData[4][1] = "81";
        weightData[5][0] = "Lightweight";
        weightData[5][1] = "73";
        weightData[6][0] = "Flyweight";
        weightData[6][1] = "66";

        // weight categories table output
        System.out.println("Weight Categories Table:");
        System.out.println("---------------------------------------------------------");
        System.out.printf("| %-25s | %-25s |\n", "Weight Categories", "Kilogram");
        System.out.println("---------------------------------------------------------");
        for (int i = 0; i < weightData.length; i++) {
            System.out.printf("| %-25s | %-25s |\n", weightData[i][0], weightData[i][1]);
        }
        System.out.println("---------------------------------------------------------");

        // Additional information goes here
        System.out.println("Additional Rules:");
        System.out.println("1. Athletes can receive a maximum of five hours private coaching a week.");
        System.out.println("2. Only Intermediate and Elite athletes can enter competitions.");
        System.out.println("3. Competitions are held on the second Saturday of each month.");
    }

    // Method to display old athlete information
    static void checkOldAthlete() {
        Scanner sc = new Scanner(System.in);
        System.out.println("What is your registered name?");
        String oldAthleteName = sc.nextLine();
        System.out.println("---------------------------------------------------------");
        System.out.println("Your registered information is here:");
        System.out.println("---------------------------------------------------------");
        if (oldAthleteName.length() < 5) {
            System.out.println("Your registered name: " + oldAthleteName
                    + " \nCurrent Weight: 75 \nCompetition Weight: 80 \nYour current weight is lower than your competition weight. \nTraining Plan: Beginner \n"
                    + //
                    "Competitions entered: None \nPrivate Coaching: None \nFees: $25.00");
            System.out.println("---------------------------------------------------------");

        } else {
            System.out.println("Your registered name: " + oldAthleteName
                    + " \nCurrent Weight: 99 \nCompetition Weight: 77 \nYour current weight is higher than your competition weight. \nTraining Plan: Intermediate \n"
                    + //
                    "Competitions entered: 2 \nPrivate Coaching: 3 hours \nFees: $101.00");
            System.out.println("---------------------------------------------------------");
        }
    }

    // Method to register more
    static void registerMore(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Do you want to register more? (Yes/No)");
        String registerMore = sc.nextLine();
        if (registerMore.equalsIgnoreCase("Yes")) {
            main(args); // Recursively call main method to start registration again
        } else {
            System.out.println("Goodbye!");
            System.exit(0);
        }
    }

    // Method to calculate total cost
    private static double calculateTotalCost(String trainingPlan, String athleteChoice, int numOfComs,
            int coachingHours) {
        double trainingPlanCost = 0;
        double competitionCost = 0;
        double coachingCost = 0;

        // Calculate training plan cost
        if (trainingPlan.equalsIgnoreCase("Beginner")) {
            trainingPlanCost = 25.00;
        } else if (trainingPlan.equalsIgnoreCase("Intermediate")) {
            trainingPlanCost = 30.00;
        } else {
            trainingPlanCost = 35.00;
        }

        // Calculate competition cost
        if (athleteChoice.equalsIgnoreCase("Yes")) {
            competitionCost = numOfComs * 22.00;
        } else {
            competitionCost = 0;
        }

        // Calculate coaching cost
        if (coachingHours > 0) {
            coachingCost = coachingHours * 9.00;
        } else {
            coachingCost = 0;
        }

        // Calculate total cost
        return trainingPlanCost + competitionCost + coachingCost;
    }

}
