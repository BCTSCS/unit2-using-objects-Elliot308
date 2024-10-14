/**
 * Write a description of class Rectangle here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
import greenfoot.*;
public class Rectangle extends Actor {
    private int width;
    private int height;
    private Rectangle sample;
    public Rectangle(int w, int h){
        width = w;
        height = h;
        getImage().scale(width*10,height*10);
    }
    public Rectangle(int s){
        width = s;
        height = s;
        getImage().scale(width*10,height*10);
    }
    public Rectangle(){
        //width = 10;
        //height = 10;
        sample = new Rectangle(8,20);
        System.out.println("Width: " + width + "\n Height: " + height + "\n Object: " + sample);
        //getImage().scale(width*10,height*10);
    }
    public static void main(String[] args){
        //Rectangle r1 = null;
        //System.out.println(r1);
        Rectangle r1 = new Rectangle(20,30);
        //System.out.println(r1);
    }
    public void setWidth() {
        width = 10;
    }
    public void setWidth(int size) {
        width = size;
    }
    public void setSize(int w, int h) {
        width = w;
        height = h;
    }
    public String toString() {
        //return "Rectangle width: " + width + " / Rectangle height:" + height;
        return "Rectangle: " + System.identityHashCode(this) + "\n Rectangle width: " + width + " / Rectangle height:" + height;
    }
    
}
