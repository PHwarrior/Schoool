public class Player
{
    public static void main(String[] args) {
        Shaman shaman = new Shaman("Gandulf", 150, 100, 100, 2);
        Swordsman sm = new Swordsman("Sir Karl", 170, 100, 100, 2);
        
        System.out.println("----- Shaman -----");
        shaman.walk();
        shaman.walk();
        shaman.walk();
        shaman.run();
        shaman.run();
        shaman.heal();
        shaman.showStats();
        System.out.println("----- -----");
        System.out.println("----- Swordsman -----");
        sm.walk();
        sm.walk();
        sm.walk();
        sm.run();
        sm.run();
        sm.slash();
        sm.slash();
        sm.showStats();
        System.out.println("----- -----");
    } 
}