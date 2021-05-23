package Ushtrimi5;

// Andi Tahiri 202152219

/*Udhëzon shfrytëzuesin të shtyp një numër [vlerë tek më e madhe se pesë (5): të përdoret
        while loop] i cili tregon sa numra (të plotë 32 bit) do të shtypen, dhe duke përdorur for
        loop të kërkohet nga shfrytëzuesi të shtypen ata numra.
        Në fund të shtypet (afishohet) se sa numra janë shtypur gjithsej dhe sa për qind e këtyre
        numrave ishin numra negativ çift:
        Jane shtypur gjithsej <x> numra dhe <y>% e tyre e jane numra negativ cift.
        Testimi i kushtit të bëhet në metodën e klasës negativCift e cila e pranon numrin si
        parametër.*/

import java.util.Scanner;

public class CiftNegativ {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int numStart, numScan, numCount=0, numPerc = 0;
        System.out.println("Shtypni një numër (vlerë më e madhe se pesë 5):");
        numStart = scan.nextInt();
        if (numStart <6){
            System.out.println("Keni shtypur numer me te vogel se 5");
        }else {
            while (true){
                for (int i =0; i<numStart;i++){
                    System.out.println("Shtypni nje numer:");
                    numScan = scan.nextInt();
                    if (numScan < 0 && numScan % 2==-0){
                        numCount++;
                    }
                }
                break;
            }
            if (numCount >0){
                numPerc = (numCount*100)/numStart;
            }
        }         
        System.out.println("Jane shtypur gjithsej "+numStart+" numra dhe "+numPerc+"% e tyre e jane numra negativ cift");
    }
}
