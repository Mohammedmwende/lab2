/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab.pkg2;
import java.util.concurrent.ExecutorService;  
import java.util.concurrent.Executors;
import java.util.logging.Level;
import java.util.logging.Logger;
/**
 *
 * @author user
 */
public class  lab implements Runnable {
private String message;  
        
public lab(String s){this.message=s;}  

public void run() {  
System.out.println(Thread.currentThread().getName()+"Task 1");  
System.out.println(Thread.currentThread().getName()+"Task 2");
System.out.println(Thread.currentThread().getName()+"Task 3"); 
}  

public static void main(String[] args) {  
ExecutorService executor = Executors.newFixedThreadPool(2);//creating a pool of 3 threads  
for (int i = 0; i < 10; i++) {  
Runnable one = new lab("" + i);  
executor.execute(one);//calling execute method of ExecutorService  
}  
executor.shutdown();  
while (!executor.isTerminated()) {   }  
System.out.println("Finished all threads");  }}      

