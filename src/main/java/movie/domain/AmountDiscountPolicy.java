package movie.domain;

public class AmountDiscountPolicy extends DiscountPolicy {
    private Money discountAmount;

    public Money getDiscountAmount(Screening screening, DiscountCondition ...conditions) {
        super(conditions);
        this.discountAmount = discountAmount;
    }

    @Override
    protected Money getDiscountAmount(Screening screening) {
        return discountAmount;
    }
}
