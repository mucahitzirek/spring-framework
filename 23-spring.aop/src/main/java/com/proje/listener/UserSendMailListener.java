package com.proje.listener;

import org.springframework.context.ApplicationListener;
import org.springframework.stereotype.Component;

import com.proje.event.UserSendMailEvent;
import com.proje.model.User;

@Component
public class UserSendMailListener implements ApplicationListener<UserSendMailEvent> {

	@Override
	public void onApplicationEvent(UserSendMailEvent userSendMailEvent) {

		User user = userSendMailEvent.getUser();

		System.out.println("Mail gönderilecek user bilgileri : ");

		System.out.println(user);

		System.out.println("Mailbaslıgı : " + userSendMailEvent.getTitle());
		System.out.println("Mail icerigi : " + userSendMailEvent.getContent());

	}

}
