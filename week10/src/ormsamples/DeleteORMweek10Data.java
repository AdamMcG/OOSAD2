/**
 * Licensee: Institute of Technology Tallaght
 * License Type: Academic
 */
package ormsamples;

import org.orm.*;
public class DeleteORMweek10Data {
	public void deleteTestData() throws PersistentException {
		PersistentTransaction t = ormtest.ORMweek10PersistentManager.instance().getSession().beginTransaction();
		try {
			ormtest.Employee lormtestEmployee = ormtest.Employee.loadEmployeeByQuery(null, null);
			lormtestEmployee.delete();
			t.commit();
		}
		catch (Exception e) {
			t.rollback();
		}
		
	}
	
	public static void main(String[] args) {
		try {
			DeleteORMweek10Data deleteORMweek10Data = new DeleteORMweek10Data();
			try {
				deleteORMweek10Data.deleteTestData();
			}
			finally {
				ormtest.ORMweek10PersistentManager.instance().disposePersistentManager();
			}
		}
		catch (Exception e) {
			e.printStackTrace();
		}
	}
}
