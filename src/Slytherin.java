class Slytherin extends Hogwarts {

    private int cunning;
    private int determination;
    private int ambition;
    private int resourcefulness;
    private int thirstForPower;

    public Slytherin(int magicPower, int transgressionDistance, int cunning, int determination, int ambition, int resourcefulness, int thirstForPower) {
        super(magicPower, transgressionDistance);
        this.cunning = cunning;
        this.determination = determination;
        this.ambition = ambition;
        this.resourcefulness = resourcefulness;
        this.thirstForPower = thirstForPower;
    }

    public int compareStudents(Slytherin student) {
        // Сравнение по полю cunning
        if (this.cunning > student.cunning) {
            return 1;
        } else if (this.cunning < student.cunning) {
            return -1;
        } else {
            return 0;
        }
    }

    public void studentDescription() {
        super.studentDescription();
        System.out.println("Качества Слизерина: хитрость " + cunning + ", решительность " + determination + ", амбициозность " + ambition + ", находчивость " + resourcefulness + ", жажда власти " + thirstForPower);
    }

    public int getCunning() {
        return cunning;
    }

    public int getDetermination() {
        return determination;
    }

    public int getAmbition() {
        return ambition;
    }

    public int getResourcefulness() {
        return resourcefulness;
    }


}

