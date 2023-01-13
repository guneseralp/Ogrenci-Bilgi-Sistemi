

public class Main {
    public static void main(String[] args) {
        Teacher t1 = new Teacher("Mahmut Hoca","TRH","+90500000");
        Teacher t2 = new Teacher("Graham","FZK","000");
        Teacher t3 = new Teacher("Külyutmaz","BIO","111111");

        Course tarih = new Course("Tarih", "101","TRH");
        tarih.addTeacher(t1);

        Course fizik=new Course("Fizik","102","FZK");
        fizik.addTeacher(t2);

        Course bio = new Course("Biyoloji","101","BIO");
        bio.addTeacher(t3);

        Student s1 = new Student ("Şaban","121354","4",tarih,fizik,bio);
        s1.addBulkExamNote(100,70,50,50,50,50);
        s1.ispass();
        Student s2 = new Student("Necmi","444","4",tarih, fizik,bio);
        s2.addBulkExamNote(50,30,70,50,50,50);
        s2.ispass();
    }
}