package mx.utng.practice.controller;

import java.util.List;

import javax.annotation.PostConstruct;
import javax.faces.bean.ViewScoped;
import javax.inject.Named;

import org.springframework.beans.factory.annotation.Autowired;

import mx.utng.practice.model.CampGeneral;
import mx.utng.practice.model.StudentGrade;
import mx.utng.practice.repository.CampGeneralRepository;
import mx.utng.practice.repository.StudentGradeRepository;

@Named
@ViewScoped
public class CampGeneralController {
	@Autowired
	private CampGeneralRepository campGeneralRepository;
	private CampGeneral campGeneral = new CampGeneral(); 
	private List<CampGeneral> campGenerals;
	private boolean editMode = false;
	
	@PostConstruct
	public void init(){
		setCampGenerals(campGeneralRepository.findAll());
}

	public CampGeneralRepository getCampGeneralRepository() {
		return campGeneralRepository;
	}

	public void setCampGeneralRepository(CampGeneralRepository campGeneralRepository) {
		this.campGeneralRepository = campGeneralRepository;
	}

	public List<CampGeneral> getCampGenerals() {
		return campGenerals;
	}
	

	public CampGeneral getCampGeneral() {
		return campGeneral;
	}

	public void setCampGeneral(CampGeneral campGeneral) {
		this.campGeneral = campGeneral;
	}

	public void setCampGenerals(List<CampGeneral> campGenerals) {
		this.campGenerals = campGenerals;
	}

	public boolean isEditMode() {
		return editMode;
	}

	public void setEditMode(boolean editMode) {
		this.editMode = editMode;
	}
	public void save(){
		campGeneralRepository.save(campGeneral);
		if(!editMode){
			getCampGenerals().add(campGeneral);
		}
		campGeneral= new CampGeneral();
		setEditMode(false);
	}
	public void delete(CampGeneral campGeneral){
		campGeneralRepository.delete(campGeneral);
		campGenerals.remove(campGeneral);
	}
	public void update(CampGeneral campGeneral){
		setCampGeneral(campGeneral);
		setEditMode(true);
	}
	public void cancel(){
		campGeneral= new CampGeneral();
		setEditMode(false);
	}
	
}
