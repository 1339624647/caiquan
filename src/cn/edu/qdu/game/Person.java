package cn.edu.qdu.game;

import java.util.Scanner;

public class Person extends Player {
	Scanner input = new Scanner(System.in);

	public void inputName() {
		String name=input.next();
		//用set方法得到name
		setPlayerName(name);
	}

	public int myFit() {
		int personFit=input.nextInt();
		switch (personFit) {
		case 1:
			System.out.println(getPlayerName() + "出拳：剪刀");
			break;
		case 2:
			System.out.println(getPlayerName() + "出拳：石头");
			break;
		case 3:
			System.out.println(getPlayerName() + "出拳：布");
			break;
		default:
			break;
		}
		return personFit;
	}
    public String askContinute(){
    String ret=input.next();
	return ret;
}
}