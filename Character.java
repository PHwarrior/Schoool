public class Character {
    String name;
    int health, stamina, mana;
    
    public Character(String name, int health, int stamina, int mana) {
        this.name = name;
        this.health = health;
        this.stamina = stamina;
        this.mana = mana;
    }
    public void walk() {
        stamina -= 1;
    }
    public void run() {
        stamina -= 3;
    }
    public void showStats() {
        System.out.println("It's name is " + name);
        System.out.println(name + " health is " + health);
        System.out.println(name + " stamina is " + stamina);
        System.out.println(name + " mana is " + mana);
    }
}