package com.jhf.labten;

public class SalesPerson extends Employee  implements Comparable<SalesPerson>{
	
	private static String certificationNumber; //for transaction num
	// ( ??? -- ##)
    
     private static boolean charsOK(String s) { 
    	    for (char c : certificationNumber.toCharArray()) {
    	        if (s.indexOf(c) != -1) return false;
    	    }
    	    return true;
             // indexOf : to check if a specific character is in your string or not
    	    //(it will return -1 if it's not in it).
    	    
    	    
    	    //
    	}

	public static String getCertificationNumber() {
	if(	charsOK(certificationNumber)) {
		return certificationNumber;
	}
	else return null;
	}

	public static void setCertificationNumber(String certificationNumber) {
		SalesPerson.certificationNumber = certificationNumber;
	}

	public SalesPerson() {
		super();
	}
	
	public SalesPerson(String name,int age, double salary, String certName) {
		super(name,age,salary);
		requireValidCertificationNumber(certName);
		//this.certificationNumber=certName;
    }
	
	
	
	
	@Override
	public String toString() {
		return "SalesPerson [getEmp_name()=" + getEmp_name() + ", getAge()=" + getAge() + ", getEmp_salary()="
				+ getEmp_salary() + ", getClass()=" + getClass() + ", hashCode()=" + hashCode() + ", toString()="
				+ super.toString() + "]";
	}

	private static  String requireValidCertificationNumber(String certNum) {
		String exp="thers is an axception the cert number not good";
		if (charsOK(certificationNumber)) {
	 	InvalidEmployeeCertException inv=new InvalidEmployeeCertException(exp);
	 	return "error i certNum";
		}
		else 
			System.out.print("there is no fault in numbe");
		
			return certNum;
	}
	public interface Comparable<SalesPerson> {
		int compareTo(SalesPerson other);
		
		
	}
	@Override
	public int compareTo(SalesPerson o) {
		// TODO Auto-generated method stub
		
		if(getEmp_salary()==o.getEmp_salary()) {
			return 0;
		}
		else 	if(getEmp_salary()>o.getEmp_salary()) {
			return 1;
		}
		else return -1;
	}
	
	}
