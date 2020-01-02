package com.demo.controllers.action;

import org.apache.struts2.convention.annotation.Action;
import org.apache.struts2.convention.annotation.Namespace;
import org.apache.struts2.convention.annotation.Result;
import com.opensymphony.xwork2.ActionSupport;

@Namespace("/home")
public class HomeAction extends ActionSupport {

	private static final long serialVersionUID = 1L;

	@Action(value = "index", results = {
		@Result(name = SUCCESS, location = "/WEB-INF/views/home/index.jsp")
	})
	public String index() {
		return SUCCESS;
	}

}