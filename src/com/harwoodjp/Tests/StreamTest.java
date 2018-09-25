package com.harwoodjp.Tests;

import static java.util.stream.Collectors.groupingBy;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

import com.harwoodjp.Classes.VendingMachine.Product;
import com.harwoodjp.Classes.VendingMachine.VendingMachine;

public class StreamTest {

	public static void run() {
//		streamMapTest();
		streamGroupingTest();
	}

	public static void streamMapTest() {
		VendingMachine myMachine = new VendingMachine();

		Product hersheyBar = new Product("A0", "Hershey's Chocolate Bar", 100, 5);
		Product laysChips = new Product("A1", "Lay's Potato Chips", 100, 8);
		Product doritosChips = new Product("A2", "Dorito's Cool Ranch Chips", 100, 2);
		Product peanutBag = new Product("A3", "Bag of Peanuts", 75, 3);

		myMachine.addInventory(hersheyBar);
		myMachine.addInventory(laysChips);
		myMachine.addInventory(doritosChips);
		myMachine.addInventory(peanutBag);

		List<String> productDescriptions = myMachine.getInventory()
				.stream()
				.map(product -> product.getDescription())
				.collect(Collectors.toList());

		System.out.println(productDescriptions);
	}

	public static void streamGroupingTest() {
		VendingMachine myMachine = new VendingMachine();

		Product hersheyBar = new Product("A0", "Hershey's Chocolate Bar", 100, 5);
		Product laysChips = new Product("A1", "Lay's Potato Chips", 100, 8);
		Product doritosChips = new Product("A2", "Dorito's Cool Ranch Chips", 100, 2);
		Product peanutBag = new Product("A3", "Bag of Peanuts", 75, 3);

		myMachine.addInventory(hersheyBar);
		myMachine.addInventory(laysChips);
		myMachine.addInventory(doritosChips);
		myMachine.addInventory(peanutBag);

		Map<Integer, List<Product>> groupedByPrice = myMachine.getInventory()
				.stream()
				.collect(groupingBy(Product::getPrice));

		System.out.println(groupedByPrice.toString());

	}

}
