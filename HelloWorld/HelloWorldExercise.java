package HelloWorld;

/*
Clase 14 - Ejercicios: Primeros pasos
Vídeo: https://youtu.be/JOAqpdM36wI?t=5108
*/

public class HelloWorldExercise {

    public static void main(String[] args) {

        // 1. Imprime un mensaje que diga tu nombre en lugar de "¡Hola Mundo!".
        System.out.println("Hols, soy Ky!");

        // 2. Imprime dos líneas: "Hola" y luego "Mundo" con un solo println.
        System.out.println("Hola\nMundo");

        // 3. Añade un comentario sobre lo que hace cada línea del programa.
        //System.out.println imprime texto por consola y añade un salto de línea.

        // 4. Crea un comentario en varias líneas.
        /* Comentario en varias líneas
           Sirve para explicar bloques grandes de código
           o dejar notas importantes
        */

        // 5. Imprime tu edad, tu color favorito y tu ciudad.
        System.out.println("Edad: 31");
        System.out.println("Color favorito: turquesa");
        System.out.println("Ciudad: Manacor");

        // 6. Explora los diferentes System.XXX.println(); más allá de "out".
        System.err.println("Esto es un mensaje de error");

        // 7. Utiliza varios println para imprimir una frase.
        System.out.println("Estoy");
        System.out.println("aprendiendo");
        System.out.println("java");
        System.out.println("con MoureDev");

        // 8. Imprime un diseño ASCII (por ejemplo, una cara feliz usando símbolos)
        System.out.println("  ^_^  ");

        // 9. Intenta ejecutar el programa sin el método main y observa el error.
        //// Error típico: Main method not found in class

        //10. Intenta cambiar el nombre del archivo a uno diferente del de la clase y compílalo. ¿Qué pasa?
        /*/Users/kenaylabrador/IdeaProjects/curso_java/HelloWorldExercises.java:8:8
           java: class HelloWorldExercise is public, should be declared in a file named HelloWorldExercise.java
        */

    }
}