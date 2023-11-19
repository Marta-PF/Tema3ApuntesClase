//Notas del video de la CLase 3 del Jueves 2 de noviembre de 2023

//ESTRUCTURAS DE SELECCIÓN

/*UTILIZANDO "if":
Ponemos como ejemplo las notas de un examen. La variable "nota" va a ser el resultado del exámen.
(La variable "cantidad" es para un ejemplo concreto, nos vamos a centrar más en "nota")
Con el primer System.out.println "Se está ejecutando el programa" tendremos un poco la referencia en pantalla del punto
de partida hasta que llega a la pregunta (if).
 */

public class EntradaIF {
    public static void main(String[] args) {
        int nota =7;
        int cantidad = -1;

        System.out.println("Se está ejecutando el programa");

        /*Nuestro programa se va ejecutando y en determinado momento llega a una pregunta.

        if funciona de forma que si la respuesta a la pregunta es TRUE, se ejecutará aquello que vaya entre los corchetes
        del propio if. Si resulta ser FALSE, se saltará el if (y lo que contengan sus corchetes, claro) y  el programa
        continuará su curso, en este caso finalizará directamente.

        Lo que nuestro if pregunta en este caso básicamente es: "¿Nuestra nota es mayor que 5 (nota>5) Y TAMBIÉN (&&)
        menor que 11 (nota<11)? Si es TRUE, ambas son correctas, quiero que aparezca el texto "Has aprobado" y después
        el programa siga su curso".

        Nuestra nota es 7, de modo que ambas condiciones son TRUE, así que muestra el texto que tiene dentro el if y
        finaliza el programa con un texto final fuera de sus corchetes.

        Si nuestra nota, por ejemplo, fuese 2, no cumpliría las condiciones. De modo que el programa finalizaría
        directamente con el "Terminando programa".

        Podemos añadir más condiciones, por eso tenemos el ejemplo con "cantidad":
        if (nota>5 && nota<11 && cantidad>0) sería FALSE, por ejemplo. Cantidad es -1, es menos que 0. Saltaría el if.

         */
        if(nota>5 && nota<11){
            //La nota es TRUE entre 5-10. Lo que hay entre paréntesis en if es una sola condicion. Una sola "pregunta".
            System.out.println("Has aprobado");

        }
            System.out.println("Terminando programa");
    }

}
