
import java.util.Scanner;

// por Alvaro Calderon - 250226
public class Principal {
    // public: el acceso a este archivo es publico, que se acceso puede ser 
    // desde cualquier otra Clase.

    // class: es la palabra reservada para indicar que comienza una Clase.
    public static void main(String[] Args) {
        //acceso publico que no cambia y que no retorna valores
        System.out.print("Hola Mundo!, estoy en Quinto!");
        System.out.println(" Aqui no hay salto de linea");

        // Estructura condicional if
        // verificar si un numro es positivo o negativo
        // 1) declarar variable numero como entero a trabajar
        int numero = 0;
        // 2) solicitar el numero al usuario
        Scanner leer = new Scanner(System.in);
        numero = leer.nextInt();
        // 3) verificar numero
        System.out.println("El numero ingresado es: " + numero);
        if (numero > 0) {
            System.out.println("El numero: " + numero + " es positivo");
        } else if (numero < 0) {
            System.out.println("El número: " + numero + " es negativo");
        } else {
            System.out.println("Es Cero ");
        }
        System.out.println("----------------------------------------------");
        //2- Indicar si un alumno aprobó o reprobró segun una nota ingresada +70
//        nota
//        
//                si es mayor 70 = aprobó
//                si es menor a 70 = reprobó
//                es igual a 70 = aprobó

        System.out.println("----------------------------------------------");

        // 3- Cambiar la nota ingresada a una letra según se indica en el cuadro:
//        A para 90
//        B para 80
//        C para 70
//        D para 60
//        E para 50
//        F para otros
        /*
        4- Pedir dos números y decir si uno es múltiplo del otro.
        5- Pedir dos números y decir cual es el mayor o si son iguales.
        6- Pedir dos números y mostrarlos ordenados de mayor a menor.
         */
        // califica una tarea se de indicar si fue "Excelente", muy bien, buena
        // regular, mala, deficiente
        // switch
        int puntoTarea;
        System.out.println("Ingrese el resultado de su tarea:");
        System.out.println(">");
        puntoTarea = leer.nextInt();

        switch (puntoTarea) {
            case 10:
                System.out.println("Excelente");
                break;
            case 9:
                System.out.println("Muy bueno");
                break;
            case 8:
                System.out.println("Bueno");
                break;
            case 7:
                System.out.println("Aceptable");
                break;
            case 6:
                System.out.println("Regular");
                break;
            case 5:
                System.out.println("Insuficiente");
                break;
            default:
                System.out.println("Necesita mejorar");
                break;
        }
        //  Pedir una nota numérica entera entre 0 y 10, y mostrar dicha nota 
        // de la forma: cero, uno, dos, tres...

    }

}
