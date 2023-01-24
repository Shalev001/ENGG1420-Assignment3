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
    int day, month, year;
    static int[] months = {0,31,28,31,30,31,30,31,31,30,31,30,31};
    
    public Date(int day,int month,int year){
        this.day = day;
        this.month = month;
        this.year = year;
    }
    
    public void print(){
        System.out.printf("%d/%d/%d\n",day,month,year);
    }
    
    public void addDays(int n){
        for (int i = 0; i < n; i++){
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
    
    private int isBigger(Date date, int day, int month, int year){
        if((date.year > year || (date.year == year && date.month > month))||(date.year == year && date.month == month && date.day > day)){
            return 1;
        }
        else if((date.year < year || (date.year == year && date.month < month))||(date.year == year && date.month == month && date.day < day)){
            return -1;
        }
        return 0;
    }
    
    public int compare(Date date){
        int ddiff = 0;
        int d = day;
        int m = month;
        int y = year;
        Date dat = new Date(d,m,y);
        while (date.isBigger(date,dat.day,dat.month,dat.year) != 0){
            
            if (date.isBigger(date,dat.day,dat.month,dat.year) >= 1){
                dat.addDays(1);
                ddiff++;
            }
            else{
                dat.subDays(1);
                ddiff--;
            }
        }
        return ddiff;
    }
}
