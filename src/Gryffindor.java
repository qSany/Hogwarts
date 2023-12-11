class Gryffindor extends Hogwarts {
    private int nobility;
    private int honor;
    private int bravery;


    public Gryffindor(String name, int magicPower, int transgressionDistance, int nobility, int honor, int bravery) {
        super(name, magicPower, transgressionDistance);
        this.nobility = nobility;
        this.honor = honor;
        this.bravery = bravery;
    }


    public void studentDescription() {
        super.studentDescription();
        System.out.println(": благородство " + nobility + ", честь " + honor + ", храбрость " + bravery);
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
    private int sum () {
       return bravery + nobility + honor ;

    }
    public void compareStudents(Gryffindor student){
        if (this.sum()> student.sum()){
            System.out.println(this.getName() + " Сильнее "+ student.getName());
        }
        else {
            System.out.println( student.getName() + " Лучше "+ this.getName());
        }
    }
}


