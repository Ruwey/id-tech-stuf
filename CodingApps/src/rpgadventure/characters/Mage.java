package rpgadventure.characters;

import rpgadventure.Arena;

public class Mage extends Character {
    // Create mana varaible
    int mana;
    public Mage(){
        super();
        this.health = 70;
        this.defence = 10;
        this.stregth = 5;
        this.mana = 50;
    }

    // Generating the attack dmg
    public int attack(Character target){
        int attckDmg = this.stregth*2;

        // Mana implentation
        int manaUse = Arena.ranGen.nextInt(10);
        this.mana -= manaUse;
        attckDmg += manaUse;

        int dmgDlt = target.takeDmg(attckDmg);
        return dmgDlt;
    }
}
