package by.teachmeskills.homeworks.hw_03032023.task1.Hands;

public class ToshibaHandImpl implements IHand {
    private final int price;

    public ToshibaHandImpl(int price) {
        this.price = price;
    }

    @Override
    public void upHand() {
        System.out.println("Рука Toshiba поднялась");
    }

    @Override
    public int getPrice() {
        return price;
    }
}
