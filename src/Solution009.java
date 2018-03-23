package src;
import java.util.ArrayList;
import java.util.List;

public class Solution009 {
    /**
     * @param n: An integer
     * @return: A list of strings.
     */
    public List<String> fizzBuzz(int n) {
    	
    	List<String> list = new ArrayList();
    	for(int i = 1; i <=n; i++){
    		if(i % 3 == 0 && i % 5 != 0){
    			list.add("fizz");
    		}else if( i % 5 == 0 && i % 3 != 0){
    			list.add("buzz");
    		}else if( i % 5 == 0 && i % 3 == 0){
    			list.add("fizz buzz");
    		}else{
    			list.add(i + "");
    		}
    	}
    	return list;
    }
}