public class closure {

    public static void main(String[] args) {
        Noargumentfunction<Noargumentfunction<String>> str=() -> {
          String name = "program";
        return () -> "Hello " + name; //we can access the local variable name here
    };

    Noargumentfunction<String>  result = str.apply();
        System.out.println(result.apply());
        // System.out.println(name);//error for accessing other local(closure) variable name
    }
}
