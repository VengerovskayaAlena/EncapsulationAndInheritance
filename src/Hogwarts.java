import java.util.Objects;

public class Hogwarts {

    private final String fistName;

    private final String lastName;

    private int spellPower;

    private int transgressionDistance;

    public Hogwarts(String fistName, String lastName, int spellPower, int transgressionDistance) {
        this.fistName = fistName;
        this.lastName = lastName;
        this.spellPower = spellPower;
        this.transgressionDistance = transgressionDistance;
    }

    public String getFistName() {
        return fistName;
    }

    public String getLastName() {
        return lastName;
    }

    public int getSpellPower() {
        return spellPower;
    }

    public void setSpellPower(int spellPower) {
        this.spellPower = spellPower;
    }

    public int getTransgressionDistance() {
        return transgressionDistance;
    }

    public void setTransgressionDistance(int transgressionDistance) {
        this.transgressionDistance = transgressionDistance;
    }

    @Override
    public String toString() {
        return "Hogwarts{" +
                "fistName='" + fistName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", spellPower=" + spellPower +
                ", transgressionDistance=" + transgressionDistance +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Hogwarts hogwarts = (Hogwarts) o;
        return spellPower == hogwarts.spellPower && transgressionDistance == hogwarts.transgressionDistance && Objects.equals(fistName, hogwarts.fistName) && Objects.equals(lastName, hogwarts.lastName);
    }

    @Override
    public int hashCode() {
        return Objects.hash(fistName, lastName, spellPower, transgressionDistance);
    }

    private int magicSkill (){
        return spellPower + transgressionDistance;
    }

    public static void studentComparison(Hogwarts studentOne, Hogwarts studentTwo){
        if (studentOne.magicSkill()>studentTwo.magicSkill()){
            System.out.println(studentOne + "обладает большей мощностью магии, чем " + studentTwo);
        } else if (studentOne.magicSkill()<studentTwo.magicSkill()) {
            System.out.println(studentTwo + "обладает большей мощностью магии, чем " + studentOne);
        } else {
            System.out.println("Студенты по силе равны");
        }
    }

}
