package lambda.funcao_anonima.introducao.entities;
import java.text.DecimalFormat;
public class Product {
    private String name;
    private Double price;

    public Product() {
    }

    public Product(String name, Double price) {
        this.name = name;
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Double getPrice() {
        return price;
    }

    public void setPrice(Double price) {
        this.price = price;
    }

    public static void staticPriceUpdate(Product p){
        p.setPrice(p.getPrice() * 1.10);
    }


    public String toString() {
        DecimalFormat df = new DecimalFormat("#.00");
        return "Product [name=" + name + ", price=R$ " + df.format(price) + "]";
    }

}
