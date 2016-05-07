/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.ujjwal.commandexample.commands;

/**
 *
 * @author ujjwal
 */
public class MinCommand extends commands{

    @Override
    public double execute(double x, double y) {
        return (x<y)?x:y;
    }
    
}
