
public class Strings {

    public static void main(String[] args) {

        // Declaración

        String name = "Kenay";
        var surname = new String("Labrador");

        // Concatenación
        System.out.println(name + " " + surname);

        // Longitud
        System.out.println(name.length());

        // Obtener carácter
        System.out.println(name.charAt(name.length() - 1));

        // Subcadena
        System.out.println(name.substring(2));
        System.out.println(name.substring(1, 3));

        // Mayúsculas y minúsculas
        System.out.println(name.toUpperCase());
        System.out.println(name.toLowerCase());

        System.out.println(name);

        // Comprobar si contiene
        System.out.println("Hola, Java".contains("Kenay"));
        System.out.println("Hola, Java".toUpperCase().contains("AVA"));


        // Comparación
        System.out.println(name.equals("Kenay"));
        System.out.println(name.equals("Kenay"));
        System.out.println(name.equalsIgnoreCase("Kenay"));

        // == vs. equals

        var a = "Kenay";
        var b = "Kenay";
        var c = new String("Kenay");

        System.out.println(a == b);
        System.out.println(a == c);
        System.out.println(a.equals(c));

        // Trim
        System.out.println(" Hola, me llamo Kenay ".trim());

        // Replace
        System.out.println(" Hola, me llamo Kenay ".replace("Kenay", "Labrador"));

        // Format
        var age = 31;
        System.out.println(String.format("Hola, %s. Tengo %d.", name, age));
    }
}