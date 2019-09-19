public class Typage {

    public static void main(String[] args) {

        int var1 = 1;
        float var2 = (float) 1.5;
        char var3 = '4';

        //Conversion #1
        String var1A = Integer.toString(var1);
        System.out.println("Conversion #1");
        System.out.println("La nouvelle valeur de var1 = " + var1A);

        //Conversion #2 var1 to boolean
        boolean var1B = (var1 == 1);
        System.out.println("Conversion #2");
        System.out.println("La nouvelle valeur de var1 = " + var1B);
        //IMPOSSIBLE de convertir un entier en boolean, parce qu'un boolean
        //ne peut contenir que vrai ou faux.

        //Conversion #3 var2 to int
        int var2A = (int) var2;
        System.out.println("Conversion #3");
        System.out.println("La nouvelle valeur de var2 = " + var2A);

        //Conversion #4 var2 to String
        var2 = Math.round(var2);
        String var2B = (Float.toString(var2));
        System.out.println("Conversion #4");
        System.out.println("La nouvelle valeur de var2 = " + var2B);

        //Conversion #5 var3 to int
        //var3 = Character.toInteger;
        int var3A = Character.getNumericValue(var3);
        System.out.println("Conversion #5");
        System.out.println("La nouvelle valeur de var3 = " + var3A);
        //Fonctionne seulement si le char est entre 0 et 9.


    }
}
