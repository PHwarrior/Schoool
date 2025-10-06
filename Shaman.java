class Shaman extends Character {
    int heal;
    Shaman (String name, int health, int stamina, int mana, int heal) {
        super(name, health, stamina, mana);
        this.heal = heal;
    }
    
    void heal() {
        health += 5;
        stamina += 5;
        mana += 5;
    }
}