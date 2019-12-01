package com.business;

import com.dao.LoginIDao;
import com.dao.impl.LoginDaoImp;
import com.model.Utilisateur;
import com.model.UtilisateurId;

public class LogintBusiness {

	private LoginIDao loginDao = new LoginDaoImp();

	private String userLogin;
	private String userPassWord;

	public String connecter() {

		Utilisateur user = (Utilisateur)loginDao.findById(Utilisateur.class, new UtilisateurId(userLogin,userPassWord));
				
		if (user != null)
			return "success";
		else
			return "error";
	}

	public void annuler() {
		userLogin = "";
		userPassWord = "";
	}

	public LoginIDao getLoginDao() {
		return loginDao;
	}

	public void setLoginDao(LoginIDao loginDao) {
		this.loginDao = loginDao;
	}

	public String getUserLogin() {
		return userLogin;
	}

	public void setUserLogin(String userLogin) {
		this.userLogin = userLogin;
	}

	public String getUserPassWord() {
		return userPassWord;
	}

	public void setUserPassWord(String userPassWord) {
		this.userPassWord = userPassWord;
	}

}
