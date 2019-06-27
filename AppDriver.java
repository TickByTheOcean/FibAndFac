package com.revature.example.app;
import com.revature.prompt.HomePrompt;
import com.revature.prompt.Prompt;

public class AppDriver {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Prompt currentPrompt = new HomePrompt();
		while(true) {
			currentPrompt = currentPrompt.run();
		}
	}

}
