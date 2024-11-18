public class Kogtevran extends Hogwarts{

    private int smart;

    private int wise;

    private int witty;

    private int fullOfCreativity;

    public Kogtevran(String fistName, String lastName, int spellPower, int transgressionDistance, int smart, int wise, int witty, int fullOfCreativity) {
        super(fistName, lastName, spellPower, transgressionDistance);
        this.smart = smart;
        this.wise = wise;
        this.witty = witty;
        this.fullOfCreativity = fullOfCreativity;
    }

    public int getSmart() {
        return smart;
    }

    public void setSmart(int smart) {
        this.smart = smart;
    }

    public int getWise() {
        return wise;
    }

    public void setWise(int wise) {
        this.wise = wise;
    }

    public int getWitty() {
        return witty;
    }

    public void setWitty(int witty) {
        this.witty = witty;
    }

    public int getFullOfCreativity() {
        return fullOfCreativity;
    }

    public void setFullOfCreativity(int fullOfCreativity) {
        this.fullOfCreativity = fullOfCreativity;
    }

    @Override
    public String toString() {
        return "Kogtevran{" +
                "fistName='" + getFistName()+ '\'' +
                ", lastName='" + getLastName() + '\'' +
                ", spellPower=" + getSpellPower() +
                ", transgressionDistance=" + getTransgressionDistance() +
                "smart=" + smart +
                ", wise=" + wise +
                ", witty=" + witty +
                ", fullOfCreativity=" + fullOfCreativity +
                '}';
    }

    private int magicSkill(){
        return smart + wise + witty + fullOfCreativity;
    }

    public static void studentComparison(Kogtevran studentOne, Kogtevran studentTwo){
        if (studentOne.magicSkill()>studentTwo.magicSkill()){
            System.out.println(studentOne + "обладает большей мощностью магии, чем " + studentTwo);
        } else if (studentOne.magicSkill()<studentTwo.magicSkill()) {
            System.out.println(studentTwo + "обладает большей мощностью магии, чем " + studentOne);
        } else {
            System.out.println("Студенты по силе равны");
        }
    }
}
