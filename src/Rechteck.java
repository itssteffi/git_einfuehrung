public class Rechteck extends Volume {
    double lange;
    double breite;

    public Rechteck(double hohe, double lange, double breite) {
        super(hohe);
        this.lange = lange;
        this.breite = breite;
    }

    @Override
        public double calcVolumen(double hohe) {
        double v = (lange * breite * hohe)/3;
        return v;
    }
}

