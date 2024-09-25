/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.account;

/**
 *
 * @author User
 */
public class CarProperties {
    private int topSpeed;
    private int currSpeed;
    private String color;
    private String model;
    private String manufacturer;
    private String plateNumber;

    public CarProperties(int topSpeed, int currSpeed, String color, String model, String manufacturer, String plateNumber) {
        this.topSpeed = topSpeed;
        this.currSpeed = currSpeed;
        this.color = color;
        this.model = model;
        this.manufacturer = manufacturer;
        this.plateNumber = plateNumber;
    }

    public int getTopSpeed() {
        return topSpeed;
    }

    public void setTopSpeed(int topSpeed) {
        this.topSpeed = topSpeed;
    }

    public int getCurrSpeed() {
        return currSpeed;
    }

    public void setCurrSpeed(int currSpeed) {
        this.currSpeed = currSpeed;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public String getManufacturer() {
        return manufacturer;
    }

    public void setManufacturer(String manufacturer) {
        this.manufacturer = manufacturer;
    }

    public String getPlateNumber() {
        return plateNumber;
    }

    public void setPlateNumber(String plateNumber) {
        this.plateNumber = plateNumber;
    }
    
    public boolean accelerate(){
        if(currSpeed < topSpeed){
            currSpeed += 10;
            System.out.println("Increasing speed to " + currSpeed);
            return true;
        }else
        System.out.println("Reached top speed!");
        return false;
    }
    
    public boolean decelerate(){
        if(currSpeed > 0){
            currSpeed -= 10;
            System.out.println("Decelerating to " + currSpeed);
            return true;
        }
        System.out.println("At full stop!");
        return false;
    }

    
    public void display(){
        System.out.println(this.toString());
        System.out.println("\n\n");
    }
    
    
    @Override
    public String toString() {
        return "CarProperties" + "\ntopSpeed = " + topSpeed + "\ncurrSpeed = " + currSpeed + "\ncolor = " + color + "\nmodel = " + model + "\nmanufacturer = " + manufacturer + "\nplateNumber = " + plateNumber;
    }
    
    
    
}
