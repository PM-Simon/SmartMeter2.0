package de.tub.as.smm.dao;

import java.util.List;

import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.TypedQuery;

import de.tub.as.smm.models.Nutzereintrag;

@Stateless
public class NutzereintragDao {
	
	@PersistenceContext
	private EntityManager em;

	public void persist(Nutzereintrag eintrag) {
		em.persist(eintrag);
	}

	public List<Nutzereintrag> getAllSmartMeter() {
		TypedQuery<Nutzereintrag> query = em.createQuery("SELECT eintrag FROM Nutzereintrag eintrag ORDER BY eintrag.id", Nutzereintrag.class);

		return query.getResultList();
	}
	

}
