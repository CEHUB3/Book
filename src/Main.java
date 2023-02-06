public class Main {
    public static void main(String[] args) {
        Book b1 = new Book("Java", true);
        Book b2 = new Book("Mat", false);
        Book b3 = new Book("Mat", true);
        Book b4 = new Book("Mat", false);
        System.out.println(b1.equals(b2));
        System.out.println(b2.equals(b3));
        System.out.println(b2.equals(b4));

    }
}