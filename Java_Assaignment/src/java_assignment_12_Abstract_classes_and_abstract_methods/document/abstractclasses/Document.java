package java_assignment_12_Abstract_classes_and_abstract_methods.document.abstractclasses;

public abstract class Document {
    private String fileName;

    public Document(String fileName){
        this.fileName = fileName;
    }


    public abstract String open() ;
    public abstract String save();
    public abstract String getDetails();
    public String close(){
        return "The file "+ fileName + " is closing...";
    }

    public String getFileName(){
        return fileName;
    }
}
