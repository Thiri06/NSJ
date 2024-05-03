import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner scan = new Scanner(System.in);

        System.out.println("Welcome to the North Sussux Judo!!!\nYou can choose the three levels: beginner, intemediate, elite.\nAnd we will calculate the training fees based on your choice. ");
        System.out.println("----------------------------------------------");
        System.out.println("Please choose the training plan:");
        
        String athleteChoice = scan.nextLine();
        if (athleteChoice == "Beginner") {
            System.out.println("----------------------------------------------");
            System.out.println("You have chosen the Beginner level and the cost is $40.");
            
        }else if (athleteChoice == "Intermediate") {
            System.out.println("----------------------------------------------");
            System.out.println("You have chosen the Intermediate level and the cost is &60.");
            
        }else{
            System.out.println("----------------------------------------------");
            System.out.println("You have chosen the Elite level and the cost is $80.");
        }

        System.out.println("----------------------------------------------");

        System.out.println("Do you want to get private coaching sessions?");
        String userAns = scan.nextLine();
        if (userAns.equals("Yes")){
            System.out.println("You can receive maximum 5 hours of private coaching in a week.\n1 hour = $9.00 \nHow many hours do you want to get? \n1 hour or 2 hours or 3 hours or 4 hours or 5 hours");
            String ans = scan.nextLine();

            switch (ans) {
                case "1 hour":
                    System.out.println("Your total fee is $9.00");
                    break;
                case "2 hours":
                    System.out.println("Your total fee is $18.00");
                    break;
                case "3 hours":
                    System.out.println("Your total fee is $27.00");
                    break;
                case "4 hours":
                    System.out.println("Your total fee is $36.00");
                    break;
                case "5 hours":
                    System.out.println("Your total fee is $45.00");
                    break;
                default:
                    System.out.println("You can't choose more than 5 hours");
                    break;
            }

        }else{
            System.out.println("Thank you for using North Sussux Judo. Goodbye!");
        }

        scan.close();

    }
    
}
