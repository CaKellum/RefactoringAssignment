public class LowInsurance {
    public LowInsurance() {
    }

    double low(double income) {
        return (income - getAdjustment()) * getWeight() + getConstant();
    }

    int getAdjustment() {
        return 0;
    }

    int getConstant() {
        return 0;
    }

    double getWeight() {
        return 0.365;
    }
}