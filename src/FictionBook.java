public class FictionBook extends Book implements Discount {
    private String category;
    private Double promotionalPrice = 0.0;

    // Constructors

    public FictionBook() {
    }

    public FictionBook(String name, Double price) {
        super(name, price);
    }

    public FictionBook(int bookCode, String name, Double price, String author, String category, Double promotionalPrice) {
        super(bookCode, name, price, author);
        this.category = category;
        this.promotionalPrice = promotionalPrice;
    }

    // Getters

    public String getCategory() {
        return category;
    }

    public Double getPromotionalPrice() {
        return promotionalPrice;
    }

    // Setters

    public void setCategory(String category) {
        this.category = category;
    }

    public void setPromotionalPrice(Double promotionalPrice) {
        this.promotionalPrice = promotionalPrice;
    }

    @Override
    public Double setDiscount(int percent) {
        this.promotionalPrice = this.getPrice() * (100 - percent)/100;
        return promotionalPrice;
    }
}
