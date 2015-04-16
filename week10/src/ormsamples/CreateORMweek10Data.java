/**
 * Licensee: Institute of Technology Tallaght
 * License Type: Academic
 */
package ormsamples;

import org.orm.*;
public class CreateORMweek10Data {
	public void createTestData() throws PersistentException {
		PersistentTransaction t = ormtest.ORMweek10PersistentManager.instance().getSession().beginTransaction();
		try {
			for(int i = 0; i < 100; i++){
			ormtest.Employee lormtestEmployee = ormtest.Employee.createEmployee();
			// Initialize the properties of the persistent object here
			lormtestEmployee.setName("Mr A Smith");
			lormtestEmployee.setAddress("Kingswood Tallaght Dublin 24");
			lormtestEmployee.setPps(i + "23344");
			lormtestEmployee.setMobile(i + "86632");			
			lormtestEmployee.save();
			}
			t.commit();
		}
		catch (Exception e) {
			t.rollback();
		}
		
	}
	
	public static void main(String[] args) {
		try {
			CreateORMweek10Data createORMweek10Data = new CreateORMweek10Data();
			try {
				createORMweek10Data.createTestData();
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
