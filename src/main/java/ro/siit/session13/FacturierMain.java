package ro.siit.session13;

public class FacturierMain {
    public static void main(String[] args) {
        Facturier facturier = new Facturier(100);
        // System.out.println(facturier.genereazaNumarFactura());
        Factura aTreiaFactura = new Factura(facturier.genereazaNumarFactura(), "A treia factura", 10.0);
        facturier.add(new Factura(facturier.genereazaNumarFactura(), "Prima factura", 10.0));
        facturier.add(new Factura(facturier.genereazaNumarFactura(), "A doua factura", 100.0));
        facturier.add(aTreiaFactura);
        facturier.add(aTreiaFactura);

        facturier.printInvoices();

        Factura hackedInvoice = new Factura(facturier.genereazaNumarFactura(), "Pay with priority", -11000.0);
        facturier.getInvoices().put(hackedInvoice.getNumber(), hackedInvoice);

        facturier.printInvoices2();
        System.out.println("===");
        facturier.printInvoices3();
        System.out.println("===");
        facturier.printInvoices4();

    }
}
