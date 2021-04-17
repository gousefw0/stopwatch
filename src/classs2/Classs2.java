/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package classs2;

import java.util.Scanner;

/**
 *
 * @author yousef walid
 */
public class Classs2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
          Scanner input = new Scanner(System.in);
        StopWatch obj = new StopWatch();
        System.out.println("Enter S to start ");
        String i = input.nextLine();
        if (i == "S" || i == "s") {
            obj.start();
        }
        System.out.println("Watch Started");
        System.out.println("Enter E to End ");
        String x = input.nextLine();
        if (x == "E" || x == "e") {
            obj.end();

        }
        System.out.println("The  total time is " + obj.getElapsedtime() + " MS");

    }

    }
    

class StopWatch {

    private double start_time;
    private double end_time;

    public double getStart_time() {
        return start_time;
    }
    public double getEnd_time() {
        return end_time;
    }
    public StopWatch() {
        this.start_time = System.currentTimeMillis();
    }
    public void start() {
        start_time = System.currentTimeMillis();

    }
    public void end() {
        end_time = System.currentTimeMillis();
    }
    public double getElapsedtime() {

        return ( end_time-start_time );
    }
    
}
