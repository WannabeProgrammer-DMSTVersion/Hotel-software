/**
 * Created by Konstantinos Spinos and Vasilis Papatheodorides on 7/12/2019.
 * 8180122, 8180096
 */

import java.util.Scanner;
import java.util.ArrayList;

public class Hotel_Software {
	public static void main(String[] args) {
		login(); //���������� � ����� �������� ��� ���������� �������������� ������
		loadObjects();
	}
	private static void login() {
		Scanner input = new Scanner(System.in);
		String set_username = "admin";
	    String set_password = "admin";
	    String username = null;
	    String password = null;
	    while (!set_username.equals(username)) {
	    	System.out.println("�������� username:");
	    	username = input.next();
	    	if (!set_username.equals(username)) {
	    		System.out.println("����� username.");
	    	   	username = input.nextLine();
	    	}
	    }
	    while (!set_password.equals(password)) {
			System.out.println("�������� password:");
			password = input.next();
			if (!set_password.equals(password)) {
			    System.out.println("����� password.");
			    password = input.nextLine();
			}
	    }
	    System.out.println("�������� �������.");
	}
	private static void loadObjects() {
		//����� ����������� ��� �� ���� 2018
		Income i1_2018 = new Income("����� ��� �������", 985392.30);
		Income i2_2018 = new Income("����� ��� bar", 252426.60);
		Income i3_2018 = new Income("����� �����", 100765.40);

		//����� ����������� ��� �� ���� 2018
		Outcome o1_2018 = new Outcome("����� �����������", 176268.25);
		Outcome o2_2018 = new Outcome("����� ���������� �����������", 103245.80);
		Outcome o3_2018 = new Outcome("����� �����", 732953.60);

		//����� ����������� ��������� ��� �� ���� 2018
		ArrayList<Double> year_2018 = new ArrayList<Double>();
		year_2018.add(i1_2018.getValue());
		year_2018.add(i2_2018.getValue());
		year_2018.add(i3_2018.getValue());
		year_2018.add(o1_2018.getValue());
		year_2018.add(o2_2018.getValue());
		year_2018.add(o3_2018.getValue());
		calculateProfit(year_2018);
	}
	private static void calculateProfit(ArrayList<Double> list1) {
		double income = list1.get(0) + list1.get(1) + list1.get(2);
		double outcome = list1.get(3) + list1.get(4) + list1.get(5);
		double profit = income - outcome;
		if (profit < 0) {
			System.out.printf("�� ���������� ��������� ���� %.2f %s\n", profit, "����");
		} else if (profit == 0) {
			System.out.println("�� ���������� ��� �������� ������");
		} else {
			System.out.printf("�� ���������� ���� ������ %.2f %s\n", profit, "����");
		}
	}
}

