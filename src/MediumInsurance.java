public class MediumInsurance {
    public MediumInsurance() {
    }

    double medium(double income) {
        return (income - getModifier()) * getWeight() + getConstant();
    }

    int getConstant() {
        return 35600;
    }

    double getWeight() {
        return 0.2;
    }

    int getModifier() {
        return 10000;
    }
}