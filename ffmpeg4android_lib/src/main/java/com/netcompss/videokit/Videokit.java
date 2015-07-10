package com.netcompss.videokit;

public final class Videokit {

  static {
    System.loadLibrary("videokit");
  }
	

  public native void run(String[] args, String workFolder, boolean isComplex);
  public native void fexit();
  

}
