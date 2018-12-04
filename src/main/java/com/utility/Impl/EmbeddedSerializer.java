package com.utility.Impl;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.lang.reflect.InvocationTargetException;

import com.utility.Interface.EmbeddedSerializerInterface;

public class EmbeddedSerializer implements EmbeddedSerializerInterface {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1012810027750339867L;

	public void init() {
		// TODO Auto-generated method stub
		
	}

	public void serialize(Object objIn, String filepath) {
		try {
			// Saving of object in a file
			FileOutputStream file = new FileOutputStream(filepath);
			ObjectOutputStream out = new ObjectOutputStream(file);

			// Method for serialization of object
			out.writeObject(objIn);

			out.close();
			file.close();

			System.out.println("Object has been serialized");

		} catch (IOException ex) {
			System.out.println("IOException is caught");
		}
		
	}

	public Object deSerialize(Object objOut, String filepath) {
		try {
			// Reading the object from a file
			FileInputStream file = new FileInputStream(filepath);
			ObjectInputStream in = new ObjectInputStream(file);

			// Method for deserialization of object
			objOut = in.readObject();

			in.close();
			file.close();

			System.out.println("Object has been deserialized ");
		} catch (IOException ex) {
			System.out.println("IOException is caught");
		} catch (ClassNotFoundException ex) {
			System.out.println("ClassNotFoundException is caught");
		}
		return objOut;
		
	}

	public void serializeToList(Object objIn, String filepath) {
		// TODO Auto-generated method stub
		
	}

	

	public void stop() {
		// TODO Auto-generated method stub
		
	}

	public void getContext() {
		// TODO Auto-generated method stub
		
	}

	public Object deSerializeFromList(Object objOut, String filepath) {
		return objOut;
		// TODO Auto-generated method stub
		
	}

	

}
