package de.epoq.miniproject;

import java.io.Serializable;
import javax.persistence.Embeddable;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;

@Embeddable
public class EmbeddedFoo implements Serializable
{
	public static enum EnumBar {
		VALUEA, VALUEB
	}

	private EnumBar enumBar;

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
