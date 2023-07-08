package neeraj.rest.webservices.neerajwebservices;

public class helloworldneeraj {
    private  String hello;

    public helloworldneeraj(String  hello) {
        this.hello = hello;
    }

    public String getHello() {
        return hello;
    }

    public void setHello(String hello) {
        this.hello = hello;
    }

    @Override
    public String toString() {
        return "helloworldneeraj{" +
                "hello='" + hello + '\'' +
                '}';
    }
}
