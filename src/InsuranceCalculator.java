public class InsuranceCalculator {

    private final VeryHighInsurance veryHighInsurance = new VeryHighInsurance();
    private final HighInsurance highInsurance = new HighInsurance();
    private final MediumInsurance mediumInsurance = new MediumInsurance();
    private final LowInsurance lowInsurance = new LowInsurance();

    public double calculateInsurance(double income) {
        if (income <= 10000) {
            return lowInsurance.low(income);
        } else if (income <= 30000) {
            return mediumInsurance.medium(income);
        } else if (income <= 60000) {
            return highInsurance.high(income);
        } else {
            return veryHighInsurance.veryHigh(income);
        }
    }

}
