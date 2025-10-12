package PloyParameter.java;

public class EmployeeTest {
    public static void main(String[] args) {
        ordinaryEmployee tom = new ordinaryEmployee(3000,"tom");
        manager jack = new manager(6000,"jack",200000);
        EmployeeTest employeeTest = new EmployeeTest();
        employeeTest.showEmpAnnual(tom);
        employeeTest.showEmpAnnual(jack);
        employeeTest.testWork(tom);
        employeeTest.testWork(jack);
    }
    public void showEmpAnnual(Employee e){
        System.out.println(e.getAnnual()+"获取年工资");
    }
    public void testWork(Employee e){
        if(e instanceof manager){
            ((manager) e).manage();
        } else if (e instanceof ordinaryEmployee) {
            ((ordinaryEmployee) e).work();
        }else {
            System.out.println("都不是");
        }
    }
}
