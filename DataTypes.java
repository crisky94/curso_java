public class DataTypes {
    static void main(String[] args) {

        //Tipos de datos primitivos

        int myInt = 37;

        double myDouble = 1.68;

        //float, long, byte

        char  myChar = 'a';
        System.out.println(myChar);

        boolean myBoolean = true;
        myBoolean = false;
        System.out.println(myBoolean);

        String myString = "Hola, Java";
        System.out.println(myString);

        // Tipo de dato en tiempo de compilación

        System.out.println(myString.getClass().getSimpleName());

    }
}
