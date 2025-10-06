class Swordsman extends Character {
    int slash;
    Swordsman (String name, int health, int stamina, int mana, int slash) {
        super(name, health, stamina, mana);
        this.slash = slash;
    }
    
    void slash() {
        System.out.println("I am powerful!");
        mana -= 10;
    }
}