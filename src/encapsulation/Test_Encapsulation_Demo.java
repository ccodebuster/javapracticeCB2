package encapsulation;

public class Test_Encapsulation_Demo {

    public static void main(String[] args) {
        Encapsulation_Demo ec = new Encapsulation_Demo();
        ec.setEmp_id(1005);
        ec.setEmp_name("Codebuster");
        ec.setSalary(35000);

        System.out.println(ec.getEmp_id());
        System.out.println(ec.getEmp_name());
        System.out.println(ec.getSalary());

        ec.setEmp_id(10);
        ec.setEmp_name("Testing");
        ec.setSalary(50000);


        System.out.println(ec.getEmp_id());
        System.out.println(ec.getEmp_name());
        System.out.println(ec.getSalary());

    }
}
