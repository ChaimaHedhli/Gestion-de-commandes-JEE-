package com.business;

import java.util.ArrayList;
import java.util.List;

import com.dao.ContactIDao;
import com.dao.impl.ContactDaoImp;
import com.model.Contact;

public class ContactBusiness {

	private ContactIDao ctDao;// = new ContactDaoImp();
	private List<Contact> listContact = new ArrayList();

	private Contact ct = new Contact();

	public void ajouter() {
		ctDao.saveOrUpdate(ct);
		ct = new Contact();
	}

	public String quitter() {
		return "quitter";
	}

	public void annuler() {
		ct = new Contact();
	}

	public Contact getCt() {
		return ct;
	}

	public void setCt(Contact ct) {
		this.ct = ct;
	}

	public ContactIDao getCtDao() {
		return ctDao;
	}

	public void setCtDao(ContactIDao ctDao) {
		this.ctDao = ctDao;
	}

	public List<Contact> getListContact() {
		listContact = ctDao.findAll(Contact.class);
		return listContact;
	}

	public void setListContact(List<Contact> listContact) {
		this.listContact = listContact;
	}

}
