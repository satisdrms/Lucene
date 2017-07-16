package com.satisdrms.textsearch.custom;

import java.io.File;

//Sample OutPut(postings List for a input term) would look like below for Lucene
//doc_id: 40 occurences: (3,20) (25,197)

public class TermSearch {
	Index indexObj;

	public TermSearch(Index indexObj) {
		this.indexObj = indexObj;
	}

	public void search(String term) {
		TLocations found = null;
		if (indexObj.contains(term)) {
			found = indexObj.get(term);
			printDocs(found);
		}
		else {
			System.out.println("The term \""+term+"\" is not found!!");
		}
		// String jSonString=ConvertToJSON.getInstance().convert(found);
		
	}

	private void printDocs(TLocations found) {
		System.out.println("The term is found in the below locations ");
		for (File f : found.getFiles()) {
			System.out.println(f.getName());
		}

	}
}
