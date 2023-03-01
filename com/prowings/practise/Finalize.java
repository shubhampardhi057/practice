package com.prowings.practise;

public class Finalize {
	public static void main(String[] args) {
		Finalize t = new Finalize();

		System.out.println(t.hashCode());
		t = null;
		// Calling Garbage Collector
		System.gc();
		System.out.println("End  Garbage Collector");
	}

	protected Finalize()

	{
		System.out.println("Finalize Method Called");

	}
}
