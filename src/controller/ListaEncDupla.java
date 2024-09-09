package controller;
import model.*;

public class ListaEncDupla<generic>{
	
	public RoundDLinked <Object> lista = new RoundDLinked<Object>();
	
	public void teste() throws Exception{

		lista.addElemento("essa matéria vai me deixar maluca!");
        lista.addElemento(2);
        lista.addElemento(5);
        lista.addElemento("Sapinho");
        lista.addElemento(3);
        lista.addElemento(1);
        lista.addElemento("Coelinho");
        System.out.println(lista.toString());
        //ADD OK
        
        Node <Object> last = lista.getLast();
        System.out.println(last.getElemento().toString());
        //LAST OK
		
		lista.remove(last);
		//REMOVE OK
		System.out.println(lista.toString());

    }
}