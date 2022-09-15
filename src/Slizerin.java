public class Slizerin extends Hogwarts {
    int conning;
    int determination;
    int ambition;
    int resourcefulness;
    int lustForPower;

    public Slizerin(String fullName, int magic, int transgress, int conning, int determination, int ambition,
                    int resourcefulness, int lustForPower) {
        super(fullName, magic, transgress);
        this.conning = conning;
        this.determination = determination;
        this.ambition = ambition;
        this.resourcefulness = resourcefulness;
        this.lustForPower = lustForPower;
    }

    public int getConning() {
        return conning;
    }
    public void setConning(int conning) {
        if (conning < 0 || conning > 100) {
            throw new RuntimeException("Ввели неверное значение");
        }
        this.conning = conning;
    }

    public int getDetermination() {
        return determination;
    }
    public void setDetermination(int determination) {
        if (determination < 0 || determination > 100) {
            throw new RuntimeException("Ввели неверное значение");
        }
        this.determination = determination;
    }

    public int getAmbition() {
        return ambition;
    }
    public void setAmbition(int ambition) {
        if (ambition < 0 || ambition > 100) {
            throw new RuntimeException("Ввели неверное значение");
        }
        this.ambition = ambition;
    }

    public int getResourcefulness() {
        return resourcefulness;
    }
    public void setResourcefulness(int resourcefulness) {
        if (resourcefulness < 0 || resourcefulness > 100) {
            throw new RuntimeException("Ввели неверное значение");
        }
        this.resourcefulness = resourcefulness;
    }

    public int getLustForPower() {
        return lustForPower;
    }
    public void setLustForPower(int lustForPower) {
        if (lustForPower < 0 || lustForPower > 100) {
            throw new RuntimeException("Ввели неверное значение");
        }
        this.lustForPower = lustForPower;
    }

    public String toString() {
        return "Слизерин, "+this.fullName +
                "- колдовать-" + this.magic +
                ", трансгрессировать-" + this.transgress +
                ", хитрость-" + this.conning +
                ", решительность-" + this.determination +
                ", амбициозность-" + this.ambition +
                ", находчивость-" + this.resourcefulness +
                ", жажда власти-" + this.lustForPower;
    }

    public void compareStudents(Slizerin student2) {
        int power1 = this.conning + this.determination + this.ambition + this.resourcefulness + this.lustForPower;
        int power2 = student2.conning + student2.determination + student2.ambition + student2.resourcefulness + student2.lustForPower;
        if (power1 > power2) {
            System.out.println(this.fullName + " сильнее, чем " + student2.fullName);
        } else if (power2 > power1) {
            System.out.println(student2.fullName + " сильнее, чем " + this.fullName);
        } else {
            System.out.println(this.fullName + " сила равна силе " + student2.fullName);
        }
    }
}