class Hufflepuff extends Hogwarts {
    private int diligence;
    private int loyalty;
    private int honesty;


    public Hufflepuff(String name, int magicPower, int transgressionDistance, int diligence, int loyalty, int honesty) {
        super(name, magicPower, transgressionDistance);
        this.diligence = diligence;
        this.loyalty = loyalty;
        this.honesty = honesty;
    }

    public void studentDescription() {
        super.studentDescription();
        System.out.println(": трудолюбие " + diligence + ", верность " + loyalty + ", честность " + honesty);
    }

    public int getDiligence() {
        return diligence;
    }

    public int getLoyalty() {
        return loyalty;
    }

    public int getHonesty() {
        return honesty;
    }

    private int sum() {
        return honesty + loyalty + diligence;
    }

    public void compareStudents(Hufflepuff student) {
        if (this.sum() > student.sum()) {
            System.out.println(this.getName() + " Сильнее " + student.getName());
        } else {
            System.out.println(student.getName() + " Лучше " + this.getName());
        }
    }
}
