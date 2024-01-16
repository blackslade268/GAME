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
public class anjing {
    int stamina;
    int kecepatan;
    
    int ketinggian;
    String nama;

void berjalan(){
    stamina++;
    System.out.println("berjalan");
}
void berlari(){
    stamina--;
    System.out.println("berlari");
    kecepatan++;
}
void suara(){
    System.out.println("woff");
}
void melompat(){
    stamina--;
    System.out.println("hop!");
    ketinggian++;
}
void berhenti(){
    stamina++;
    System.out.println("  ");
    kecepatan--;
    
}

}
