package com.utility.Impl;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

import com.utility.Interface.EmbeddedSerializerInterface;

public class EmbeddedSerializer implements EmbeddedSerializerInterface {

	public void init() {
		// TODO Auto-generated method stub
		
	}

	public void serialize(Object obj1) {
		
		// Serialization  
        try
        {     
            FileOutputStream file = new FileOutputStream("file.ser"); 
            ObjectOutputStream out = new ObjectOutputStream(file); 
              
            // Method for serialization of object 
            out.writeObject(obj1); 
              
            out.close(); 
            file.close(); 
              
            System.out.println("Object has been serialized"); 
  
        }
		
	}

	public void deSerialize(File fl1, Class cl1) {
		// Deserialization 
        try
        {    
            // Reading the object from a file 
            FileInputStream file = new FileInputStream(fl1); 
            ObjectInputStream in = new ObjectInputStream(file); 
              
            // Method for deserialization of object 
            objectOut = (Demo)in.readObject(); 
              
            in.close(); 
            file.close(); 
              
            System.out.println("Object has been deserialized "); 
            System.out.println("a = " + object1.a); 
            System.out.println("b = " + object1.b); 
        } 		
	}

	public void stop() {
		// TODO Auto-generated method stub
		
	}

	public void getContext() {
		// TODO Auto-generated method stub
		
	}

}
