/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tp3_ce;

import java.util.Random;

/**
 *
 * @author Aluno
 */
public class TP3_CE {

    /**
     * @param args the command line arguments
     */
    static Individual population[];
    static final int N = 20;
    
    public static void main(String[] args) {
        // TODO code application logic here
        
        population = new Individual[N];
        
        generate_initial_population();
        
    }
    
    public static void generate_initial_population() {
        double number, x;
         Random random = new Random();        
               
        for (int i = 0; i < population.length; i++) {
            Individual ind = new Individual();
            
            number = random.nextInt(33) - 15;
            x = number;
            
            ind.setX(x);
            
            population[i] = ind;
        }
    }
    
}
