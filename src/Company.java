public class Company {
    private int id;
    private String cname;
    private String location;
    private Employee[]employee;

    public Company() {
    }

    public Company(int id, String cname, String location, Employee[] employee) {
        this.id = id;
        this.cname = cname;
        this.location = location;
        this.employee = employee;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getCname() {
        return cname;
    }

    public void setCname(String cname) {
        this.cname = cname;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public Employee[] getEmployee() {
        return employee;
    }

    public void setEmployee(Employee[] employee) {
        this.employee = employee;
    }
    public  String geEmployeeByName(String employee, Company company){
        Employee employee1=null;
        for (int i = 0; i <company.employee.length; i++) {
            if (company.employee[i].getName().equals(employee)) {
                employee1 = company.employee[i];
            }
        }return "name: "+employee1.getName()+"surname: "+employee1.getSurname()+"age: "+employee1.getAge()+"salary: "+employee1.getSalary();}
public int count(int age, Company company ) {
    int s = 0;
    for (int i = 0; i < company.employee.length; i++) {
        if (company.employee[i].getAge() == age) {
            s++;
        }
        return s;

    }

}}