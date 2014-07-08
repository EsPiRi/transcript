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
        
        Scanner input=new Scanner(System.in);
       
       // System.out.println("Ders sayisini giriniz");
       // int dersSayisi=input.nextInt();
        ArrayList<ders> dersler= new ArrayList<ders>();
        
        dersler.add(new ders("fizik1",45,60,3));
        dersler.add(new ders("calc1",90,90,5));
        dersler.add(new ders("calc2",36,78,5));
        dersler.add(new ders("diff",0,0,3));
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
        
      /*  for(int j=0;j<dersler.length;j++){
            dersler[j]=new ders();
        }*/
       /* for(int i=0;i<dersler.length;i++){
        System.out.println((i+1)+". dersin adini giriniz");
        
        dersler[i].setDersAdi(input.next());
        System.out.println("ders kaydi basarili");
        
        
        }*/
        
        
       /* for (ders dersler1 : dersler) {
            System.out.println(dersler1.getDersAdi() + " dersi icin vize notunu giriniz");
            
            dersler1.setVizeNotu(input.nextDouble());
            System.out.println(dersler1.getDersAdi() + " dersi icin final notunu giriniz");
            dersler1.setFinalNotu(input.nextDouble());
        }*/
        
        
        
        
        
        // TODO code application logic here
    }
   
    
}
