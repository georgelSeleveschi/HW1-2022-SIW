package it.uniroma3.siw.model;
import javax.persistence.*;
@Entity
public class Azienda {
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private Long id;
	@Column(nullable=false)
	private String ragione_sociale;
	@Column(nullable=false)
	private String indirizzo;
	@Column(nullable=false)
	private String telefono;

}
