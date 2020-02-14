public abstract class IncomeBasedInsurance {
    public double calculate(double income){
        return (income - getAdjustment()) * getWeight() + getConstant();
    }

    protected abstract double getWeight();

    protected abstract int getAdjustment();

    protected abstract int getConstant();
}
