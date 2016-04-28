package cn.edu.qdu.game;

import java.util.Random;
import java.util.Scanner;

public class Computer extends Player {
	Scanner input = new Scanner(System.in);
	//也可用数组输入名字
    //String[] name={"刘备","孙权","曹操"};
	public void inputName() {
		int key=input.nextInt();
		//setPlayerName(name[key-1]);
		switch (key) {
		case 1:
			setPlayerName ( "刘备");
			break;
		case 2:
			setPlayerName ( "孙权");
			break;
		case 3:
			setPlayerName ( "曹操");
			break;
		default:
			System.out.println("输入错误");
			break;
		}
	}

	public int myFit() {
		int computerFit = (int) (Math.random() * 3) + 1;
		switch (computerFit) {
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
		return computerFit;
	}

	
}
