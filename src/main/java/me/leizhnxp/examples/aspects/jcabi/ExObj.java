package me.leizhnxp.examples.aspects.jcabi;

import java.io.IOException;

import com.jcabi.aspects.Loggable;

public class ExObj {
	 @Loggable(Loggable.INFO)
	 public String load(String resource) throws IOException {
	   return "something";
	 }
	 
	 public static void main(String[] args) throws IOException {
		new ExObj().load("anything");
	}
}
