package com.covalense.java.methodreference;

public class TestAvg {
public static void main(String[] args) {
	CalculateAvg c=new CalculateAvg();
	Average r=c::calAvg;
	r.avg(10, 20, 30);
}
}
