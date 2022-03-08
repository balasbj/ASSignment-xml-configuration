package com.tcs.Assignment;

import org.springframework.stereotype.Component;

@Component
public class Tyre {
	

	public Tyre() {
		super();
		// TODO Auto-generated constructor stub
	}
	private String tyre;

	public Tyre(String tyre) {
		super();
		this.tyre = tyre;
	}

	public String getTyre() {
		return tyre;
	}

	public void setTyrebrand(String tyre) {
		this.tyre = tyre;
	}

	@Override
	public String toString() {
		return "Tyre [tyre=" + tyre + "]";
	}
	
	}
