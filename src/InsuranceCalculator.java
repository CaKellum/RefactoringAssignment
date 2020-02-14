public class InsuranceCalculator {

    public double calculateInsurance(double income) {
        if (income <= 10000) {
            return low(income);
        } else if (income <= 30000) {
            return medium(income);
        } else if (income <= 60000) {
            return high(income);
        } else {
            return veryHigh(income);
        }
    }

    private double low(double income) {
        return income*0.365;
    }

    private double medium(double income) {
        return (income-10000)*0.2+35600;
    }

    private double high(double income) {
        return (income-30000)*0.1+76500;
    }

    private double veryHigh(double income) {
        return (income-60000)*0.02+105600;
    }

}
