public class SalaryCalculator {

    static final double BASE_SALARY = 1000.00;
    static final double MAX_SALARY = 2000.00;

    public double multiplierPerDaysSkipped(int daysSkipped) {
        return (daysSkipped > 5) ? .85 : 1;
    }

    public int multiplierPerProductsSold(int productsSold) {
        return (productsSold > 20) ? 13 : 10;
    }

    public double bonusForProductSold(int productsSold) {
        return productsSold * multiplierPerProductsSold(productsSold);
    }

    public double finalSalary(int daysSkipped, int productsSold) {
        double potentialSalary = BASE_SALARY * multiplierPerDaysSkipped(daysSkipped) + bonusForProductSold(productsSold);
        return (potentialSalary > MAX_SALARY) ? MAX_SALARY : potentialSalary;
    } 
}
