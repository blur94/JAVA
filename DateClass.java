    //Non-executable class
public class DateClass{
    private int year;
    private int month;
    private int day;
    //Write all the GET methods
    public int getYear() {

        return year;
    }
    public int getMonth() {
        return month;
    }
    public int getDay() {

        return day;
    }
    //Now, to Write the SET method
        public void setDate(int theyear, int themonth, int theday) {
        this.year = theyear;
        this.month = themonth;
        this.day = theday;
    }
}

