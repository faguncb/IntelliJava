public class Item {
    protected static int Location;
    protected static String Description;


    public Item(int Location, String Description) {
        this.Description = Description;
        this.Location = Location;
    }

    public static int getLocation() {
        return Location;
    }

    public static void setLocation(int Location) {
        Item.Location = Location;
    }

    public static String getDescription() {
        return Description;
    }

    public static void setDescription(String Description){
        Item.Description = Description;
    }

}
