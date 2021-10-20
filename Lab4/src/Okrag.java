

public class Okrag extends Figura {
    Punkt srodek;
    int promien;


    public Okrag() {
        this.srodek = new Punkt(0, 0);
        this.promien = 1;
    }

    public Okrag(Punkt p, int promien) {
        p = new Punkt();
        this.srodek = p;
        this.promien = promien;

    }

    public Okrag(int srednica, Punkt p) {
        this.promien = srednica / 2;
        this.srodek = p;
    }


    public float getPowierzchnia() {

        return Math.round(Math.PI * this.promien * this.promien);
    }

    public int getSrednica() {
        return this.promien * 2;

    }

    public int getPromien() {
        return promien;
    }

    public boolean czyWSrodku(Punkt p) {
        double odlegloscPunktu = (p.x - this.srodek.x) * (p.x - this.srodek.x) + (p.y - this.srodek.y) * (p.y - this.srodek.y);
        if (odlegloscPunktu < promien * promien) {
            return true;
        } else return false;
    }

    public static Okrag okragOpisany(Prostokat p) {
        System.out.println("Generowanie Okręgu opisanego na Prostokącie");
        return new Okrag(p.getSrodek(), (int) p.getPrzekatna() / 2);

    }

    public static Okrag okragWpisany(Prostokat p) {
        // sprawdzene warunku czy Prostokat jest kwadratem(bo tylko w kwadrat można wpisać okrąg)
        if (p.getA() == p.getB()) {
            System.out.println("Generowanie Okręgu wpisanego w Prostokąc");
            return new Okrag(p.getSrodek(), (int) p.getA() / 2); // lub p.get.Przekatna()/2
        } else {
            System.out.println("W podany Prostokąt nie można wpisać okręgu");
            return null;
        }
    }
    public void opis(){
        System.out.println("Okrąg o środku w Punkcie ("+this.srodek.x+","+this.srodek.y+") i promieniu: "+this.promien);
    }
}
