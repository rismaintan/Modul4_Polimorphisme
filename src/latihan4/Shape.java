/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package latihan4;

/**
 *
 * @author rismaiw
 */
public class Shape {
    //private member variabel
    private String color;
    //construktor
    public Shape(String color){
        this.color = color;
    }
    public String toString(){
        return "Shape[color =" +color + "]";
        
    }
    //all shape must have a method calles getArea().
    public double getArea(){
        System.out.println("Shape unknows !cannot compute area!");
        return 0;
    }
}
