
// Задание 2.4
public class Employee {
    // поля
    private String name;
    private String department;
    private Employee chief;

    // свойства
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }

    public String getDepartment() {
        return department;
    }
    public void setDepartment(String department) {
        this.department = department;
    }

    public Employee getChief() {
        return chief;
    }
    public void setChief(Employee chief) {
        this.chief = chief;
    }

    public Employee(String name, String department) {
        this.name = name;
        this.department = department;
        this.chief = null;
    }

    // методы
    @Override
    public String toString() {
        if (this == chief) { // Когда сотрудник является начальником
            return name + " начальник отдела " + department;
        } else {
            return name + " работает в отделе " + department + ", начальник которого " + chief.getName();
        }
    }
}