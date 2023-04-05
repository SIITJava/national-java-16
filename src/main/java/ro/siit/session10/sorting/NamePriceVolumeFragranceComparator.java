package ro.siit.session10.sorting;

import java.util.Comparator;

public class NamePriceVolumeFragranceComparator implements Comparator<Fragrance> {
    @Override
    public int compare(Fragrance o1, Fragrance o2) {
        if (o1.getName().compareTo(o2.getName()) == 0){
            if(o1.getPrice().compareTo(o2.getPrice()) == 0){
               // return o1.getVolume().compareTo(o2.getVolume());
                return o1.getVolume() - o2.getVolume();
            }
            return o1.getPrice().compareTo(o2.getPrice());
        }
        return o1.getName().compareTo(o2.getName());
    }
}
