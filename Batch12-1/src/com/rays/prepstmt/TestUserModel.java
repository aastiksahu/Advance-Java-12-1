package com.rays.prepstmt;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Iterator;
import java.util.List;

public class TestUserModel {

	public static void main(String[] args) throws Exception {

		// testAdd();
		 testDelete();
		// testUpdate();
		// testSearch();
		// testFindByPk();
		// testFindByLogin();
		// testAuthenticate();
	}

	private static void testAuthenticate() throws Exception {

		UserModel model = new UserModel();

		UserBean bean = model.authenticate("mohan@gmail.com", "09876543210");

		if (bean != null) {

			System.out.println("\t\t---------------Login Successfully:---------------");
			System.out.println();
			System.out.print(bean.getId());
			System.out.print("\t" + bean.getFirstName());
			System.out.print("\t" + bean.getLastName());
			System.out.print("\t" + bean.getLoginId());
			System.out.print("\t" + bean.getPassword());
			System.out.print("\t" + bean.getAddress());
			System.out.print("\t" + bean.getGender());
			System.out.println("\t" + bean.getDob());
		} else {
			System.out.println("\t\t---------------Invalid Login Id & Password.---------------");
		}

	}

	private static void testFindByLogin() throws Exception {

		UserBean bean = new UserBean();
		UserModel model = new UserModel();

		bean = model.findByLogin("rahul@gmail.com");

		if (bean == null) {
			System.out.println("\t\t---------------Invalid Login Id.---------------");
		} else {

			System.out.println("\t\t---------------Login Successfully:---------------");
			System.out.println();
			System.out.print(bean.getId());
			System.out.print("\t" + bean.getFirstName());
			System.out.print("\t" + bean.getLastName());
			System.out.print("\t" + bean.getLoginId());
			System.out.print("\t" + bean.getPassword());
			System.out.print("\t" + bean.getAddress());
			System.out.print("\t" + bean.getGender());
			System.out.println("\t" + bean.getDob());
		}
	}

	private static void testFindByPk() throws Exception {

		UserBean bean = new UserBean();
		UserModel model = new UserModel();

		bean = model.findByPk(4);

		if (bean == null) {
			System.out.println("\t\t\t\tRecord Not Found");
		} else {

			System.out.print(bean.getId());
			System.out.print("\t" + bean.getFirstName());
			System.out.print("\t" + bean.getLastName());
			System.out.print("\t" + bean.getLoginId());
			System.out.print("\t" + bean.getPassword());
			System.out.print("\t" + bean.getAddress());
			System.out.print("\t" + bean.getGender());
			System.out.println("\t" + bean.getDob());
		}

	}

	private static void testSearch() throws Exception {

		UserBean bean = new UserBean();

		UserModel model = new UserModel();

		List list = model.search(bean);

		Iterator it = list.iterator();

		while (it.hasNext()) {

			bean = (UserBean) it.next();

			System.out.print(bean.getId());
			System.out.print("\t" + bean.getFirstName());
			System.out.print("\t" + bean.getLastName());
			System.out.print("\t" + bean.getLoginId());
			System.out.print("\t" + bean.getPassword());
			System.out.print("\t" + bean.getAddress());
			System.out.print("\t" + bean.getGender());
			System.out.println("\t" + bean.getDob());

		}

	}

	private static void testUpdate() throws Exception {

		UserBean bean = new UserBean();

		UserModel model = new UserModel();

		bean.setFirstName("Mohan");
		bean.setId(3);

		model.update(bean);

	}

	private static void testDelete() throws Exception {

		UserModel model = new UserModel();

		model.delete(5);

	}

	private static void testAdd() throws Exception {

		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");

		UserBean bean = new UserBean();

		bean.setId(6);
		bean.setFirstName("shubham");
		bean.setLastName("patel");
		bean.setLoginId("shubham@gmail.com");
		bean.setPassword("09876543210");
		bean.setAddress("ujjain");
		bean.setGender("Male");
		bean.setDob(sdf.parse("2000-08-10"));

		UserModel model = new UserModel();

		model.add(bean);

	}

}
