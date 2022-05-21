package com.print.CloudPrint;

import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@SpringBootApplication
public class CloudPrintApplication {

	public static void main(String[] args) {
		List<Integer> size = new ArrayList();
		size.add(44);
		size.add(44);
		size.add(56);



		System.out.println(mostCommon(size));

	}



