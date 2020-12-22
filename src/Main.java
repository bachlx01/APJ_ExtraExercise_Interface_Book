public class Main {
    public static void main(String[] args) {

        // Create new object
        Book myBooks[] = new Book[10];
        myBooks[0] = new FictionBook("FictionBook 1", 10.0);
        myBooks[1] = new FictionBook("FictionBook 2", 10.0);
        myBooks[2] = new FictionBook("FictionBook 3", 10.0);
        myBooks[3] = new FictionBook("FictionBook 4", 10.0);
        myBooks[4] = new FictionBook("FictionBook 5", 10.0);
        myBooks[5] = new ProgrammingBook("ProgrammingBook 1", 15.0, "Java");
        myBooks[6] = new ProgrammingBook("ProgrammingBook 2", 15.0, "Java");
        myBooks[7] = new ProgrammingBook("ProgrammingBook 3", 15.0, "PHP");
        myBooks[8] = new ProgrammingBook("ProgrammingBook 4", 15.0, "Java");
        myBooks[9] = new ProgrammingBook("ProgrammingBook 5", 15.0, "C Sharp");

        // Set Discount
        ((Discount) myBooks [4]).setDiscount(20);
        ((Discount) myBooks [3]).setDiscount(50);

        // Initialize variable
        Double totalPrice = 0.0;
        Double totalDiscount = 0.0;
        int countJava = 0;


        for (Book e : myBooks) {
            totalPrice += e.getPrice();
            if (e instanceof ProgrammingBook) {
                if (((ProgrammingBook) e).getLanguage() == "Java") {
                    countJava++;
                }
            }
            if (e instanceof Discount) {
                totalDiscount += ((FictionBook) e).getPromotionalPrice();
            }
        }
        System.out.println( " Total price all of books is " + totalPrice);
        System.out.println("Count of Java language books is " + countJava);
        System.out.println("Total discount " + totalDiscount);



    }
}
