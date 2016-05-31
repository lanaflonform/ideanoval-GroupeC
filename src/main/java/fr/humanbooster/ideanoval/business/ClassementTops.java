package fr.humanbooster.ideanoval.business;
// Generated 13 avr. 2016 14:47:43 by Hibernate Tools 4.3.1.Final

import java.io.Serializable;
import java.util.Date;
import java.util.List;

import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;
import javax.persistence.Table;

/**
 * Classementtops generated by hbm2java Cette classe definit le classement des
 * id�es le plus de votes TOP
 */
@Entity
@Table(name = "classementtops")
@DiscriminatorValue("T")
public class ClassementTops extends ClassementIdee implements Serializable {

	private static final long serialVersionUID = -4038522844360197222L;

	public ClassementTops() {
		super();
		// TODO Auto-generated constructor stub
	}

	public ClassementTops(Date dateHeureCreation, List<LigneClassementIdee> ligneClassementIdee) {
		super(dateHeureCreation, ligneClassementIdee);
		// TODO Auto-generated constructor stub
	}

}