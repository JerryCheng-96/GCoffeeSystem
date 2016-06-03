
// Cheng Haoyang - ID 2015141244003

public class Product {

    private String code;
    private String description;
    private double price;

    public Product(String initialCode, String initialDescription, double initialPrice) {

        code = initialCode;
        description = initialDescription;
        price = initialPrice;
    }

    public String getCode() {return code;}

    public String getDescription() {return description;}

    public double getPrice() {return price;}

    public boolean equals(Object object) {
        if (object instanceof Product) {
            return (((Product) object).code == code);
        }
        return false;
    }

    public String toString() {return code + "_" + description + "_" + price;}
}