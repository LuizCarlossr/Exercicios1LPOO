public class Solution {
    public static double calculoImposto(double renda) {
        double imposto = 0.0;

        // Faixa 1: Isento até R$ 2.000,00
        if (renda <= 2000.00) {
            return imposto;
        }

        // Faixa 2: Renda entre R$ 2.000,01 e R$ 3.000,00
        if (renda <= 3000.00) {
            imposto += (renda - 2000.00) * 0.08;
            return imposto;
        }

        // Faixa 3: Renda entre R$ 3.000,01 e R$ 4.500,00
        if (renda <= 4500.00) {
            imposto += (1000.00) * 0.08;
            imposto += (renda - 3000.00) * 0.18;
            return imposto;
        }

        // Faixa 4: Renda acima de R$ 4.500,01
        imposto += (1000.00) * 0.08;
        imposto += (1500.00) * 0.18;
        imposto += (renda - 4500.00) * 0.28;

        return imposto;
    }
}
