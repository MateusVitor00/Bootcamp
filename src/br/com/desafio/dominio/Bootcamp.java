package br.com.desafio.dominio;

import java.time.LocalDate;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Objects;
import java.util.Set;

public class Bootcamp {
    private String nome;
    private String descricao;
    private final LocalDate dataInicio  = LocalDate.now();
    private final LocalDate dataFim = dataInicio.plusDays(45);
    private Set<Dev> devsIncritos = new HashSet<>();
    private Set<Conteudo> conteudos = new LinkedHashSet<>();

    public Bootcamp() {
    }

    public String getDescricao() {return descricao;}
    public void setDescricao(String descricao) {this.descricao = descricao;}

    public LocalDate getDataInicio() {return dataInicio;}

    public String getNome() {return nome;}
    public void setNome(String nome) {
        this.nome = nome;}

    public LocalDate getDataFim() {
        return dataFim;
    }

    public Set<Dev> getDevsIncritos() {
        return devsIncritos;}
    public void setDevsIncritos(Set<Dev> devsIncritos) {
        this.devsIncritos = devsIncritos;}

    public Set<Conteudo> getConteudos() {
        return conteudos;}
    public void setConteudos(Set<Conteudo> conteudos) {
        this.conteudos = conteudos;}

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Bootcamp bootcamp)) return false;
        return Objects.equals(getNome(),
                bootcamp.getNome()) && Objects.equals(getDescricao(),
                bootcamp.getDescricao()) && Objects.equals(getDataInicio(),
                bootcamp.getDataInicio()) && Objects.equals(getDataFim(),
                bootcamp.getDataFim()) && Objects.equals(getDevsIncritos(),
                bootcamp.getDevsIncritos()) && Objects.equals(getConteudos(),
                bootcamp.getConteudos());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getNome(), getDescricao(), getDataInicio(), getDataFim(), getDevsIncritos(), getConteudos());
    }
}
