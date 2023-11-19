//Notas del video de la CLase 3 del Jueves 2 de noviembre de 2023

//ESTRUCTURAS DE SELECCIÓN

/*UTILIZANDO "if else":
Utilizamos "if else" cuando la pregunta tiene dos posibles respuestas. Si es TRUE, queremos que haga lo del Bloque A y
si es FALSE queremos que haga lo que sea el Bloque B.

Seguimos con el ejemplo de la nota de un examen. Si lo que planteamos entre parentesis en el if es TRUE, pues como antes:
ejecuta el "Has aprobado", termina con el if y se va a lo que viene después (System.out.println"Terminando programa").
Ahora, en caso de tener como resultado FALSE tenemos preparado un nuevo bloque de código (un poco como si fuera
la "opción B"). Inmediatamente depues del } que cierra if escribimos else y abrimos nuevos corchetes. En su interior,
colocamos el código de lo que queremos que pase si la respuesta es FALSE.
En este caso pondríamos un nuevo texto diciendo
que "La nota no es válida".

Ahora, si la nota fuese menor que 5, el programa  saltaría el bloque del if y saltaría directamente al else, lo ejecutaría
y seguiría su curso hasta el final.

En resumen: cuando if es FALSE, automáticamente se ejecutará else

else es conocido como la "CONDICIÓN DE ESCAPE", poque es lo último que se ejecuta antes de terminar esa parte.
 */



public class Entrada_IF_ELSE {

    public static void main(String[] args) {

        int nota =3;

        System.out.println("Se está ejecutando el programa");
        //La nota es TRUE entre 5-10. Lo que hay entre paréntesis en if es una sola condicion. Una sola "pregunta".
        if(nota>5 && nota<11){
            System.out.println("Has aprobado");
        } else {
            System.out.println("La nota no es válida");
        }

        System.out.println("Terminando programa");
    }
}
