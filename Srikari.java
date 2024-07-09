public class Srikari {
    private int birthdayage;

    private String birthdaymonth;

    public Srikari ( int age , String month){
        birthdayage = age;
        birthdaymonth = month;
    }

    public Srikari ( int age ) {
        birthdayage = age;
        birthdaymonth = "unknown";
    }

    public int getSrikariAmeya(){
        return birthdayage;
    }

    public String getBdayMonth(){
        return birthdaymonth;
    }
}
