package java_assignment_12_Abstract_classes_and_abstract_methods.book.exceptionclass;


public class UnauthorizedAccessError extends Exception{
    public String getMessage() {
        return "Don't have access to modify the control details";
    }
}
