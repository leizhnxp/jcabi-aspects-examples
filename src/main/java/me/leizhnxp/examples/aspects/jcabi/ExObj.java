package me.leizhnxp.examples.aspects.jcabi;

import java.io.IOException;

import com.jcabi.aspects.Loggable;

public class ExObj {
	 @Loggable(Loggable.INFO)
	 public String load(String resource) throws IOException {
	   return "something";
	 }
	 @Loggable(Loggable.INFO)
	 public String load2(String resource,String res2) throws IOException {
	   return "something";
	 } 
	 public static void main(String[] args) throws IOException {
		final ExObj exObj = new ExObj();
		exObj.load("anything");
		exObj.load2("x", "y");
	}
}
