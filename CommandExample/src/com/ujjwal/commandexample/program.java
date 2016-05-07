  /*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.ujjwal.commandexample;

import com.ujjwal.commandexample.commands.CommandFactory;
import com.ujjwal.commandexample.commands.commands;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 *
 * @author ujjwal
 */
public class program {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws IOException {
        CommandFactory factory = new CommandFactory();
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        
        System.out.println("Enter num1:");
        double x = Double.parseDouble(reader.readLine());
        System.out.println("Enter the second number");
        double y = Double.parseDouble(reader.readLine());
        
        System.out.println("1. press + for +");
        System.out.println("2. press - for -");
        System.out.println("3. press * for *");
        System.out.println("4. press / for /");
        System.out.println("5. press > for calculating greater of two numbers");
        System.out.println("6. press / for calculating smaller of two numbers");
        String command = reader.readLine();
        
        commands c = factory.getCommand(command);
        System.out.println(c.execute(x, y));
        
    }
    
}
