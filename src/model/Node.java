package model;

public class Node<generic>{
	
	//<> que indicam tipo generico, não o que está dentro dele
	
	generic element;
	Node <generic> anterior;
	Node <generic> proximo;
	
	public  Node (generic e){
		this.anterior = null;
		this.proximo = null;
		this.element = e;
	}
	
	public Node<generic> getProximo(){
	return proximo;}
	
	public Node <generic> getAnterior() {
	return anterior;}
	
	public  generic getElemento(){
	return element;}
	
	public void setAnterior(Node <generic> newAnterior) {
		this.anterior = newAnterior;
	}
	
	public void setProximo(Node <generic> newProximo) {
		this.proximo = newProximo;
	}
	
	public void setElemento(generic newElement){
		this.element = newElement;
	}
}