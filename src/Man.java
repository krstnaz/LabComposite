import java.util.ArrayList;
import java.util.List;

public class Man        //Композитный класс содержит список самого себя
{
    private String name;
    private List<Man> men = new ArrayList<>();
    private List<Employee> employees = new ArrayList<>();

    public Man(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    void addMan( Man man )
    {
        men.add(man);
    }

    void removeMan( Man man )
    {
        men.remove(man);
    }

    public List<Man> getMen() {
        return men;
    }

    void addEmployee( Employee employee )
    {
        employees.add(employee);
    }

    void removeEmployee( Employee employee )
    {
        employees.remove(employee);
    }

    public List<Employee> getEmployees() {
        return employees;
    }
}
