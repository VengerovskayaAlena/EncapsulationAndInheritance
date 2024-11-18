public class Main {
    public static void main(String[] args) {

        Gryffindor[] studentGryffindor = {
                new Gryffindor("Гарри", "Поттер", 78,45,78,78,95),
                new Gryffindor("Гермиона", "Грейнджер",78,60,86,47,97),
                new Gryffindor("Рон", "Уизли",79,54,79,54,78),
        };

        Puffinduy[] studentPuffinduy = {
                new Puffinduy("Захария", "Смит",48,58,29,84,72),
                new Puffinduy("Седрик", "Диггори",48,69,32,73,53),
                new Puffinduy("Джастин", "Финч-Флетчли",76,97,35,58,25),
        };

        Kogtevran[] studentKogtevran = {
               new Kogtevran("Чжоу", "Чанг",76,43,42,34,54,54),
               new Kogtevran("Падма", "Патил",43,6,43,32,23,45),
               new Kogtevran("Маркус" ,"Белби",43,21,12,25,16,36),
        };

        Slytherin[] studentSlytherin = {
                new Slytherin("Драко", "Малфой",87,98,79,89,97,97,86),
                new Slytherin("Грэхэм", "Монтегю",76,46,38,56,37,63,24),
                new Slytherin("Грегори", "Гойл",26,84,38,26,37,46,24),
        };

        System.out.println(studentGryffindor[2].toString());
        System.out.println(studentKogtevran[1].toString());
        System.out.println(studentPuffinduy[0].toString());
        System.out.println(studentSlytherin[0].toString());

        Hogwarts.studentComparison(studentGryffindor[0], studentSlytherin[0]);
        Gryffindor.studentComparison(studentGryffindor[1], studentGryffindor[2]);
        Puffinduy.studentComparison(studentPuffinduy[1], studentPuffinduy[0]);
        Kogtevran.studentComparison(studentKogtevran[0], studentKogtevran[1]);
        Slytherin.studentComparison(studentSlytherin[1], studentSlytherin[2]);

    }
}