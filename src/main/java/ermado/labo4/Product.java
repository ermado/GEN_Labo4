package ermado.labo4;

public class Product {
    private static final int SIZE_NOT_APPLICABLE = -1;
    private String code;
    private int color;
    private int size;
    private double price;
    private String currency;

    public Product(String code, int color, int size, double price, String currency) {
        this.code = code;
        this.color = color;
        this.size = size;
        this.price = price;
        this.currency = currency;
    }

    private String getCode() {
        return code;
    }

    private int getColor() {
        return color;
    }

    private int getSize() {
        return size;
    }

    private double getPrice() {
        return price;
    }

    private String getCurrency() {
        return currency;
    }

    private String getSizeName() {
        switch (this.getSize()) {
            case 1:
                return "XS";
            case 2:
                return "S";
            case 3:
                return "M";
            case 4:
                return "L";
            case 5:
                return "XL";
            case 6:
                return "XXL";
            default:
                return "Invalid Size";
        }
    }

    private String getColorName() {
        switch (this.getColor()) {
            case 1:
                return "blue";
            case 2:
                return "red";
            case 3:
                return "yellow";
            default:
                return "no color";
        }
    }

    public StringBuffer getProductToString() {

        StringBuffer sb = new StringBuffer();
        sb.append("{");
        sb.append("\"code\": \"");
        sb.append(this.getCode());
        sb.append("\", ");
        sb.append("\"color\": \"");
        sb.append(this.getColorName());
        sb.append("\", ");

        if (this.getSize() != Product.SIZE_NOT_APPLICABLE) {
            sb.append("\"size\": \"");
            sb.append(this.getSizeName());
            sb.append("\", ");
        }

        sb.append("\"price\": ");
        sb.append(this.getPrice());
        sb.append(", ");
        sb.append("\"currency\": \"");
        sb.append(this.getCurrency());
        sb.append("\"}, ");

        return sb;
    }
}