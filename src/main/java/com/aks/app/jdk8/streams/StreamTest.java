package com.aks.app.jdk8.streams;

import java.util.Arrays;
import java.util.IntSummaryStatistics;
import java.util.List;

//Streams--collection--streams--parallelstreams--terminal operation collect
//filter-map-
public class StreamTest {

	public static void main(String[] args){
		String[] strs = {"abc","def","","efg","ghi"};
		List<String> strList = Arrays.asList(strs);
		System.out.println(strList.stream().filter(string -> string.startsWith("a")).count());
        List<Integer> intList = Arrays.asList(1,2,3,4,5,11,7,9);
        intList.stream().sorted().forEach(i -> System.out.println("test"+i));
        IntSummaryStatistics intStrm = intList.stream().mapToInt( (x) -> x).summaryStatistics();
        System.out.println(intStrm.getMax()+" "+intStrm.getCount());

	}





}
