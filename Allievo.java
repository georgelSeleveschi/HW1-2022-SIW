package it.uniroma3.siw.model;
import javax.persistence.*;
import java.time.*;
import java.util.List;
@Entity
public class Allievo {
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private Long id;
	@Column(nullable=false)
	private String nome;
	@Column(nullable=false)
	private String cognome;
	@Column(nullable=false)
    private LocalDate Data_nascita;
	@Column(nullable=false)
    private String Luogo_Nascita;
	private String email;
	
	@ManyToMany(mappedBy="allievi",fetch=FetchType.LAZY)
	private List<Corso> corsi;
	
	@ManyToOne(fetch=FetchType.EAGER)
	private Azienda azienda;
}
