package cn.edu.qdu.game;

import java.util.Scanner;

public class Person extends Player {
	Scanner input = new Scanner(System.in);

	public void inputName() {
		String name=input.next();
		//��set�����õ�name
		setPlayerName(name);
	}

	public int myFit() {
		int personFit=input.nextInt();
		switch (personFit) {
		case 1:
			System.out.println(getPlayerName() + "��ȭ������");
			break;
		case 2:
			System.out.println(getPlayerName() + "��ȭ��ʯͷ");
			break;
		case 3:
			System.out.println(getPlayerName() + "��ȭ����");
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