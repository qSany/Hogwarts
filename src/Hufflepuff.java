class Hufflepuff extends Hogwarts {
    private int diligence;
    private int loyalty;
    private int honesty;

    public Hufflepuff(int magicPower, int transgressionDistance, int diligence, int loyalty, int honesty) {
        super(magicPower, transgressionDistance);
        this.diligence = diligence;
        this.loyalty = loyalty;
        this.honesty = honesty;
    }

    public void studentDescription() {
        super.studentDescription();
        System.out.println("Качества Пуффендуя: трудолюбие " + diligence + ", верность " + loyalty + ", честность " + honesty);
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
}
