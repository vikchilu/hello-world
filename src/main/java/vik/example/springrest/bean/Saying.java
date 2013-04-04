package vik.example.springrest.bean;

import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement(name="Saying")
public class Saying {
	private String id;
	private String content;
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getContent() {
		return content;
	}
	public void setContent(String content) {
		this.content = content;
	}
	
}
