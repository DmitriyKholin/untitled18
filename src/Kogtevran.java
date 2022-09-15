public class Kogtevran extends Hogwarts {
    int smart;
    int wise;
    int witty;
    int creative;

    public Kogtevran(String fullName, int magic, int transgress, int smart, int wise, int witty, int creative) {
        super(fullName, magic, transgress);
        this.smart = smart;
        this.wise = wise;
        this.witty = witty;
        this.creative = creative;
    }

    public int getSmart() {
        return smart;
    }
    public void setSmart(int smart) {
        if (smart < 0 || smart > 100) {
            throw new RuntimeException("Ввели неверное значение");
        }
        this.smart = smart;
    }

    public int getWise() {
        return wise;
    }
    public void setWise(int wise) {
        if (wise < 0 || wise > 100) {
            throw new RuntimeException("Ввели неверное значение");
        }
        this.wise = wise;
    }

    public int getWitty() {
        return witty;
    }
    public void setWitty(int witty) {
        if (witty < 0 || witty > 100) {
            throw new RuntimeException("Ввели неверное значение");
        }
        this.witty = witty;
    }

    public int getCreative() {
        return creative;
    }
    public void setCreative(int creative) {
        if (creative < 0 || creative > 100) {
            throw new RuntimeException("Ввели неверное значение");
        }
        this.creative = creative;
    }

    public String toString() {
        return "Когтевран, "+this.fullName +
                "- колдовать-" + this.magic +
                ", трансгрессировать-" + this.transgress +
                ", умность-" + this.smart +
                ", мудрость-" + this.wise +
                ", остроумность-" + this.witty +
                ", полны творчества-" + this.creative;
    }

    public void compareStudents(Kogtevran student2) {
        int power1 = this.smart + this.wise + this.witty + this.creative;
        int power2 = student2.smart + student2.wise + student2.witty + student2.creative;
        if (power1 > power2) {
            System.out.println(this.fullName + "сильнее, чем " + student2.fullName);
        } else if (power2 > power1) {
            System.out.println(student2.fullName + " сильнее, чем " + this.fullName);
        } else {
            System.out.println(this.fullName + " сила равна силе " + student2.fullName);
        }
    }
}