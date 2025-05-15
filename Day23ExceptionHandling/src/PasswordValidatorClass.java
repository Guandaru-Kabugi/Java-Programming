public class PasswordValidatorClass {
    //two throw exceptions from Exception class
    public void validatePassword(String password, String confirmPassword)
        throws WeakPasswordCustomException,PasswordMismatchException{
        //check if length is within the specified 12 chars
            if(password.length() <8){
                throw new WeakPasswordCustomException("Password must be at least 8 characters long");
            }
            //ensure password does not exceed 20 chars
            if(password.length()>20){
                throw new WeakPasswordCustomException("Password must not be more than 20 characters.");
            }
            //boolean variables to confirm weak vs strong password
            boolean hasUpperCase = false;
            boolean hasLowerCase = false;
            boolean hasDigit = false;
            boolean hasSpecialChar = false;
            String specialCharacters = "!@#$%^&*()-+";
            //for loop to mark the boolean variables

            for (char ch: password.toCharArray()){
                //for each loop
                if(Character.isUpperCase(ch)){
                    hasUpperCase = true;
                } else if (Character.isLowerCase(ch)) {
                    hasLowerCase = true;

                } else if (Character.isDigit(ch)) {
                    hasDigit = true;
                    //index of helps check the different indexes to see if they match. It searches for the index

                } else if (specialCharacters.indexOf(ch)>=0) {
                    hasSpecialChar = true;
                }
            }
            //throw new errors to be handled later
            if(!hasUpperCase || !hasLowerCase || !hasDigit || !hasSpecialChar){
                throw new WeakPasswordCustomException("Password must contain at least one uppercase letter, one lowercase letter, one digit, and one special character.");
            }
            if (!password.equals(confirmPassword)){
                throw new PasswordMismatchException("Password does not match.");

            }

        }
    }


