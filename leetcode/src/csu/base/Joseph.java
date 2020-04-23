package csu.base;

import java.util.ArrayList;
import java.util.List;

public class Joseph {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<Integer> list = new ArrayList<Integer>();
		for(int i=1;i<=10;i++) {
			list.add(i);
		}
		System.out.println(solution(list,list.size(),3));
	}
	public static int solution(List<Integer> list ,int size,int div) {
		   int point = 0;
		   int number = 1;

		   while (list.size() > 1) {
		       if (number % div == 0) {
		           list.remove(point);
		           point--;
		       }
		       point++;
		       number++;

		       if (point > (list.size() - 1)) {
		           point = 0;
		       }
		   }
		   return list.get(0);
		}

}
