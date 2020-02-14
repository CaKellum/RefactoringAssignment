public class InsuranceCalculator {

    private IncomeBasedInsurance cal;

    public double calculateInsurance(double income) {
        if (income <= 10000) {
            cal = new LowInsurance();
            return cal.calculate(income);
        } else if (income <= 30000) {
            cal = new MediumInsurance();
            return cal.calculate(income);
        } else if (income <= 60000) {
            cal = new HighInsurance();
            return cal.calculate(income);
        } else {
            cal = new VeryHighInsurance();
            return cal.calculate(income);
        }
    }

}
