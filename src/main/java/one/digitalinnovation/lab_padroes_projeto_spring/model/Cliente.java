package one.digitalinnovation.lab_padroes_projeto_spring.model;

import jakarta.persistence.*;
import one.digitalinnovation.lab_padroes_projeto_spring.service.ClienteService;
import org.springframework.beans.factory.annotation.Autowired;

import java.time.LocalDate;
import java.util.Date;

@Entity
public class Cliente {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long id;
	private String nome;
	@ManyToOne
	private Endereco endereco;
	private LocalDate data_nascimento;
	private boolean aniversarianteDoDia = false;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public Endereco getEndereco() {
		return endereco;
	}

	public void setEndereco(Endereco endereco) {
		this.endereco = endereco;
	}

	public LocalDate getData_nascimento() {
		return data_nascimento;
	}

	public void setData_nascimento(LocalDate data_nascimento) {
		this.data_nascimento = data_nascimento;
	}

	public boolean isAniversarianteDoDia() {
		return aniversarianteDoDia;
	}

	public void setAniversarianteDoDia(boolean aniversarianteDoDia) {
		this.aniversarianteDoDia = aniversarianteDoDia;
	}
}
