package cl.empresa.proyecto.models;

import java.util.Date;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name="personas")

public class Persona {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	private String nombre;
	private String apellido;
	@Column(updatable=false)
	private Date createdAt;
	private Date updatedAt;
	
	//Definir la relacion
	@OneToOne(mappedBy="persona", cascade=CascadeType.ALL, fetch=FetchType.LAZY)
	private Licencia licencia;
	
	
}
