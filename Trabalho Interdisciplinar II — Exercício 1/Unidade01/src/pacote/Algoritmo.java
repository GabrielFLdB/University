/*
 * Nome: Algoritmo
 * Descrição: Somador de números inteiros
 * Autor: Gabriel Felipe Lopes de Barros
 * Número de Matrícula: 659322
 */

package pacote ;

import java.util.* ;

class Algoritmo {
	public static Scanner sc = new Scanner(System.in);
	//Método para soma de valores inteiros
	public static void main ( String args [ ] )
	{
		// Declaração de variáveis
		int number_1, number_2, sum;
		// Entrada de valores
		System.out.println ( "Digite um número." ) ;
		number_1 = sc.nextInt ( ) ;
		System.out.println ( "Digite outro número." ) ;
		number_2 = sc.nextInt ( ) ;
		// Çálculo de soma de variáves
		sum = number_1 + number_2 ;
		// Amostra de valores
		System.out.println ( "Soma: " + sum ) ;
	}
	//Método getSc
	public static Scanner getSc ( )
	{
		return sc ;
	}
	//Método setSc
	public static void setSc ( Scanner sc )
	{
		Algoritmo.sc = sc ;
	}
	//Método toString
	@Override
	public String toString ( )
	{
		return "Algoritmo [ getClass ( ) = " + getClass ( ) + ", hashCode ( ) = " + hashCode ( ) + ", toString ( ) = " + super.toString ( ) + "]" ;
	}
}