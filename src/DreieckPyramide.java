public class DreieckPyramide extends Volume {

    double baseLength;
    double baseHeight;
    public DreieckPyramide(double baseLength, double baseHeight, double hohe) {
        super(hohe);
        this.baseLength = baseLength;
        this.baseHeight = baseHeight;

    }

    @Override
    public double calcVolumen(double hohe) {
        double baseArea = 0.5 * baseLength * baseHeight;
        return (1.0 / 3) * baseArea * hohe;
    }


}

