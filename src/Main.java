public class Main {
    public static void main(String[] args) {
        Teacher t1 = new Teacher("Mahmut Hoca", "555", "TRH");
        Teacher t2 = new Teacher("Külyutmaz", "999", "FZK");
        Teacher t3 = new Teacher("Güdük Necmi", "1421", "KMYA");

        Course c1 = new Course("Tarih", "101", "TRH");
        c1.addTeacher(t1);

        Course c2 = new Course("Fizik", "102", "FZK");
        c2.addTeacher(t2);

        Course c3 = new Course("Kimya", "103", "KMYA");
        c3.addTeacher(t3);

        Course verbal1 = new Course("Tarih Sözlü", "SZLU", "TRH");
        verbal1.addTeacher(t1);

        Course verbal2 = new Course("Fizik Sözlü", "SZLU", "FZK");
        verbal2.addTeacher(t2);

        Course verbal3 = new Course("Kimya Sözlü", "SZLU", "KMYA");
        verbal3.addTeacher(t3);


        Student s1 = new Student("Inek Saban", "143", "4", c1, c2, c3, verbal1, verbal2, verbal3);
        s1.addBulkExamNote(76, 43, 95, 50, 50, 50);
        s1.prinName();
        s1.printNote();
        s1.isPass();
        System.out.println("===============");

        Student s2 = new Student("Necmi", "430", "4", c1, c2, c3, verbal1, verbal2, verbal3);
        s2.addBulkExamNote(45, 34, 25, 75, 75, 75);
        s2.prinName();
        s2.printNote();
        s2.isPass();

    }
}
