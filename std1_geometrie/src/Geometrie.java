public class Geometrie {

    public static void main(String[] args) {

        //Déclarer mes variables
        float ray = 10, lon = 7, hau = 5, vol, air, al, ab;
        double apo = 7.1589108;

        //Cercle
        air = (float) (Math.PI * (Math.pow(ray, 2)));

        System.out.println("Le cercle");
        System.out.println("    - Rayon    : " + ray);
        System.out.println("    - Surface  : " + air);

        //Cube
        air = (float) (6 * (Math.pow(lon, 2)));
        vol = (float) (Math.pow(lon, 3));

        System.out.println("Le Cube");
        System.out.println("    - Longueur : " + lon);
        System.out.println("    - Surface  : " + air);
        System.out.println("    - Volume   : " + vol);

        //Cylindre
        ab = (float) (Math.PI * (Math.pow(ray, 2)));
        al = (float) (Math.PI * 2 * ray * hau);
        air = al + (2 * ab);
        vol = ab * hau;

        System.out.println("Le Cylindre");
        System.out.println("    - Rayon    : " + ray);
        System.out.println("    - Hauteur  : " + hau);
        System.out.println("    - Surface  : " + air);
        System.out.println("    - Volume   : " + vol);

        //Cône
        ray = 3;
        hau = 7;
        ab = (float) (Math.PI * (Math.pow(ray, 2)));
        al = (float) (Math.PI * ray * apo);
        air = ab + al;
        vol = (ab * hau) / 3;

        System.out.println("Le Cône");
        System.out.println("    - Rayon    : " + ray);
        System.out.println("    - Hauteur  : " + hau);
        System.out.println("    - Apothème : " + apo);
        System.out.println("    - Surface  : " + air);
        System.out.println("    - Volume   : " + vol);


    }
}
