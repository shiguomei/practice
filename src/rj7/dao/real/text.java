package rj7.dao.real;


import rj7.bean.Real;
import rj7.util.DAOFactory;

public class text {
	public static void main(String[] args) {
		String id = "2";
		String idtype="id";
		Real real = (Real)DAOFactory.getDaoInstance().findById("tblreal", id, idtype, Real.class);
		//real.setradress("aaa");
		System.out.println(real);
		
		System.out.println(real.getAdress());
		System.out.println(real.getFiles());
		System.out.println(real.getIcon());
		System.out.println(real.getId());
		System.out.println(real.getIdcard());
		System.out.println(real.getClass());
		System.out.println(real.getMajor());
		System.out.println(real.getName());
		System.out.println(real.getPost());
		System.out.println(real.getId());
		System.out.println(real.getSchool());
		
		
	}
}
