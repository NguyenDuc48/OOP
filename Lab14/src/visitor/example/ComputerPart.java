package visitor.example;

public interface ComputerPart {
    public void accept(ComputerPartVisitor computerPartVisitor);
}