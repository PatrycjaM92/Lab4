public class Prostokat {
    private double a;
    private  double b;
    private double przekatna;
    private Punkt srodek =new Punkt();

    Prostokat(Punkt srodek,double a, double b){
        this.a=a;
        this.b=b;
        this.srodek=srodek;

    }
    public double getA(){
        return a;
    }

    public double getB() {
        return b;
    }

    public double getPrzekatna(){
        this.przekatna = Math.sqrt((a*a)+(b*b));
        return przekatna;
    }

    public Punkt getSrodek(){
        return srodek;
    }


}