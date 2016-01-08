package hr.dto;

import java.util.Arrays;

public class Node {
	private Integer id;
	private String text;
	private String state;
	private String path;
	
	
	private Node[] children;

	@Override
	public String toString() {
		return "Node [id=" + id + ", text=" + text + ", state=" + state
				+ ", children=" + Arrays.toString(children) + "]";
	}

	
	public String getPath() {
		return path;
	}
	public void setPath(String path) {
		this.path = path;
	}
	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getText() {
		return text;
	}

	public void setText(String text) {
		this.text = text;
	}

	public String getState() {
		return state;
	}

	public void setState(String state) {
		this.state = state;
	}

	public Node[] getChildren() {
		return children;
	}

	public void setChildren(Node[] children) {
		this.children = children;
	}
}
