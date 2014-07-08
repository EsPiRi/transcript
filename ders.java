/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package ganohesapla;

/**
 *
 * @author Sami
 */
public class ders {
   private String dersAdi;
   private double vizeNotu;
   private double finalNotu;
   private double basariNotu;
   private double dersKredisi;
   private double basariPuani;

    public double getBasariPuani() {
        return basariPuani;
    }

   public ders(){
       setBasariNotu();
   }
   public ders (String dersAdi, double vizeNotu, double finalNotu, double dersKredisi){
       this.dersAdi=dersAdi;
       this.vizeNotu=vizeNotu;
       this.finalNotu=finalNotu;
       this.dersKredisi=dersKredisi;
       setBasariNotu();
   }
   
    public String getDersAdi() {
        return dersAdi;
    }

    public void setDersAdi(String dersAdi) {
        this.dersAdi = dersAdi;
    }

    public double getVizeNotu() {
        return vizeNotu;
    }

    public void setVizeNotu(double vizeNotu) {
        this.vizeNotu = vizeNotu;
    }

    public double getFinalNotu() {
        return finalNotu;
    }

    public void setFinalNotu(double finalNotu) {
        this.finalNotu = finalNotu;
    }

    public double getBasariNotu() {
        return basariNotu;
    }

    public void setBasariNotu() {
        basariNotu = (this.getVizeNotu()*0.6)+(this.getFinalNotu()*0.4);
        if(basariNotu<50){
            basariPuani=0*dersKredisi;
        }
        else if(basariNotu>=50&&basariNotu<55){
            basariPuani=1*dersKredisi;
        }
        else if(basariNotu>=55&&basariNotu<65){
            basariPuani=1.5*dersKredisi;
        }
        else if(basariNotu>=65&&basariNotu<75){
            basariPuani=2*dersKredisi;
        }
        else if(basariNotu>=75&&basariNotu<80){
            basariPuani=2.5*dersKredisi;
        }
        else if(basariNotu>=80&&basariNotu<85){
            basariPuani=3*dersKredisi;
        }
        else if(basariNotu>=85&&basariNotu<90){
            basariPuani=3.5*dersKredisi;
        }
        else{
            basariPuani=4*dersKredisi;
        }
    }

    public double getDersKredisi() {
        return dersKredisi;
    }
    
     public  void printTranscript(){
       System.out.println(this.toString());
        
    }

    @Override
    public String toString() {
        return  "dersAdi=" + dersAdi + ", vizeNotu=" + vizeNotu + ", finalNotu=" + finalNotu + ", basariNotu=" + basariNotu + ", dersKredisi=" + dersKredisi + ", basariPuani=" + basariPuani;
    }
  
            
   
    
    
    
    
    
}
