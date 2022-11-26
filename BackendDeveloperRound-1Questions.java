public class ContactNumberValidation1  
{  
public static void main(String args[])   
{  
//calling method and validate different formats   
System.out.println("1  2124567890 : " + validateNumber("2124567890"));  
System.out.println("2  212-456-7890 : " + validateNumber("212-456-7890"));   
System.out.println("  123 456 7890 : " + validateNumber("123 456 7890"));  
System.out.println("3 (212)456-7890  : " + validateNumber("(212)456-7890"));
System.out.println("4  (212)-456-7890 : " + validateNumber("(212)-456-7890"));
System.out.println("5   212.456.7890: " + validateNumber("212.456.7890"));
System.out.println("6   212 456 7890: " + validateNumber("212 456 7890"));
System.out.println("7  +12124567890: " + validateNumber("+12124567890"));
System.out.println("8   +1 212.456.7890: " + validateNumber("+1 212.456.7890"));
System.out.println("9   +212-456-7890: " + validateNumber("+212-456-7890"));
System.out.println("10 1-212-456-7890 : " + validateNumber("1-212-456-7890"));
System.out.println("11   ");


}  


//function validates mobile numbers   
private static boolean validateNumber(String mobNumber)   
{  
//validates phone numbers having 10 digits (9998887776)  
if (mobNumber.matches("\\d{10}"))  
return true;  
//validates phone numbers having digits, -, . or spaces  
else if (mobNumber.matches("\\d{3}[-\\.\\s]\\d{3}[-\\.\\s]\\d{4}"))  
return true;
else if (mobNumber.matches("\\(\\d{3}\\)\\d{3}-\\d{4}"))  
return true;  
else if (mobNumber.matches("\\(\\d{3}\\)-\\d{3}-\\d{4}"))  
return true;  
else if (mobNumber.matches("\\+\\d{11}"))  
return true;
else if (mobNumber.matches("\\+\\d{1}[-\\.\\s]\\d{3}[-\\.\\s]\\d{3}[-\\.\\s]\\d{4}"))  
return true;  
else if (mobNumber.matches("\\+\\d{3}[-\\.\\s]\\d{3}[-\\.\\s]\\d{4}"))  
return true;
else if (mobNumber.matches("\\d{1}[-\\.\\s]\\d{3}[-\\.\\s]\\d{3}[-\\.\\s]\\d{4}"))  
return true;
//return false if any of the input matches is not found  
else  
return false;  
}  
}  