import java.util.function.Function;

class function{

    static int calculate(Function<Integer, Integer> function, int value) {
        return function.apply(value);
    }


    public static void main(String[]args){
        // Assigning a function to a variable
Function<Integer, Integer> square = x -> x * x;

// Passing a function as an argument
int result = calculate(square, 5);
System.out.println(result);
    // Function to calculate using a passed function
 


// Function as a return value
Function<Integer, Function<Integer, Integer>> addCurried = x -> y -> x + y;
int addResult = addCurried.apply(3).apply(4);
System.out.println(addResult);

    }

   
}