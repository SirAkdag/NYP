public class Student {
    Course c1;
    Course c2;
    Course c3;
    Course verbal1;
    Course verbal2;
    Course verbal3;
    String name;
    String stuNo;
    String classes;
    double average = 0.0;
    double average1 = 0.0;
    double average2 = 0.0;
    double average3 = 0.0;

    boolean isPass;

    Student(String name, String stuNo, String classes, Course c1, Course c2, Course c3, Course verbal1, Course verbal2, Course verbal3) {
        this.name = name;
        this.stuNo = stuNo;
        this.classes = classes;
        this.c1 = c1;
        this.c2 = c2;
        this.c3 = c3;
        this.verbal1 = verbal1;
        this.verbal2 = verbal2;
        this.verbal3 = verbal3;
        this.average = 0.0;
        this.isPass = false;
    }

    void addBulkExamNote(int note1, int note2, int note3, int note4, int note5, int note6) {
        if (note1 >= 0 && note1 <= 100) {
            this.c1.note = note1;
        }
        if (note2 >= 0 && note2 <= 100) {
            this.c2.note = note2;
        }
        if (note3 >= 0 && note3 <= 100) {
            this.c3.note = note3;
        }
        if (note4 >= 0 && note4 <= 100) {
            this.verbal1.note = note4;
        }
        if (note5 >= 0 && note5 <= 100) {
            this.verbal2.note = note5;
        }
        if (note6 >= 0 && note6 <= 100) {
            this.verbal3.note = note6;
        }
    }
    void prinName(){
        System.out.println(this.name+" :\n");
    }
    void printNote() {
        System.out.println(c1.name + " Notu: " + c1.note);
        System.out.println(c2.name + "Notu: " + c2.note);
        System.out.println(c3.name + "Notu: " + c3.note);
        System.out.println(verbal1.name + "Notu: " + verbal1.note);
        System.out.println(verbal2.name + "Notu: " + verbal2.note);
        System.out.println(verbal3.name + "Notu: " + verbal3.note);

    }

    void isPass() {
        this.average1 = ((this.c1.note * 0.80) + (this.verbal1.note * 0.20));
        this.average2 = ((this.c2.note * 0.70) + (this.verbal2.note * 0.30));
        this.average3 = ((this.c3.note * 0.75) + (this.verbal3.note * 0.25));
        this.average = (this.average1 + this.average2 + this.average3) / 3.0;
        if (this.average >= 55) {
            System.out.println("\nSinifi Gectiniz !");
            this.isPass = true;
        } else {
            System.out.println("\nSinifta Kalndiniz");
            this.isPass = false;
        }
    }


}
