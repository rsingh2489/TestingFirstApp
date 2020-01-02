package com.demo.controllers.action;

import java.util.Collection;
import java.util.Iterator;

import org.apache.struts2.convention.annotation.Action;
import org.apache.struts2.convention.annotation.Namespace;
import org.apache.struts2.convention.annotation.Result;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.security.core.userdetails.UserDetails;

import com.opensymphony.xwork2.ActionSupport;

@Namespace("/employee")
public class EmployeeAction extends ActionSupport {

	private static final long serialVersionUID = 1L;

	@Action(value = "index", results = {
		@Result(name = SUCCESS, location = "/WEB-INF/views/employee/index.jsp")
	})
	public String index() {
		/* Read userDetails Info */
		UserDetails userDetails = (UserDetails) SecurityContextHolder.getContext().getAuthentication().getPrincipal();
		System.out.println("Username: " + userDetails.getUsername());
		Collection<SimpleGrantedAuthority> authorities = (Collection<SimpleGrantedAuthority>) userDetails.getAuthorities();
		for (Iterator i = authorities.iterator(); i.hasNext();) {
			SimpleGrantedAuthority authority = (SimpleGrantedAuthority) i.next();
			System.out.println("Role: " + authority.getAuthority());
		}
		return SUCCESS;
	}

}