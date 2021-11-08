package Task10;

public class ComplexBread extends BasicBread implements BreadInterface {
    private final int x;

    public ComplexBread(int x) {
        super(x);
        this.x = x;
    }

    protected void printX() {
        System.out.println(x);
    }

    @Override
    public void bakeBread() {
        System.out.println("Thos is wholegrain bread ");
    }
}