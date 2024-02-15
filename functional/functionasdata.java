 class data {
    private String name;
    private int age;
//constructor
    public data(String name,int age){
    this.name=name;
    this.age= age;
        }
}


public  class functionasdata{

public final  Noargumentfunction<data> loaddata;

//constructor
public functionasdata(Boolean isdevelopment){
 this.loaddata =  isdevelopment ? this::loadreal : this::loadfake;
}

private  data loadreal(){
 System.out.println("loading real");
 return new data("A",80);
}

private  data loadfake(){
    System.out.println("returninng fake data");
    return new data("B",90);

}
    public static void main(String[] args) {

        final boolean isdevelopment =true;
        functionasdata result =new functionasdata(isdevelopment);
        System.out.println(result.loaddata.apply());

    }
}
