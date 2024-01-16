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
public class game {
    public static void main(String[] args) {
        player hero = new player();
        player enemy = new player();
        
        
        
        hero.name = "isclair";
        hero.speed = 60;
        hero.healthPoin = 100;
        hero.attack = 100;
        
        
        enemy.name ="cocolia ";
        enemy.speed = 20;
        enemy.armor = 5;
        enemy.healthPoin = 90;
        
        
       
       
        
        
        hero.run();
        
        
        enemy.run();
        
        
        if(hero.isDead()){
            System.out.println("Game Over :( ");
            
        if(enemy.isDead()){
            System.out.println("you win :D");
        }
        }
        Drone dji = new Drone();
        
        dji.energi = 50;
        dji.ketinggian = 100;
        dji.kecepatan = 60;
        dji.merek = "xiaomi";
        dji.terbang();
        dji.MematikanMesin();
        dji.maju();
        dji.mundur();
        dji.belok();
        dji.turun();
        
    
    anjing pet = new anjing();
        pet.stamina = 70;
        pet.kecepatan = 50;
        pet.ketinggian = 10;
        pet.nama = "bony";
        pet.berjalan();
        pet.berhenti();
        pet.berlari();
        pet.melompat();
        pet.suara();
        
        
        
    
    
}
}
    

    
    

