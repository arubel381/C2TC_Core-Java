package steamapi;

import java.util.Arrays;
import java.util.List;

public class Example4 {

	public static void main(String[] args) {
		List <Integer> list = Arrays.asList(15,25,35,45,55,65);
		//Normal Approach
		int result=0;
		for(int i : list)
		{
			if(i%5==0)
			result+=i;
		}
		System.out.println(result);
		
		//Stream concept approach
		System.out.println(list.stream().filter(i -> i%5==0).reduce(0,(c,e) -> (c+e)));
		System.out.println(list.stream().filter(i -> i%5==0).reduce(0,(c,e) -> Integer.sum(c,e)));
		System.out.println(list.stream().filter(i -> i%5==0).reduce(0,Integer::sum));
		System.out.println(list.stream().filter(i -> i%5==0).map(i -> i*2).reduce(0,Integer::sum));
	}

}
