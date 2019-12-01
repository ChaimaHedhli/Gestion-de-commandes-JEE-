package com.business;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import javax.faces.application.FacesMessage;
import javax.faces.context.FacesContext;

import org.primefaces.event.CellEditEvent;
import org.primefaces.event.RowEditEvent;

import com.dao.ArticleIDao;
import com.dao.CmdIDao;
import com.dao.impl.CmdDaoImp;
import com.model.Article;
import com.model.Cmd;
import com.model.DetailCmd;
import com.model.DetailCmdId;

public class CmdBusiness implements java.io.Serializable {

	private CmdIDao cmdIDao; // = new CmdDaoImp();
	private Cmd cmd = new Cmd();
	private List<Cmd> listrCmd = new ArrayList<Cmd>();
	private Cmd selectedCmd;

	private DetailCmd detatailCmd = new DetailCmd();
	private List<DetailCmd> listDetailCmd = new ArrayList<DetailCmd>();

	private DetailCmd selectedDetailCmd = new DetailCmd();
	private Article selectedArticle = new Article();
	private int qte;

	private List<Article> listArticle = new ArrayList<Article>();

	public CmdBusiness() {

		cmd.setDatCreCmd(new Date());

	}

	public void addCmd() {

		cmd.setDetailCmds(listDetailCmd);
		cmdIDao.saveOrUpdate(cmd);
		cmd = new Cmd();
	}

	public void updateCmd() {

	}

	/*
	 * />
	 */

	public void ajouterNouveauDetailCmd() {
		System.out.println("sqfdgqdsf");
		DetailCmdId id = new DetailCmdId();
		id.setCmd(cmd);
		id.setCodArtArt(selectedArticle.getCodArtArt());

		detatailCmd.setId(id);
		detatailCmd.setArticle(selectedArticle);
		detatailCmd.setQteCmdArt(qte);
		detatailCmd.setPrixTotalArt(777);

		listDetailCmd.add(detatailCmd);
		detatailCmd = new DetailCmd();
	}

	
	public void supprimerDetailCmd(){
		
		
		
	}
	public void deleteCmd() {

		cmdIDao.delete(cmd);

	}

	public void findAllCmd() {

	}

	public void annulerDetail() {
		selectedArticle = null;
		qte = 0;
	}

	public String quitter() {
		return "quitter";
	}

	public void annuler() {
		// art = new Article();
	}

	public CmdIDao getCmdIDao() {
		return cmdIDao;
	}

	public void setCmdIDao(CmdIDao cmdIDao) {
		this.cmdIDao = cmdIDao;
	}

	public Cmd getCmd() {
		return cmd;
	}

	public void setCmd(Cmd cmd) {
		this.cmd = cmd;
	}

	public List<Cmd> getListrCmd() {
		return listrCmd;
	}

	public void setListrCmd(List<Cmd> listrCmd) {
		this.listrCmd = listrCmd;
	}

	public Cmd getSelectedCmd() {
		return selectedCmd;
	}

	public void setSelectedCmd(Cmd selectedCmd) {
		this.selectedCmd = selectedCmd;
	}

	public DetailCmd getDetatailCmd() {
		return detatailCmd;
	}

	public void setDetatailCmd(DetailCmd detatailCmd) {
		this.detatailCmd = detatailCmd;
	}

	public List<DetailCmd> getListDetailCmd() {
		return listDetailCmd;
	}

	public void setListDetailCmd(List<DetailCmd> listDetailCmd) {
		this.listDetailCmd = listDetailCmd;
	}

	public DetailCmd getSelectedDetailCmd() {
		return selectedDetailCmd;
	}

	public void setSelectedDetailCmd(DetailCmd selectedDetailCmd) {
		this.selectedDetailCmd = selectedDetailCmd;
	}

	public Article getSelectedArticle() {
		return selectedArticle;
	}

	public void setSelectedArticle(Article selectedArticle) {
		this.selectedArticle = selectedArticle;
	}

	public int getQte() {
		return qte;
	}

	public void setQte(int qte) {
		this.qte = qte;
	}

	public List<Article> getListArticle() {
		
			listArticle = cmdIDao.findAll(Article.class);
		
		return listArticle;
	}

	public void setListArticle(List<Article> listArticle) {
		this.listArticle = listArticle;
	}

}
