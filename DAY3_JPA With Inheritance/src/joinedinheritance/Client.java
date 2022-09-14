package joinedinheritance;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import singleinheritance.Employee;
import singleinheritance.Manager;

public class Client {

	public static void main(String[] args) {
		EntityManagerFactory factory=Persistence.createEntityManagerFactory("JPA-PU");
		EntityManager em=factory.createEntityManager();
		em.getTransaction().begin();
		
		//create an employee1
				Employee e=new Employee();
				e.setName("Sayli");
				e.setSalary(55000);
				em.persist(e);
				
				//create an employee1
				Employee e1=new Employee();
				e1.setName("Amisha");
				e1.setSalary(35000);
				em.persist(e1);
				
				//create a manager
				Manager m=new Manager();
				m.setName("Parth");
				m.setSalary(50000);
				m.setDeptname("Information Technology");
				em.persist(m);
				
				em.getTransaction().commit();
				System.out.println("The data is added");
				em.close();
				factory.close();
		
	}
	

}