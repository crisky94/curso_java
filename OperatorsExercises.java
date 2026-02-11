

public class OperatorsExercises {

     static void main(String[] args) {

        // 1. Crea una variable con el result de cada operación aritmética.
         int result;
         int a = 5;
         int b = 2;
         result = a + b;
         System.out.println(result);
         result = a - b;
         System.out.println(result);
         result = a * b;
         System.out.println(result);
         result = a / b;
         System.out.println(result);
         result = a % b;
         System.out.println(result);

         // 2. Crea una variable para cada tipo de operación de asignación.
         int assignament = a = b;
         System.out.println(assignament);
         int assignament1 = a += 1;
         System.out.println(assignament1);
         int assignament2 = a -= 1;
         System.out.println(assignament2);
         int assignament3 = a *= 8;
         System.out.println(assignament3);
         int assignament4 = a /= 2;
         System.out.println(assignament4);
         int assignament5 = a %= 2;
         System.out.println(assignament5);


         // 3. Imprime 3 comparaciones verdaderas con diferentes operadores de comparación.
         boolean trueComparation1 = a != b;
         System.out.println(trueComparation1);
         boolean trueComparation2 = a <= b;
         System.out.println(trueComparation2);
         boolean trueComparation3 = b >= a;
         System.out.println(trueComparation3);

         // 4. Imprime 3 comparaciones falsas con diferentes operadores de comparación.

         boolean falseComparation1 = a == b;
         System.out.println(falseComparation1);
         boolean falseComparation2 = a >= b;
         System.out.println(falseComparation2);
         boolean falseComparation3 = b <= a;
         System.out.println(falseComparation3);

         // 5. Utiliza el operador lógico and.
         boolean operadorLogico1 = a < b && a > b;
         System.out.println(operadorLogico1);

         // 6. Utiliza el operador lógico or.
         boolean operadorLogico2 = a < b || a > b;
         System.out.println(operadorLogico2);

         // 7. Combina ambos operadores lógicos.
         boolean operadorLogico3 = a < b || a > b && a != b || a == b;
         System.out.println(operadorLogico3);

         // 8. Añade alguna negación.
         boolean negacion = a != b;
         System.out.println(negacion);

         // 9. Imprime 3 ejemplos de uso de operadores unarios.
         a = 5;
         int unario1 = ++a;
         System.out.println(unario1);
         int unario2 = --a;
         System.out.println(unario2);
         int unario3 = -a;
         System.out.println(unario3);

         // 10. Combina operadores aritméticos, de comparación y lógicos.
         System.out.println(a+b);
         boolean operadores = a + b > 3 || a - b < 3 && a == b || a < b;
         System.out.println(operadores);
     }
}