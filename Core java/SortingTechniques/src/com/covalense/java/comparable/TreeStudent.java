package com.covalense.java.comparable;

public class TreeStudent implements Comparable<TreeStudent> {
	String name;
	double percentage;
	int id;

	@Override
	public int compareTo(TreeStudent o) {
String a=this.name;
String b=o.name;

int k=a.compareTo(b);
return k;
		/*
		 * logic to sort students w.r.t id public int compareTo(TreeStudent o) { if
		 * (this.id < s.id) { return -1; } else if (this.id > s.id) { return 1; } else {
		 * return 0; }
		  return 0;*/
	}
}
	/*
	 * logic to sort students w.r.t name public int compareTo(TreeStudent o) { if
	 * (this.name < s.name) { return -1; } else if (this.name > s.name) { return 1;
	 * } else { return 0; }
	 */

	/*
	 * logic to sort students w.r.t percentage public int compareTo(TreeStudent o) {
	 * if (this.percentage < s.percentage) { return -1; } else if (this.percentage >
	 * s.percentage) { return 1; } else { return 0; }
	 */

