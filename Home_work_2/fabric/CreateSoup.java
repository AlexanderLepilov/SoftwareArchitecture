package Home_work_2.fabric;

public class CreateSoup extends Creator{

    @Override
    public Product createProduct() {
        return new Soup();
    }
}