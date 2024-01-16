/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package semester2;

/**
 *
 * @author MOKLET001
 */
public class player {
    String name ;
    int attack;
    int speed;
    int damage = 100;
    int armor = 100;
    int healthPoin = 100;
    
    void run(){
         System.out.println(name +" is running...");
        System.out.println("Speed: "+ speed);
        System.out.println("attack "+damage);
        System.out.println("defend "+ armor);
        System.out.println(name+"is attacking ....");
        
    }
    boolean isDead(){
         if(healthPoin <= 0)
            return true;
            return false;
    }
}
