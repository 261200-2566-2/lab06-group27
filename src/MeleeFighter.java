public class MeleeFighter extends CharacterWNormalAttack{
    protected boolean isGuard;
    /*
        attack opponent for melee fighter
        require opponent character
     */
    protected void attack(Character p){
        normalAttack(p);
    }
    /*
        guard action for melee fighter
        require guard
     */
    protected void guard(String guard){
        //check mana is enough for action
        if(mana < 5){
            System.out.println("Not enough mana");
            return;
        }
        /* activate guard and check isGuard == false
            set is isGuard = true;
                   def *= 2;
                   mana -= 5;
         */
        if(guard.equals("activate") && !isGuard){
            isGuard = true;
            def *= 2;
            mana -= 5;
        /* deactivate guard and check isGuard == true
            set is isGuard = false;
                   def /= 2;
         */
        }else if(guard.equals("deactivate") && isGuard){
            isGuard = false;
            def /= 2;
        /*
            if not all above print "wrong input"
         */

        }else{
            System.out.println("wrong input");
        }
    }
}