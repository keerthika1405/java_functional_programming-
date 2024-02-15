public class recursion {




    static int fibo(int x){
        if(x<=2){
            return 1;
        }
        return fibo(x-1) + fibo(x-2);
    }
    //high to low  approach
    // static void countDown(Integer x){
    //     if(x<0){
    //         System.out.println("Done");
    //         return ;
    //     }
    //     System.out.println(x);
    //     countDown(x-1);
    // }


    //low to high  approach
    static void countDown(Integer x,Integer end){
        if(x > end){
            System.out.println("Done");
            return ;
        }
        System.out.println(x);
        countDown(x+1, end);
    }

    public static void main(String[] args) {
        // countDown(10);        //high to low  approach
        // countDown(0,10);   //low to high  approach

        System.out.println("fibonacci of 5 is "+fibo(5));
        System.out.println("fibonacci of 10 is "+fibo(10));
        System.out.println("fibonacci of 15 is "+fibo(15));
    }


}
