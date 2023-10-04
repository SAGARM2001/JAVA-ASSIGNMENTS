package ass12;
interface Printable {
    void printDetails();
}

class CktPlayer implements Printable {
    private String name;
    private int runs;

    public CktPlayer(String name, int runs) {
        this.name = name;
        this.runs = runs;
    }

    public void printDetails() {
        System.out.println("Cricket Player: " + name);
        System.out.println("Runs Scored: " + runs);
    }
}

class FtPlayer implements Printable {
    private String name;
    private int goals;

    public FtPlayer(String name, int goals) {
        this.name = name;
        this.goals = goals;
    }

    public void printDetails() {
        System.out.println("Football Player: " + name);
        System.out.println("Goals Scored: " + goals);
    }
}

// Main class to demonstrate usage
public class interfacer {
    public static void main(String[] args) {
        CktPlayer cktPlayer = new CktPlayer("Sachin", 18426);
        FtPlayer ftPlayer = new FtPlayer("Ronaldo", 780);

        cktPlayer.printDetails();
        ftPlayer.printDetails();
    }
}
