package ro.siit.session10.sorting;

public class Fragrance implements Comparable<Fragrance>{
    private Double price;
    private int volume;
    private String name;

    public Fragrance(Double price, int volume, String name) {
        this.price = price;
        this.volume = volume;
        this.name = name;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Fragrance{");
        sb.append("price=").append(price);
        sb.append(", volume=").append(volume);
        sb.append(", name='").append(name).append('\'');
        sb.append('}');
        return sb.toString();
    }


    @Override
    public int compareTo(Fragrance o) {
        if(this.name.compareToIgnoreCase(o.name) == 0){
           return this.price.compareTo(o.price);
        }
        return this.name.compareToIgnoreCase(o.name);
    }

    public String getName() {
        return name;
    }

    public Double getPrice() {
        return price;
    }

//    public Integer getVolume() {
//        return volume;
//    }


    public int getVolume() {
        return volume;
    }
}
