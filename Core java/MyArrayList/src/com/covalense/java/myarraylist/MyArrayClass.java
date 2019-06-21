package com.covalense.java.myarraylist;

public class MyArrayClass {
	private Object[] myarray;
	private int index;

	public MyArrayClass() {
		this(10);
	}

	public MyArrayClass(int size) {
		if (size <= 0) {
			throw new ArrayIndexOutOfBoundsException("size should be greater than 0");
		}
		myarray = new Object[size];
		index = 0;
	}// end of constructor

	public void add(Object val) {
		if (index >= myarray.length) {
			Object[] myarray2 = new Object[myarray.length * 2];
			System.arraycopy(myarray, 0, myarray2, 0, myarray.length);
		}
		myarray[index] = val;
		index++;
	}

	// using arraycopy
	public void remove(int pos) {
		if (pos > myarray.length) {
			throw new ArrayIndexOutOfBoundsException("pos should not greater than 8");
		}
		System.arraycopy(myarray, pos + 1, myarray, pos, myarray.length - 1 - pos);

	}

	public Object get(int pos) {
		return myarray[pos];
	}


}// end of class