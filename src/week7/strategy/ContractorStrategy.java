package week7.strategy;

public class ContractorStrategy implements ISalaryStrategy {
    private double payRate;
    private int currentHours;

    public ContractorStrategy(double payRate) {
        this.payRate = payRate;
    }

    @Override
    public void addWorkHours(int hours) {
        currentHours += hours;
    }

    @Override
    public double getSalary() {
        return currentHours * payRate;
    }
}
