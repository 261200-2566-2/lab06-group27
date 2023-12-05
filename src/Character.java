public class Character {
    //initialize stats of character
    protected int hp,maxHp,atk,def,mana,speed,maxMana;
    //initialize class of character
    protected String Class;
    //set not equipped for character
    protected String Accessory = "not equipped";
    /*Check Can Character Evade?
      return true if CharacterEvadable
             false if CharacterEvadable not
     */
    protected boolean isEvade(){
        if(this instanceof CharacterEvadable p){
            return p.isEvade;
        }else{
            return false;
        }
    }
    /*Check Character isAlive?
        return hp != 0
     */
    protected boolean isAlive(){
        return hp != 0;
    }
    /*  to summarize all action in the round of each character
     */
    public void roundEnd(){
        if(this instanceof CharacterEvadable p){
            p.isEvade = false;
        }
        if(this instanceof MeleeFighter p){
            p.isGuard = false;
        }
        if(this instanceof Mage p){
            if(p.buff){
                atk /= 2;
                p.buff = false;
            }
        }
    }
    /*  to make Character stats merge with equipment stats
        if no equipment , print "Accessory doesn't exist."
        @param Accessory
     */
    public void equip(Accessory a){
        if(a instanceof attackEquipment){
            this.atk += ((attackEquipment) a).atk();
            this.speed += ((attackEquipment) a).speed();
            this.Accessory = a.type();
        }
        else if(a instanceof defEquipment){
            this.def += ((defEquipment) a).def();
            this.speed += ((defEquipment) a).speed();
            this.Accessory = a.type();
        }
        else {
            System.out.println("Accessory doesn't exist.");
        }
    }
    /*  print stats of this Character
        return IsAlive == true print stats;
               IsAlive == false print "Your character is dead"
     */
    public void print(){
        if(this.isAlive()){
            System.out.println("Hp: "+ this.hp + "  atk: "+this.atk+"  def: "+this.def+"  mana: "+this.mana+"  speed: "+this.speed);
        }else {
            System.out.println("Your character is dead");
        }

    }
}