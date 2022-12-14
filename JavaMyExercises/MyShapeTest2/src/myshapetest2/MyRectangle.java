package myshapetest2;

import java.awt.Color;
import java.awt.Graphics;

public class MyRectangle extends MyBoundedShape {
    
    public MyRectangle(){
        super();
    }
    
    public MyRectangle(int x1,int y1,int x2,int y2,Color color,boolean fill){
        super(x1,y1,x2,y2,color,fill);
    }
   
    @Override
    public  void draw(Graphics g){
        g.setColor(getColor());
        if(getFill()){
            g.fillRect(getX1(), getY1(),getWidth(), getHeight());
        }
        else{
            g.drawRect(getX1(), getY1(),getWidth(), getHeight());
        } 
    }

}