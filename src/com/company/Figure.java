package com.company;

public class Figure {
   private double x;
   private double y;

   public Figure(double x, double y){
       this.x = x;
       this.y =y;
   }

    public double getX() {
        return x;
    }

    public double getY() {
        return y;
    }

    public void affiche(){
        System.out.println("centre = ( " + x + " , " + y + " )"
        );
    }

}
