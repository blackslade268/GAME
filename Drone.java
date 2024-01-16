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
public class Drone {
    int energi;
    int ketinggian;
    int kecepatan;
    String merek;
    
    
    
    void terbang(){
        energi--;
        if(energi> 10){
            ketinggian++;
            System.out.println("Drone terbang...");
            
        }else {
            System.out.println("energi lemah: Drone tidak bisa terbang");
            
        }
    }
    void MematikanMesin(){
        if(ketinggian > 0){
            System.out.println("mesin tidak bisa dimatikan karena sedang terbang");
        }else{
            System.out.println("mesin dimatikan...");
        }
    }
    void turun(){
        ketinggian--;
        energi--;
        System.out.println("Drone turun");
    }
    void belok(){
        energi--;
        System.out.println("Drone belok");
    }
    void maju(){
        energi--;
        System.out.println("Drone maju ke depan");
        kecepatan++;
        
    }
    void mundur(){
        energi--;
        System.out.println("Drone mundur");
        kecepatan++;
    }
}
