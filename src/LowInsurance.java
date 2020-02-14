public class LowInsurance extends IncomeBasedInsurance {

    LowInsurance(){
        System.out.println("low");
    }

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