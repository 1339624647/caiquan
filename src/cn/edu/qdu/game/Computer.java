package cn.edu.qdu.game;

import java.util.Random;
import java.util.Scanner;

public class Computer extends Player {
	Scanner input = new Scanner(System.in);
	//Ҳ����������������
    //String[] name={"����","��Ȩ","�ܲ�"};
	public void inputName() {
		int key=input.nextInt();
		//setPlayerName(name[key-1]);
		switch (key) {
		case 1:
			setPlayerName ( "����");
			break;
		case 2:
			setPlayerName ( "��Ȩ");
			break;
		case 3:
			setPlayerName ( "�ܲ�");
			break;
		default:
			System.out.println("�������");
			break;
		}
	}

	public int myFit() {
		int computerFit = (int) (Math.random() * 3) + 1;
		switch (computerFit) {
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
		return computerFit;
	}

	
}
