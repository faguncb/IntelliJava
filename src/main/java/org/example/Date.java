public class Date {
    private int month, day, year;

    public Date(int month, int day, int year) {
        this.month=month;
        this.day=day;
        this.year=year;
    }

    public int getMonth()
    {
        return month;
    }

    public void setMonth(int month){
        this.month=month;
    }

    public int getDay()
    {
        return day;
    }

    public void setDay(int day){
        this.day=day;
    }

    public int getYear()
    {
        return year;
    }

    public void setYear(int year){
        this.year=year;
    }

    public void displayDate(){
        System.out.print(" "+month);
        System.out.print("/"+day);
        System.out.print("/"+year);
    }

}
