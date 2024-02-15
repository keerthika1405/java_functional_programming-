import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collector;
import java.util.stream.Collectors;

public class practiceofstream{

    static class person{
        public String name;
        public int age;

     public person(String name,int age){
            this.name=name;
            this.age=age;
        }
    }
    static class car{
        public final String name = null;
        public String make;
        public String color;
        public float price;

        public car(String make,String color,float price){
this.make=make;
this.color=color;
this.price=price;

        }
    }
    static class employee{
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

public static void main(String[]args){

//get the list contain that all the people name ?

person[] peoplearray = {
     new person("ram",10),
     new person("anu",20),
     new person("lal",30),
     new person("salam",40),
};
List<person> people =new ArrayList<>(Arrays.asList(peoplearray));

List<String> resultofperson = people
                    .stream()
                    .map( (per)->per.name)
                    .collect(Collectors.toList());

                    System.out.println(resultofperson);

//get the list of blue color ?

car[] cararray ={
    new car("chevy","black",100000),
    new car("ford","blue",200000),
    new car("lamborghini","white",400000),
    new car("toyoto","blue",500000),
};
List<car> car =new ArrayList<>(Arrays.asList(cararray));

List<String> resultofcar = car
                    .stream()
                    .filter((cars)-> cars.color.equals( "blue")) 
                    .map((cars) -> cars.make) 
                    .collect(Collectors.toList());

System.out.println(resultofcar);
//find the sum of all employee salary ?



employee[] employeearray ={
    new employee("arun",25,"developer",30000),
    new employee("sam",30,"analyst",20000),
    new employee("rose",40,"developer",70000),
    new employee("karthick",50,"process associaate",30000),
};
List<employee> employee =new ArrayList<>(Arrays.asList(employeearray));

float resultofemployee = employee
                    .stream()
                    .map((emp) -> emp.salary)
                    .reduce(0f ,(acc,x) -> acc + x);

System.out.println("Total salary of given empoyee :"+resultofemployee);



//combine list of function
float totaldevelopersalary = employee
                    .stream()
                    .filter(sal -> sal.jobTitle == "developer")
                    .map((emp) -> emp.salary)
                    .reduce(0f ,(acc,x) -> acc + x);

float countofdeveloper = employee
                    .stream()
                    .filter(sal -> sal.jobTitle == "developer")
                    .collect(Collectors.counting());

float averagedevelopersalary = totaldevelopersalary /countofdeveloper;
System.out.println("average developer salary : "+ averagedevelopersalary);



//parallelstream
/*
 * average salary calculator in the key-value pair with help of map
 * key:jobTitle
 * value: salary(average)
 */


Map<String,Float> calculaterAvgSalary = employee 
                .stream()
                .collect(Collectors.groupingBy((emp)-> emp.jobTitle ))
                .entrySet()
                .stream()
                .collect(Collectors.toMap(
                    (entry) -> entry.getKey(),
                    (entry) -> entry.getValue()
                    .stream()
                    .map((emp)->emp.salary)
                    .reduce(0f, (acc,x) -> acc + x) / entry.getValue().size()
                ));

                System.out.println("Average salary of employee : "+calculaterAvgSalary);

}
}