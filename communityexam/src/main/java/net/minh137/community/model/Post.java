package net.minh137.community.model;

import java.time.LocalDateTime;

public class Post {
	private int id;
    private String title;
    private String content;
    private String author;
    private LocalDateTime createdAt;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public String getContent() {
		return content;
	}
	public void setContent(String content) {
		this.content = content;
	}
	public String getAuthor() {
		return author;
	}
	public void setAuthor(String author) {
		this.author = author;
	}
	public LocalDateTime getCreatedAt() {
		return createdAt;
	}
	public void setCreatedAt(LocalDateTime createdAt) {
		this.createdAt = createdAt;
	}
	
	@Override
	public String toString() {
		return "Post [id=" + id + ", title=" + title + ", content=" + content + ", author=" + author + ", createdAt="
				+ createdAt + ", getId()=" + getId() + ", getTitle()=" + getTitle() + ", getContent()=" + getContent()
				+ ", getAuthor()=" + getAuthor() + ", getCreatedAt()=" + getCreatedAt() + ", getClass()=" + getClass()
				+ ", hashCode()=" + hashCode() + ", toString()=" + super.toString() + "]";
	}
    
    
}
