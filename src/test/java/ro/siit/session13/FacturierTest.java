package ro.siit.session13;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class FacturierTest {
    @Test
    public void check_duplicates(){
        Facturier facturier = new Facturier(10);
        Factura f1 = new Factura(facturier.genereazaNumarFactura(), "F", 10.0);
        Factura f2 = new Factura(f1.getNumber(), "F2", 1.0);

        facturier.add(f1);

        Exception exception = Assertions.assertThrows(RuntimeException.class, () -> {
            facturier.add(f2);
        });

        String expectedMessage = "Invoice already exists";
        String actualMessage = exception.getMessage();

        Assertions.assertTrue(actualMessage.contains(expectedMessage));

        Assertions.assertTrue(facturier.getInvoices().entrySet().size() == 1);
    }

    @Test
    public void get_invoices_works(){
        Facturier facturier = new Facturier(10);
        Factura f1 = new Factura(facturier.genereazaNumarFactura(), "F", 10.0);
        Factura f2 = new Factura(facturier.genereazaNumarFactura(), "F2", 1.0);

        facturier.add(f1);
        facturier.add(f2);



        Assertions.assertTrue(facturier.getInvoices().entrySet().size() == 2);
    }
}
