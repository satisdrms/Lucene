package com.satisdrms.textsearch.custom;

import java.io.File;
import java.util.Map;
import java.util.Scanner;

public class Custom {
	private Map<File, TLocations> files;
	private static Index indexObj;

	public static void main(String[] args) {
		String inputPath = "input/temp/";
		analyzeFiles(inputPath);
		searchTerm();

	}

	private static void searchTerm() {
		TermSearch termSearch = new TermSearch(indexObj);
		String term = getInput();
		termSearch.search(term);

	}

	private static String getInput() {
		System.out.print("Enter the next term to search:- ");
		Scanner sc = new Scanner(System.in);
		return sc.nextLine();

	}

	private static void analyzeFiles(String inputpath) {
		Analyze analyze = new Analyze(inputpath);
		indexObj = analyze.process();
	}
}
