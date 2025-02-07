import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        int numero1 = 2;
        String hola = "hola";
        System.out.println("El numero es: " + numero1 + " y la palabra es: " + hola);

        Scanner escaneo = new Scanner(System.in);
        System.out.println("Ingrese el nombre: ");
        int numero = escaneo.nextInt();
        System.out.println("El numero es " + numero);

        if (numero%2 == 0){
            System.out.println("El numero " + numero  + " es par");
        } else
            System.out.println("El numero " + numero  + " es impar");
    }
}