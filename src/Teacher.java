public class Teacher {
    Teacher teacher;
    String name;
    String mpno;
    String branch;

    Teacher(String name, String mpno, String branch) {
        this.name = name;
        this.branch = branch;
        this.mpno = mpno;
    }

    void print() {
        System.out.println("Ad: " + this.name);
        System.out.println("Telefon Numarasi: " + this.mpno);
        System.out.println("Bölümü: " + this.branch);

    }


}
