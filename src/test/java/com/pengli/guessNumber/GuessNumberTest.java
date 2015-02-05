package com.pengli.guessNumber;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.PrintStream;
import java.util.List;

import org.junit.Test;
import org.mockito.InOrder;
import static org.mockito.Mockito.*;


public class GuessNumberTest {
	
	@Test
	public void should_success_guess_onece(){
		String data = "1234\r\n";
		System.setIn(new ByteArrayInputStream(data.getBytes()));
		final ByteArrayOutputStream os = new ByteArrayOutputStream();
		System.setOut(new PrintStream(os));
		GuessNumber guessNumber = new GuessNumber("1234" );
		guessNumber.guessNumber();
//		System.err.println(os.toString());
		
		List singleMock = mock (List.class );
		   
		//using a single mock
		singleMock.add("Welcome!");
		singleMock.add("");
		singleMock.add("Please input your number(6):");
		singleMock.add("Congratulations!");
		
		//create an inOrder verifier for a single mock
		InOrder inOrder = inOrder(singleMock);
		for(String item : os.toString().split("\r\n")){
			inOrder.verify(singleMock).add(item);
		}	 
	}
	
	@Test
	public void should_success_at_sixth(){
		String data = "4321\r\n4312\r\n4231\r\n4213\r\n4132\r\n1234\r\n";
		System.setIn(new ByteArrayInputStream(data.getBytes()));
		final ByteArrayOutputStream os = new ByteArrayOutputStream();
		System.setOut(new PrintStream(os));
		GuessNumber guessNumber = new GuessNumber("1234" );
		guessNumber.guessNumber();
//		System.err.println(os.toString());
		
		List singleMock = mock (List.class );
		   
		//using a single mock
		singleMock.add("Welcome!");
		singleMock.add("");
		singleMock.add("Please input your number(6):");
		singleMock.add("0A4B");
		singleMock.add("");
		singleMock.add("Please input your number(6):");
		singleMock.add("0A4B");
		singleMock.add("");
		singleMock.add("Please input your number(6):");
		singleMock.add("2A2B");
		singleMock.add("");
		singleMock.add("Please input your number(6):");
		singleMock.add("1A3B");
		singleMock.add("");
		singleMock.add("Please input your number(6):");
		singleMock.add("1A3B");
		singleMock.add("");
		singleMock.add("Please input your number(6):");
		singleMock.add("Congratulations!");
		//create an inOrder verifier for a single mock
		InOrder inOrder = inOrder(singleMock);
		for(String item : os.toString().split("\r\n")){
			inOrder.verify(singleMock).add(item);
		}	 
	}
	
	@Test
	public void should_failed_at_the_end_with_sever_input(){
		String data = "4321\r\n4312\r\n4231\r\n4213\r\n4132\r\n4123\r\n5643\r\n";
		System.setIn(new ByteArrayInputStream(data.getBytes()));
		final ByteArrayOutputStream os = new ByteArrayOutputStream();
		System.setOut(new PrintStream(os));
		GuessNumber guessNumber = new GuessNumber("1234" );
		guessNumber.guessNumber();
//		System.err.println(os.toString());
		
		List singleMock = mock (List.class );
		   
		//using a single mock
		singleMock.add("Welcome!");
		singleMock.add("");
		singleMock.add("Please input your number(6):");
		singleMock.add("0A4B");
		singleMock.add("");
		singleMock.add("Please input your number(6):");
		singleMock.add("0A4B");
		singleMock.add("");
		singleMock.add("Please input your number(6):");
		singleMock.add("2A2B");
		singleMock.add("");
		singleMock.add("Please input your number(6):");
		singleMock.add("1A3B");
		singleMock.add("");
		singleMock.add("Please input your number(6):");
		singleMock.add("1A3B");
		singleMock.add("");
		singleMock.add("Please input your number(6):");
		singleMock.add("0A4B");
		singleMock.add("Game Over!");
		//create an inOrder verifier for a single mock
		InOrder inOrder = inOrder(singleMock);
		for(String item : os.toString().split("\r\n")){
			inOrder.verify(singleMock).add(item);
		}	 
	}
	
	@Test
	public void should_verify_failed_at_the_second_and_sucess_at_sixth(){
		String data = "4321\r\n1111\r\n4312\r\n4231\r\n4213\r\n4132\r\n1234\r\n";
		System.setIn(new ByteArrayInputStream(data.getBytes()));
		final ByteArrayOutputStream os = new ByteArrayOutputStream();
		System.setOut(new PrintStream(os));
		GuessNumber guessNumber = new GuessNumber("1234" );
		guessNumber.guessNumber();
//		System.err.println(os.toString());
		
		List singleMock = mock (List.class );
		   
		//using a single mock
		singleMock.add("Welcome!");
		singleMock.add("");
		singleMock.add("Please input your number(6):");
		singleMock.add("0A4B");
		singleMock.add("");
		singleMock.add("Please input your number(6):");
		singleMock.add("Cannot input duplicate numbers!");
		singleMock.add("");
		singleMock.add("Please input your number(6):");
		singleMock.add("0A4B");
		singleMock.add("");
		singleMock.add("Please input your number(6):");
		singleMock.add("2A2B");
		singleMock.add("");
		singleMock.add("Please input your number(6):");
		singleMock.add("1A3B");
		singleMock.add("");
		singleMock.add("Please input your number(6):");
		singleMock.add("1A3B");
		singleMock.add("");
		singleMock.add("Please input your number(6):");
		singleMock.add("Congratulations!");
		//create an inOrder verifier for a single mock
		InOrder inOrder = inOrder(singleMock);
		for(String item : os.toString().split("\r\n")){
			inOrder.verify(singleMock).add(item);
		}	 
	}
	
	@Test
	public void should_verify_failed_at_the_second_and_failed_at_the_end_with_total_nine_input(){
		String data = "4321\r\n1111\r\n4312\r\n4231\r\n4213\r\n4132\r\n4123\r\n5432\r\n5423\r\n";
		System.setIn(new ByteArrayInputStream(data.getBytes()));
		final ByteArrayOutputStream os = new ByteArrayOutputStream();
		System.setOut(new PrintStream(os));
		GuessNumber guessNumber = new GuessNumber("1234" );
		guessNumber.guessNumber();
//		System.err.println(os.toString());
		
		List singleMock = mock (List.class );
		   
		//using a single mock
		singleMock.add("Welcome!");
		singleMock.add("");
		singleMock.add("Please input your number(6):");
		singleMock.add("0A4B");
		singleMock.add("");
		singleMock.add("Please input your number(6):");
		singleMock.add("Cannot input duplicate numbers!");
		singleMock.add("");
		singleMock.add("Please input your number(6):");
		singleMock.add("0A4B");
		singleMock.add("");
		singleMock.add("Please input your number(6):");
		singleMock.add("2A2B");
		singleMock.add("");
		singleMock.add("Please input your number(6):");
		singleMock.add("1A3B");
		singleMock.add("");
		singleMock.add("Please input your number(6):");
		singleMock.add("1A3B");
		singleMock.add("");
		singleMock.add("Please input your number(6):");
		singleMock.add("0A4B");
		singleMock.add("Game Over!");
		//create an inOrder verifier for a single mock
		InOrder inOrder = inOrder(singleMock);
		for(String item : os.toString().split("\r\n")){
			inOrder.verify(singleMock).add(item);
		}	 
	}
}
