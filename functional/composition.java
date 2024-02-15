import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import java.util.function.Function;
import java.util.stream.Collectors;

class employee{
    public String name;
    public int age;
    public String jobTitle;
    public  float salary;

  public  employee(String name,int age,String jobTitle,float salary){
    this.name=name;
    this.age=age;
    this.jobTitle=jobTitle;
    this.salary=salary;
  }
}
public class composition {
public static void main(String[] args) {

    // Function<Integer,Integer> multiply = x -> x * 2;
    // Function<Integer,Integer> minus = x-> x - 1;

    //  Function<Integer,Integer> result = multiply.compose(minus);
    // Function<Integer,Integer> result1 = minus.andThen(multiply);
    // Function<Integer,Integer> result2 = minus.compose(multiply);

    // System.out.println(result.apply(10));
    // System.out.println(result1.apply(5));
    // System.out.println(result2.apply(5));

    employee[] employeearray ={
        new employee("arun",25,"developer",30000),
        new employee("sam",30,"analyst",20000),
        new employee("rose",40,"developer",70000),
        new employee("karthick",50,"process associaate",30000),
    };
    List<employee> employee =new ArrayList<>(Arrays.asList(employeearray));

    //1.get employee name , 2.reverse it ,3. change to uppercase (using composition)

    Function<employee,String> getname = get -> get.name;
    Function<String,String> reverse = str->new StringBuilder(str).reverse().toString();
    Function<String,String> uppercase  =str -> str.toUpperCase();

    Function<employee,String> getresult = getname.andThen(reverse).andThen(uppercase);

    List<String> resultofemployee = employee
                    .stream()
                    .map( getresult)
                    .collect(Collectors.toList());

    System.out.println(resultofemployee);
}
}
