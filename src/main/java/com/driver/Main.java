package com.driver;

import java.sql.SQLOutput;

public class Main {
  public static void main(String args[]){
      RWOnly obj=new RWOnly();
      obj.setName("raj");
      System.out.print (obj.getName() );
  }
}