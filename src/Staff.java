public class Staff extends Person{
    private String school;
    private int pay;

    public Staff(String name, String adress, String school, int pay) {
        super(name, adress);
        this.school = school;
        this.pay = pay;
    }

    public String getSchool() {
        return school;
    }

    public int getPay() {
        return pay;
    }

    public void setSchool(String school) {
        this.school = school;
    }

    public void setPay(int pay) {
        this.pay = pay;
    }

    @Override
    public String toString() {
        return "Staff{" + "Person{" +
                "name='" + getName() + '\'' +
                ", adress='" + getAdress() + '\'' +
                '}' + "school='" + school + '\'' +
                ", pay=" + pay +
                '}';
    }
}

