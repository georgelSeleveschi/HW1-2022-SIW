package it.uniroma3.siw.model;
import javax.persistence.*;
import java.time.*;
import java.util.List;
@Entity
public class Docente {
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private Long id;
	@Column(nullable=false)
	private String nome;
	@Column(nullable=false)
	private String cognome;
	private LocalDate data_nascita;
	private String luogo_nascita;
	@Column(nullable=false)
	private String partita_iva;
	
	@OneToMany(mappedBy="docente" ,fetch=FetchType.EAGER)
	private List<Corso> corsi; 
	
}
