package com.utility.Impl;


public class EmbeddedSerializerTestMain {

	public static void main(String[] args) {
		
		EmbeddedSerializer object = new EmbeddedSerializer();
		String filename = "file.ser";
		


		TestSerializerClass2 objTestIn = new TestSerializerClass2();
		
//		object.serialize(objTestIn, filename);
		
		TestSerializerClass2 objTestOut = new TestSerializerClass2();
		TestSerializerClass2 objFinal = (TestSerializerClass2) object.deSerialize(objTestOut, filename);
		
		System.out.println("deserialized values:"+ objFinal.int1 + objFinal.str1);
	}
}
