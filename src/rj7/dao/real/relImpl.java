package rj7.dao.real;

import rj7.bean.Real;
import rj7.util.DAOFactory;








public class relImpl implements  relDao{
   public Real findById(String id, String tblname,String idtype) {
		
		return (Real)DAOFactory.getDaoInstance().findById(tblname, id, idtype,Real.class);
	}

}
