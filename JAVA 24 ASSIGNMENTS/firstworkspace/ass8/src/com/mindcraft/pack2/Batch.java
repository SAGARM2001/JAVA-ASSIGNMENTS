package com.mindcraft.pack2;

public class Batch {
	private String CourseName ;
	private int BatchStrength;
	
	public Batch() {
		CourseName="XML";
		BatchStrength=30;
	}
	public void display() {
		System.out.println(CourseName+" "+BatchStrength);
	}
}