package strategy.pseudo;

public class App {
    public static void main(String[] args) {
        Context context = new Context();
        int id = 0;
        if (id == 0) {
            context.setStrategy(new ConcreteStrategyAdd());
        } else if (id == 1) {
            context.setStrategy(new ConcreteStrategySubtract());

        } else {
            context.setStrategy(new ConcreteStrategyMultiply());
        }
        System.out.println(context.executeStrategy(2, 4));
    }
}
