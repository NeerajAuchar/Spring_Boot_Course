package neeraj.rest.webservices.neerajwebservices;

public class Helloworldjoe {
    private  String helloworldjoe;

    public Helloworldjoe(String helloworldjoe) {
        this.helloworldjoe = helloworldjoe;
    }

    public String getHelloworldjoe() {
        return helloworldjoe;
    }

    public void setHelloworldjoe(String helloworldjoe) {
        this.helloworldjoe = helloworldjoe;
    }

    @Override
    public String toString() {
        return "Helloworldjoe{" +
                "helloworldjoe='" + helloworldjoe + '\'' +
                '}';
    }
}
