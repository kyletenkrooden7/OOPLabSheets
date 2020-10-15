package labsheet8.sampleprogram1.exercise2;

public class Validator {

    //algorithm taken and modified from last years Lab Sheet 10 Extra, Exercise 4
    public static boolean isValidRegistrationNumber(String registrationNumber){

        if(registrationNumber.length()>=6 && registrationNumber.length()<=12) //must be between 6 and 12 characters long (inclusive)
            if(Character.isDigit(registrationNumber.charAt(0)) && Character.isDigit(registrationNumber.charAt(1))) // first 2 characters of the registration plate must be digits
                if(registrationNumber.charAt(2)=='-') // third character must be a dash symbol
                    if((Character.isUpperCase(registrationNumber.charAt(3))&&Character.isUpperCase(registrationNumber.charAt(4))&& //•	The next 2 characters must either be 2 uppercase letters or else a single uppercase letter followed by a dash, to represent the county in which the car was purchased. If the 4th and 5th characters were both uppercase letters, then the 6th character must be a dash, but if the 4th and 5th characters were an uppercase letter followed by a dash then the 6th character must be a digit
                            registrationNumber.charAt(5)=='-') || (Character.isUpperCase(registrationNumber.charAt(3))&&
                            registrationNumber.charAt(4)=='-' && Character.isDigit(registrationNumber.charAt(5)))) {

                        int j;

                        for (j = 6; j < registrationNumber.length(); j++) //•	Beyond the 6th character, all the remaining characters in the registration plate must consist of digits - as there could be any number of digits, up to a maximum of 6 digits, for this part of the registration plate, you will need a loop to process these characters


                            if (!Character.isDigit(registrationNumber.charAt(j)))
                                break;

                        if (j == registrationNumber.length())
                            return true;
                    }

        return false;
    }
}