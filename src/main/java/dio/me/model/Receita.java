package dio.me.model;

public class Receita {
private Long id;
private Data data;
private String descricao;
private Double valor;
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



}
