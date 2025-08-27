public class Solution {
    public static double conversaoTemperatura(double temperatura, String escala) {
        if (escala.equals("C")) {
            double fahrenheit = (temperatura * 9 / 5) + 32;
            return Math.round(fahrenheit * 100.0) / 100.0;
        } else if (escala.equals("F")) {
            double celsius = (temperatura - 32) * 5 / 9;
            return Math.round(celsius * 100.0) / 100.0;
        } else {
            return 0.0;
        }
    }
}
