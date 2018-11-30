package com.utility.Interface;

import java.io.File;
import java.io.Serializable;

public interface EmbeddedSerializerInterface extends Serializable{
	
	void init();
	void serialize(Object obj1);
	void deSerialize(File fl1 , Class<?> cl1);
	void stop();
	void getContext();

}
