//Notas del video de la CLase 3 del Jueves 2 de noviembre de 2023

//ESTRUCTURAS DE SELECCIÓN

/*UTILIZANDO "if elseif else":
En if y en if else hemos visto una sola condición, ahora vamos a trabajar con varias condiciones.
Cada condición es un bloque, vamos comprobando si las condiciones se cumplen de bloque en bloque hasta que dé TRUE
o se nos acaben los bloques (ayuda mucho dibujar el esquema en un papel primero).

Nuestro primer bloque equivale a la primera condicion: preparamos un if con las condiciones del suspenso, que debe ser
mayor o igual que 1 hasta 4.99 (nota>=1 && nota<5).

Segunda condición: Si nuestra primera condición es FALSE, saltaremos a la siguiente. La segunda condicion funcionará
como un else, pero escribiremos else if en su lugar. else if nos proporciona otro paréntesis donde podemos escribir
nuestra segunda condición (el aprobado es: nota>=5 nota<7) y podemos añadir otro texto.
Si sale FALSE, saltamos a la tercera condición. Si es TRUE, sale nuestro texto nuevo y termina.

Tercera condición: Creamos otro else if con sus propios corchetes, texto etc.
La condición del notable: (nota>=7 && nota<10) ((Ten cuidado con el nota<10, te equivocas mucho y pones 9.99 como
el enunciado)). Igual que antes, si es TRUE termina el programa, si es FALSE continúa a la siguiente condición.

Cuarta condición: El sobresaliente. Mismo procedimiento que antes, la condición esta vez será (nota<=9 && nota>9.99)

¡¡OJO!! Quinta (y última) condición: Matrícula de honor. Esta es la condición que sucede cuando no quedan más,
es "LO QUE SOBRA", y lo que sobra se trata con un else a secas, no necesitamos nada más, no hay que preguntar nada, es
que no hay más opción que esta.

Ahora podemos probar con distintos valores en "nota".

Puede haber un if dentro de otro if, pero pondré el ejemplo en otro documento de clase que sea la parte 2.
 */


public class Entrada_IF_ELSEIF_ELSE {

    public static void main(String[] args) {

        int nota =1;

        System.out.println("Se está ejecutando el programa");

        /* Condiciones (Los números que valen son del 1 al 10):
        1) suspenso De 1 a 4.99
        2) aprobado De 5 a 6.99
        3) notable De 7 a 8.99
        4) sobresaliente De 9 a 9.99
        5) matrícula de honor 10
         */

        if(nota>=1 && nota<5){
            System.out.println("Has suspendido");
        } else if (nota>=5 && nota<7){
            System.out.println("Has aprobado");
        } else if (nota>=7 && nota<9) {
            System.out.println("Tienes un notable");
        } else if (nota>=9 && nota<10) {
            System.out.println("¡Enhorabuena! ¡Tienes un sobresaliente!");
        } else {
            System.out.println("¡¡Enhorabuena!! ¡Matrícula de honor!");
        }


        System.out.println("Terminando programa");
    }
}
