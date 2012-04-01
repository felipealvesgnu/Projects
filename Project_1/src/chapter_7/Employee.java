package chapter_7;

public class Employee implements Comparable<Employee>{

	private int age;
	
	public void setAge(int age){
		this.age = age;
	}
	
	public int getAge(){
		return this.age;
	}

	@Override
	public int compareTo(Employee otherEmployee) {
		
		int age = otherEmployee.getAge();
		
		if(this.getAge() > age)
			return 1;
		else if(this.getAge() < age)
			return -1;
		else
			return 0;	
	}
}

class JavaComparableExample{
	   
    public static void main(String args[]){
       
        /*
        Create two different Employee objects, so that we can compare them.
        */
       
        Employee one = new Employee();        
        one.setAge(40);
       
        Employee two = new Employee();        
        one.setAge(30);
       
        /*
        Use compareTo method to determine which employee is younger
        */
       
        if(one.compareTo(two) > 0) {        
            System.out.println("Employee one is older than employee two!");
       
        } else if(one.compareTo(two) < 0) {        
            System.out.println("Employee one is younger than employee two!");        
       
        } else if(one.compareTo(two) == 0) {        
            System.out.println("Both employees are same!");        
        }
   
    }
 
}
