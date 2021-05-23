package Ushtrimi5;

// Andi Tahiri 202152219

/*Udhëzon shfrytëzuesin të shtyp një numër [së paku shtatë (7): të përdoret while loop] i cili tregon sa numra (të plotë 64 bit)
        do të shtypen, dhe duke përdorur for loop të kërkohet nga shfrytëzuesi të shtypen ata numra.
        Në fund të shtypet se sa numra janë shtypur gjithsej dhe se cili nga këta numra ishte numri më i madh tek pozitiv:
        Jane shtypur gjithsej <x> numra dhe <maxNr> ishte numri me i madh tek pozitiv.
        Nëse nuk është shtypur asnjë numër tek tek të shtypet (afishohet):
        Nuk eshte shtypur asnje numer tek pozitiv!*/

import java.util.Scanner;

public class MaxTekPozitiv {
    public static void main(String[] args) {
        Scanner scan = new Scanner (System.in);
        int numStart, numCount=0;
        double numIn, numMax=0;
        System.out.println("Shtypni një numër (së paku shtatë 7):");
        numStart = scan.nextInt();
        if (numStart<0){
            System.out.println("Keni shtypur numer me te vogel se 7");
        }else {
            while (true){
                for (int i=0;i<numStart;i++){
                    System.out.println("Shtypni nje numer:");
                    numIn = scan.nextDouble();
                    if (numIn>0 && numIn % 2 !=0){
                        numCount++;
                        if (numIn>numMax){
                            numMax = numIn;
                        }
                    }
                }
                if (numCount<1){
                        System.out.println("Nuk eshte shtypur asnje numer tek pozitiv!");
                }else {
                    System.out.println("Jane shtypur gjithsej " + numStart + " numra dhe " + numMax + " ishte numri me i madh tek pozitiv.");
                }
                break;
            }
        }
    }
}
