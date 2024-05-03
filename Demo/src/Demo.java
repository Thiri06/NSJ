import java.util.Scanner;

public class Demo {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Enter your name: ");
        String name = scan.nextLine();

        System.out.println("Enter your age: ");
        int age = scan.nextInt();

        System.out.println("Enter your wage per hour: ");
        double wage = scan.nextDouble();
        double dailyWage = wage * 8;
        double yearlyWage = dailyWage * 12;

        System.out.println("===============================");
        System.out.println("Your name is "+ name);
        System.out.println("Your age is "+ age);
        System.out.println("Your wage per hour is "+ wage);
        System.out.println("Your daily wage is "+ dailyWage);
        System.out.println("Your yearly salary is "+ yearlyWage);

        scan.close();

    }

}

// import java.util.*;

// public class North {
//     public static void main(String[] args) {

//         Scanner scan = new Scanner(System.in);

//         // table for training plan and fees
//         String[][] tableData = new String[5][2];

//         tableData[0][0] = "Beginner (2 sessions per week)-weekly fee";
//         tableData[0][1] = "$25.00";
//         tableData[1][0] = "Intermediate (3 sessions per week)-weekly fee";
//         tableData[1][1] = "$30.00";
//         tableData[2][0] = "Elite (5 sessions per week)-weekly fee";
//         tableData[2][1] = "$35.00";
//         tableData[3][0] = "Private tuition-per hour";
//         tableData[3][1] = "$9.00";
//         tableData[4][0] = "Competition entry fee-per competition";
//         tableData[4][1] = "$22.00";

//         // Welcoming message is here.....
//         System.out.println("Welcome to the North Sussux Judo!!!");
//         System.out.println("You can choose the desired training plan from below \"Training Plan Table\" ");

//         // Training plan table output
//         System.out.println("Training Plan Table:");
//         System.out.println("-----------------------------------------------------------------------------");
//         System.out.printf("| %-50s | %-20s |\n", "Training Plan", "Prices ($USD)");
//         System.out.println("-----------------------------------------------------------------------------");
//         for (int i = 0; i < tableData.length; i++) {
//             System.out.printf("| %-50s | %-20s |\n", tableData[i][0], tableData[i][1]);
//         }
//         System.out.println("-----------------------------------------------------------------------------");

//         // Table for weight categories
//         String[][] weightData = new String[7][2];
//         weightData[0][0] = "Categories";
//         weightData[0][1] = "Upper Weight Limit (Kg)";
//         weightData[1][0] = "Heavyweight";
//         weightData[1][1] = "Unlimited (over 100)";
//         weightData[2][0] = "Light-Heavyweight";
//         weightData[2][1] = "100";
//         weightData[3][0] = "Middleweight";
//         weightData[3][1] = "90";
//         weightData[4][0] = "Light-Middleweight";
//         weightData[4][1] = "81";
//         weightData[5][0] = "Lightweight";
//         weightData[5][1] = "73";
//         weightData[6][0] = "Flyweight";
//         weightData[6][1] = "66";

//         // weight categories table output
//         System.out.println("Weight Categories Table:");
//         System.out.println("---------------------------------------------------------");
//         System.out.printf("| %-25s | %-25s |\n", "Weight Categories", "Kilogram");
//         System.out.println("---------------------------------------------------------");
//         for (int i = 0; i < weightData.length; i++) {
//             System.out.printf("| %-25s | %-25s |\n", weightData[i][0], weightData[i][1]);
//         }
//         System.out.println("---------------------------------------------------------");

//         // Additional information goes here
//         System.out.println("Additional Rules:");
//         System.out.println("1. Athletes can receive a maximum of five hours private coaching a week.");
//         System.out.println("2. Only Intermediate and Elite athletes can enter competitions.");
//         System.out.println("3. Competitions are held on the second Saturday of each month.");

//         // Athlete Name
//         System.out.println("Enter your name: ");
//         String name = scan.nextLine();
//         System.out.println("Hello, " + name + "!");

//         // Training plan
//         // System.out.println("What kind of training paln do you want from our Judo's
//         // training plans?");
//         // System.out.println("Enter your training plan: ");
//         // String trainingPlan = scan.nextLine();
//         // if (trainingPlan.equalsIgnoreCase("Beginner")) {
//         // System.out.println("You have chosen the Beginner level and the cost is
//         // $25.00");
//         // } else if (trainingPlan.equalsIgnoreCase("Intermediate")) {
//         // System.out.println("You have chosen the Intermediate level and the cost is
//         // $30.00");
//         // } else {
//         // System.out.println("You have chosen the Elite level and the cost is $35.00");
//         // }

//         // Current Weight
//         System.out.println("Enter your weight in kilograms: ");
//         int currentWeight = scan.nextInt();
//         System.out.println("Enter your competition weight in kilograms: ");
//         int competitionWeight = scan.nextInt();

//         if (currentWeight > competitionWeight) {
//             System.out.println("Your current weight is higher than your competition weight.");
//         } else if (currentWeight < competitionWeight) {
//             System.out.println("Your current weight is lower than your competition weight.");
//         } else {
//             System.out.println("Your current weight is the same as your competition weight.");
//         }

//         // Display weight category based on input kilograms
//         System.out.printf("Based on our Judo's weight categories table,");
//         if (competitionWeight > 100) {
//             System.out.println(" You are under Heavyweight category.");
//         } else if (competitionWeight <= 100 && competitionWeight > 90) {
//             System.out.println(" You are under Light-Heavyweight category.");
//         } else if (competitionWeight <= 90 && competitionWeight > 81) {
//             System.out.println(" You are under Middleweight category.");
//         } else if (competitionWeight <= 81 && competitionWeight > 73) {
//             System.out.println(" You are under Light-Middleweight category.");
//         } else if (competitionWeight <= 73) {
//             System.out.println(" You are under Lightweight category.");
//         } else {
//             System.out.println(" You are under Flyweight category.");
//         }

//         // Training Plan
//         System.out.println("What kind of training paln do you want from our Judo's training plans?");
//         System.out.println("Enter your training plan: ");
//         scan.nextLine();
//         String trainingPlan = scan.nextLine().trim();

//         if (trainingPlan.equalsIgnoreCase("Beginner")) {
//             System.out.println("You have chosen the Beginner level and the cost is $25.00");
//             System.out.println("According to our rules, beginners can't enter competition.");
//         } else if (trainingPlan.equalsIgnoreCase("Intermediate") || trainingPlan.equalsIgnoreCase("Elite")) {
//             System.out.println("You have chosen the " + trainingPlan + " level and the cost is $"
//                     + (trainingPlan.equalsIgnoreCase("Intermediate") ? "30.00" : "35.00"));
//             System.out.println("You are eligible to enter the competitions.");

//             // Number of competitions entered
//             System.out.println("Do you want to enter the competitions held by our North Sussex Judo?(Yes/No)");
//             String athleteChoice = scan.nextLine();
//             if (athleteChoice.equalsIgnoreCase("Yes")) {
//                 System.out.println("How many competitions do you want to enter? (1, 2, 3)");
//                 int numOfComs = scan.nextInt();

//                 if (numOfComs <= 3) {
//                     double entryFee = numOfComs * 22.00;
//                     System.out.println(
//                             "You have entered " + numOfComs + " competition(s) and the cost is $" + entryFee + ".");
//                 } else {
//                     System.out.println("You can enter maximum 3 competitions.");
//                 }
//             } else {
//                 System.out.println("User did not enter any competition.");
//             }
//         } else {
//             System.out.println("Invalid training plan choice.");
//         }

//         // Private Coaching
//         System.out.println("Do you want to get private coaching sessions?(Yes/No)");

//         String userAns = scan.nextLine();

//         if (userAns.equalsIgnoreCase("Yes")) {
//             System.out.println("You can receive maximum 5 hours of private coaching in a week.");
//             System.out.println("1 hour = $9.00");
//             System.out.println("How many hours do you want to get? (1, 2, 3, 4, 5)");
//             int hours = scan.nextInt();
//             if (hours <= 5) {
//                 double pVCost = hours * 9.00;
//                 System.out.println("Your private coaching fee for" + " " + hours + "hour" + " " + "is $" + pVCost);
//             } else {
//                 System.out.println("You can't receive more than 5 hours of private coaching in a week.");
//             }

//         } else {
//             System.out.println("No private coaching sesions selected.");
//         }

//         scan.close();

//         // Main method ends
//     }

// }
