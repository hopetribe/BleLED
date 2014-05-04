package com.jbt.bleled.beans;

import com.jbt.bleled.utils.BytesUtil;
import com.jbt.bleled.utils.DebugFlag;

public class LedBean extends BaseBean {

	private static final long serialVersionUID = -910647735401444155L;

	private int tag;
	private int lenght;
	private int value;

	public LedBean() {

	}

	public LedBean(int tag, int value) {
		this.tag = tag;
		this.lenght = 1;
		this.value = value;
	}

	private LedBean(int tag, int len, int value) {
		// TODO Auto-generated method stub
		this.tag = tag;
		this.lenght = len;
		this.value = value;
	}

	@Override
	public void printf() {
		// TODO Auto-generated method stub
		DebugFlag.printfLog(null, toString());
	}

	public int getTag() {
		return tag;
	}

	public int getLenght() {
		return lenght;
	}

	public int getValue() {
		return value;
	}

	@Override
	public byte[] toBytes() {
		byte[] buf = new byte[3];

		System.arraycopy(BytesUtil.getBytes(getTag()), 0, buf, 0, 1);
		System.arraycopy(BytesUtil.getBytes(getLenght()), 0, buf, 1, 1);
		System.arraycopy(BytesUtil.getBytes(getValue()), 0, buf, 2, 1);

		return buf;

	}

	@Override
	public String toString() {
		// TODO Auto-generated method stub
		String tmpString = String.format(
				"LedBean: tag = %d, lenght = %d, value = %d", tag, lenght,
				value);
		return tmpString;
	}
}
