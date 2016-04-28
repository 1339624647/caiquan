package cn.edu.qdu.game;

import java.util.Scanner;

public class Judger {
	private int total;
	Scanner input = new Scanner(System.in);
	// ������ϵ
	private Person person=new Person();
	private Computer computer=new Computer();

	public void startGame() {
		// ������Ϸ��ʼ
		System.out.println("****************\r\n**��ȭ����ʼ**\r\n****************");
		// ���ܹ���
		System.out.println("��ȭ����1.����2.ʯͷ3.��");
	}

	public void askName() {
		// ѡ���������
		System.out.println("��ѡ��Է���ɫ(1:����2:��Ȩ3:�ܲ�)��");
		computer.inputName();
		// ѯ���������
		System.out.println("���������������");
		person.inputName();
		System.out.println(computer.getPlayerName() + "VS" + person.getPlayerName());
	}

	public void playGame() {
		String ret = null;
		do {//do while ѭ���ж��Ƿ����
			System.out.println("��" + person.getPlayerName() + "��ȭ1.����2.ʯͷ3.��(������Ӧ����):");
			int personNum = person.myFit();//��personNum���person.myFit()
			
			System.out.println("��" + computer.getPlayerName() + "��ȭ1.����2.ʯͷ3.��(������Ӧ����):");
			int computerNum = computer.myFit();
			if (personNum == computerNum) {
				System.out.println("ƽ��");

			} else if (personNum == 1 && computerNum == 3 || personNum == 2 && computerNum == 1
					|| personNum == 3 && computerNum == 2) {
				System.out.println(person.getPlayerName() + "Ӯ��");
				person.setWinningTimes(person.getWinningTimes() + 1);

			} else {
				System.out.println(computer.getPlayerName() + "Ӯ��");
				computer.setWinningTimes(computer.getWinningTimes() + 1);
			}
			total++;
			System.out.println("Ҫ������y/n");
			ret = person.askContinute();

		} while (ret.equalsIgnoreCase("y"));
	}

	public void finalResult() {
		System.out.println("������" + total + "��");
		System.out.println("��Ӯ��" + person.getWinningTimes() + "��");
	}
	public static void main(String[] args) {
		Judger j=new Judger();
		j.startGame();
		j.askName();
		j.playGame();
		j.finalResult();
	}
}
