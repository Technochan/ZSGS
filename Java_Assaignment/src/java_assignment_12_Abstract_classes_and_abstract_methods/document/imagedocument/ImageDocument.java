package java_assignment_12_Abstract_classes_and_abstract_methods.document.imagedocument;

import java_assignment_12_Abstract_classes_and_abstract_methods.document.abstractclasses.Document;

public class ImageDocument extends Document {

    private String fileSize;
    private String fileCreator;

    public ImageDocument(String fileName , String fileSize,String fileCreator){
        super(fileName);
        this.fileSize = fileSize;
        this.fileCreator = fileCreator;
    }
    @Override
    public String open() {
        return "The file "+ super.getFileName()+ " is opening..." ;
    }

    @Override
    public String save() {
        return "The file "+super.getFileName()+ " is saving...";
    }
    @Override
    public String getDetails(){
        return open() + " \n "+save()+" \n "+ super.close()+"\n";
    }

}
