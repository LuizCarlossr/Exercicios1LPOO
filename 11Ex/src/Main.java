//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        System.out.println("Conversão de Moeda");
        System.out.println(Solution.conversaoMoeda(500.0, 5.0));
        System.out.println(Solution.conversaoMoeda(-100.0, 5.0));
        System.out.println(Solution.conversaoMoeda(500.0, 0.0));
        System.out.println(Solution.conversaoMoeda(200.0, 4.0));
    }
}