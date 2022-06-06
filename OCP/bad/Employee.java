package OCP.bad;

public class Employee {

    private EmployeeType type;
    
    public Integer calculateSalary() {

        if (EmployeeType.ANALIST.equals(this.type)) {
            return 4000;
        } else if (EmployeeType.PROGRAMMER.equals(this.type)) { 
            return 2500;
        } else {
            throw new NullPointerException();
        }
    }
}
