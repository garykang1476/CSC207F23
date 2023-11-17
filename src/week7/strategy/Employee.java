package week7.strategy;

public class Employee {

    private String name;
    private ISalaryStrategy iSalaryStrategy;


    Employee(String name, ISalaryStrategy iSalaryStrategy){
        this.name = name;
        this.iSalaryStrategy = iSalaryStrategy;
    }

    void logWorkHours(int hours){
        iSalaryStrategy.addWorkHours(hours);
    }


    double getSalary(){
        return iSalaryStrategy.getSalary();
    }

    void updateStrategy(ISalaryStrategy iSalaryStrategy){
        this.iSalaryStrategy = iSalaryStrategy;
    }


    public static void main(String[] args) {
        Employee emp = new Employee("Gary", new BasePaySalaryStrategy(40000, 200, 500));
        Employee emp2 = new Employee("ALex", new ContractorStrategy(400));

        emp.updateStrategy(new ContractorStrategy(400));
    }

}
