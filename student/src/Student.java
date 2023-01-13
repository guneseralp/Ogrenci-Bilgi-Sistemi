public class Student {
    Course c1;
    Course c2;
    Course c3;
    String name;
    String stNumber;
    String classes;
    double avarage;
    boolean isPass;


    Student(String name,String stNumber, String classes,Course c1,Course c2, Course c3){
        this.name = name;
        this.stNumber = stNumber;
        this.classes = classes;
        this.c1 = c1;
        this.c2 = c2;
        this.c3 = c3;
        this.avarage = 0.0;
        this.isPass = false;
    }

    void addBulkExamNote(int note1, int note2, int note3,int sNote1,int sNote2, int sNote3){
        if(((note1*0.8)+(sNote1*0.2)) >= 0 && ((note1*0.8)+(sNote1*0.2)) <= 100){
            this.c1.note = (note1*0.8)+(sNote1*0.2);
        }
        if(((note2*0.8)+(sNote2*0.2)) >= 0 && ((note2*0.8)+(sNote2*0.2)) <= 100){
            this.c2.note = (note2*0.8)+(sNote2*0.2);
        }
        if(((note3*0.8)+(sNote3*0.2)) >= 0 && ((note3*0.8)+(sNote3*0.2)) <= 100){
            this.c3.note = (note3*0.8)+(sNote3*0.2);
        }
    }
    void ispass(){
        System.out.println("=======================");
        this.avarage = (this.c1.note + this.c2.note + this.c3.note) / 3.0;
        if(this.avarage > 55){
            System.out.println("Sınıfı Başarılı bir şakilde geçtiniz.");
            this.isPass = true;
        }else{
            System.out.println("Sınıfta Kaldınız.");
            this.isPass = false;
        }
        printNote();
    }

    void printNote(){

        System.out.println(c1.name + " Notu\t:" + this.c1.note);
        System.out.println(c2.name + " Notu\t:" + this.c2.note);
        System.out.println(c3.name + " Notu\t:" + this.c3.note);
        System.out.println("Ortalama: " + this.avarage);
    }
}
