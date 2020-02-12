package Family;

public class Person {
	    private  static String name;
	    private  static int salary;
	  
	    public Person() {
			
		}
	    public String getName() {
	        return name;
	    }

	    public void setName(String name) {
	    	Person.name = name;
	    }

	    public int getsalary() {
	        return salary;
	    }

	    public void setsalary(int salary) {
	        Person.salary = salary;
	    }
	    
        public void showsalary() {
            System.out.println(name+"工资是"+salary);
            
        }


		
		
}





