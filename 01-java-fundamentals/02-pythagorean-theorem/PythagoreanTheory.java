import java.lang.Math;
public class PythagoreanTheory {
    public double calculateHypotenuse(int legA, int legB) {
        double c = ((legA*legA)+(legB*legB));
        double squareRoot = Math.sqrt(c);
        System.out.println(squareRoot);
        return squareRoot;
    }
}