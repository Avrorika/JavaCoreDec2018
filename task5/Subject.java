package task5;

public enum Subject {
    LITERATURE("Lit"), MATHS("Maths"), LOGIC("Logic");

    Subject(String subject) {
        this.subject = subject;
    }

    String subject;

    public String getSubject() {
        return subject;
    }

    public void setSubject(String subject) {
        this.subject = subject;
    }

}
