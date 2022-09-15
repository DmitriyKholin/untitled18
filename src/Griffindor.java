public class Griffindor extends Hogwarts {
    private int nobility;
    private int honour;
    private int bravery;

    public Griffindor(String fullName, int magic, int transgress, int nobility, int honour, int bravery) {
        super(fullName, magic, transgress);
        this.nobility = nobility;
        this.honour = honour;
        this.bravery = bravery;
    }

    public int getNobility() {
        return nobility;
    }
    public void setNobility(int nobility) {
        if (nobility < 0 || nobility > 100) {
            throw new RuntimeException("Ввели неверное значение");
        }
        this.nobility = nobility;
    }

    public int getHonour() {
        return honour;
    }
    public void setHonour(int honour) {
        if (honour < 0 || honour > 100) {
            throw new RuntimeException("Ввели неверное значение");
        }
        this.honour = honour;
    }

    public int getBravery() {
        return bravery;
    }
    public void setBravery(int bravery) {
        if (bravery < 0 || bravery > 100) {
            throw new RuntimeException("Ввели неверное значение");
        }
        this.bravery = bravery;
    }

    public String toString() {
        return "Гриффиндор, "+this.fullName +
                "-колдовать-" + this.magic +
                ", трансгрессировать-" + this.transgress +
                ", благородство-" + this.nobility +
                ", честь-" + this.honour +
                ", храбрость-" + this.bravery;
    }

    public void compareStudents(Griffindor student2) {
        int power1 = this.nobility + this.honour + this.bravery;
        int power2 = student2.nobility + student2.honour + this.bravery;
        if (power1>power2){
            System.out.println(this.fullName+" сильнее, чем "+student2.fullName);
        } else if (power2>power1) {
            System.out.println(student2.fullName+" сильнее, чем "+this.fullName);
        }
        else {
            System.out.println(this.fullName+" сила равна силе "+student2.fullName);
        }

    }
}