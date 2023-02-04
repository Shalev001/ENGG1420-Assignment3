package engg.asignment3;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author shale
 */
public class Rect {
    //creating class parameters
    private int x, y;
    private int width,height;
    
    // implamenting constructors outlined
    public Rect(int x, int y, int width, int height){
        this.x = x;
        this.y = y;
        // running the given values of width and height through an absolute value function
        if (width < 0){
            this.width = -width;
        }
        else{
            this.width = width;
        }
        if (height < 0){
            this.height = -height;
        }
        else{
        this.height = height;
        }
    }
    public Rect(int width, int height){
        if (width < 0){
            this.width = -width;
        }
        else{
        this.width = width;
        }
        if (height < 0){
            this.width = -height;
        }
        else{
        this.width = height;
        }
    }
    // creating setters and getters for all of the perameters
    public void setx(int x){
        this.x = x;
    }
    public void sety(int y){
        this.y = y;
    }
    public void setwidth(int width){
        this.width = width;
    }
    public void setheight(int height){
        this.height = height;
    }
    
    public int getx(){
        return x;
    }
    public int gty(){
        return y;
    }
    public int getwidth(){
        return width;
    }
    public int getheight(){
        return height;
    }
    public int getPerimeter(){
        return (2*width + 2*height);
    }
    public int getArea(){
        return (width*height);
    }
    /**
     * a function that returns true if the current rectangle is bigger that the rect parameter
     * @param rect an input Rect to compare against
     * @return true if the parameter is smaller than the current Rect, false if not
     * @see engg.asignment3.Rect#
     * @version 1
     */
    public boolean isBigger(Rect rect){
        if ((width*height) > rect.getArea()){
            return true;
        }
        return false;
    }
    
    /**
     * a function to move the location of the rect using the two given parameters
     * @param x
     * @param y 
     */
    public void move(int x, int y){
        this.x = x;
        this.y = y;
    }
    
    /**
     * a function to set the size of the Rect, will set width and height to the given value
     * @param n 
     */
    public void changeSize(int n){
        // implamenting an absolute value function
        if (n > 0){
        width = n;
        height = n;      
        }
        else{
        width = -n;
        height = -n;      
        }
    }
    /**
     * a function to print the parameters of the current Rect to the console
     */
    public void Print(){
        System.out.printf("the position is (%d,%d) the width is %d and the height is %d \n",x,y,width,height);
    }
    
}
