package ro.siit.session13;

import java.util.*;

public class Facturier {
    private Map<Integer, Factura> facturi = new HashMap();
    private Integer numarUltimaFactura;

    public Facturier(Integer numarUltimaFactura) {
        this.numarUltimaFactura = numarUltimaFactura;
    }

    public Integer genereazaNumarFactura(){
        return ++numarUltimaFactura;
    }

    public void add(Factura factura){
        if(facturi.containsKey(factura.getNumber())){
            throw new RuntimeException("Invoice already exists");
        }
        facturi.put(factura.getNumber(), factura);
    }

    public Map<Integer, Factura> getInvoices(){
        Map<Integer, Factura> invoicesCopy = new TreeMap<>();
        invoicesCopy.putAll(facturi);
        return invoicesCopy;
    }

    public void printInvoices(){
        for (Integer key: facturi.keySet()) {
            System.out.println(facturi.get(key));
        }
    }

    public void printInvoices2(){
        for (Integer key: facturi.keySet()) {
            System.out.println(facturi.get(key).toString2());
        }
    }

    public void printInvoices3(){
        Set<Factura> invoicesSet = new TreeSet<>();
        for (Integer key: facturi.keySet()) {
            invoicesSet.add(facturi.get(key));
        }

        for (Factura invoice: invoicesSet) {
            System.out.println(invoice);
        }

    }

    public void printInvoices4(){
        Set<Factura> invoicesSet = new TreeSet<>(new FacturaComparator());
        for (Integer key: facturi.keySet()) {
            invoicesSet.add(facturi.get(key));
        }

        for (Factura invoice: invoicesSet) {
            System.out.println(invoice);
        }

    }
}
