package application;

import java.util.Date;
import java.util.List;
import java.util.Scanner;

import model.dao.DaoFactory;
import model.dao.DepartmentDao;
import models.entities.Department;
import models.entities.Seller;

public class Program2 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		DepartmentDao departmentDao = DaoFactory.createDepartmentDao();
		
		System.out.println("===== TEST 1: department findById =====");
		Department dep = departmentDao.findById(1);
		
		System.out.println(dep);
		
		System.out.println("\n===== TEST 2: department findAll =====");
		List<Department> list = departmentDao.findAll();
		list.forEach(System.out::println);
		
		System.out.println("\n===== TEST 4: department insert =====");
		dep = new Department(null, "Music");
		departmentDao.insert(dep);
		System.out.println("Inserted! New id = " + dep.getId());
		
		System.out.println("\n===== TEST 5: department update =====");
		dep = departmentDao.findById(1);
		dep.setName("Food");
		departmentDao.update(dep);
		System.out.println("Update complete!");
		
		System.out.println("\n===== TEST 6: department delete =====");
		System.out.print("Enter the ID to be deleted: ");
		int id = sc.nextInt();
		departmentDao.deleteById(id);
		System.out.println("Delete completed!");
	}
}
