package com.exe.springdi2;

public class MessageCall {

	public static void main(String[] args) {
		
		//1.
		MessageEn ob1 = new MessageEn();
		ob1.sayHello("suzi");
		
		MessageKr ob2 = new MessageKr();
		ob2.sayHello("�����");
		
		//2.
		Message ms = null;
		
		ms = new MessageEn();
		ms.sayHello("inna");
		
		ms = new MessageKr();
		ms.sayHello("�γ�");
		
	}

}
