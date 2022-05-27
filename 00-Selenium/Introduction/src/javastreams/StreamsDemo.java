package javastreams;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import org.testng.Assert;
import org.testng.annotations.Test;

public class StreamsDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
		 * 
		 * Streams API is a new feature from java 8 By using streams we can perform
		 * aggregate operations on data returned from collections classes by drastically
		 * reduce complexity of code
		 * 
		 */
//find all elements starting with letter A
		ArrayList<String> names = new ArrayList<String>();
		names.add("Abhi");
		names.add("Don");
		names.add("Alekhya");
		names.add("Adam");
		names.add("Ram");
		int count = 0;

		for (int i = 0; i < names.size(); i++) {
			String actual = names.get(i);
			if (actual.startsWith("A")) {
				count++;
			}
		}
//		System.out.println(count);

		StreamsDemo obj = new StreamsDemo();
		obj.streamFilter();
		obj.StreamMap();
		obj.streamCollect();
	}

	@Test
	public void streamFilter() {
		ArrayList<String> names = new ArrayList<String>();
		names.add("Abhi");
		names.add("Don");
		names.add("Alekhya");
		names.add("Adam");
		names.add("Ram");

		Long count1 = names.stream().filter(s -> s.startsWith("A")).count();
		System.out.println(count1);

		Stream.of("Abhi", "Don", "Alekhya", "Adam", "Ram").filter(s -> {
			return s.startsWith("A");

		}).count();

		names.stream().filter(s -> s.length() > 4).forEach(s -> System.out.println(s));

		names.stream().filter(s -> s.length() > 4).limit(1).forEach(s -> System.out.println(s));
	}

	@Test
	public void StreamMap() {
		// print names with last letter A convert uppercase

		ArrayList<String> names1 = new ArrayList<String>();
		names1.add("Abhi");
		names1.add("Don");
		names1.add("Alekhya");
		names1.add("Adam");
		names1.add("Ram");

		Stream.of("Abhi", "Don", "Alekhya", "Adam", "Ram").filter(s -> s.endsWith("a")).map(s -> s.toUpperCase())
				.forEach(s -> System.out.println(s));

		// print names which have first letter as a with uppercase and sorted******
		List<String> names = Arrays.asList("Abhi", "Don", "Alekhya", "Adam", "Ram");
		names.stream().filter(s -> s.startsWith("A")).sorted().map(s -> s.toUpperCase())
				.forEach(s -> System.out.println(s));

		// Merge
		Stream<String> newStream = Stream.concat(names.stream(), names1.stream());
		newStream.sorted().forEach(s -> System.out.println(s));

		boolean flag = newStream.anyMatch(s -> s.equalsIgnoreCase("Adam"));
		Assert.assertTrue(flag);
	}

	@Test
	public void streamCollect() {
		List<String> ls = Stream.of("Abhi", "Don", "Alekhya", "Adam", "Ram").filter(s -> s.endsWith("a"))
				.map(s -> s.toUpperCase()).collect(Collectors.toList());
		System.out.println(ls.get(0));
		
		List<Integer> names1 = Arrays.asList(3,2,1,2,3,4,5,4);
		names1.stream().distinct().forEach(s->System.out.println(s));
		List<Integer> li = names1.stream().distinct().sorted().collect(Collectors.toList());
		System.out.println(li.get(2));
	}
}
