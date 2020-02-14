public class LowInsurance extends IncomeBasedInsurance {

    @Override
    public int getAdjustment() {
        return 0;
    }

    @Override
    public int getConstant() {
        return 0;
    }

    @Override
    public double getWeight() {
        return 0.365;
    }
}