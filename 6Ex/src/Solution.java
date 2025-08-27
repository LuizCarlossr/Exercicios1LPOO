public class Solution {
    public static Object operacoesSimples(int a, int b, String operacao) {
        switch (operacao) {
            case "+":
                return a + b;
            case "-":
                return a - b;
            case "*":
                return a * b;
            case "/":
                if (b == 0) {
                    return "Divisão por zero não permitida";
                } else {
                    return a / b;
                }
            default:
                return "Operação inválida";
        }
    }
}
