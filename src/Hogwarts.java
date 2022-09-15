public class Hogwarts {
    String fullName;
    int magic;
    int transgress;
    public Hogwarts(String fullName, int magic, int transgress) {
        this.fullName=fullName;
        this.magic = magic;
        this.transgress = transgress;
    }

    public String getFullName() {
        return fullName;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    public int getMagic() {
        return magic;
    }

    public void setMagic(int magic) {
        if (magic<0 || magic>100){
            throw new RuntimeException("Ввели неверное значение");
        }
        this.magic = magic;
    }

    public int getTransgress() {
        return transgress;
    }

    public void setTransgress(int transgress) {
        if (transgress<0 || transgress>100){
            throw new RuntimeException("Ввели неверное значение");
        }
        this.transgress = transgress;
    }
    public static void compareStudents(Hogwarts student1, Hogwarts student2){
        int power1=student1.magic+student1.transgress;
        int power2=student2.magic+student2.transgress;
        if (power1>power2) {
            System.out.println(student1.fullName+" сильнее, чем "+student2.fullName);
        } else if (power1<power2) {
            System.out.println(student2.fullName+" сильнее, чем "+student1.fullName);
        }else {
            System.out.println(student1.fullName+" сила равна силе "+student2.fullName);
        }

    }

}