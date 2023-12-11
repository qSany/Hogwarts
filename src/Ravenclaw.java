class Ravenclaw extends Hogwarts {

    private int intelligence;
    private int wisdom;
    private int wit;
    private int creativity;


    public Ravenclaw(String name, int magicPower, int transgressionDistance, int intelligence, int wisdom, int wit, int creativity) {
        super(name, magicPower, transgressionDistance);
        this.intelligence = intelligence;
        this.wisdom = wisdom;
        this.wit = wit;
        this.creativity = creativity;
    }

    public int compareStudents(Ravenclaw student) {
        // Сравнение по полю wisdom
        if (this.wisdom > student.wisdom) {
            return 1;
        } else if (this.wisdom < student.wisdom) {
            return -1;
        } else {
            return 0;
        }
    }


    public void studentDescription() {
        super.studentDescription();
        System.out.println(": умность " + intelligence + ", мудрость " + wisdom + ", остроумие " + wit + ", творчество " + creativity);
    }

    public int getIntelligence() {
        return intelligence;
    }

    public int getWisdom() {
        return wisdom;
    }

    public int getWit() {
        return wit;
    }

    public int getCreativity() {
        return creativity;
    }
}

