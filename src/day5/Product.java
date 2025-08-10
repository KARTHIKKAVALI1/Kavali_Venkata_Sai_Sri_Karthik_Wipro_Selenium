package day5;

//. Builder Pattern & Encapsulation: Immutable Product
//Use Builder design to create immutable class with encapsulation.
//•	Create an immutable Product class with private final fields such as name, code, price, and optional category.
//•	Use a static nested Builder inside the Product class. Provide methods like withName(), withPrice(), etc., that apply validation (e.g. non-negative price).
//•	The outer class should have only getter methods, no setters.
//•	The builder returns a new Product instance only when all validations succeed

public class Product {
    private final String name;
    private final String code;
    private final double price;
    private final String category;

    private Product(Builder builder) {
        this.name = builder.name;
        this.code = builder.code;
        this.price = builder.price;
        this.category = builder.category;
    }

    public String getName() { return name; }
    public String getCode() { return code; }
    public double getPrice() { return price; }
    public String getCategory() { return category; }

    public static class Builder {
        private String name;
        private String code;
        private double price;
        private String category = "General";

        public Builder withName(String name) {
            if (name == null || name.trim().isEmpty()) {
                this.name = "DefaultName";
            } else {
                this.name = name;
            }
            return this;
        }

        public Builder withCode(String code) {
            if (code == null || code.trim().isEmpty()) {
                this.code = "DEFAULT_CODE";
            } else {
                this.code = code;
            }
            return this;
        }

        public Builder withPrice(double price) {
            if (price < 0) {
                this.price = 0;
            } else {
                this.price = price;
            }
            return this;
        }

        public Builder withCategory(String category) {
            if (category == null || category.trim().isEmpty()) {
                this.category = "General";
            } else {
                this.category = category;
            }
            return this;
        }

        public Product build() {
            // If name or code still null, assign defaults (just in case)
            if (name == null) name = "DefaultName";
            if (code == null) code = "DEFAULT_CODE";

            return new Product(this);
        }
    }

    @Override
    public String toString() {
        return String.format("Product{name='%s', code='%s', price=%.2f, category='%s'}", name, code, price, category);
    }

    public static void main(String[] args) {
        Product product1 = new Product.Builder()
            .withName("Laptop")
            .withCode("LT001")
            .withPrice(999.99)
            .withCategory("Electronics")
            .build();

        Product product2 = new Product.Builder()
            .withName("Book")
            .withCode("BK001")
            .withPrice(19.99)
            .build();

        Product invalidProduct = new Product.Builder()
            .withName("")
            .withCode(null)
            .withPrice(-10.0)
            .withCategory("")
            .build();

        System.out.println(product1);
        System.out.println(product2);
        System.out.println(invalidProduct);
    }
}
