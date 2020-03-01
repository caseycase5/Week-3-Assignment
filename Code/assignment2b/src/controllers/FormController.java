package controllers;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.ViewScoped;
import javax.faces.context.FacesContext;

import beans.User;

@ManagedBean
@ViewScoped

public class FormController {
	
	public String onSubmit() {
		
		// Gets user values from the form
		FacesContext context = FacesContext.getCurrentInstance();
		User user = context.getApplication().evaluateExpressionGet(context, "#{user}", User.class);
		
		// Puts the user object into the Post request
		FacesContext.getCurrentInstance().getExternalContext().getRequestMap().put("user", user);
		
		// Takes to the next page listed
		return "TestResponse.xhtml";
	}
	
	public String onFlash() {
		FacesContext context = FacesContext.getCurrentInstance();
		User user = context.getApplication().evaluateExpressionGet(context, "#{user}", User.class);
		
		FacesContext.getCurrentInstance().getExternalContext().getFlash().put("user", user);
		
		return "TestResponse2.xhtml?faces-redirect=true";
		
	}
	
	public String onBack() {
		FacesContext context = FacesContext.getCurrentInstance();
		User user = context.getApplication().evaluateExpressionGet(context, "#{user}", User.class);
		
		FacesContext.getCurrentInstance().getExternalContext().getFlash().put("user", user);
		return "TestForm.xhtml";
	}

}
