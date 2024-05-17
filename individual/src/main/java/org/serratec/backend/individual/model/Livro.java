package org.serratec.backend.individual.model;

import jakarta.persistence.Column;
import jakarta.persistence.Embedded;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import jakarta.validation.Valid;
import jakarta.validation.constraints.NotBlank;

@Entity
@Table(name="livro")
public class Livro {
	
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="idLivro", nullable=false)
    private Long id;

    @Column(name="titulo", nullable=false)
    @NotBlank(message = "Preencha o título")
    @Valid
    private String titulo;

    @Embedded
    @Valid
    private InformacaoPublicacao informacaoPublicacao;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getTitulo() {
		return titulo;
	}

	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}

	public InformacaoPublicacao getInformacaoPublicacao() {
		return informacaoPublicacao;
	}

	public void setInformacaoPublicacao(InformacaoPublicacao informacaoPublicacao) {
		this.informacaoPublicacao = informacaoPublicacao;
	}

    
}
