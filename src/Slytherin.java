public class Slytherin extends Hogwarts{

    private int cunning;

    private int determination;

    private int ambition;

    private int resourcefulness;

    private int lustForPower;

    public Slytherin(String fistName, String lastName, int spellPower, int transgressionDistance, int cunning, int determination, int ambition, int resourcefulness, int lustForPower) {
        super(fistName, lastName, spellPower, transgressionDistance);
        this.cunning = cunning;
        this.determination = determination;
        this.ambition = ambition;
        this.resourcefulness = resourcefulness;
        this.lustForPower = lustForPower;
    }

    public int getCunning() {
        return cunning;
    }

    public void setCunning(int cunning) {
        this.cunning = cunning;
    }

    public int getDetermination() {
        return determination;
    }

    public void setDetermination(int determination) {
        this.determination = determination;
    }

    public int getAmbition() {
        return ambition;
    }

    public void setAmbition(int ambition) {
        this.ambition = ambition;
    }

    public int getResourcefulness() {
        return resourcefulness;
    }

    public void setResourcefulness(int resourcefulness) {
        this.resourcefulness = resourcefulness;
    }

    public int getLustForPower() {
        return lustForPower;
    }

    public void setLustForPower(int lustForPower) {
        this.lustForPower = lustForPower;
    }

    @Override
    public String toString() {
        return "Slytherin{" +
                "fistName='" + getFistName()+ '\'' +
                ", lastName='" + getLastName() + '\'' +
                ", spellPower=" + getSpellPower() +
                ", transgressionDistance=" + getTransgressionDistance() +
                "cunning=" + cunning +
                ", determination=" + determination +
                ", ambition=" + ambition +
                ", resourcefulness=" + resourcefulness +
                ", lustForPower=" + lustForPower +
                '}';
    }

    private int magicSkill(){
        return cunning + determination + ambition + resourcefulness + lustForPower;
    }

    public static void studentComparison(Slytherin studentOne, Slytherin studentTwo){
        if (studentOne.magicSkill()>studentTwo.magicSkill()){
            System.out.println(studentOne + "обладает большей мощностью магии, чем " + studentTwo);
        } else if (studentOne.magicSkill()<studentTwo.magicSkill()) {
            System.out.println(studentTwo + "обладает большей мощностью магии, чем " + studentOne);
        } else {
            System.out.println("Студенты по силе равны");
        }
    }
}
