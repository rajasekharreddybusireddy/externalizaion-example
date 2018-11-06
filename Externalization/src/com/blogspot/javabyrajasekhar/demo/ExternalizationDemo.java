package com.blogspot.javabyrajasekhar.demo;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

import com.blogspot.javabyrajasekhar.model.Employee;

public class ExternalizationDemo {
	public static void main(String[] args) {

		try {
			Employee employee = new Employee(111, "rajasekhar reddy", 50000d);
			ObjectOutputStream oob = new ObjectOutputStream(new FileOutputStream("emp.txt"));
			oob.writeObject(employee);
			oob.close();

			ObjectInputStream ois = new ObjectInputStream(new FileInputStream("emp.txt"));
			Object object = ois.readObject();
			Employee emp = (Employee) object;
			// System.out.println(emp + "from ExternalizationDemo ");
			System.out.println("eno" + emp.getEno());
			System.out.println("name" + emp.getName());
			System.out.println("salary" + emp.getSalary());
			ois.close();
		} catch (IOException | ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
