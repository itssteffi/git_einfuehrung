public class Main {
    public static void main(String[] args) {
        System.out.println("Hello Endri");
        System.out.println("aaaaaa");
        System.out.println("Grupi ma i mire");
        System.out.println("Hallo");

        Rechteck rechteck = new Rechteck(5, 4, 2);
        System.out.println("Volumen des Quaders: " + rechteck.calcVolumen(5));

        DreieckPyramide pyramid = new DreieckPyramide(6, 4, 10);
        System.out.println("Volume of the pyramid: " + pyramid.calcVolumen(10));
    }


}