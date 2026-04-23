import java.util.*;
public class Main
{
	public static void main(String[] args) {
	List<Integer>list=new ArrayList(Arrays.asList(9,8,5,4,6));
	int max=-1;
	int second=-1;
	for(int num:list){
	    if(num>max){
	        second=max;
	        max=num;
	    }
	    else if(num>second&&num!=max){
	        second=num;
	    }
	    }
	System.out.print(second);
	}
	}
