//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        System.out.println("Soma: " + Solution.operacoesSimples(3, 5, "+"));
        System.out.println("Subtração: " + Solution.operacoesSimples(7, 2, "-"));
        System.out.println("Divisão: " + Solution.operacoesSimples(9, 0, "/"));
        System.out.println("Multiplicação: " + Solution.operacoesSimples(4, 2, "*"));
        System.out.println("Números Inteiros: " + Solution.operacoesSimples(4, 2, "%"));

    }
}