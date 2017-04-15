package net.bootsfaces.test.beans;

import java.io.Serializable;
import java.util.Date;

import javax.faces.view.ViewScoped;
import javax.inject.Named;

@Named
@ViewScoped
public class TestBean implements Serializable {
	private static final long serialVersionUID = 1L;

	private Date date;

	public void onload() {
		setDate(new Date());
	}

	public Date getDate() {
		return date;
	}

	public void setDate(Date date) {
		this.date = date;
	}
}
