package de.epoq.miniproject;

import java.util.List;
import javax.ejb.Stateless;
import javax.naming.NamingException;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;
import oracle.toplink.essentials.config.HintValues;
import oracle.toplink.essentials.config.TopLinkQueryHints;

@Stateless(name = "Mgmnt", mappedName = "ejb/Mgmnt")
public class Mgmnt implements IMgmnt
{
	@PersistenceContext(unitName = "em1")
	private EntityManager em;

	@SuppressWarnings("unchecked")
	@Override
	public List<EntityFoo> getEntityFoos(final long id) throws NamingException
	{
		final Query q = em.createNativeQuery("SELECT * FROM minitable where id = " + id);
		//                final Query q = em.createNativeQuery("SELECT x FROM minitable where x.id = :id");
		//                q.setParameter("id", id);

		final List<EntityFoo> campaigns = q.getResultList();
		return campaigns;
	}
}
