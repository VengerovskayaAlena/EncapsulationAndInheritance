public class Puffinduy extends Hogwarts{

    private int hardworking;

    private int loyal;

    private int honest;

    public Puffinduy(String fistName, String lastName, int spellPower, int transgressionDistance, int hardworking, int loyal, int honest) {
        super(fistName, lastName, spellPower, transgressionDistance);
        this.hardworking = hardworking;
        this.loyal = loyal;
        this.honest = honest;
    }

    public int getHardworking() {
        return hardworking;
    }

    public void setHardworking(int hardworking) {
        this.hardworking = hardworking;
    }

    public int getLoyal() {
        return loyal;
    }

    public void setLoyal(int loyal) {
        this.loyal = loyal;
    }

    public int getHonest() {
        return honest;
    }

    public void setHonest(int honest) {
        this.honest = honest;
    }

    @Override
    public String toString() {
        return "Puffinduy{" +
                "fistName='" + getFistName()+ '\'' +
                ", lastName='" + getLastName() + '\'' +
                ", spellPower=" + getSpellPower() +
                ", transgressionDistance=" + getTransgressionDistance() +
                "hardworking=" + hardworking +
                ", loyal=" + loyal +
                ", honest=" + honest +
                '}';
    }

    private int magicSkill(){
        return hardworking + loyal + honest;
    }

    public static void studentComparison(Puffinduy studentOne, Puffinduy studentTwo){
        if (studentOne.magicSkill()>studentTwo.magicSkill()){
            System.out.println(studentOne + "обладает большей мощностью магии, чем " + studentTwo);
        } else if (studentOne.magicSkill()<studentTwo.magicSkill()) {
            System.out.println(studentTwo + "обладает большей мощностью магии, чем " + studentOne);
        } else {
            System.out.println("Студенты по силе равны");
        }
    }
}
