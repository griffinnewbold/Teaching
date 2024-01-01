
/******************************************
* PhoneNumber.java 
* Written by Cannon
*
* Modified by Griffin
* 
* Objects of this class determine weather a
* phone number is a valid Manhattan Number
*
******************************************/

public class PhoneNumberCompile{

    private String number; 
    private boolean valid; 
	

    public PhoneNumberCompile(String n){
        number=n;
        valid=true;
    }

    // This method checks to see if the area code is a Manhattan 
    // area code
    private void check1(){
        int areaCode=Integer.parseInt(n.substring(0,3));
        if (!(areaCode==212 || areaCode==917 || areaCode==646))
            valid=false;
    }
	
    // This method checks to see if the first number of the prefix
    // is a valid number (2-9)
    private void check2(){
        first=Integer.parseInt(n.substring(4,5));
        
    }
    if (first==0 || first==1)
            valid=false;
	
    // this public method calls the two support methods to check
    // to see if the number is valid
    public void check(){
        check1();
        check2();
    }
    // This is an accessor method for the IV valid
    public boolean isValid(){
        return valid;
    }

