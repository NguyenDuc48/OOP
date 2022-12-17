package lab6;

public class TestPerson {
    public static void main(String[] args) {
        Person ps1 = new Person("Duc", "Thanh Xuan");
        Student st1 = new Student("Duc", "Thanh Xuan", "K66A5", 2022, 1.5);
        Staff sf1 = new Staff("Duc", "Thanh Xuan", "HUS", 1.5);
        System.out.println(ps1);
        System.out.println(st1);
        System.out.println(sf1);
    }
}
