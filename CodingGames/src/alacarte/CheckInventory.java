package alacarte;

public class CheckInventory {
    public static void main(String[] args) {
        // Setup inventory
        String[] inventory = new String[5];
        inventory[0] = "HP Potion";
        inventory[1] = "Magic Sword";
        inventory[2] = "Wooden Shield";
        inventory[3] = "Magic Key";

        printInventory(inventory);

        if (checkInventory(inventory, "Magic Key")) {
            System.out.println("Your magic key allows you to open the door.");
        } else {
            System.out.println("You cannot open the door. If only you had a magic key...");
        }
    }

    public static void printInventory(String[] inventory) {
        for (String item : inventory) {
            System.out.println(item);
        }
    }

    // Return true if search is in inventory
    public static boolean checkInventory(String[] inventory, String search) {
        for (String item : inventory) {
            if (item != null && item.equals(search)) {
                return true;
            }
        }
        return false;
    }
}
