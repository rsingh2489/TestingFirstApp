package com.demo.controllers.action;

import org.apache.struts2.convention.annotation.Action;
import org.apache.struts2.convention.annotation.Namespace;
import org.apache.struts2.convention.annotation.Result;

import com.opensymphony.xwork2.ActionSupport;

@Namespace("/dashboard")
public class DashBoardAction extends ActionSupport {

	private static final long serialVersionUID = 1L;

	private String username;
	private String password;

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	@Action(value = "index", results = {
		@Result(name = SUCCESS, type = "redirectAction", params = { "namespace", "/dashboard", "actionName", "login" })
	})
	public String index() {
		return SUCCESS;
	}

	@Action(value = "login", results = {
		@Result(name = SUCCESS, location = "/WEB-INF/views/dashboard/login.jsp")
	})
	public String login() {
		return SUCCESS;
	}

	@Action(value = "welcome", results = {
		@Result(name = SUCCESS, location = "/WEB-INF/views/dashboard/welcome.jsp")
	})
	public String welcome() {
		return SUCCESS;
	}

	@Action(value = "accessDenied", results = {
		@Result(name = SUCCESS, location = "/WEB-INF/views/dashboard/accessDenied.jsp")
	})
	public String accessDenied() {
		return SUCCESS;
	}

}