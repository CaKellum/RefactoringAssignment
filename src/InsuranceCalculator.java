public class InsuranceCalculator {

    private IncomeBasedInsurance cal;

    public double calculateInsurance(double income) {
        cal = IncomeBasedInsurance.setInconmeBase(income);
        return cal.calculate(income);
    }

}
