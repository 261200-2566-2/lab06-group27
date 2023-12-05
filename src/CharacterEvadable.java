
public class CharacterEvadable extends Character{
    protected boolean isEvade;
    /*
       Make Character evade
     */
    public void evade(){
        isEvade = true;
        mana -= 5;
    }
}