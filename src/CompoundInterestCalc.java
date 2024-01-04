public class CompoundInterestCalc {
    public static void main(String[] args) {
        //Calculate compound interest for a house that costs 100,000, with annual interest rate= 3.875,
        // which compounds monthly in the time period of 10 years.

        double principle = 100000.00;
        double annualInterestRateInPercent = 3.875;
        double timeInYears = 10;
        double rateInDecimal = annualInterestRateInPercent / 100;
        double accuredAmount = principle* Math.pow (1 + rateInDecimal,timeInYears);
        System.out.println("Accured amount= " + accuredAmount);
        double compoundInterest = accuredAmount - principle;
        System.out.println("Compound Interest over 10 years is: " + compoundInterest);

    }
}

