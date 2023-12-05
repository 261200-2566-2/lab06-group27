public class Mage extends CharacterWNormalAttack{
    protected boolean buff;
    /*
        attack action for Class mage
        require opponent character
     */
    public void cast(Character p){
        normalAttack(p);
    }
    /*
        buff skill for class mage
     */
    protected void buff(){
        //Check mana if not enough print "Not enough mana"
        if(mana < 15){
            System.out.println("Not enough mana");
            return;
        }
        //set atk*2 , hp + 5
        atk *= 2;
        hp += 5;
        //Check if hp > maxHp , set hp = maxHp
        if(hp > maxHp) hp = maxHp;
        //set mana + 2
        mana += 2;
        //Check if mana > max mana , set mana = max mana
        if(mana > maxMana) mana = maxMana;
        //set buff activate
        buff = true;
    }
}