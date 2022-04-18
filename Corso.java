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
	
	@ManyToMany
	private List<Allievo> allievi;
	
	@ManyToOne
	private Docente docente;

}