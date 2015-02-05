package com.pengli.guessNumber;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashSet;
import java.util.Set;

public class GuessNumber {
	private String initNumber = null;
	private final String SUCCESS_FLAG = "4A0B";
	private final int COUNT = 6;
	
	public GuessNumber(String initNumber){
		this.initNumber = initNumber;
	}
	
	private String countNumber(String inputNumber){
		if(this.initNumber.equals(inputNumber)){
			return this.SUCCESS_FLAG;
		}
		
		int valueA = 0, valueB = 0;
		for(int i = 0; i < this.initNumber.length(); i++){
			if(this.initNumber.charAt(i) == inputNumber.charAt(i)){
				valueA ++;
			}
			else if(inputNumber.indexOf(this.initNumber.charAt(i)) != -1){
				valueB ++;
			}
		}
		
		return valueA + "A" + valueB + "B";
	}
	
	private boolean verify(String verifiedStr){
		Set<Character> set = new HashSet<Character>();
		for(char item : verifiedStr.toCharArray()){
			set.add(item);
		}
		if(set.size() != 4){
			return false;
		}
		return true;
	}
	
	public void guessNumber() {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Welcome!");

		int count = 0;
		boolean successFlag = false;
		while(count < this.COUNT && !successFlag)
		try {
			System.out.println();
			System.out.println("Please input your number(6):");
			String currentInput = br.readLine();
			if(this.verify(currentInput)){
				String checkResult = this.countNumber(currentInput);
				if(checkResult.equals(this.SUCCESS_FLAG)){
					successFlag = true;
				}
				else{
					System.out.println(checkResult);
					count ++;
				}
				
			}
			else{
				System.out.println("Cannot input duplicate numbers!");
			}
		} catch (IOException e) {
			e.printStackTrace();
		}
		
		
		if(successFlag){
			System.out.println("Congratulations!");
		}
		else{
			System.out.println("Game Over!");
		}
		
		
	}
	
	public static void main(String[] args) throws IOException {
		GuessNumber guess = new GuessNumber("1234");
		guess.guessNumber();


	}

}
