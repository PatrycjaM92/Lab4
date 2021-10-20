import java.util.Random;

public class Taxi extends Auto {

    float[] zarobki=new float[12];
    Random r=new Random();


    public Taxi (){
        for(int i=0;i<this.zarobki.length;i++){
            this.zarobki[i]=r.nextFloat()*10;
        }

    }

    public float srZarobki(){

        float suma=0;
        for(int i=0;i<this.zarobki.length;i++){
            suma+=this.zarobki[i];
        }
        return suma/this.zarobki.length;
    }
    public static void main(){
        Taxi t1=new Taxi();
        System.out.println("Sredni przebieg: "+String.format("%.3f", t1.srPrzebieg())+"km.");
        System.out.println( "Średnie zarobki "+ String.format("%.3f",t1.srZarobki())+"zł");
    }


}
