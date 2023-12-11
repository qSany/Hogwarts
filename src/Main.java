public class Main {
    public static void main(String[] args) {


        Gryffindor harryPotter = new Gryffindor("harryPotter",100, 50, 10, 20, 30);
        harryPotter.studentDescription();

        Hufflepuff cedricDiggory = new Hufflepuff("cedricDiggory" ,80, 40, 15, 25, 35);
        cedricDiggory.studentDescription();

        Ravenclaw lunaLovegood = new Ravenclaw("lunaLovegood",110, 45, 12, 22, 32, 42);
        lunaLovegood.studentDescription();


        Slytherin dracoMalfoy = new Slytherin("dracoMalfoy" ,95, 48, 18, 28, 38, 48, 58);
        dracoMalfoy.studentDescription();
       // int result = harryPotter.compareStudents(cedricDiggory);
        //if (result > 0) {
//            System.out.println("Гарри Поттер интеллектуальнее Седрика Диггори");
//        } else if (result < 0) {
//            System.out.println("Гарри Поттер менее умен, чем Седрик Диггори.");
//        } else {
//            System.out.println("Гарри Поттер и Седрик Диггори имеют одинаковый уровень интеллекта.");
//        }
        Gryffindor student = new Gryffindor("germeona", 88,88,66,33,76);
        System.out.println();
        harryPotter.compareStudentsBySchool(lunaLovegood);
        harryPotter.compareStudentsBySchool(dracoMalfoy);
        dracoMalfoy.compareStudentsBySchool(cedricDiggory);
        harryPotter.compareStudentsBySchool(cedricDiggory);
        student.compareStudents(harryPotter);
    }

}


