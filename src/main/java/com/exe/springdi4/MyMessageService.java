package com.exe.springdi4;

import org.springframework.stereotype.Component;

@Component("messageService")
public class MyMessageService implements MessageService{

	public String getMessage() {
		return "¾È³ç~ ¿À·£ ³ªÀÇ »ç¶û¾Æ~";
	}

}
