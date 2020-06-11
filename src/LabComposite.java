public class LabComposite
{
    public static void main(String[] args)
    {
        Man man1 = new Man("Man1");
        Man man2 = new Man("Man2");
        Employee employee1 = new Employee("Employee1");
        Employee employee2 = new Employee("Employee2");

        man1.addEmployee(employee1);
        man1.addEmployee(employee2);
        System.out.println(man1.getEmployees());

        man1.addMan(man1);
        man1.addMan(man2);
        System.out.println(man1.getMen());

        man1.removeEmployee(employee1);
        System.out.println(man1.getEmployees());

    }
}
