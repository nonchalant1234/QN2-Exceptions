/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.sacco.mystery;

/**
 *
 * @author dero
 */
public class Mystery {
    
    /**
     * The mystery method with try-catch-finally
     * Shows that finally block overrides return value
     */
    static int mystery() {
        try {
            System.out.println("A");
            return 1;  // This return is overridden by finally
        } catch (Exception e) {
            System.out.println("B");
            return 2;
        } finally {
            System.out.println("C");
            return 3;  // This overrides the return from try block
        }
    }
    
    /**
     * Main method - Entry point of the program
     */
    public static void main(String[] args) {
        System.out.println("=== DEMONSTRATING TRY-CATCH-FINALLY ===");
        System.out.println("Calling mystery()...");
        System.out.println("Returned value: " + mystery());
        System.out.println("=== END ===");
    }
}
