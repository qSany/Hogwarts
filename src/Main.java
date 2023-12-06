public class Main {
    int result = harryPotter.compareStudents(cedricDiggory);
        if (result > 0) {
        System.out.println("Гарри Поттер умнее Седрика Диггори");
    } else if (result < 0) {
        System.out.println("Гарри Поттер менее умен, чем Седрик Диггори.");
    } else {
        System.out.println("Гарри Поттер и Седрик Диггори имеют одинаковый уровень интеллекта.");
    }
}

    public static void main(String[] args) {
        Gryffindor harryPotter = new Gryffindor(100, 50, 10, 20, 30);
        harryPotter.studentDescription();

        Hufflepuff cedricDiggory = new Hufflepuff(80, 40, 15, 25, 35);
        cedricDiggory.studentDescription();

        Ravenclaw lunaLovegood = new Ravenclaw(90, 45, 12, 22, 32, 42);
        lunaLovegood.studentDescription();

        Slytherin dracoMalfoy = new Slytherin(95, 48, 18, 28, 38, 48, 58);
        dracoMalfoy.studentDescription();
    }
}
