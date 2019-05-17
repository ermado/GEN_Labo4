package ermado.labo4;

import java.util.ArrayList;
import java.util.List;

public class Orders {
    private List<Order> orders = new ArrayList<>();

    public void AddOrder(Order order) {
        orders.add(order);
    }

    public int getOrdersCount() {
        return orders.size();
    }

    public Order getOrder(int i) {
        return orders.get(i);
    }

    public StringBuffer getOrdersToString() {

        StringBuffer sb = new StringBuffer();

        for (int i = 0; i < this.getOrdersCount(); i++) {
            Order order = this.getOrder(i);
            sb.append("{");
            sb.append("\"id\": ");
            sb.append(order.getOrderId());
            sb.append(", ");
            sb.append("\"products\": [");

            sb.append(order.getProductsToString());

            if (order.getProductsCount() > 0) {
                sb.delete(sb.length() - 2, sb.length());
            }

            sb.append("]");
            sb.append("}, ");
        }

        if (this.getOrdersCount() > 0) {
            sb.delete(sb.length() - 2, sb.length());
        }

        return sb;
    }
}
