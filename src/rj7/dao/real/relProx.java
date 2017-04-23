package rj7.dao.real;


import rj7.bean.Real;
import rj7.dao.real.relDao;
import rj7.dao.real.relImpl;

public class relProx implements relDao {
	

private relDao dao = null;
	
	public relProx() {
		
		this.dao = new relImpl();
	}
	
	public Real findById(String id, String tblname,String idtype) {
		
		return this.dao.findById(id, tblname,idtype);
	}}
