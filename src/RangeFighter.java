public class RangeFighter extends CharacterEvadable{
    /*
        shoot opponent action
        require opponent character
     */
    protected void shoot(Character p){
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
        //Check opponent character use evade "You missed your attack."
        if(p.isEvade()){
            System.out.println("You missed your attack.");
            return;
        }
        //make new opponent hp by opponent atk
        p.hp -= atk;
        //Check hp opponent < 0 , set hp = 0
        if(p.hp < 0) {
            p.hp = 0;
        }
        mana += 2;
        //check mana > max mana , set mana = max mana
        if(mana > maxMana) mana = maxMana;
    }
}