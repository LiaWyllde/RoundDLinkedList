package view;

import controller.*;
import model.*;

public class Main {
	
	public static void main (String[] Args){
		ListaEncDupla lista = new ListaEncDupla();
		
		//
		
		try{
			lista.teste();
		} catch (Exception e){
		
			e.printStackTrace();
		}
	}
}