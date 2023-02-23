
package metodus_gyakorlas;

public class Metodus_gyakorlas {

    public static void main(String[] args) {
        int osszeg = elso10SzamOsszeg();
        String kimenet = "Az első 10szám összege: " + osszeg + "\n";
        Kiir(kimenet);
        
        int szam1 = 7, szam2 = 4;
        Kiir("%d + %d = %d\n".formatted(szam1,szam2,szam1+szam2));
        
        int szam3 = 3, szam4 = 4;
        
        int osszeg1 = osszead(szam1, szam2);
        int osszeg2 = osszead(osszeg1, szam3);
        int vegosszeg = osszead(osszeg2, szam4);
        
        Kiir("A számok összge:\n" + vegosszeg);
        
        double gyok = Math.sqrt(osszeg2);
        Kiir("A " + szam1 +", " + szam2 + ", " + szam3 + " összegének a gyöke:\n" + gyok);
    }
  
        public static int elso10SzamOsszeg(){
        int osszeg = 0;
        for (int i = 0; i < 10; i++) {
            osszeg += i;
        }
        return osszeg;
                
        //Kiir("Az első 10szám összege: " + osszeg);
    }
    public static void Kiir(String vmi)
    {
        System.out.println(vmi);
    }
    private static int osszead(int a, int b){
        return a+b;
     /*System.out.printf("%d + %d = %d\n", a, b, a+b);*/
    }
}

