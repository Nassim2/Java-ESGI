package HeritageExerciceThree;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Comparator;
import java.util.concurrent.atomic.AtomicBoolean;

public class Main{
    public static void main(String[] args) {
        int totalArea = 0;
        double totalTaxes = 0;
        int nbPool = 0;

        int size = 6;

        Building[] bat = new Building[size];
        bat[0] = new Villa("Nassim", "71 rue Ok", 200, 5, true);
        bat[1] = new Company("Michel", "20 rue Dacc", 1000, "Galley-La Company", 100, 10);
        bat[2] = new Villa("Pedro", "99 rue Non", 100, 3, false);
        bat[3] = new Villa("Eren", "234 rue Longue", 250, 6, true);
        bat[4] = new Company("Jean", "1 rue Entreprise", 500, "Cobra", 10, 2);
        bat[5] = new Company("Reiner", "42 rue Vie", 3000, "La Grosse Boite", 400, 50);

        for (int i = 0; i < size; i++) {
            totalArea += bat[i].getArea();
            totalTaxes += bat[i].tax();
            if (bat[i] instanceof Villa){
                if (((Villa) bat[i]).isSwimming_pool()) {
                    nbPool++;
                }
            }
        }

        System.out.println("\n--------- Sorted by Area ------------\n");

        Arrays.sort(bat);

        for (int i = 0; i < size; i++) {
            bat[i].print();
        }

        System.out.println("\n--------- Sorted by Owner ------------\n");

        Arrays.sort(bat, Comparator.comparing(Building::getOwner));

        for (int i = 0; i < size; i++) {
            bat[i].print();
        }

        System.out.println("\n----------- Other Values ------------\n");

        System.out.println(totalArea);
        System.out.println(totalTaxes);
        System.out.println(nbPool);
    }
}