package ro.siit.session13;

import java.util.StringJoiner;

public class Factura implements Comparable<Factura>{
    private Integer number;
    private String description;
    private Double amount;

    public Factura(Integer number, String description, double amount) {
        this.number = number;
        this.description = description;
        this.amount = amount;
    }

    public Integer getNumber() {
        return number;
    }

    public Double getAmount() {
        return amount;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Factura{");
        sb.append("number=").append(number);
        sb.append(", description='").append(description).append('\'');
        sb.append(", amount=").append(amount);
        sb.append('}');
        return sb.toString();
    }


    public String toString2() {
        return new StringJoiner(", ", Factura.class.getSimpleName() + "[", "]")
                .add("number=" + number)
                .add("description='" + description + "'")
                .add("amount=" + amount)
                .toString();
    }

    @Override
    public int compareTo(Factura otherInvoice) {
        if(this.amount.compareTo(otherInvoice.amount) == 0){
            return -this.number.compareTo(otherInvoice.number);
        }
        return -this.amount.compareTo(otherInvoice.amount);
    }
}
