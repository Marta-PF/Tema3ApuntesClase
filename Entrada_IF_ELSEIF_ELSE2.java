//Notas del video de la CLase 3 del Jueves 2 de noviembre de 2023

//ESTRUCTURAS DE SELECCIÓN

/*UTILIZANDO "if elseif else" PARTE 2 (INCLUYE EJEMPLO DE Scanner Y EJEMPLO DE if ternario/condicional ? ):
Aquí tenemos el código en el que un if va dentro de otro if. La primera condición del if marcará que solo se ejecutará
el if que lleva dentro si el valor de "nota" está entre 1 o 10 (10 incluído). Si el valor de nota no cumple esa
condición, se saltará el if interno. A la hora de escribir basta con meter el segundo if entre los corchetes del primero.

En caso de que no se cumpla la condición del primer if (FALSE), podemos añadir un else detrás de su corchete de cierre con
la acción que queremos que suceda. En este caso un texto de "Número no válido".

¡OJO! AL crear un if dentro de otro if tener cuidado de no poner una condición demasiado genérica la primera, corres el
riesgo de que sea tan amplia que anule a las que van después.
*/


import java.util.Scanner;

public class Entrada_IF_ELSEIF_ELSE2 {

    public static void main(String[] args) {

        int nota =126;

        System.out.println("Se está ejecutando el programa");

        /* Condiciones (Los números que valen son del 1 al 10):
        1) suspenso De 1 a 4.99
        2) aprobado De 5 a 6.99
        3) notable De 7 a 8.99
        4) sobresaliente De 9 a 9.99
        5) matrícula de honor 10
         */
        if (nota>1 && nota<=10) {
            if (nota >= 1 && nota < 5) {
                System.out.println("Has suspendido");
            } else if (nota >= 5 && nota < 7) {
                System.out.println("Has aprobado");
            } else if (nota >= 7 && nota < 9) {
                System.out.println("Tienes un notable");
            } else if (nota >= 9 && nota < 10) {
                System.out.println("¡Enhorabuena! ¡Tienes un sobresaliente!");
            } else {
                System.out.println("¡¡Enhorabuena!! ¡Matrícula de honor!");
            }
        }
        else {
            System.out.println("Número no válido");
        }

        /*Ahora vamos a hacer un ejemplo que incluye el uso de Scanner.
        Scanner sirve para que el usuario pueda introducir un dato escribiendo con el teclado. Nuestro programa lo lee.
        Vamos a pedir al usuario que introduzca un número y el programa responda si es un número par.
         */

        Scanner scanner = new Scanner(System.in);   //comando para hacer lecturas por teclado.
        System.out.println("Introduce el número a evaluar");

        /*Creamos nuestra variable int con el número a introducir y lo igualamos a scanner. seguido de lo que queremos
        que lea. Va a leer un int, de modo que será scanner.nextInt()
        Si, por ejemplo, fuese a leer un String, sería scanner.next() a secas. Con flow o double hay que tener cuidado
        al poner el punto o la coma del decimal, puede dar error si no está escrito con el correcto.
         */

        int numero = scanner.nextInt();

        //¿Es par el número? ¿Cómo podemos saberlo?
        //Sabemos que un número par se puede dividir (/) entre 2
        //En otras palabras, llevado a código -> Si el resto (%) de dividir entre 2 es 0

        if (numero%2==0){                       //"Si el resto de dividir el numero entre 2 es 0, es par"
            System.out.println("Número par");

        } else {
            System.out.println("Número impar");    //(else: No hace falta preguntar, lo que queda solo puede ser "impar")
        }





        //------- if ternario -----

        /* if ternario/condicional ? : doy una condición, pongo una ? y aquí vas a poner el valor de la condición cuando
        la condición es TRUE (valor_true) : y el valor cuando la condición es FALSE (valor_false)
         */


        String par = numero%2==0 ? "Es par" : "Es impar";       /*¿El resultado es par o impar? La condición es (en este caso número%2==0) seguido de ? y el
                                                                texto "Es par" (en caso de que sea true) añadimos dos puntos (:) y el texto "Es impar" si
                                                                la condicion es false.
                                                                la variable par será TRUE "Es par" siempre y cuando se cumpla la condición numero%2==0
                                                                la variable par será FALSE "Es impar" cuando no se cumpla la condición
                                                                Se utiliza en ocasiones muy puntuales y básicas con respuesta SI o NO.
                                                                */
        System.out.println(par);


        //----------------------



        System.out.println("Terminando programa");
    }
}



































