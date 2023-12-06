class Ravenclaw extends Hogwarts {
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
}
    private int intelligence;
    private int wisdom;
    private int wit;
    private int creativity;

    public Ravenclaw(int magicPower, int transgressionDistance, int intelligence, int wisdom, int wit, int creativity) {
        super(magicPower, transgressionDistance);
        this.intelligence = intelligence;
        this.wisdom = wisdom;
        this.wit = wit;
        this.creativity = creativity;
    }

    public void studentDescription() {
        super.studentDescription();
        System.out.println("Качества Когтевранца: умность " + intelligence + ", мудрость " + wisdom + ", остроумие " + wit + ", творчество " + creativity);
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