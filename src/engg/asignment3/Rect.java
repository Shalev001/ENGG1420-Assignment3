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
    int x, y;
    int width,height;
    
    public Rect(int x, int y, int width, int height){
        this.x = x;
        this.y = y;
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
    public int getPerimeter(){
        return (2*width + 2*height);
    }
    public int getArea(){
        return (width*height);
    }
    public boolean isBigger(Rect rect){
        if ((width*height) > rect.getArea()){
            return true;
        }
        return false;
    }
    
    public void move(int x, int y){
        this.x = x;
        this.y = y;
    }
    public void changeSize(int n){
        if (n > 0){
        width = n;
        height = n;      
        }
        else{
        width = -n;
        height = -n;      
        }
    }
    public void Print(){
        System.out.printf("the position is (%d,%d) the width is %d and the height is %d \n",x,y,width,height);
    }
    
}
