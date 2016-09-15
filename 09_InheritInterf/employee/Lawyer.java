public class Lawyer extends Employee {
    public void sue() {
        System.out.println("I'll see you in court!");
    }
    public String getVacationForm() { 
        return "pink";
    }
    public double getSalary() { 
        double basesalary = super.getSalary();
        return basesalary + 10000.0;
    }
}
