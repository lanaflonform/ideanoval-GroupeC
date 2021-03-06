package fr.humanbooster.ideanoval.business;
// Generated 13 avr. 2016 14:47:43 by Hibernate Tools 4.3.1.Final

import java.io.Serializable;
import java.util.Date;

import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

/**
 * Alerteidee generated by hbm2java
 */
@Entity
@Table(name = "alerteidee")
@DiscriminatorValue("I")
public class AlerteIdee extends Alerte implements Serializable {

	private static final long serialVersionUID = -8545907042882984135L;

	@ManyToOne
	private Idee idee;
	
	public AlerteIdee() {
	}

	public AlerteIdee(Utilisateur utilisateur, String raison, Date dateHeureAlerte, Idee idee ) {
		super(utilisateur, raison, dateHeureAlerte);		
		this.idee = idee;
	}

	public AlerteIdee(Idee idee) {
		super();
		this.idee = idee;
	}

	public Idee getIdee() {
		return idee;
	}

	public void setIdee(Idee idee) {
		this.idee = idee;
	}


}
