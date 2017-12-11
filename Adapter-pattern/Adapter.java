public class Adapter ITarget {
    Adaptee adaptee;
    public Adapter(Adaptee a) {
        this.adaptee = a;
    }

    public void request() {
        this.adaptee.specificRequest();
    }
}

public class Adaptee {
    public void specificRequest(){
        // Code for some specific request.
    }
}