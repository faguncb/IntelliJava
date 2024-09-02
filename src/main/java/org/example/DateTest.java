
public class DateTest {
    public static void main(String [] args){
        Date date1 = new Date(8, 28, 2024);
        System.out.println("The initial date: ");
        date1.displayDate();

        date1.setMonth(2);
        date1.setDay(12);
        date1.setYear(2025);

        System.out.print("The updated date: ");
        date1.displayDate();
    }
}


