/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.ujjwal.commandexample.commands;

import java.util.HashMap;

/**
 *
 * @author ujjwal
 */
public class CommandFactory {
    private HashMap<String,commands> command = initialize();
    
    private HashMap<String, commands> initialize(){
        HashMap<String, commands> c = new HashMap<>();
        c.put("+", new addcommand());
        c.put("-", new subcommand());
        c.put("*", new mulcommand());
        c.put("/", new divcommand());
        c.put(">", new MaxCommand());
        c.put("<", new MinCommand());
        return c;
    }
    
    public commands getCommand(String key){
        if(isCommand(key)){
            return (commands)command.get(key);
        }
        else
            return null;
    }
    
    public Boolean isCommand(String key){
        return command.containsKey(key);
    }
    
}
