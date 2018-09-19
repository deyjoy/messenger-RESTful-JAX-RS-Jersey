package org.joy.javabrains.messenger.service;

import java.util.ArrayList;
import java.util.List;

import org.joy.javabrains.messenger.model.Message;

public class MessageService {

	public List<Message> getAllMessages() {

		Message m1 = new Message(1, "Hello World", "Ali");
		Message m2 = new Message(2, "Hello Java", "Farsad");
		Message m3 = new Message(3, "Hello Jersey", "Joy");
		Message m4 = new Message(4, "Hello Pychrm", "Refayet");
		Message m5 = new Message(5, "Hello Manager", "Shanchary");

		List<Message> list = new ArrayList<>();
		list.add(m1);
		list.add(m2);
		list.add(m3);
		list.add(m4);
		list.add(m5);

		return list;
	}

}
