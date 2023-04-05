package ro.siit.session10.sorting;

import java.util.Set;
import java.util.TreeSet;

public class DouglasShop {
    public static void main(String[] args) {
        Set<Fragrance> testers = new TreeSet<>();
        testers.add(new Fragrance(150.0, 50, "Nu exista!"));
        testers.add(new Fragrance(350.0, 50, "Channel"));
        testers.add(new Fragrance(50.0, 50, "Channel"));
        testers.add(new Fragrance(50.0, 100, "Nu exista!"));

        testers.add(new Fragrance(50.0, 20, "Channel"));

        for (Fragrance tester: testers) {
            System.out.println(tester);
        }

        System.out.println("********");
        Set<Fragrance> cheapTesters = new TreeSet<>(new PriceFragranceComparator());
        cheapTesters.addAll(testers);

        for (Fragrance tester: cheapTesters) {
            System.out.println(tester);
        }

        System.out.println("********");
        Set<Fragrance> fullyComparedTesters = new TreeSet<>(new NamePriceVolumeFragranceComparator());
        fullyComparedTesters.addAll(testers);
        fullyComparedTesters.add(new Fragrance(50.0, 20, "Channel"));

        for (Fragrance tester: fullyComparedTesters) {
            System.out.println(tester);
        }

    }
}
