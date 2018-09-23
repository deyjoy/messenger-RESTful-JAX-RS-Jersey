package org.joy.javabrains.messenger.service;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import org.joy.javabrains.messenger.database.DatabaseClass;
import org.joy.javabrains.messenger.model.Message;

public class MessageService {

	private Map<Long, Message> messages = DatabaseClass.getMessages();

	public List<Message> getAllMessages() {
		return new ArrayList<Message>(messages.values());
		
		Message getMessage(long id) {
			return message.get(id); 
		}
		
		Message addMessage(Message message) {
			message.setId(message.size() + 1);
			messages.put(message.getId(), message); 
			return message; 
		}
		
		public Message updateMessage(Message message) {
			if(message.getID() <= 0) {
				return null; 
			}
			message.put(message.getId(), message); 
			return message; 
		}
		
		public Message removeMessage(long id) {
			return message.remove(id); 
		}

		// Message m1 = new Message(1, "Hello Mauritius", "Ali");
		// Message m2 = new Message(2, "Hello Java", "Farsad");
		// Message m3 = new Message(3, "Hello Jersey", "Joy");
		// Message m4 = new Message(4, "Hello Pychrm", "Refayet");
		// Message m5 = new Message(5, "Hello Manager", "Shanchary");
		//
		// List<Message> list = new ArrayList<>();
		// list.add(m1);
		// list.add(m2);
		// list.add(m3);
		// list.add(m4);
		// list.add(m5);
		//
		// return list;
	}

}
