public class CharacterWNormalAttack extends Character{
    /*  let Character attack other player
         require Character p
     */
    protected void normalAttack(Character p){
        //Check your character is dead print "Your character has died."
        if(!isAlive()){
            System.out.println("Your character has died.");
            return;
        }
        //Check opponent character is dead print "You cannot attack dead characters."
        if(!p.isAlive()){
            System.out.println("You cannot attack dead characters.");
            return;
        }
        //Check opponent character use evade print "You missed your attack."
        if(p.isEvade()){
            System.out.println("You missed your attack.");
            return;
        }
        //initialize damage form player atk- opponent def
        int damage = this.atk - p.def;
        //if damage <= 0 print "Your attack power is too low to deal damage."
        if(damage <= 0) {
            System.out.println("Your attack power is too low to deal damage.");
            return;
        }
        //make new opponent hp by opponent hp - damage
        p.hp -= damage;
        //check if opponent hp < 0 p.hp = 0
        if(p.hp < 0) {
            p.hp = 0;
        }
        //plus mana + 2
        mana += 2;
        //check mana > maxMana , mana = Max mana
        if(mana > maxMana) mana = maxMana;
    }
}