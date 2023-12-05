class Gryffindor extends Hogwarts {
    private int nobility;
    private int honor;
    private int bravery;

    public Gryffindor(int magicPower, int transgressionDistance, int nobility, int honor, int bravery) {
        super(magicPower, transgressionDistance);
        this.nobility = nobility;
        this.honor = honor;
        this.bravery = bravery;
    }

    public void studentDescription() {
        super.studentDescription();
        System.out.println("Качества Гриффиндора: благородство " + nobility + ", честь " + honor + ", храбрость " + bravery);
    }

    public int getNobility() {
        return nobility;
    }

    public int getHonor() {
        return honor;
    }

    public int getBravery() {
        return bravery;
    }
}
