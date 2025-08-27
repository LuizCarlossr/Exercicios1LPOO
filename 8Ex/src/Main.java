//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        System.out.println("Conversão de Celsius para Fahrenheit e vice-versa.");
        System.out.println(Solution.conversaoTemperatura(100.0, "C"));
        System.out.println(Solution.conversaoTemperatura(32.0, "F"));
        System.out.println(Solution.conversaoTemperatura(0.0, "C"));
        System.out.println(Solution.conversaoTemperatura(212.0, "F"));
        System.out.println(Solution.conversaoTemperatura(100.0, "K"));
    }
}