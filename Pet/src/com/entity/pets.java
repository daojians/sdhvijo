package com.entity;

public class pets {
	private int id;
	private String name;
	private int tid;
	private int mid;
	private String love;
		
	public pets() {
		super();
	}
	public pets(String name, int tid, int mid, String love) {
		super();
		this.name = name;
		this.tid = tid;
		this.mid = mid;
		this.love = love;
	}
	public pets(int id, String name, int tid, int mid, String love) {
		super();
		this.id = id;
		this.name = name;
		this.tid = tid;
		this.mid = mid;
		this.love = love;
	}
	public int getId() {
		return id;
	}
	
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getTid() {
		return tid;
	}
	public void setTid(int tid) {
		this.tid = tid;
	}
	public int getMid() {
		return mid;
	}
	public void setMid(int mid) {
		this.mid = mid;
	}
	public String getLove() {
		return love;
	}
	public void setLove(String love) {
		this.love = love;
	}

	
}
