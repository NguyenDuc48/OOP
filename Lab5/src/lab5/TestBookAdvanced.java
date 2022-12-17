package lab5;

public class TestBookAdvanced {
    public static void main(String[] args) {
        AuthorAdvanced[] authors = new AuthorAdvanced[2];
        authors[0] = new AuthorAdvanced("Tan Ah Tech", "ahtech@somewhere.com", 'm');
        authors[1] = new AuthorAdvanced("Paul Tan", "paul@nowhere.com", 'm');

        BookAdvanced javaDummy = new BookAdvanced("Java for dummy", authors, 19.99, 99);
        System.out.println(javaDummy);

        System.out.println("Author's name are: " + javaDummy.getAuthorNames());
    }
}
