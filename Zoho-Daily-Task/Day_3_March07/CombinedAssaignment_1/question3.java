package Day_3_March07.CombinedAssaignment_1;

import java.util.ArrayList;
import java.util.Scanner;

//3. In the BMI calculator program done in Java Assignment 2, write methods
//to get height and weight for 2 or more persons and compare their BMIs.

class Bmi {
    String name;
    double bmi;
    String remark;
    static ArrayList<Bmi> reports = new ArrayList<>();
    public Bmi(String name,double bmi,String remark){
        this.name = name;
        this.bmi = bmi;
        this.remark = remark;
    }
    public static void add(Bmi report) {
        reports.add(report);
    }
    public static void print(){
        for(int i=0 ; i<reports.size()-1 ; i++){
            if(reports.get(i).bmi < reports.get(i+1).bmi ){
                Bmi report = reports.get(i+1);
                reports.set(i+1, reports.get(i));
                reports.set(i, report);
            }
        }
        System.out.println("Name \t\t |  BMI \t |  Remark");
        int k=0;
        while(k < reports.size()){
            System.out.println(reports.get(k).name +"\t\t |  "+reports.get(k).bmi +"\t |  "+reports.get(k).remark  );
            k++;
        }
    }
}
public class question3 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the person count to check: ");
        int personCount = scan.nextInt();

        for(int i=1 ; i<=personCount ; i++){
            System.out.println("Enter the Name of Person "+ i );
            String name = scan.next();
            System.out.println("Enter weight of Person "+ i + " in KG");
            float weight = scan.nextFloat();
            System.out.println("Enter height of Person "+ i + " in CM");
            float height = scan.nextFloat();
            checkBmi(name,weight,height);
        }
        Bmi.print();
        scan.close();
    }
    public static void checkBmi(String name , float weight , float height){
        double val =  weight / (height/100 * height/100 );
        double bmi = Math.round(val * 10.0) / 10.0;

        if(bmi < 18.5){
            Bmi obj = new Bmi(name,bmi,"Under Weight");
            Bmi.add(obj);
        } else if(bmi >= 18.5 && bmi < 25){
            Bmi obj = new Bmi(name,bmi,"Normal Weight");
            Bmi.add(obj);
        } else if(bmi >= 25 && bmi < 30){
            Bmi obj = new Bmi(name,bmi,"Over Weight");
            Bmi.add(obj);
        } else {
            Bmi obj = new Bmi(name,bmi,"Obesity");
            Bmi.add(obj);
        }
    }
}
