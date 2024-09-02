public class ItemMonsterMain {
    public static void main (String [] args) {
        Item obj1 = new Item(200, "Kandy");
        System.out.println("Location: " +Item.getLocation());
        System.out.println("Dscription: "+Item.getDescription());

        Monster obj2 = new Monster(300, "Pasikuda");
        System.out.println("Location: " +Monster.getLocation());
        System.out.println("Location: " +Monster.getDescription());

        System.out.println("");

        Item.setLocation(900);
        Item.setDescription("Canada");
        System.out.println("Location: " +Item.getLocation());
        System.out.println("Location: " +Item.getDescription());

        Monster.setLocation(1500);
        Monster.setDescription("California");
        System.out.println("Location: " +Monster.getLocation());
        System.out.println("Location: " +Monster.getDescription());



    }
}
