package com.proje.publisher;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationEventPublisher;
import org.springframework.stereotype.Component;

import com.proje.event.UserSendMailEvent;
import com.proje.model.User;

@Component
public class UserSendMailPublisher {

	@Autowired
	private ApplicationEventPublisher applicationEventPublisher;

	public void userRegisterMessage() {
		String title = "Kayıt onay mesaji";

		String content = "Kaydinizi tamamlamak icin asaidaki linke tiklayiniz";

		User user = new User("mucahityusufzirek@gmail.com", "213165", "Mücahit Yusuf", "Zirek");

		UserSendMailEvent event = new UserSendMailEvent(user, title, content);

		this.applicationEventPublisher.publishEvent(event);
	}

}
