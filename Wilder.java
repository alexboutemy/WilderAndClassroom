public class Wilder {
    private String firstname;
    private boolean present;

    public Wilder(String firstname, boolean present) {
        this.firstname = firstname;
        this.present = present;
    }

    public String getFirstname() {
        return firstname;
    }

    public boolean getPresent() {
        return present;
    }

    public void setFirstname(String firstname) {
        this.firstname = firstname;
    }

    public void setPresent(boolean present) {
        this.present = present;
    }

    public String whoAmI() {
        String not = this.getPresent() ? "" : "not ";
        return "My name is " + this.getFirstname() + " and I am " + not + "present";
    }
}