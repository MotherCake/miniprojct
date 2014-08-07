package de.epoq.miniproject;

import java.io.Serializable;
import javax.persistence.AttributeOverride;
import javax.persistence.Column;
import javax.persistence.Embedded;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "minitable")
public class EntityFoo implements Serializable
{
	@Id
	public Integer id;

	@Embedded
	@AttributeOverride(name = "enumBar", column = @Column(name = "enumbar"))
	private EmbeddedFoo embeddedFoo;

	public Integer getId()
	{
		return id;
	}

	public EmbeddedFoo getEmbeddedFoo()
	{
		return embeddedFoo;
	}

	public void setId(final Integer id)
	{
		this.id = id;
	}

	public void setEmbeddedFoo(final EmbeddedFoo embeddedFoo)
	{
		this.embeddedFoo = embeddedFoo;
	}
}
