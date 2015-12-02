package me.leizhnxp.examples.aspects.jcabi;

import java.io.IOException;

import com.jcabi.aspects.LogExceptions;
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
	 @Loggable
	 public String loadExBean(ExBean exb) {
	   return exb.getClass().getName();
	 }
	 @LogExceptions
	 public String loadExeption() {
	   throw new RuntimeException();
	 }
	 public static void main(String[] args) throws IOException {
		final ExObj exObj = new ExObj();
		exObj.load("anything");
		exObj.load2("x", "y");
		exObj.loadExBean(new ExBean());
		exObj.loadExeption();
	}
}
