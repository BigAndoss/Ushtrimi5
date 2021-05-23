package Ushtrimi5;

// Andi Tahiri 202152219

/*Udhëzon shfrytëzuesin të shtyp një numër [së paku 10: të përdoret do while loop] i cili tregon sa fjalë/fjali do të shtypen,
        dhe duke përdorur for loop të kërkohet nga shfrytëzuesi të shtypen ato fjalë/fjali.
        Në fund të shtypet (afishohet) se sa fjalë/fjali janë shtypur gjithsej dhe sa prej
        tyre fillojnë me numër, përmbajnë shenjë pikësimi [. , ? ! : ;] dhe përfundojnë me string-un “UBT” (case insensitive):
        Jane shtypur gjithsej <x> fjale/fjali dhe <y> prej tyre e plotesojne kushtin.
        Testimi i kushtit të bëhet në metodën e klasës countUBT e cila e pranon fjalën/fjalinë si parametër.*/

import java.util.Scanner;

public class UBTCount {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int numStart, numCount=0;
        String fjala;
        String[] shenja = {".",",","?","!",":",";"};
        System.out.println("Shtypni numrin e fjaleve (së paku 10):");
        numStart = scan.nextInt();
        if (numStart<0){
            System.out.println("Ju keni shtypur numer me te vogel se 10");
        }else {
            while (true) {
                for (int i = 0; i < numStart; i++) {
                    System.out.println("Shenoni nje fjale/fjali");
                    fjala = scan.next();
                    boolean num = Character.isDigit(fjala.charAt(0));
                    for (String s : shenja) {
                        if (fjala.contains(s) && num && countUBT(fjala)) {
                            numCount++;
                            break;
                        }
                    }
                }
                break;
            }
            if (numCount == 0) {
                System.out.println("Asnje fjali nuk e ploteson kushtin");
            } else if (numCount == 1) {
                System.out.println("kushtim e ploteson vetem 1 fjali");
            } else {
                System.out.println("Kushtin e plotesojne " + numCount + " Fjali");
            }
        }
    }
    public static boolean countUBT(String fjalia){
        return fjalia.contains("UBT");
    }
}
