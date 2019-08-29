package com.yang.model;

import java.io.Serializable;


public interface BaseEntity<E extends Serializable> extends Serializable {

	public E getId();

}
