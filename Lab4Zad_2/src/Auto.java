import java.util.Random;


public class Auto {

    float [] przebieg = new float[12];
    Random r = new Random();

    public Auto(){
        for(int i=0;i<this.przebieg.length;i++){
            this.przebieg[i]= r.nextFloat()*1000;

        }
        for(float km:this.przebieg){
            System.out.println(String.format("%.3f", km)+" km");
        }


    }
    public float srPrzebieg(){

        float suma=0;
        for(int i=0;i<this.przebieg.length;i++){
            suma+=this.przebieg[i];
        }

       return suma/this.przebieg.length;

    }

}
