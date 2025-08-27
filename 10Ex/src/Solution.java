public class Solution {
    public static double calculoConsumoCombustivel(double distancia, double combustivel) {
        if (combustivel <= 0) {
            return 0.0;
        }

        double consumoMedio = distancia / combustivel;

        return Math.round(consumoMedio * 100.0) / 100.0;
    }
}
