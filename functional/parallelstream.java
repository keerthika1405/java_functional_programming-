/*
 * Parallel streams in Java are designed to enable parallel processing of data, which can lead 
 * to improved performance on multi-core machines for certain types of operations. 
 * 
 * 
 * parallel streams are not suitable for all types of operations, such as those with dependencies 
 * between elements. As with any optimization, it's crucial to measure and profile your 
 * application to determine whether parallel streams provide a performance benefit for
 *  your specific use case
 */

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class parallelstream {
    public static void main(String[] args) {
        

        String[]  arraystr ={"functional","programming","is ","part","of","java"};
        List<String>  liststr =new ArrayList<>(Arrays.asList(arraystr));

        List<String> processword = liststr
        .parallelStream()
        .map((word) ->{
            // System.out.println("upper casing "+ word);
            return word.toUpperCase();
          })
          .map((word)-> {
            // System.out.println("Adding exclaimator mark to word"+ word);
            return word + "!";
          })
          .collect(Collectors.toList());

          System.out.println(processword);
    }    
}
