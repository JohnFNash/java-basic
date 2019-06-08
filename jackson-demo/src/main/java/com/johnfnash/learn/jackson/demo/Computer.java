package com.johnfnash.learn.jackson.demo;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@JsonIgnoreProperties(value={"cpu", "mainboard"}, allowGetters = true)
public class Computer {

	private String cpu;
	
	private String memory;
	
	private String os;

	public String getCpu() {
		return cpu;
	}

	public void setCpu(String cpu) {
		this.cpu = cpu;
	}

	public String getMemory() {
		return memory;
	}

	public void setMemory(String memory) {
		this.memory = memory;
	}

	public String getOs() {
		return os;
	}

	public void setOs(String os) {
		this.os = os;
	}

	@Override
	public String toString() {
		return "Computer [cpu=" + cpu + ", memory=" + memory + ", os=" + os + "]";
	}
	
}
