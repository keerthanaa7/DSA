import java.util.Objects;

public class StoredEmployee {
    private String key;
    private Employee employee;

    public StoredEmployee(String key, Employee employee){
        this.key = key;
        this.employee = employee;
    }

    public String getKey() {
        return key;
    }

    public void setKey(String key) {
        this.key = key;
    }

    public Employee getEmployee() {
        return employee;
    }

    public void setEmployee(Employee employee) {
        this.employee = employee;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        StoredEmployee that = (StoredEmployee) o;
        return Objects.equals(key, that.key) && Objects.equals(employee, that.employee);
    }

    @Override
    public int hashCode() {
        return Objects.hash(key, employee);
    }
}
