package neeraj.rest.webservices.neerajrestservices;

public class Helloworldbean {
    private  String helloworld;

    public Helloworldbean(String helloworld) {
        this.helloworld = helloworld;

    }

    public String getHelloworld() {
        return helloworld;
    }

    public void setHelloworld(String helloworld) {
        this.helloworld = helloworld;
    }

    @Override
    public String toString() {
        return "helloworldbean{" +
                "helloworld='" + helloworld + '\'' +
                '}';
    }
}
