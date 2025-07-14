package model;


public class Employee1 {
   
	private int id;
    private String name;
    private double salary;
    private String department;
    private String city;
    private String position;
    private String hireDate;
    private String email;
    private String address;
    private String companyName;
    
    public Employee1() {
    	
    }

    public Employee1(int id, String name, double salary, String department, String city, String position,
			String hireDate, String email, String address, String companyName) {
		super();
		this.id = id;
		this.name = name;
		this.salary = salary;
		this.department = department;
		this.city = city;
		this.position = position;
		this.hireDate = hireDate;
		this.email = email;
		this.address = address;
		this.companyName = companyName;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public double getSalary() {
		return salary;
	}

	public void setSalary(double salary) {
		this.salary = salary;
	}

	public String getDepartment() {
		return department;
	}

	public void setDepartment(String department) {
		this.department = department;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public String getPosition() {
		return position;
	}

	public void setPosition(String position) {
		this.position = position;
	}

	public String getHireDate() {
		return hireDate;
	}

	public void setHireDate(String hireDate) {
		this.hireDate = hireDate;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public String getCompanyName() {
		return companyName;
	}

	public void setCompanyName(String companyName) {
		this.companyName = companyName;
	}

	@Override
	public String toString() {
		return "Employee1 [id=" + id + ", name=" + name + ", salary=" + salary + ", department=" + department
				+ ", city=" + city + ", position=" + position + ", hireDate=" + hireDate + ", email=" + email
				+ ", address=" + address + ", companyName=" + companyName + ", getId()=" + getId() + ", getName()="
				+ getName() + ", getSalary()=" + getSalary() + ", getDepartment()=" + getDepartment() + ", getCity()="
				+ getCity() + ", getPosition()=" + getPosition() + ", getHireDate()=" + getHireDate() + ", getEmail()="
				+ getEmail() + ", getAddress()=" + getAddress() + ", getCompanyName()=" + getCompanyName()
				+ ", getClass()=" + getClass() + ", hashCode()=" + hashCode() + ", toString()=" + super.toString()
				+ "]";
	}
    
    
}

