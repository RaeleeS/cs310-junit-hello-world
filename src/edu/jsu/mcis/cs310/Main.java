package edu.jsu.mcis.cs310;

public class Main {

    public static void main(String[] args) {
        
        Main m = new Main();
        String message = m.getGreeting();
        
        System.out.println(message);
        System.out.println(m.reverse(message));
        
    }
    
    public String getGreeting() {
        return "Hello, World!";
    }
    
    public String reverse(String message) {
        String reversed = "";   
        for (int i = message.length() - 1; i >= 0; i--) { 
            reversed += message.charAt(i); 
        }
        return reversed; 
    }
        
 }