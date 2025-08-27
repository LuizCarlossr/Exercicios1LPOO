public class Solution {
    public static double conversaoMoeda(double valorReais, double taxaCambio) {
        if (valorReais <= 0 || taxaCambio <= 0) {
            return 0.0;
        }

        double valorDolares = valorReais / taxaCambio;

        return Math.round(valorDolares * 100.0) / 100.0;
    }
}
