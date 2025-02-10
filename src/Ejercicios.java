import java.util.ArrayList;
import java.util.Scanner;

//EJERCICIO 1
/*
public class Ejercicios {
    public static void main(String[] args){
        int segundos = 60;
        int minutos = 60;

        int segundos_anio = minutos * segundos * 24 * 365;

        Scanner escaneo =new Scanner(System.in);
        System.out.println("Ingrese los años: ");
        int anios = escaneo.nextInt();
        System.out.println("Ingrese los meses: ");
        int meses = escaneo.nextInt();
        System.out.println("Ingrese los dias: ");
        int dias = escaneo.nextInt();
        int segundos_total = (segundos * minutos * 24 * 365) * anios + (segundos * minutos * 24) * (meses * 30) + (segundos * minutos * 24) *  dias;
        System.out.println("Segundos del tiempo indicado: "+ segundos_total);

    }
}

*/

//EJERCICIO 2

/*
public class Ejercicios {
    public static void main(String[] args){
        System.out.println("El mayor numero que se puede representar para: \n Char:" + Character.MAX_VALUE + "\n Int:" + Integer.MAX_VALUE + "\n Short: " + Short.MAX_VALUE + "\n");
    }
}

*/

//EJERCICIO 3

/*
public class Ejercicios {
    public static void main(String[] args){
        ArrayList<Integer> numeros = new ArrayList<>();
        int cantidad = 0;
        int suma = 0;

        for (int i = 0; i <= 100; i++){
            if (i%5==0){
                cantidad+=1;
                numeros.add(i);
            }
        }
        for (int i = 0; i < numeros.size(); i++){
            suma += numeros.get(i);
        }

        System.out.println("La cantidad de numeros multiplos de 5 entre 0 y 100: " + cantidad);
        System.out.println("Esos numeros son: " + numeros);
        System.out.println("La suma de todos esos numeros: " + suma);
    }
}
*/

//EJERCICIO 4
/*
public class Ejercicios {
    public static void main(String[] args){
        ArrayList<Integer> numeros = new ArrayList<>();
        Scanner escaneo = new Scanner(System.in);
        System.out.println("Ingrese numeros: \n");
        boolean preguntar = true;
        while (preguntar){
            int agregado = escaneo.nextInt();
            if (agregado<0){
                preguntar = false;
            }else
                numeros.add(agregado);

        }
        int maximo = 0;
        int minimo = numeros.get(0);
        for (int i = 0; i < numeros.size(); i++){
            if (numeros.get(i)<minimo){
                minimo = numeros.get(i);
            }
            if (numeros.get(i)>maximo){
                maximo = numeros.get(i);
            }
        }
        System.out.println("El mayor número es: " + maximo);
        System.out.println("El menor número es: " + minimo);

    }
}
*/


//EJERCICIO 5
/*
public class Ejercicios {
    public static void main(String[] args){
        int[] fila = new int[11];
        System.out.print("  ");
        for (int i = 0; i < fila.length; i++){
            fila[i] = i;
            System.out.print("  " + fila[i]);
        }
        System.out.println();
        for (int i = 0; i < fila.length; i++){
            fila[i] = i;
            System.out.print(fila[i] + "-");
            for (int j = 0; j < fila.length; j++){
                int multiplicacion = fila[i]*fila[j];
                if (multiplicacion<10){
                    System.out.print("  " + multiplicacion);

                }else
                    System.out.print(" " + multiplicacion);
            }
            System.out.println();

        }
        Scanner entrada = new Scanner(System.in);
        System.out.println("Introduzca la tabla que deseas buscar (NUMERO): \n");
        int numero = entrada.nextInt();
        ArrayList<Integer> tabla = new ArrayList<>();
        for (int i = 0; i < fila.length; i++){
            tabla.add(fila[i]*numero);
            System.out.println(numero + " x " + i + " = " + tabla.get(i));
        }
    }
}
*/

public class Ejercicios {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Ingrese el numero de primos: ");
        int num = sc.nextInt();
        ArrayList<Integer> primos = new ArrayList<>();

        int denominador = 2;

        for (int i=1; i<=num; i++){
            while (true){
                boolean divisible = false;
                for (int j=2; j<denominador; j++){
                    if (denominador%j==0){
                        divisible = true;
                        denominador++;
                        break;
                    }
                }
                if (!divisible){
                    primos.add(denominador);
                    denominador++;
                    break;
                }
            }
        }
        System.out.println("La lista de numeros primos: " + primos);
    }
}
