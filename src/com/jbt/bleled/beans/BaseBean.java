package com.jbt.bleled.beans;

import java.io.Serializable;

public abstract class BaseBean implements Serializable {
	/**
	 * Description : base bean
	 * 
	 * @Fields serialVersionUID
	 */
	private static final long serialVersionUID = -3494512101528923896L;

	public abstract void printf();

	public abstract byte[] toBytes();

	public abstract String toString();
}
