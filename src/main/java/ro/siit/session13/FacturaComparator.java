package ro.siit.session13;

import java.util.Comparator;

public class FacturaComparator implements Comparator<Factura> {
    @Override
    public int compare(Factura o1, Factura o2) {
        if(o1.getAmount().compareTo(o2.getAmount()) == 0){
            return o1.getNumber().compareTo(o2.getNumber());
        }
        return o1.getAmount().compareTo(o2.getAmount());
    }

}
