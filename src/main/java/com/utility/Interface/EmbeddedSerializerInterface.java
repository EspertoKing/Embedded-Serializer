package com.utility.Interface;

import java.io.File;
import java.io.Serializable;

public interface EmbeddedSerializerInterface extends Serializable{
	
	void init();
	
	void serialize(Object objIn,String filepath);
	Object deSerialize(Object objOut,String filepath);
	
	void serializeToList(Object objIn,String filepath);
	Object deSerializeFromList(Object objOut,String filepath);
	
	void stop();
	void getContext();

}
