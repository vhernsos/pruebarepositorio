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

        if (numero < 50){
            System.out.println("El numero " + numero  + " es menor que 50");
        } else if (numero > 50){
            System.out.println("El numero " + numero  + " es mayor que 50");
        } else {
            System.out.println("El numero " + numero  + " es igual a 50");
        }

        //sentencia switch- case
        System.out.println("Ingrese el color(Rojo, Verde o Azul): ");
        char colores = escaneo.next().charAt(0);
        switch (colores){
            case 'R':
            case 'r':
                System.out.println("El color es Rojo");
                break;
            case 'V':
            case 'v':
                System.out.println("El color es verde");
                break;
            case 'A':
            case 'a':
                System.out.println("El color es Azul");
                break;
            default:
                System.out.println("El color no es valido");
        }
        int suma = 0;
        for (int i = 0; i < 10; i++){
            suma = suma + i;
            System.out.println(suma);
        }
        int par = 1;
        while (par %2 != 0){
            System.out.println("Ingrese un numero par: ");
            par = escaneo.nextInt();
        }

    }
}