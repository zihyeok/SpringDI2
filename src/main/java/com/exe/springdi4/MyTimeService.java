package com.exe.springdi4;

import java.text.SimpleDateFormat;
import java.util.Date;

import org.springframework.stereotype.Component;

@Component
public class MyTimeService implements TimeService{

	public String getTimeString() {
		
		SimpleDateFormat sbf = 
				(SimpleDateFormat)SimpleDateFormat.
				getDateTimeInstance(SimpleDateFormat.LONG,
						SimpleDateFormat.LONG);//��¥,�ð� ��ġ���Ǵ�
		
		String now = sbf.format(new Date());
		
		return now;
	}

}
