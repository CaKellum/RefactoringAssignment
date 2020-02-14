public class VeryHighInsurance extends IncomeBasedInsurance {
    VeryHighInsurance(){
        System.out.println("Vhigh");
    }

    @Override
    public int getConstant() {
        return 105600;
    }

    @Override
    public double getWeight() {
        return 0.02;
    }

    @Override
    public int getAdjustment() {
        return 60000;
    }
}