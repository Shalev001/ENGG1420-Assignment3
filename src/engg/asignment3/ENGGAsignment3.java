/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package engg.asignment3;

/**
 *
 * @author shale
 */
public class ENGGAsignment3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //creating test instances
        Rect r1 = new Rect(0,0,-10,20);
        Rect r2 = new Rect(0,0,-60,20);
        Date date1 = new Date(16,10,2004);
        Date date2 = new Date(14,11,2004);
        
        //printing the perameters of r1
        System.out.printf("r1:");r1.Print();
        
        //moving and changing the size of r1
        r1.move(20,50);
        r1.changeSize(-25);
        
        // printing out r1 and r2
        System.out.printf("r1:");r1.Print();
        System.out.printf("r2:");r2.Print();
        
        //printing conparisons to the console in a readable formatt
        System.out.println("the parimiter of r1 is: " + r1.getPerimeter());
        System.out.println("r1 is bigger than r2: " + r1.isBigger(r2));
        System.out.println("r2 is bigger than r1: " + r2.isBigger(r1));
        
        //changing the size of r1
        r1.changeSize(-70);
        
        //printing out r1 and r2
        System.out.printf("r1:");r1.Print();
        System.out.printf("r2:");r2.Print();
        
        //printing new conparisons to the console in a readable formatt
        System.out.println("r1 is bigger than r2: " + r1.isBigger(r2));
        System.out.println("r2 is bigger than r1: " + r2.isBigger(r1));
        
        //printing to the console the diffrence between date1 and date2 then the inverse
        System.out.println(date1.compare(date2));
        System.out.println(date2.compare(date1));
        
        // ading 38 days to date1
        date1.addDays(38);
        
        //printing to the console the updated diffrence between date1 and date2 then the inverse
        System.out.println(date1.compare(date2));
        System.out.println(date2.compare(date1));
        
        //adding 366 days to date2
        date2.addDays(366);
        
        //printing to the console the updated diffrence between date1 and date2 then the inverse
        System.out.println(date1.compare(date2));
        System.out.println(date2.compare(date1));
    }
    
}
