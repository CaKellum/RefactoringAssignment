public class HighInsurance {
    public HighInsurance() {
    }

    double high(double income) {
        return (income - getAdjustment()) * getWeight() + getConstant();
    }

    int getConstant() {
        return 76500;
    }

    double getWeight() {
        return 0.1;
    }

    int getAdjustment() {
        return 30000;
    }
}