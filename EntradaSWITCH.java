//Notas del video de la CLase 3 del Jueves 2 de noviembre de 2023

//ESTRUCTURAS DE SELECCIÓN

/*UTILIZANDO "switch":
Es muy parecido a if elseif else, pero es una estructura más clara y directa.
Con switch disponemos de multiples opciones, automáticamente se selecciona una y el programa continúa.
Cuando llegamos a la expresión, a la pregunta que nos ofrece múltiples respuestas, se evalúa un VALOR (no un TRUE O FALSE
como en if).
Ese valor puede ser: Un número (int); una letra (char) o un String
*/


import java.lang.runtime.SwitchBootstraps;
import java.util.Scanner;

public class EntradaSWITCH {

    public static void main(String[] args) {
        //Por ejemplo, vamos a hacer que la consola lea un número introducido por teclado.
        System.out.println("Iniciando programa");

        Scanner scanner = new Scanner(System.in);
        System.out.println("Introduce número");
        int numero = scanner.nextInt();


        //Pongamos que queremos el número 6 y tenemos distintas acciones posibles:
        //Si el número introducido es 1 -> Queremos que se ejecute una cosa, digamos a)
        //Si el número introducido es 4 -> Queremos que se ejecute b)
        //Si el número introducido es 6 -> Queremos que se ejecute c)
        //Si se introduce otro número   -> Queremos que se ejecute d)

        /*Queremos evaluar casos concretos. La diferencia con if else es que no va preguntando uno tras otro, va directamente
        a la respuesta que corresponde y la ejecuta.

        Se contruye escribiendo "switch (){}" (sin comillas)
        Dentro de los paréntesis va el identificador del valor que queremos evaluar.

        Dentro de los corchetes realizamos una lista con "case 1:" (1 es el valor que lo activa, podría ser una palabra entre comillas también)
        ponemos lo que vamos a ejecutar y cerramos con "break; para finalizar el switch y salir para continuar ejecutando el programa.
        Si no ponemos break, seguirá ejecutando un caso tras otro hasta terminar.

        Luego el case 4, el case 6 que son las respuestas que desencadenan una acción.

        Dentro de cada case podemos incluir un if si queremos.

        ¡Ojo! Con dónde declaramos las variables, si es dentro de un bloque solo existe dentro del bloque, no fuera. "if" {}
        son bloques. Y la variable siempre tiene que tener un valor mínimo. Puede que tenga valor dentro de if, pero si
        no lo tiene fuera y vuelves a utilizar esa variable, no funcionará. Necesitarás darle un valor, en String podria ser
        igualar a "". ¡OJO! x 2 Me pierdo un poco, porque si tiene valor en else sí funciona. Investigar el "AMBITO DE LAS VARIABLES"
        La cuestión es que en switch, si por ejemplo, creamos una variable en el case 1 y luego intentamos llamarla desde
        case 4, no podremos hacerlo porque case 1 terminará con el break, por lo que la variable de case 4 nunca recibirá ese valor.
         */

        switch (numero){
            case 1:
                //Ejemplo de variable: String saludo = "Hola Don Pepito";
                System.out.println("El valor es 1");
                break;
            case 4:
                // saludo = "Hola Don José"; --> nunca recibirá el valor, case 1 ya ha terminado y ha saltado a continuar el programa
                System.out.println("El valor es 4");
                break;
            case 6:
                System.out.println("El valor es 6");
                break;
            default:                                        //default no es obligatorio, pero si recomendado para las opciones restantes
                System.out.println("Valor no contemplado");
                break;                                     //este break; se puede omitir, pero se puede añadir para no perder el hábito

        }

        System.out.println("Terminando el programa...");









    }
}
