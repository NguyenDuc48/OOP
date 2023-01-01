package Iterator.example;

public class App {
    public static void main(String[] args) {
        String[] listStr = {"Nam", "Duc", "Hai"};
        ProductCatalog productCatalog = new ProductCatalog(listStr);
        Iterator iterator = productCatalog.getIterator();
        while (iterator.hasNext()) {
            System.out.println("Name: " + iterator.next());
        }

    }
}
