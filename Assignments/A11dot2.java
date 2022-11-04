import java.util.Date;

public class A11dot2 {
	public static void main(String[] args) {
		Person p = new Person("bob", "Rexburg", "1234", "bob@bob.com");
		System.out.println(p);
		Person s = new Student("ann", "Rigby", "2345", "ann@ann.com", "Senior");
		System.out.println(s);
		Person e = new Employee("joe", "Roberts", "3456", "bob@bob.com", "STC " + "100", 100000.00, new Date());
		System.out.println(e);
		Person f = new Faculty("sue", "Ririe", "4567", "sue@sue.com", "SMI " + "222", 150000.00, new Date(100L),
				"12:00", "Full Professor");
		System.out.println(f);
		
	}
}

class Person {
	String name;
	String address;
	String phoneNumber;
	String email;

	public Person(String name, String address, String phoneNumber, String email) {
		super();
		this.name = name;
		this.address = address;
		this.phoneNumber = phoneNumber;
		this.email = email;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public String getPhoneNumber() {
		return phoneNumber;
	}

	public void setPhoneNumber(String phoneNumber) {
		this.phoneNumber = phoneNumber;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String toString() {
		return "Person - " + name;
	}
}

class Student extends Person {
	String status;

	public Student(String name, String address, String phoneNumber, String email, String status) {
		super(name, address, phoneNumber, email);
		this.status = status;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	public String toString() {
		return "Student - " + name + " - " + status;
	}
}

class Employee extends Person {
	String office;
	double salary;
	Date dateHired;

	public Employee(String name, String address, String phoneNumber, String email, String office, double salary,
			Date dateHired) {
		super(name, address, phoneNumber, email);
		this.office = office;
		this.salary = salary;
		this.dateHired = dateHired;
	}

	public String getOffice() {
		return office;
	}

	public void setOffice(String office) {
		this.office = office;
	}

	public double getSalary() {
		return salary;
	}

	public void setSalary(double salary) {
		this.salary = salary;
	}

	public Date getDateHired() {
		return dateHired;
	}

	public void setDateHired(Date dateHired) {
		this.dateHired = dateHired;
	}

	public String toString() {
		return "Employee - " + name + " - " + dateHired;
	}
}

class Faculty extends Employee {
	String officeHours;
	String rank;

	public Faculty(String name, String address, String phoneNumber, String email, String office, double salary,
			Date dateHired, String officeHours, String rank) {
		super(name, address, phoneNumber, email, office, salary, dateHired);
		this.officeHours = officeHours;
		this.rank = rank;
	}

	public String getOfficeHours() {
		return officeHours;
	}

	public void setOfficeHours(String officeHours) {
		this.officeHours = officeHours;
	}

	public String getRank() {
		return rank;
	}

	public void setRank(String rank) {
		this.rank = rank;
	}

	public String toString() {
		return "Faculty - " + name + " - " + rank;
	}
}