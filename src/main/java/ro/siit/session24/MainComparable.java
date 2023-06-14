package ro.siit.session24;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class MainComparable {
    public static void main(String[] args) {
        List<ComparableEntity> comparableEntities = new ArrayList<>();
        comparableEntities.add(new ComparableEntity(1, "ddd"));
        comparableEntities.add(new ComparableEntity(5, "zzz"));
        comparableEntities.add(new ComparableEntity(10, "aaa"));

//        for (ComparableEntity cE: comparableEntities) {
//            System.out.println(cE);
//        }

        Collections.sort(comparableEntities, (e1, e2) -> - e1.getP2().compareTo(e2.getP2()));

//        for (ComparableEntity cE: comparableEntities) {
//            System.out.println(cE);
//        }

    //    comparableEntities.stream().forEach(ce -> System.out.println(ce));
        comparableEntities.stream()
                .forEach(System.out::println);
    }
}
