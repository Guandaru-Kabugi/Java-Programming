public class ValidationLoggerClass implements AutoCloseable{
    //closable is an interface

    //do not make below variable static if you do not plan to use it program wide

    public static boolean hasLoggedCompletion = true;

    public void log(String status,String message){
        System.out.printf("Status: %s | Message: %s%n", status, message);
    }
    public void logSuccess(){
        log("SUCCESS", "The password meets all security criteria.");
    }
    public void logFailure(String reason){
        log("FAILURE", reason);
    }

    //overrides method interface to close the logger successfully

    @Override
    public void close() {
        if (!hasLoggedCompletion) {
            log("INFO", "Password validation process completed.");
            hasLoggedCompletion = true;
        }

    }
}
