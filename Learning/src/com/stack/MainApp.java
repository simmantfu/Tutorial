package com.stack;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class MainApp {

	public static void main(String[] args) throws ParseException {
		// TODO Auto-generated method stub

		Map<Date, ProductVo> contains = new HashMap<>();
		List<ProductVo> list = new ArrayList<ProductVo>();

		ProductVo productVo1 = new ProductVo();
		productVo1.setStartDate(new SimpleDateFormat("dd/MM/yyyy").parse("01/10/2017"));
		productVo1.setEndDate(new SimpleDateFormat("dd/MM/yyyy").parse("02/10/2017"));
		productVo1.setRate(10);
		list.add(productVo1);

		ProductVo productVo2 = new ProductVo();
		productVo2.setStartDate(new SimpleDateFormat("dd/MM/yyyy").parse("04/10/2017"));
		productVo2.setEndDate(new SimpleDateFormat("dd/MM/yyyy").parse("04/10/2017"));
		productVo2.setRate(20);
		list.add(productVo2);

		ProductVo productVo3 = new ProductVo();
		productVo3.setStartDate(new SimpleDateFormat("dd/MM/yyyy").parse("01/10/2017"));
		productVo3.setEndDate(new SimpleDateFormat("dd/MM/yyyy").parse("02/10/2017"));
		productVo3.setRate(30);
		list.add(productVo3);

		list.forEach(v -> {

			if (contains.containsKey(v.getStartDate())) {

				ProductVo p = contains.get(v.getStartDate());
				if (p.getEndDate().equals(v.getEndDate())) {
					System.out.println(v.getRate() + p.getRate());
				}
			}

			if (!contains.containsKey(v.getStartDate())) {
				contains.put(v.getStartDate(), v);
			}

		});
	}

}
