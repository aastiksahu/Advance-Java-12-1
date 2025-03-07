package com.rays.marks;

import java.util.Iterator;
import java.util.List;

public class TestMarksheetModel {

	public static void main(String[] args) throws Exception {

		// testAdd();
		// testUpdate();
		// testDelete();
		// testSearch();
		// testGetRollNo();
		testGetMeritList();
	}

	private static void testGetMeritList() throws Exception {

		MarksheetBean bean = new MarksheetBean();

		MarksheetModel model = new MarksheetModel();

		List list = model.getMeritList(bean);

		Iterator it = list.iterator();

		while (it.hasNext()) {

			bean = (MarksheetBean) it.next();

			System.out.print(bean.getId());
			System.out.print("\t\t" + bean.getRollNo());
			System.out.print("\t\t" + bean.getFirstName());
			System.out.print("\t\t" + bean.getLastName());
			System.out.print("\t\t" + bean.getPhysics());
			System.out.print("\t\t" + bean.getChemistry());
			System.out.print("\t\t" + bean.getMaths());
			System.out.print("\t\t" + bean.getTotal());
			System.out.println("\t\t" + bean.getPercentage());

		}

	}

	private static void testGetRollNo() throws Exception {

		MarksheetBean bean = new MarksheetBean();

		MarksheetModel model = new MarksheetModel();

		List list = model.search(bean);

		Iterator it = list.iterator();

		while (it.hasNext()) {

			bean = (MarksheetBean) it.next();

			System.out.println(bean.getRollNo());
		}
	}

	private static void testSearch() throws Exception {

		MarksheetBean bean = new MarksheetBean();

		MarksheetModel model = new MarksheetModel();

		List list = model.search(bean);

		Iterator it = list.iterator();

		while (it.hasNext()) {

			bean = (MarksheetBean) it.next();

			System.out.print(bean.getId());
			System.out.print("\t\t" + bean.getRollNo());
			System.out.print("\t\t" + bean.getFirstName());
			System.out.print("\t\t" + bean.getLastName());
			System.out.print("\t\t" + bean.getPhysics());
			System.out.print("\t\t" + bean.getChemistry());
			System.out.println("\t\t" + bean.getMaths());

		}

	}

	private static void testDelete() throws Exception {

		MarksheetModel model = new MarksheetModel();

		model.delete(3);

	}

	private static void testUpdate() throws Exception {

		MarksheetBean bean = new MarksheetBean();

		MarksheetModel model = new MarksheetModel();

		bean.setFirstName("Rohan");
		bean.setId(3);

		model.update(bean);
	}

	private static void testAdd() throws Exception {

		MarksheetBean bean = new MarksheetBean();
		MarksheetModel model = new MarksheetModel();

		bean.setId(3);
		bean.setRollNo(103);
		bean.setFirstName("Mohan");
		bean.setLastName("Yadav");
		bean.setPhysics(75);
		bean.setChemistry(80);
		bean.setMaths(85);

		model.add(bean);

	}

}
