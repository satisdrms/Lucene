package com.satisdrms.textsearch.custom;

import java.io.File;
import java.util.Calendar;
import java.util.Map;
import java.util.Scanner;

public class Custom {
	private Map<File, TLocations> files;
	private static Index indexObj;

	public static void main(String[] args) {
		String inputPath = "input/stories/";
		// System.out.println(Calendar.getInstance().getTime());
		analyzeFiles(inputPath);
		// System.out.println(Calendar.getInstance().getTime());
		searchTerm();

	}

	private static void searchTerm() {
		TermSearch termSearch = new TermSearch(indexObj);
		String term = getInput();
		termSearch.search(term.toLowerCase());

	}

	private static String getInput() {
		System.out.print("Enter the term to search:- ");
		Scanner sc = new Scanner(System.in);
		return sc.nextLine();

	}

	private static void analyzeFiles(String inputpath) {
		Analyze analyze = new Analyze(inputpath);
		indexObj = analyze.process();
	}
}
