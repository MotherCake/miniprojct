package de.epoq.miniproject;

import java.io.Serializable;
import javax.persistence.Access;
import javax.persistence.AccessType;
import javax.persistence.Column;
import javax.persistence.Embeddable;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;

@Embeddable
@Access(AccessType.PROPERTY)
public class EmbeddedFoo implements Serializable
{
	public static enum EnumBar {
		VALUEA, VALUEB
	}

	public EnumBar enumBar;

	@Enumerated(EnumType.STRING)
	public EnumBar getEnumBar()
	{
		return enumBar;
	}

	public void setEnumBar(final EnumBar enumBar)
	{
		this.enumBar = enumBar;
	}
}
