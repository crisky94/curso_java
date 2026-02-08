/*
Clase 17 - Ejercicios: Variables y constantes
Vídeo: https://youtu.be/JOAqpdM36wI?t=6732
*/

public class BeginnerExercises {

     static void main(String[] args) {

        // 1. Declara una variable de tipo String y asígnale tu nombre.
        String myName = "Kenay";
        System.out.println(myName);

        // 2. Crea una variable de tipo int y asígnale tu edad.
        int myAge = 31;
        System.out.println(myAge);

        // 3. Crea una variable double con tu altura en metros.
        double myHigh = 1.68;
        System.out.println(myHigh);

        // 4. Declara una variable de tipo boolean que indique si te gusta programar.
        boolean iLikeProgramming = true;
        System.out.println(iLikeProgramming);

        // 5. Declara una constante con tu email.
        final String EMAIL = "labradorcristina8@gmail.com";
        System.out.println(EMAIL);


        // 6. Crea una variable de tipo char y guárdale tu inicial.
        char myInitial = 'k';
        System.out.println(myInitial);

        // 7. Declara una variable de tipo String con tu localidad, y a continuación cambia su valor y vuelve a imprimirla.
        String myLocation = "Granada";
        myLocation = "Mallorca";
        System.out.println(myLocation);


        // 8. Crea una variable int llamada a, otra b, e imprime la suma de ambas.
        int a = 2;
        int b = 5;

        System.out.println(a+b);

        // 9. Imprime el tipo de dos variables creadas anteriormente.
        System.out.println(myLocation.getClass().getSimpleName());
        System.out.println(EMAIL.getClass().getSimpleName());

        // 10. Intenta declarar una variable sin inicializarla y luego asígnale un valor antes de imprimirla.
        String patata;
        patata = "tuberculo";
        System.out.println(patata);
    }
}