public class Assassin extends CharacterEvadable{
    /*
        stab action for class Assassin
        require opponent character
     */
    protected void stab(Character p){
        //Check your character is dead print "Your character has died."
        if(!isAlive()){
            System.out.println("Your character has died.");
            return;
        }
        //Check your opponent is dead print "You cannot attack dead characters."
        if(!p.isAlive()){
            System.out.println("You cannot attack dead characters.");
            return;
        }
        //Check your opponent use evade print "You missed your attack."
        if(p.isEvade()){
            System.out.println("You missed your attack.");
            return;
        }
        //initialize passiveAtk
        int passiveAtk;
        /*
            Check if your speed > opponent speed and mana >= maxMana
            set passiveAtk = atk+5; else passiveAtk = atk;
         */
        if(this.speed > p.speed && this.mana >= maxMana){
            passiveAtk = atk+5;
        }else {
            passiveAtk = atk;
        }
        /*
            summarize damage = passiveAtk - p.def;
         */
        int damage = passiveAtk - p.def;
        /*
            check if damage <= 0 , print "Your attack power is too low to deal damage."
         */
        if(damage <= 0) {
            System.out.println("Your attack power is too low to deal damage.");
            return;
        }
        //make new opponent hp by opponent atk
        p.hp -= damage;
        //check if opponent hp < 0 p.hp = 0
        if(p.hp < 0) {
            p.hp = 0;
        }
        //check mana > maxMana , mana = Max mana
        mana += 2;
        if(mana > maxMana) mana = maxMana;
    }
}