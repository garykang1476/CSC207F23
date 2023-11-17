package week7.strategy;

public class SalaryStrategyFactory {

    public static ISalaryStrategy getStrategy(String type){
        if (type.equals("优秀员工")) {
            return new BasePaySalaryStrategy(100000, 100, 2000);
        } else if (type.equals("Contractor")){
            return new ContractorStrategy(400);
        }
        else{
            throw new IllegalArgumentException();
        }
    }


    public static ISalaryStrategy getStrategy(double basePay, int basePayHour, double overpayRate){
        return new BasePaySalaryStrategy(basePay, basePayHour, overpayRate);
    }

    public static ISalaryStrategy getStrategy(double payRate){
        return new ContractorStrategy(payRate);
    }
}
