package dio.me.model;

import org.h2.store.Data;

public class Transacao {
private Long id;
private Data data;
private String descricao;
private Double valor;
private Receita receita;
private Despesa despesa;
public Long getId() {
	return id;
}
public void setId(Long id) {
	this.id = id;
}
public Data getData() {
	return data;
}
public void setData(Data data) {
	this.data = data;
}
public String getDescricao() {
	return descricao;
}
public void setDescricao(String descricao) {
	this.descricao = descricao;
}
public Double getValor() {
	return valor;
}
public void setValor(Double valor) {
	this.valor = valor;
}
public Receita getReceita() {
	return receita;
}
public void setReceita(Receita receita) {
	this.receita = receita;
}
public Despesa getDespesa() {
	return despesa;
}
public void setDespesa(Despesa despesa) {
	this.despesa = despesa;
}




}
