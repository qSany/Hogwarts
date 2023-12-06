class Hogwarts {

    private int magicPower;
    private int transgressionDistance;

    public Hogwarts(int magicPower, int transgressionDistance) {
        this.magicPower = magicPower;
        this.transgressionDistance = transgressionDistance;
    }

    public int getMagicPower() {
        return magicPower;
    }

    public int getTransgressionDistance() {
        return transgressionDistance;
    }

    public void studentDescription() {
        System.out.println("Ученик школы Хогвартс с силой магии " + magicPower + " и расстоянием трансгрессии " + transgressionDistance);
    }
}