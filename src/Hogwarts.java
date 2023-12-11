abstract class Hogwarts {

    private String name;
    private int magicPower;
    private int transgressionDistance;

    public Hogwarts(String name, int magicPower, int transgressionDistance) {
        this.name = name;
        this.magicPower = magicPower;
        this.transgressionDistance = transgressionDistance;
    }

    public String getName() {
        return name;
    }

    public int getMagicPower() {
        return magicPower;
    }

    public int getTransgressionDistance() {
        return transgressionDistance;
    }

    public void studentDescription() {
        System.out.println(this.getName()+ " Ученик  школы Хогвартс с силой магии "
                + magicPower + " и расстоянием трансгрессии " + transgressionDistance);

    }
    public void compareStudentsBySchool(Hogwarts student){
        if (this.magicPower > student.getMagicPower()) {
            System.out.println(this.getName() + " Сильнее "+ student.getName());

        }
        else {
            System.out.println( student.getName() + " Сильнее "+ this.getName());
        }
    }
}

