package rpgadventure.characters;

import rpgadventure.Arena;

public class Rogue extends Character{
    public int dexterity = 20;

    public Rogue(){
        super();
        this.stregth = 8;
        this.defence = 0;
        this.health = 100;
    }

    // Generating the attack dmg
    public int attack(Character target){
        // Critical Hit
        boolean critHit = Arena.ranGen.nextInt(100) < dexterity;
        int attckDmg = this.stregth*2;
        if (critHit) {
            attckDmg *= 2;
            System.out.println("***** CRITICAL HIT *****");
        }
        int dmgDlt = target.takeDmg(attckDmg);
        return dmgDlt;
    }

}
