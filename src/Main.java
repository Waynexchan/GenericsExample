class Info<T , k>{
    private  T key;
    private  k value;


    public T getKey() {
        return key;
    }

    public void setKey(T key) {
        this.key = key;
    }

    public k getValue() {
        return value;
    }

    public void setValue(k value) {
        this.value = value;
    }
}

public class Main {
    public static void main(String[] args) {
        Info<String, Integer> myInfo = new Info<>();
        myInfo.setKey("Wilson");
        myInfo.setValue(3000);
        System.out.println(myInfo.getKey() + " " +myInfo.getValue());

    }
}