package movie.domain;
public interface DiscountCondition {

    public boolean isSatisfiedBy(Screening screening);
}
