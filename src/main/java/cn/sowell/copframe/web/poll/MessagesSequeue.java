package cn.sowell.copframe.web.poll;

import java.util.LinkedList;

public class MessagesSequeue {
	private LinkedList<Message> messages = new LinkedList<>();
	private int beginIndex;
	private int endIndex;
	
	MessagesSequeue(){
		
	}
	
	public LinkedList<Message> getMessages() {
		return messages;
	}
	public int getBeginIndex() {
		return beginIndex;
	}
	void setBeginIndex(int beginIndex) {
		this.beginIndex = beginIndex;
	}
	public int getEndIndex() {
		return endIndex;
	}
	void setEndIndex(int endIndex) {
		this.endIndex = endIndex;
	}
	
	
	
	
}
