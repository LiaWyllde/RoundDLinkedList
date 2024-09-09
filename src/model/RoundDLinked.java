package model;

import model.Node;

public class RoundDLinked<generic>{

	//na lista duplamente encadeada circular, elementos só são adicionadas no final
	
	Node <generic> node;
	Node <generic> header;
	Node <generic> trailer;
	static int size = 0;
	
	public void addElemento(generic elemento){
	
		//append só adiciona no final
	
		Node <generic> nodoElemento = new Node <generic> (elemento);
	
		if(size <= 1){
			
			//this.header = nodoElemento;
			this.trailer = nodoElemento;
			
			if (size == 0){
				this.header = nodoElemento;
				this.trailer = nodoElemento;	
			} else {
				this.trailer = nodoElemento;
			}
			
			header.setProximo(trailer);
			trailer.setProximo(header);
			
			++size;
			
		} else {
		
			Node <generic> guarda = trailer;
			
			trailer = nodoElemento;
			guarda.setProximo(trailer);
			trailer.setAnterior(guarda);
			trailer.setProximo(header);
			
			++size;
		}
	}
	
	public Node <generic> getLast(){
		return trailer;
	}
		
	public int getTotal(){
		return size;
	}
		
	public void remove (Node<generic> no)throws Exception{
		
		if (size == 0){throw new Exception("A lista está vazia");}
		
		if(size == 1){ 
		
			trailer = null;
			header = null;
			no = null;
			//sysout noodle;
			
		} else {
		
			Node <generic> guardaA = no.getAnterior();
			Node <generic> guardaP = no.getProximo();
			no = null;
			
			guardaA.setProximo(guardaP);
			guardaP.setAnterior(guardaA);
		}
	}
	
	@Override
    public String toString(){
        if(this.header == null){
            return "[]";
        }

        StringBuilder builder = new StringBuilder("[");
        Node <generic> buffer = this.header;

        builder.append(buffer.getElemento());

        while(buffer.getProximo() != trailer.getProximo() ){
            builder.append(",");
            buffer = buffer.getProximo();
            builder.append(buffer.getElemento());
        }

        builder.append("]");
        return builder.toString();
    }
	
}