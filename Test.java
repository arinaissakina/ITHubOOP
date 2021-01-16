public class Test {

    public static void testAuthor(){

        Author author = new Author("Levi", "levi@weebmail.com", 'm');
        System.out.println(author);
        author.setEmail("paulTan@nowhere.com");
        System.out.println("name is: " + author.getName());
        System.out.println("eamil is: " + author.getEmail());
        System.out.println("gender is: " + author.getGender());
    }

    public static void testBook(){

        Author author = new Author("Levi", "levi@weebmail.com", 'm');
        Book dummyBook = new Book("Art of Cleaning", author, 19.95, 99);
        System.out.println(dummyBook);
        dummyBook.setPrice(29.95);
        dummyBook.setQty(28);
        System.out.println("name is: " + dummyBook.getName());
        System.out.println("price is: " + dummyBook.getPrice());
        System.out.println("qty is: " + dummyBook.getQty());
        System.out.println("Author is: " + dummyBook.getAuthor());
        System.out.println("Author's name is: " + dummyBook.getAuthor().getName());
        System.out.println("Author's email is: " + dummyBook.getAuthor().getEmail());
        Book anotherBook = new Book("more Java", new Author("Paul Tan",
                "paul@somewhere.com", 'm'), 29.95);
        System.out.println(anotherBook);
    }

    public static void testBookB(){

        Author[] authors = new Author[2];
        authors[0] = new Author("Tan Ah Teck", "AhTeck@somewhere.com", 'm');
        authors[1] = new Author("Paul Tan", "Paul@nowhere.com", 'm');
        BookB javaDummy = new BookB("Java for Dummy", authors, 19.99, 99);
        System.out.println(javaDummy);
    }

    public static void testMyPoint(){

        MyPoint p1 = new MyPoint(); // Test constructor
        System.out.println(p1); // Test toString()
        p1.setX(8); // Test setters
        p1.setY(6);
        System.out.println("x is: " + p1.getX()); // Test getters
        System.out.println("y is: " + p1.getY());
        p1.setXY(3, 0); // Test setXY()
        System.out.println(p1.getXY()[0]); // Test getXY()
        System.out.println(p1.getXY()[1]);
        System.out.println(p1);
        MyPoint p2 = new MyPoint(0, 4); // Test another constructor
        System.out.println(p2);
// Testing the overloaded methods distance()
        System.out.println(p1.distance(p2)); // which version?
        System.out.println(p2.distance(p1)); // which version?
        System.out.println(p1.distance(5, 6)); // which version?
        System.out.println(p1.distance());

        MyPoint[] points = new MyPoint[10]; // Declare and allocate an array of MyPoint
        for (int i = 0; i < points.length; i++) {
            points[i] = new MyPoint(i+1, i+1);
            System.out.println(points[i]);
        }
    }


    public static void main(String[] args) {

        //testAuthor();
        //testBook();
        //testBookB();
        //testMyPoint();

    }
}
