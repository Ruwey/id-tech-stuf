package rpgadventure;

public class Character {
    // Basic character attributes
    public String name;
    public int stregth;
    public int health;
    public int defence;

    // Generating dmg taken
    public int takeDmg( int dmg ){
        int dmgTkn = dmg - this.defence;
        this.health -= dmgTkn;
        return dmgTkn;
    }

    // Generating the attack dmg
    public int attack(Character target){
        int attckDmg = this.stregth*2;
        int dmgDlt = this.takeDmg(attckDmg);
        return dmgDlt;
    }
}
