package Ushtrimi5;

// Andi Tahiri 202152219

/*Udhëzon shfrytëzuesin të shtyp një numër [së paku dhjetë (10): të përdoret while loop] i
        cili tregon sa fjalë/fjali do të shtypen, dhe duke përdorur for loop të kërkohet nga
        shfrytëzuesi të shtypen ato fjalë/fjali.
        Të gjendet dhe të afishohet në konzolë se cila fjalë/fjali është më e vogla (vie e para
        alfabetikisht):
        Prej gjithsej <x> fjaleve/fjalive te shtypura e para alfabetikisht vie:
<fjalia qe vie e para alfabetikisht>*/

import java.util.Scanner;

public class FirstString {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int numFjala;
        String newFjala = null;
        System.out.println("Shtypni një numër (së paku dhjetë 10)");
        numFjala = scan.nextInt();
        if (numFjala<0){
            System.out.println("Keni shtypur numer me te vogel se 10");
        }else{
            while (true){
                for (int j=0; j<numFjala;j++){
                    System.out.println("Shtypni nje fjale");
                    String fjala = scan.next();
                    if (j==0){
                        newFjala = fjala;
                    }
                    if (j>1){
                        if (fjala.length()<=newFjala.length()){
                            if (fjala.charAt(0)<newFjala.charAt(0)){
                                newFjala = fjala;
                            }
                        }
                    }
                }
                break;
            }
        }
        System.out.println("Prej gjithsej "+numFjala+" fjaleve/fjalive te shtypura e para alfabetikisht vie:\n" +
                newFjala);
    }
}
