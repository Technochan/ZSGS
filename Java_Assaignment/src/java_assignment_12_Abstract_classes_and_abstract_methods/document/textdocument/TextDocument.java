package java_assignment_12_Abstract_classes_and_abstract_methods.document.textdocument;

import java_assignment_12_Abstract_classes_and_abstract_methods.document.abstractclasses.Document;

public class TextDocument extends Document {
    private String fileSize;
    private String fileCreator;

    public TextDocument(String fileName , String fileSize,String fileCreator){
        super(fileName);
        this.fileSize = fileSize;
        this.fileCreator = fileCreator;
    }
    @Override
    public String open() {
        return "The file "+ super.getFileName()+ " is closing..." ;
    }

    @Override
    public String save() {
        return "The file "+super.getFileName()+ " is closing...";
    }

    public String getDetails(){
        return open() + " \n "+save()+" \n "+ super.close();
    }

}
