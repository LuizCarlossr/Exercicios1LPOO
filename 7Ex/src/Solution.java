public class Solution {
    public static double calculoJurosSimples(double capital, double taxa, int tempo) {
        double juros = capital * taxa * tempo;

        return Math.round(juros * 100.0) / 100.0;
    }
}
