package com.yavval.struts2example;

import com.opensymphony.xwork2.ActionSupport;

/*
 * The Action class responds to a user action when user clicks a URL. 
 * One or more of the Action class's methods are executed and a String result is returned. 
 * Based on the value of the result, a specific JSP page is rendered.
 */
public class HelloWorldAction extends ActionSupport {

	private String name;

	public String execute() throws Exception {
		return "success";
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

}
