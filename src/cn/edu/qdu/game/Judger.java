package cn.edu.qdu.game;

import java.util.Scanner;

public class Judger {
	private int total;
	Scanner input = new Scanner(System.in);
	// 关联关系
	private Person person=new Person();
	private Computer computer=new Computer();

	public void startGame() {
		// 宣布游戏开始
		System.out.println("****************\r\n**猜拳，开始**\r\n****************");
		// 介绍规则
		System.out.println("出拳规则：1.剪刀2.石头3.布");
	}

	public void askName() {
		// 选择电脑姓名
		System.out.println("请选择对方角色(1:刘备2:孙权3:曹操)：");
		computer.inputName();
		// 询问玩家姓名
		System.out.println("请输入玩家姓名：");
		person.inputName();
		System.out.println(computer.getPlayerName() + "VS" + person.getPlayerName());
	}

	public void playGame() {
		String ret = null;
		do {//do while 循环判断是否继续
			System.out.println("请" + person.getPlayerName() + "出拳1.剪刀2.石头3.布(输入相应数字):");
			int personNum = person.myFit();//用personNum存放person.myFit()
			
			System.out.println("请" + computer.getPlayerName() + "出拳1.剪刀2.石头3.布(输入相应数字):");
			int computerNum = computer.myFit();
			if (personNum == computerNum) {
				System.out.println("平局");

			} else if (personNum == 1 && computerNum == 3 || personNum == 2 && computerNum == 1
					|| personNum == 3 && computerNum == 2) {
				System.out.println(person.getPlayerName() + "赢了");
				person.setWinningTimes(person.getWinningTimes() + 1);

			} else {
				System.out.println(computer.getPlayerName() + "赢了");
				computer.setWinningTimes(computer.getWinningTimes() + 1);
			}
			total++;
			System.out.println("要继续吗？y/n");
			ret = person.askContinute();

		} while (ret.equalsIgnoreCase("y"));
	}

	public void finalResult() {
		System.out.println("共玩了" + total + "局");
		System.out.println("你赢了" + person.getWinningTimes() + "局");
	}
	public static void main(String[] args) {
		Judger j=new Judger();
		j.startGame();
		j.askName();
		j.playGame();
		j.finalResult();
	}
}
