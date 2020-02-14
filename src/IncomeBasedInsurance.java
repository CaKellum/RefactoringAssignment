import java.util.HashMap;
import java.util.Map;

public abstract class IncomeBasedInsurance {



    public static IncomeBasedInsurance setInconmeBase(double income) {
        int med = new MediumInsurance().getAdjustment();
        int high = new HighInsurance().getAdjustment();
        int verHigh = new VeryHighInsurance().getAdjustment();
        Map<Boolean, IncomeBasedInsurance> insuranceMap = new HashMap<>();
        insuranceMap.put((income <= med), new LowInsurance());
        insuranceMap.put((med<income&&income<=high),new MediumInsurance());
        insuranceMap.put((high<income&&income<=verHigh),new HighInsurance());
        insuranceMap.put((verHigh<income), new VeryHighInsurance());
        return insuranceMap.get(true);
    }

    public double calculate(double income){
        return (income - getAdjustment()) * getWeight() + getConstant();
    }

    protected abstract double getWeight();

    protected abstract int getAdjustment();

    protected abstract int getConstant();
}
