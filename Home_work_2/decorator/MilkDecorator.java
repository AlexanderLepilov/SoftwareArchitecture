package Home_work_2.decorator;

public class MilkDecorator implements Coffee {

    private Coffee coffee;
    public MilkDecorator (Coffee coffee) {
        this.coffee = coffee;
    }

    @Override
    public double getCost() {
        return coffee.getCost() + 0.5;
    }

    @Override
    public String getDescription() {
        return coffee.getDescription() + " с молоком";
    }

}