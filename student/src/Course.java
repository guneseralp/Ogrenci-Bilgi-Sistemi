public class Course {
    Teacher teach;
    String name;
    String code;
    String prefix;
    double note;

    Course(String name,String code,String prefix){
        this.name = name;
        this.code = code;
        this.prefix = prefix;
        int note = 0;
    }



    void addTeacher(Teacher teacher){
        if(teacher.branch.equals(this.prefix)) {
            this.teach = teacher;
        }else{
            System.out.println("Öğretmen ve ders birimleri uyuşmamaktadır.");
        }
    }

    void printTeacher(){
        this.teach.print();
    }
}
