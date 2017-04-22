public class Date {
    private int day;
    private int month;
    private int year;

    public Date(int day, int month, int year) {
        this.day = day;
        this.month = month;
        this.year = year;
    }

    public int getDay() {
        return day;
    }

    public int getMonth() {
        return month;
    }

    public int getYear() {
        return year;
    }

    public boolean checkIfBefore(Date o) {
        if(this.year < o.getYear()) {
            return true;
        }
        else if(this.year == o.getYear() && this.month < getMonth()){
            return true;
        }
        else if(this.year == o.getYear() && this.month == getMonth() && this.day < o.getDay()){
            return true;
        }
        else return false;
    }





}