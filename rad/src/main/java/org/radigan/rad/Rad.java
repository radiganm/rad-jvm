// Rad.java
//
// Copyright 2016 Mac Radigan
// All Rights Reserved

  package org.radigan.rad;

  import com.sun.jna.Library;
  import com.sun.jna.Native;
  import com.sun.jna.Platform;

  public class Rad
  {

    public interface RadLib extends Library 
    {
      RadLib INSTANCE = (RadLib) Native.loadLibrary("rad", RadLib.class);
      void test();
    }

    public static void main(String[] args) 
    {
      RadLib.INSTANCE.test();
    }

  }

// *EOF*
