package week7.strategy;

public class BasePaySalaryStrategy implements ISalaryStrategy {

    private double basePay;
    private int basePayHour;
    private double overpayRate;
    private int currentHours;

    public BasePaySalaryStrategy(double basePay, int basePayHour, double overpayRate) {
        this.basePay = basePay;
        this.basePayHour = basePayHour;
        this.overpayRate = overpayRate;
    }

    @Override
    public void addWorkHours(int hours) {
        currentHours += hours;

    }

    @Override
    public double getSalary() {
        if (currentHours > basePayHour){
            return basePay + overpayRate * (currentHours - basePayHour);
        }
        return basePayHour;
    }
}
