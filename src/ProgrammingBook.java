public class ProgrammingBook extends Book {
    private String language;
    private String framework;

    // Constructors

    public ProgrammingBook() {
    }

    public ProgrammingBook(String name, Double price, String language) {
        super(name, price);
        this.language = language;
    }

    public ProgrammingBook(String language, String framework) {
        this.language = language;
        this.framework = framework;
    }

    public ProgrammingBook(int bookCode, String name, Double price, String author, String language, String framework) {
        super(bookCode, name, price, author);
        this.language = language;
        this.framework = framework;
    }

    // Getters

    public String getLanguage() {
        return language;
    }

    public String getFramework() {
        return framework;
    }

    // Setters

    public void setLanguage(String language) {
        this.language = language;
    }

    public void setFramework(String framework) {
        this.framework = framework;
    }
}
