package Udemy;

public class Challenge1 {
    // Só pode mexer dentro do metodo main para corrigir o erro.
    int a = 3;
    public static void main (String[] arg) {
        // Poderia simplesmente colocar um static na var a e isso já resolveria.

        // Minha resolução do erro foi fazer um construtor b que chama a class Challenge1.
        // Depois passei uma var x que chama o arg da class.
        // No caso a Class recebe o aregumento de a = 3 e b recebe o construtor da class e x recebe class.arg = b.a
        Challenge1 b = new Challenge1();
        int x = b.a;
        System.out.println(x);
    }
}
