/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab.pkg2;

/**
 *
 * @author user
 */
public class Lab2 {
public static int ages[] = {20,45,47,38,35,67,18,34};

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws InterruptedException {
        // TODO code application logic here
  
        Thread t1 = new Thread ( new Runnable() {
            @Override
            public void run() {
               for (int i=0; i<ages.length; i++){
                   System.out.println(ages[i]);
               }
            
        }});
    Thread t2 = new Thread (new Runnable() {
            @Override
            public void run() {
                for (int i=0; i<ages.length; i++){
                System.out.println( ages[i]-18);
            }
            }
        });
    Thread t3 = new Thread(new Runnable() {
            @Override
            public void run() {
                for (int i=0; i<ages.length;i++){
                    int f=(ages[i]-18)/5 + 1;
                    
                    System.out.println(f);
                }
            }
        });

t1.start();
t1.join();
t2.start();
t3.start();
    }
}