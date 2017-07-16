package com.satisdrms.textsearch.custom;

public class Token {

	int tokennumber;
	int position;

	public Token(int tokenNumber, int position) {
		this.tokennumber = tokenNumber;
		this.position = position;
	}
//	@Override
//	public boolean equals(Object obj) {
//		Token cObj = (Token) obj;
//		return cObj.tokennumber == this.tokennumber && cObj.position == this.position;
//	}
//
//	@Override
//	public int hashCode() {
//		return this.tokennumber + this.position;
//	}
//
//	@Override
//	public String toString() {
//		return "(" + Integer.toString(this.tokennumber) + "," + Integer.toString(this.position) + ")";
//	}
//
}
