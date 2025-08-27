//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        System.out.println("Consumo de combustível:");
        System.out.println(Solution.calculoConsumoCombustivel(500.0, 50.0));
        System.out.println(Solution.calculoConsumoCombustivel(750.0, 60.0));
        System.out.println(Solution.calculoConsumoCombustivel(1000.0, 0.0));
    }
}