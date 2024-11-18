public class Gryffindor extends Hogwarts {

    private int nobility;

    private int honor;

    private int courage;

    public Gryffindor(String fistName, String lastName, int spellPower, int transgressionDistance, int nobility, int honor, int courage) {
        super(fistName, lastName, spellPower, transgressionDistance);
        this.nobility = nobility;
        this.honor = honor;
        this.courage = courage;
    }

    public int getNobility() {
        return nobility;
    }

    public void setNobility(int nobility) {
        this.nobility = nobility;
    }

    public int getHonor() {
        return honor;
    }

    public void setHonor(int honor) {
        this.honor = honor;
    }

    public int getCourage() {
        return courage;
    }

    public void setCourage(int courage) {
        this.courage = courage;
    }

    @Override
    public String toString() {
        return "Gryffindor{" +
                "fistName='" + getFistName()+ '\'' +
                ", lastName='" + getLastName() + '\'' +
                ", spellPower=" + getSpellPower() +
                ", transgressionDistance=" + getTransgressionDistance() +
                "nobility=" + nobility +
                ", honor=" + honor +
                ", courage=" + courage +
                '}';
    }

     private int magicSkill(){
        return nobility + honor + courage;
    }

    public static void studentComparison(Gryffindor studentOne, Gryffindor studentTwo){
        if (studentOne.magicSkill()>studentTwo.magicSkill()){
            System.out.println(studentOne + "обладает большей мощностью магии, чем " + studentTwo);
        } else if (studentOne.magicSkill()<studentTwo.magicSkill()) {
            System.out.println(studentTwo + "обладает большей мощностью магии, чем " + studentOne);
        } else {
            System.out.println("Студенты по силе равны");
        }
    }
}
