package com.tus.tables;

import java.util.ArrayList;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;

@ManagedBean
@SessionScoped
public class TableData {
	private String companyName;
	private ArrayList<Name> names = new ArrayList<Name>();

	public TableData() {
		this.companyName = "My Company";
		names.add(new Name("Larry", "Marketing", 30, 2000));
		names.add(new Name("Robert", "Marketing", 35, 3000));
		names.add(new Name("Steve", "Sales", 25, 2500));
	}

	public String getCompanyName() {
		return companyName;
	}

	public ArrayList<Name> getNames() {
		return names;
	}
	
	public Name editName(Name name) {
		name.setCanEdit(true);
		return null;
	}
	
	public Name saveAction() {
		for (Name name: names) {
			name.setCanEdit(false);
		}
		return null;
	}

}


