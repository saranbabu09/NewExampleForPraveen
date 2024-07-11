package org.emp;

public class Employee {
	
	//empId(),empName(),empDob(),empPhone(),empEmail(),empAddress()
       public void  empId() {
    	   System.out.println("ID : 10101");
       }
       public void empName() {
    	   System.out.println("Name : Saran");
       }
       public void empDob() {
    	   System.out.println("DOB : 11/03/1997");
       }
       public void empPhone() {
    	   System.out.println("Phone : 9345022745");
       } 
       public void empEmail() {
    	   System.out.println("Email : babusaran785@gmail.com ");
       }
       public void empAddress() {
    	   System.out.println("Address : Police Quatres,Kandigai");
       }
       public static void main(String[] args) {
		Employee obj = new Employee();
		obj.empId();
		obj.empName();
		obj.empDob();
		obj.empPhone();
		obj.empEmail();
		obj.empAddress();
	}

}
