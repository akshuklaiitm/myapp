package com.aks.app.jdk8.lambda;



public class Animal{
	  String name;
	  public  Animal(String name){
		  this.name=name;
	  }
	  @Override
	public String toString() {

		return name;
	}
	public static int animalCommpare(Animal a,Animal b){
		return a.name.compareTo(b.name);
	}
}
