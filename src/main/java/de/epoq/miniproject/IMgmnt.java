package de.epoq.miniproject;

import java.util.List;
import javax.ejb.Local;
import javax.naming.NamingException;

@Local
public interface IMgmnt
{
	public List<EntityFoo> getEntityFoos(final long id) throws NamingException;
}
