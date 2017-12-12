package com.company;

public class Negyzet {
    private double [] kozeppont;
    private boolean peneszes= false;
    public Negyzet(double[] hely){ kozeppont= hely;}
    public boolean beleloge() {return peneszes;}
    public void megvaltoztat(boolean legyen){peneszes=legyen;}  
}
