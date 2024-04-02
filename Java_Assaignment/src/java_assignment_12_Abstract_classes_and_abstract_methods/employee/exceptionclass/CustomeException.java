package java_assignment_12_Abstract_classes_and_abstract_methods.employee.exceptionclass;

public class CustomeException extends Exception {

}
class UnauthorizedAccessError extends CustomeException{
    public String getMessage() {
        return "Don't have access to modify the control details";
    }
}
