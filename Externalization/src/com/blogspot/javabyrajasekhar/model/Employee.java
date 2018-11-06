package com.blogspot.javabyrajasekhar.model;

import java.io.Externalizable;
import java.io.IOException;
import java.io.ObjectInput;
import java.io.ObjectOutput;

public class Employee implements Externalizable {
	private int eno;
	private String name;
	private  double salary;

	public Employee() {
		// TODO Auto-generated constructor stub
	}

	public Employee(int eno, String name, double salary) {
		super();
		this.eno = eno;
		this.name = name;
		this.salary = salary;
	}

	public int getEno() {
		return eno;
	}

	public void setEno(int eno) {
		this.eno = eno;
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

	@Override
	public String toString() {
		return "Employee [eno=" + eno + ", name=" + name + ", salary=" + salary + "]";
	}

	@Override
	public void readExternal(ObjectInput in) throws IOException, ClassNotFoundException {
		eno = in.readInt();
		name = (String) in.readObject();
		salary = in.readDouble();
		// System.out.println(eno + " " + name + " " + salary + "from read external
		// method");

	}

	@Override
	public void writeExternal(ObjectOutput out) throws IOException {

		out.writeInt(eno);
		out.writeObject(name);
		out.writeDouble(salary);
		;
	}

}
