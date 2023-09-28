package com.exe.springdi4;

import org.springframework.context.support.GenericXmlApplicationContext;

/*
@Component : �ڵ����� �� ���

@Scope
�ڵ����� ��ϵǴ� ���� ���� ����
singleton, prototype, session ��

@Required
Setter �޼��忡 �����ؼ� �ݵ�� �����ؾ� �ϴ� �ʼ� ������Ƽ ����

@Autowired
Setter �޼���, ������ �޼��� �Ǵ� �ʵ�(������Ƽ)�� ���� ���� �ؼ� 
�ڵ����� ������ ������ ����ǵ��� ����

@Autowired with (required = false) Option
�����̳ʰ� �ڵ����� ������ ������ ������ �� ��� Bean�� �߰����� ���ص�
������ �߻���Ű�� �ʵ��� ����

@Qualifier
@Autowired�� �Բ� ���Ǿ �ڵ� ������ ������ ����� ��� Bean�� ��ü������ ����
���� Ÿ���� Bean�� �� �� �̻� ��ϵ� ��� @Autowired�� �߻��� �� �ִ� ��ȣ�� ����

@Resource
@Autowired + @Qualifier�� ���� ȿ��
*/

public class MessageMain {

	public static void main(String[] args) {
		
		//ServiceConsumer sc = new ServiceConsumer();
		//sc.consumerSercice();
		
		GenericXmlApplicationContext context = 
				new GenericXmlApplicationContext("app-context.xml");
		
		ServiceConsumer sc = (ServiceConsumer)context.getBean("serviceConsumer");
		sc.consumerService();
		
	}

}
