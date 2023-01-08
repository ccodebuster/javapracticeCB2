package encapsulation;

public class Encapsulation_Demo {
        /*To achieve Encapsulation Declared Variables as Private and using get and set methods
        to access and update the value of a private
        variable*/
    private int emp_id;

    private String emp_name;

    private int salary;

    public int getEmp_id() {
        return emp_id;
    }

    public void setEmp_id(int emp_id) {
        this.emp_id = emp_id;
    }

    public String getEmp_name() {
        return emp_name;
    }

    public void setEmp_name(String emp_name) {
        this.emp_name = emp_name;
    }

    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }
}
