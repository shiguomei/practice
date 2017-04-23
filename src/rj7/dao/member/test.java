package rj7.dao.member;

import rj7.bean.Member;
import rj7.util.DAOFactory;


public class test {

	public static void main(String[] args) {
		String id = "1";
		String username="123";
		String pswd ="123";
		String idtype="id";
		Member mem = (Member)DAOFactory.getDaoInstance().findById("tbluser", id, idtype,Member.class);
   
		
		System.out.println(mem.getPswd());
		
		System.out.println(DAOFactory.getDaoInstance().login(username, pswd, "tbluser"));
	}
}
