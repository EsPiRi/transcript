/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package ganohesapla;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author Sami
 */
public class GanoHesapla {

    static ArrayList<ders> dersler;
    static int totalDersKredisi=0;
    static double totalBasariPuani=0;
   
    public static void main(String[] args) {
        
        String dersAdi;
    double vizeNotu;
    double finalNotu;
    int kredi;
    int secim;
        Scanner input=new Scanner(System.in);
        System.out.println("Seçim menüsü");
        System.out.println("-------------------------");
        System.out.println("1.Dersler hazir eklensin");
        System.out.println("2.Dersleri kendim eklemek istiyorum");
       secim=input.nextInt();
       ArrayList<ders> dersler= new ArrayList<>();
        
       switch(secim){
           case 1:
       
        dersler.add(new ders("fizik1",80,60,3));
        dersler.add(new ders("calc1",90,90,5));
       dersler.add(new ders("calc2",90,78,5));
        dersler.add(new ders("diff",90,100,4));
      break;
           case 2:
         System.out.println("Ders sayisini giriniz");
        int dersSayisi=input.nextInt();
        
        for(int i=0;i<dersSayisi;i++){
        System.out.println((i+1)+". dersin adini giriniz");
        dersAdi=input.next();
               
        System.out.println(dersAdi+" dersi icin vize notunu giriniz");
       vizeNotu=input.nextDouble();
         System.out.println(dersAdi+" dersi icin final notunu giriniz");
        finalNotu=input.nextDouble();
             System.out.println(dersAdi+" dersinin kredisini giriniz");
             kredi=input.nextInt();
         dersler.add(new ders(dersAdi,vizeNotu,finalNotu,kredi));
         System.out.println("ders kaydi basarili");
       
        }
     break;
           default:
               System.out.println("Yanlis Secim, tekrar deneyin.");
       
    }
        
        
     
        
        
          int i=0;
     for (ders dersler1 : dersler) {
       totalDersKredisi+=dersler.get(i).getDersKredisi();
       totalBasariPuani+=dersler.get(i).getBasariPuani();
       i++;
        }
        
           i=0;
        for (ders dersler1 : dersler) {
        dersler.get(i).printTranscript();
        i++;
        }
        double gano=totalBasariPuani/totalDersKredisi;
        System.out.println(gano);
      
    }
   
    
}
