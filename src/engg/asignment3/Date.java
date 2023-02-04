package engg.asignment3;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author shale
 */
public class Date {
    // creating the class perameters
    int day, month, year;
    
    // creating a list of all the months containing the number of days in each month, the month number is the index
    private static final int[] months = {0,31,28,31,30,31,30,31,31,30,31,30,31};
    
    // constructor containing the required fields
    public Date(int day,int month,int year){
        this.day = day;
        this.month = month;
        this.year = year;
    }
    
    // a method to print the current values of the date class parameters
    public void print(){
        System.out.printf("%d/%d/%d\n",day,month,year);
    }
    
    // a method to add a surtain number of days to the current date
    public void addDays(int n){
        //creating a loop that runs n times
        for (int i = 0; i < n; i++){
            // the code within the loop adds a single day while accounting for month and year rollover
            day++;
            if (day > months[month]){
                day = 1;
                month++;
                if (month > 12){
                    year++;
                    month = 1;
                }
                        
            }
        }
    }
    
    // a private method to subtract n days from a date
    private void subDays(int n){
        for (int i = n; i > 0; i--){
            day--;
            if (day == 0){
                month--;
                if (month == 0){
                    year--;
                    month = 12;
                }
                day = months[month];
            }
            
        }
    }
    
    //a private method to check which date is bigger, one date is passed through a Date class and the other through parameters
    private int isBigger(Date date, int day, int month, int year){
        if((date.year > year || (date.year == year && date.month > month))||(date.year == year && date.month == month && date.day > day)){
            return 1;
        }
        else if((date.year < year || (date.year == year && date.month < month))||(date.year == year && date.month == month && date.day < day)){
            return -1;
        }
        return 0;
    }
    
    //a function that returns the number of days between two dates
    public int compare(Date date){
        int ddiff = 0;// a variable to keep track of the number days between the dates
        int d = day;
        int m = month;
        int y = year;
        Date dat = new Date(d,m,y);// a temporary date that can be modified without consiquenses
        
        //creating a loop that keeps going until dat is equivilant to date
        while (date.isBigger(date,dat.day,dat.month,dat.year) != 0){
            
            if (date.isBigger(date,dat.day,dat.month,dat.year) >= 1){// iff dat is smaller than date add days
                dat.addDays(1);
                ddiff++;
            }
            else{// if dat is bigger than date subtract days
                dat.subDays(1);
                ddiff--;
            }
        }
        return ddiff;
    }
}
