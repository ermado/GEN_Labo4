package ermado.labo4;

public class OrdersWriter {
    private Orders orders;

    public OrdersWriter(Orders orders) {
        this.orders = orders;
    }

    public String getContents() {
        StringBuffer sb = new StringBuffer("{\"orders\": [");

        sb.append(orders.getOrdersToString());

        return sb.append("]}").toString();
    }
}