package ytjava2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class RExceptionHandlingTryWithResources2 {

	// try with resources
	public static void main(String[] args) throws Exception {
		int n = 0;

		System.out.println("Enter  a number");
		// if we just want to close resources ,and not handling exception , still we
		// want close resource

		// from java 1.8 we can use try with resource , if we declare here we dont need
		// to close resource
		// as soon as object done with work ,it will close resource
		try (BufferedReader br = new BufferedReader(new InputStreamReader(System.in))) {

			n = Integer.parseInt(br.readLine());

		}

		// thus we can write try block without using catch and finally
		System.out.println(n);
	}

}

/*
 * What are the main differences between Scanner and BufferedReader? The Scanner
 * has a little buffer (1KB char buffer) as opposed to the BufferedReader (8KB
 * byte buffer), but it's more than enough. BufferedReader is a bit faster as
 * compared to scanner because the scanner does the parsing of input data and
 * BufferedReader simply reads a sequence of characters.
 */
