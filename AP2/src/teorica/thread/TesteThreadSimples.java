/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package teorica.thread;

/**
 *
 * @author PauloCésar
 */
public class TesteThreadSimples {
    public static void main(String[] args) {
        
        ThreadSimples ts1 = new ThreadSimples("Fulano");
        ThreadSimples ts2 = new ThreadSimples("Beltrano");Thread t1 = new Thread(ts1);
                
        ts2.start();
        ts1.start();
    }
}
