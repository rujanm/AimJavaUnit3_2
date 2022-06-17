package com.aim.java.unit3;

import java.util.Scanner;

public class MyPoint {
    private int x;
    private int y;

    public int getX() {
        return this.x;
    }

    public void setX(int x) {
        this.x = x;
    }

    public int getY() {
        return this.y;
    }

    public void setY(int y) {
        this.y = y;
    }

    public MyPoint(){
        this.x = 0;
        this.y = 0;
    }
    public MyPoint(int x, int y){
        this.x = x;
        this.y = y;
    }
    public double distance(int xCoord, int yCoord){
        
        double displacement;
        displacement = Math.sqrt(Math.pow(xCoord-this.x,2) + Math.pow(yCoord-this.y,2));
        return displacement;
    }

    public double distance(MyPoint myPoint){
        double displacement;
        displacement = Math.sqrt(Math.pow(myPoint.x-this.x,2) + Math.pow(myPoint.y-this.y,2));
        return displacement;
    }

    public static double distance(MyPoint myPoint1, MyPoint myPoint2){
        double displacement;
        displacement = Math.sqrt(Math.pow(myPoint1.x-myPoint2.x,2) + Math.pow(myPoint1.y-myPoint2.y,2));
        return displacement;
    }
}


class Main
{
    public static void main( String[] args )
    {
        
        Scanner obj = new Scanner(System.in);
        MyPoint p1 = new MyPoint();
        

        

       
        
        


        System.out.println( "This program creates a point (p1) and a point at the coordinates" +
        "entered by you (p2). It then computes and displays the distance from (0,0)" +
        "to the point defined by you, using three different methods. \n" );


        System.out.print("Enter the x coordinate of a point: ");
        int x1 = obj.nextInt();
        
        System.out.print("Enter the y coordinate of a point: ");
        int y1 = obj.nextInt();


        MyPoint p2 = new MyPoint(x1,y1);

        double distance1;
        distance1 = p1.distance(x1,y1);

        double distance2;
        distance2 = p1.distance(p2);

        double distance3;
        distance3 = p1.distance(p1,p2);

        System.out.println("Using method 1, the distance from (" + 
        0 + "," + 0 + ") to (" + x1 + "," + y1 + ") is " + 
        distance1 );

        System.out.println("Using method 2, the distance from (" + 
        0 + "," + 0 + ") to (" + x1 + "," + y1 + ") is " + 
        distance2 );

        System.out.println("Using method 3, the distance from (" + 
        0 + "," + 0 + ") to (" + x1 + "," + y1 + ") is " + 
        distance3 );
    }
}
