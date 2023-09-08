package com.kh.mvc.person.mo.PersonController;

import com.kh.mvc.person.mo.PersonModel.PersonModel;
import com.kh.mvc.person.mo.PersonView.PersonView;

public class PersonController {
	
	private PersonModel pm;
	private PersonView pv;
	
	public PersonController(PersonModel pm, PersonView pv) {
		this.pm = pm;
		this.pv = pv;
	}
	
	public void setpersonName(String name) {
		pm.setName(name);
	}

	public void setpersonAge(int age) {
		pm.setAge(age);
	}

	public String getpersonName() {
		return pm.getName();
	}

	public int getpersonAge() {
		return pm.getAge();
	}

	public void updateView() {
		pv.displayInfo(pm.getName(), pm.getAge());
	}

}
