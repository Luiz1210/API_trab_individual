package org.serratec.backend.individual.model;

import java.util.Date;

import com.fasterxml.jackson.annotation.JsonFormat;

import jakarta.persistence.Column;
import jakarta.persistence.Embeddable;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Size;

@Embeddable
public class InformacaoPublicacao {
	@Column(name="autor", nullable=false)
	@NotBlank(message="Preencha o autor ")
	@Size(max = 50, message = "Tamanho máximo 50")
    private String autor;
	
	@Column(name="dataPublicacao", nullable=false)
	@JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "dd/MM/yyyy")
    private Date dataPublicacao;
	
	@Column(name="editora", nullable=false)
	@NotBlank(message="Preencha a editora ")
	@Size(max = 20, message = "Tamanho máximo 20")
    private String editora;
	
	public String getAutor() {
		return autor;
	}
	public void setAutor(String autor) {
		this.autor = autor;
	}
	public Date getDataPublicacao() {
		return dataPublicacao;
	}
	public void setDataPublicacao(Date dataPublicacao) {
		this.dataPublicacao = dataPublicacao;
	}
	public String getEditora() {
		return editora;
	}
	public void setEditora(String editora) {
		this.editora = editora;
	}

    
}

