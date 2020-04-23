package csu.base;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class JosephCircle {

	public static void main(String[] args) {
		ArrayList<String> res = (ArrayList<String>) doAction(100, 5, 3);
		for (String str : res) {
			System.out.print(str + " ");
		}
		System.out.println("");
		System.out.println(res.size());
	}

//n 个人， 从k开始算，第m个人
	public static List doAction(int n, int k, int m) {
		ArrayList<String> circle = new ArrayList<String>();
		for (int i = 1; i <= n; i++) {
			circle.add(String.valueOf(i));
		}
		ArrayList<String> list = new ArrayList<String>();
		ArrayList<String> temp = null;
		int count = k + m;
		while (true) {
			temp = (ArrayList<String>) circle.clone();
			if (temp.size() == 1) {
				list.add(temp.get(0));
				break;
			}
			for (int i = 0; i < temp.size(); i++) {
				count--;
				if (count == 0) {
					list.add(temp.get(i));
					circle.remove(temp.get(i));
					count = m;
				}
			}
		}
		return list;

	}

}
