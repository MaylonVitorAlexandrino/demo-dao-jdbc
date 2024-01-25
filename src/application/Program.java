package application;

import java.util.List;

import model.dao.DaoFactory;
import model.dao.SellerDao;
import models.entities.Department;
import models.entities.Seller;

public class Program {

	public static void main(String[] args) {

		SellerDao sellerDao = DaoFactory.createSellerDao();
		
		System.out.println("===== TEST 1: seller findById =====");
		Seller seller = sellerDao.findById(1);
		
		System.out.println(seller);
		
		System.out.println("\n===== TEST 2: seller findById =====");
		Department department = new Department(2, null);
		List<Seller> list = sellerDao.findByDepartment(department);
		list.forEach(System.out::println);
		
		System.out.println("\n===== TEST 3: seller findAll =====");
		list = sellerDao.findAll();
		list.forEach(System.out::println);
	}

}
