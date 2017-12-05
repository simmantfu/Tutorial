package jdk8tut;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Function;
import java.util.stream.Collectors;

public class FunFuntionalTutorial {

	public static void main(String... strings) {

		List<Product> list = new ArrayList<Product>();
		ProProduce produce = new ProProduce();
		list.add(new Product("Mobile", 42));
		list.add(new Product("Car", 1100));
		list.add(new Product("home", 121100));
		
		produce.extract(list, produce.getPrices()).forEach(v->System.out.println(v));
		produce.extract(list, produce.getNames()).forEach(v->System.out.println(v));
	}

}

class Product {

	String productName;
	int price;

	public Product(String productName, int price) {
		this.productName = productName;
		this.price = price;
	}

}

class ProProduce {

	public Function<Product, String> getNames() {

		return t -> t.productName;
	}

	public Function<Product, Integer> getPrices() {

		return t -> t.price;
	}

	public List<Object> extract(List<Product> proList, Function<Product, ?> function) {

		List<Object> l = proList.stream().map(function).collect(Collectors.toList());
		
		return l;

	}

}
