import java.util.*;

class AthleteInfo {
    private String name;
    private double currentWeight;
    private double competitionWeight;
    private String t_Plan;
    private int numOfComs;
    private int coachingHrs;

    public AthleteInfo(String name, double currentWeight, double competitionWeight, String t_Plan, int numOfComs, int coachingHrs) {
        this.name = name;
        this.currentWeight = currentWeight;
        this.competitionWeight = competitionWeight;
        this.t_Plan = t_Plan;
        this.numOfComs = numOfComs;
        this.coachingHrs = coachingHrs;
    }
    

    public String getName() {
        return name;
    }

    public double getCurrentWeight() {
        return currentWeight;
    }

    public double getCompetitionWeight() {
        return competitionWeight;
    }

    public String getT_Plan() {
        return t_Plan;
    }

    public int getNumOfComs() {
        return numOfComs;
    }

    public int getCoachingHrs() {
        return coachingHrs;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setCurrentWeight(double currentWeight) {
        this.currentWeight = currentWeight;
    }

    public void setCompetitionWeight(double competitionWeight) {
        this.competitionWeight = competitionWeight;
    }

    public void setT_Plan(String t_Plan) {
        this.t_Plan = t_Plan;
    }

    public void setNumOfComs(int numOfComs) {
        this.numOfComs = numOfComs;
    }

    public void setCoachingHrs(int coachingHrs) {
        this.coachingHrs = coachingHrs;
    }

}

public class NSD {
    public static void main(String[] args) {
        // creating ArrayList to hold User objects
        ArrayList<AthleteInfo> athletes = new ArrayList<AthleteInfo>();

        // adding users to the ArrayList
        // Adding users to the ArrayList
        athletes.add(new AthleteInfo("Eaint Thiri Mon", 70.8, 80.9, "Beginner", 1, 2));
        athletes.add(new AthleteInfo("John Doe", 80.5, 75.3, "Intermediate", 1, 4));
        athletes.add(new AthleteInfo("Alice Smith", 65.2, 70.7, "Elite", 2, 5));
        athletes.add(new AthleteInfo("Michael Johnson", 90.3, 85.8, "Beginner", 2, 3));
        athletes.add(new AthleteInfo("Emily Brown", 55.9, 60.2, "Intermediate", 4, 5));
        athletes.add(new AthleteInfo("David Wilson", 75.4, 70.9, "Elite", 3, 2));


        // Using Scanner to get user input
        Scanner scanner = new Scanner(System.in);
        System.out.println("What is your name?");
        String inputName = scanner.nextLine();

        // Displaying the details of the user whose name matches the input
        boolean found = false;
        for (AthleteInfo athleteInfo : athletes) {
            if (athleteInfo.getName().equals(inputName)) {
                System.out.println("Name: " + athleteInfo.getName());
                System.out.println("Current Weight: " + athleteInfo.getCurrentWeight());
                System.out.println("Competition Weight: " + athleteInfo.getCompetitionWeight());
                System.out.println("Training Plan: " + athleteInfo.getT_Plan());
                System.out.println("Number of Competitions: " + athleteInfo.getNumOfComs());
                System.out.println("Coaching Hours: " + athleteInfo.getCoachingHrs());
                found = true;
                break;
            }
        }
        if (!found) {
            System.out.println("User not found. Please try again.");
        }
    }
}
