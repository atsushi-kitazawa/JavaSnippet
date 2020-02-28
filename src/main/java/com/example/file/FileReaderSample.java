package com.example.file;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class FileReaderSample {
	public static void main(String[] args) {
		List<String> list = Arrays.asList("aaa", "bbb", "ccc", "addd");
		List<String> res = list	.stream()
								.filter(param -> param.startsWith("a"))
								.map(param -> param.toUpperCase())
								.collect(Collectors.toList());
		System.out.println(res);
	}
}
