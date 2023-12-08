// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {

        Knight Knight = new Knight();
        Accessory sword = new Sword();
        Knight.equip(sword);
        printChar(Knight,1);
        Thief Thief = new Thief();
        printChar(Thief,2);

        Thief.stab(Knight);
        Knight.attack(Thief);

        System.out.println(" ");
        System.out.println("summarize");
        System.out.println(" ");
        Knight.roundEnd();
        Thief.roundEnd();
        printChar(Knight,1);
        printChar(Thief,2);

        Thief.evade();
        Knight.attack(Thief);

        System.out.println(" ");
        System.out.println("summarize");
        System.out.println(" ");
        Knight.roundEnd();
        Thief.roundEnd();
        printChar(Knight,1);
        printChar(Thief,2);
        System.out.println(" ");

        Wizard Wizard = new Wizard();
        Accessory Gloves = new Gloves();
        Wizard.equip(Gloves);
        printChar(Wizard,3);
        printChar(Thief,2);
        System.out.println(" ");

        Thief.stab(Wizard);
        Wizard.cast(Thief);

        System.out.println("summarize");
        System.out.println(" ");
        Knight.roundEnd();
        Thief.roundEnd();
        printChar(Wizard,3);
        printChar(Thief,2);
        System.out.println(" ");
    }
    /*print Character information to show
        @param Class's Character
        @param i is player number
        @return print player number , class , equipment and stats
    */
        public static void printChar(Character p, int i){
        System.out.println("player " + i + " (" + p.Class + ") (" + p.Accessory + ")");
        p.print();
    }
}