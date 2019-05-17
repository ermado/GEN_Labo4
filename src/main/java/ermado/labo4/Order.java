package ermado.labo4;

import java.util.ArrayList;
import java.util.List;

public class Order {
    private List<Product> products = new ArrayList<Product>();
    private int id;

    public Order(int id) {
        this.id = id;
    }

    public int getOrderId() {
        return id;
    }

    public int getProductsCount() {
        return products.size();
    }

    public Product getProduct(int j) {
        return products.get(j);
    }

    public void AddProduct(Product product) {
        products.add(product);
    }

    public StringBuffer getProductsToString() {

        StringBuffer sb = new StringBuffer();

        for (int j = 0; j < this.getProductsCount(); j++) {
            Product product = this.getProduct(j);

            sb.append("{");
            sb.append("\"code\": \"");
            sb.append(product.getCode());
            sb.append("\", ");
            sb.append("\"color\": \"");
            sb.append(product.getColorFor());
            sb.append("\", ");

            if (product.getSize() != Product.SIZE_NOT_APPLICABLE) {
                sb.append("\"size\": \"");
                sb.append(product.getSizeFor());
                sb.append("\", ");
            }

            sb.append("\"price\": ");
            sb.append(product.getPrice());
            sb.append(", ");
            sb.append("\"currency\": \"");
            sb.append(product.getCurrency());
            sb.append("\"}, ");
        }

        return sb;
    }
}
