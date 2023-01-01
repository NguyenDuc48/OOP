package builder.example;

public class Builder {
    public static void main(String[] args) {
        HouseBuilder houseBuilder = new IglooHouseBuilder();

        CivilEngineer civilEngineer = new CivilEngineer(houseBuilder);

        civilEngineer.constructHouse();

        House house = civilEngineer.getHouse();

        System.out.println(house);
    }
}
