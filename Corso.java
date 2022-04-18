package it.uniroma3.siw.model;
import javax.persistence.*;

import java.util.*;

import java.time.*;
@Entity
public class Corso {
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private Long id;
	@Column 
	private String nome;
	private LocalDate Data_Inizio;
	private int durata;
	
	@ManyToMany(fetch=FetchType.LAZY)
	private List<Allievo> allievi;
	
	@ManyToOne(fetch=FetchType.EAGER)
	private Docente docente;

}
