package com.biz.raffle;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class RaffleExec01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<String> names = Arrays.asList(NamesClass.NAMES);
		
		//�迭������ŭ �ݺ��Ͽ� �ڼ���
		for(int i = 0; i < names.size(); i++) {
			Collections.shuffle(names);
		}
		
		// 0���� �迭ũ�⸸ŭ�� �������� ���� �����
		int nameCount =names.size();
		int nameSearch = (int)(Math.random() * nameCount);
		
		// ������ �̿��ؼ� List�߿� �����ϱ�
		System.out.println("������ ��÷��!!!");
		System.out.println(names.get(nameSearch));
		
		//�ڼ��� ������� ��ü ����Ʈ ����
		System.out.println("��÷�� ����~~~");
		System.out.println(names);
	}

}
