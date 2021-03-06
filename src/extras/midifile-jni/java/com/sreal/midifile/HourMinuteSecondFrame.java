
package com.sreal.midifile;

public class HourMinuteSecondFrame
{
	static { java.lang.System.loadLibrary("midifilejni"); }

	private byte[] pointer;

	public HourMinuteSecondFrame() { this.init(); }
	private native void init();
	public native void finalize();
	public native long getHour();
	public native void setHour(long hour);
	public native long getMinute();
	public native void setMinute(long minute);
	public native long getSecond();
	public native void setSecond(long second);
	public native float getFrame();
	public native void setFrame(float frame);
	public native java.lang.String toString();
	public native void parse(java.lang.String string);
}

