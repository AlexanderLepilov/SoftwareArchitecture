package Home_work_2.seminar_example;

public class SilverGenerator extends ItemFabric {

    public IGameItem createItem() {

        return new SilverReward();

    }
}