public class Vecteur {

    public static void main(String[] args) {

        float dis, xa = 1, ya = 2, za = 3, xb = 4, yb = 5, zb = 6;

        //Point A
        System.out.println("Quelles sont les coordonnées du point A?");
        System.out.println("xa : " + xa);
        System.out.println("ya : " + ya);
        System.out.println("za : " + za);
        System.out.println("Le point A : " + xa + ", " + ya + ", " + za);

        //Point B
        System.out.println("Quelles sont les coordonnées du point B?");
        System.out.println("xb : " + xb);
        System.out.println("yb : " + yb);
        System.out.println("zb : " + zb);
        System.out.println("Le point B : " + xb + ", " + yb + ", " + zb);

        //Équation
        dis = (float) (Math.sqrt(Math.pow(xb - xa, 2) + Math.pow(yb - ya, 2) + Math.pow(zb - za, 2)));

        System.out.println("La distance est : " + dis);


    }
}
