public class Puffenduy extends Hogwarts {
    int industriousness;
    int loyality;
    int honesty;

    public Puffenduy(String fullName, int magic, int transgress, int industriousness, int loyality, int honesty) {
        super(fullName, magic, transgress);
        this.industriousness = industriousness;
        this.loyality = loyality;
        this.honesty = honesty;
    }

    public int getIndustriousness() {
        return industriousness;
    }

    public void setIndustriousness(int industriousness) {
        if (industriousness < 0 || industriousness > 100) {
            throw new RuntimeException("Ввели неверное значение");
        }
        this.industriousness = industriousness;
    }

    public int getLoyality() {
        return loyality;
    }

    public void setLoyality(int loyality) {
        if (loyality < 0 || loyality > 100) {
            throw new RuntimeException("Ввели неверное значение");
        }
        this.loyality = loyality;
    }

    public int getHonesty() {
        return honesty;
    }

    public void setHonesty(int honesty) {
        if (honesty < 0 || honesty > 100) {
            throw new RuntimeException("Ввели неверное значение");
        }
        this.honesty = honesty;
    }

    public String toString() {
        return "Пуффендуй, "+ this.fullName +
                "-колдовать-" + this.magic +
                ", трансгрессировать-" + this.transgress +
                ", трудолюбие-" + this.industriousness +
                ", верность-" + this.loyality +
                ", честность-" + this.honesty;
    }

    public void compareStudents(Puffenduy student2) {
        int power1 = this.industriousness + this.loyality + this.honesty;
        int power2 = student2.industriousness + student2.loyality + this.honesty;
        if (power1 > power2) {
            System.out.println(this.fullName + " сильнее, чем " + student2.fullName);
        } else if (power2 > power1) {
            System.out.println(student2.fullName + " сильнее, чем " + this.fullName);
        } else {
            System.out.println(this.fullName + " сила равна силе " + student2.fullName);
        }

    }
}