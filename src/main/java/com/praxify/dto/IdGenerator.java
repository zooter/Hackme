package com.praxify.dto;
import java.util.Random;
public class IdGenerator {
	




	static final String AB = "0123456789";
	static Random rnd = new Random();

	/*public static void main(String arg[]) {

	System.out.println(randomString(6));



	}*/
	static String randomString( int len )
	{
	  StringBuilder sb = new StringBuilder( len );
	  for( int i = 0; i < len; i++ )
	     sb.append( AB.charAt( rnd.nextInt(AB.length()) ) );
	  return sb.toString();
	}
	}


