
package testdraw;

import java.awt.Color;
import java.awt.Graphics;

public class MyLine {
    
    private int x1;
    private int y1;
    private int x2;
    private int y2;
    private Color color;
    
    public MyLine(){
        x1=0;
        y1=0;
        x2=0;
        y2=0;
        color=Color.BLACK;
    }
    //set
    public void setX1(int x1){
        this.x1=(0<=x1?x1:0);
    }
    public void setY1(int y1){
        this.y1=(0<=y1?y1:0);
    }
    public void setX2(int x2){
        this.x2=(0<=x2?x2:0);
    }
    public void setY2(int y2){
        this.y2=(0<=y2?y2:0);
    }
    public void setColor(Color color){
        this.color=color;
    }
    //get
    public int getX1(){
        return x1;
    }
    public int getY1(){
        return y1;
    }
    public int getX2(){
        return x2;
    }
    public int getY2(){
        return y2;
    }
    public Color getColor(){
        return color;
    }
    
    
    
    public void draw(Graphics g){
        g.setColor(getColor());
        g.drawLine(getX1(),getY1(),getX2(),getY2());
    }
}
