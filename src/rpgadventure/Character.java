package rpgadventure;


public class Character {
    public static String[] nameList = {"Larry","Jerry","Karry","Berry","Terry"};
    // Constructor
    public Character(){
        this.name = nameList[Arena.ranGen.nextInt(nameList.length)];
    }
    public Character()
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
        int dmgDlt = target.takeDmg(attckDmg);
        return dmgDlt;
    }

    // Checks if character is alive
    public boolean isAlive(){
        return health > 0;
    }

}
