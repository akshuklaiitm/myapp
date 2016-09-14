package com.aks.app.jdk8.lambda;

import java.util.Arrays;

public class LambdaTest {
  interface Circle{
	  double get(double radius);
  }
  public  double circleOperation(Circle c , double radius){
	  return c.get(radius);
  }

	public static void main(String[] args){

		LambdaTest lTest = new LambdaTest();
		Circle area = (r) ->  Math.PI*r*r ;
		Circle circumference = (r) -> Math.PI*r*2;

		System.out.println("area is " +lTest.circleOperation(area, 10));
		System.out.println("circumference is " + lTest.circleOperation(circumference, 10));



		Animal[] animalArr = {
        		new Animal("Lion"),
        		new Animal("Crocodile"),
        		new Animal("Tiger"),
        		new Animal("Elephant")};
		System.out.println("Before sorting "+ Arrays.toString(animalArr));
		Arrays.sort(animalArr,Animal::animalCommpare);
		System.out.println("After sorting "+ Arrays.toString(animalArr));

	}







}
