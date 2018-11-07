/**
 * 
 */
package es.jmp.black.jack;

import java.util.Random;
import java.util.Scanner; 


/**
 * @author Jmp085
 *
 */
public class BlackJack {

	@SuppressWarnings("unused")
	private String cardName;
	@SuppressWarnings("unused")
	private int value;
	public BlackJack(String nombre, int  valor){cardName = nombre; value = valor;}


	@SuppressWarnings("resource")
	public static void main(String[] args) {
		
		System.out.println("");
		System.out.println("  RETRO BLACKJACK");
		System.out.println("desarrollado por JMP");
		System.out.println("");

		double chips = 100;
		Scanner entradaB = new Scanner(System.in);// se declara e inicializa la instancia  de la clase Scanner.
		while (chips > 0){
			System.out.println("Tiene "+ chips+ " fichas.");
			System.out.println("Cuantas desea apostar?");
			String apuesta = entradaB.next();
			double bet = Double.parseDouble(apuesta);
			if (bet <= chips && bet > 0){
				chips = chips - bet;

				int as = 11;

				// TODO Auto-generated method stub
				String[] cartas = {"AS","DOS","TRES","CUATRO","CINCO","SEIS","SIETE","OCHO","NUEVE","DIEZ","J","Q","K"};
				int[] valores = {as,2,3,4,5,6,7,8,9,10,10,10,10};
				BlackJack[] cards = new BlackJack[3];

				//Valor Carta
				for (int i = 0; i< cards.length; i++){
					cards[i] = new BlackJack(cartas[i], valores[i]);
				}

				int nameC = new Random().nextInt(cartas.length);
				String random = (cartas[nameC]);
				int randomVal = (valores[nameC]);
				//Palo Carta
				String[] palo = new String[4];
				for(int i=0; i<4; i++) { 
					palo[i] = new String(); 
				} 
				palo[0]= new String ("PICAS"); 
				palo[1]= new String ("TREBOLES");
				palo[2]= new String ("CORAZONES");
				palo[3]= new String ("DIAMANTES");

				int paloC = new Random().nextInt(palo.length);
				String randomP = (palo[paloC]);

				//Valor segunda
				int nameC2 = new Random().nextInt(cartas.length);
				String random2 = (cartas[nameC2]);
				int randomV = (valores[nameC2]);
				//Palo segunda
				int paloC2 = new Random().nextInt(palo.length);
				String randomP2 = (palo[paloC2]);

				//Puntuacion Inicial	
				if (random == "AS" && (randomVal+randomV > 21)){randomVal = 1;}
				else if (random2 == "AS" && (randomVal+randomV > 21)){randomV = 1;}
				int suma = randomVal+randomV;
				//Primera carta
				System.out.println("Su primera carta es "+ random + " de "+ randomP+"."/* Su valor es "+randomVal*/);
				
				try {
					Thread.sleep (1000);
					} catch (Exception e) {System.out.println("Error de aplicacion");}
				
				//Segunda carta
				System.out.println("Su segunda carta es "+ random2 + " de "+ randomP2+"."/* Su valor es "+randomV*/);
				
				try {
					Thread.sleep (1000);
					} catch (Exception e) {System.out.println("Error de aplicacion");}
				
				//Valor croupier
				int nameCC1 = new Random().nextInt(cartas.length);
				String randomC1 = (cartas[nameCC1]);
				int randomVC = (valores[nameCC1]);
				//Palo croupier
				int paloCC1 = new Random().nextInt(palo.length);
				String randomCC1 = (palo[paloCC1]);
				//Croupier, carta vista
				System.out.println("La carta del croupier es "+ randomC1 + " de "+ randomCC1+"."/* Su valor es "+randomVC*/);
			
				//Asegurar Variables 
				boolean asegurado = false;
				double asegurarB = 0 ;
				

				try {
					Thread.sleep (1000);
					} catch (Exception e) {System.out.println("Error de aplicacion");}

				if (randomVal == 10 && randomV == 11 && randomVC != 10 || randomVal == 10 && randomV == 11 && randomVC != 11  || randomVal == 11 && randomV == 10 && randomVC != 10 || randomVal == 11 && randomV == 10 && randomVC != 11) 
				{ suma=21; 
				System.out.println("Sus cartas suman: "+suma);
				System.out.println("Usted ha hecho BlackJack!");
				
				//Asegurar
				Scanner entrada2 = new Scanner(System.in);
				String pedir2=  null;
				if (randomC1 == "AS" && chips >= bet/2){ System.out.println("Asegurar?");
				pedir2= entrada2.next();
				if (pedir2.equals("si") || pedir2.equals("Si") || pedir2.equals("SI")){
					asegurado=true; asegurarB = bet/2; chips = chips - asegurarB;
					System.out.println("Ha realizado un seguro por "+asegurarB+" fichas");}
				} 

				try {
					Thread.sleep (500);
					} catch (Exception e) {System.out.println("Error de aplicacion");}
				
				}
				else if (randomVal == 10 && randomV == 11 || randomVal == 11 && randomV == 10) 
				{ suma=21; 
				System.out.println("Sus cartas suman: "+suma);
				System.out.println("Usted ha hecho BlackJack!");
				
				//Asegurar
				Scanner entrada2 = new Scanner(System.in);
				String pedir2=  null;
				if (randomC1 == "AS" && chips >= bet/2){ System.out.println("Asegurar?");
				pedir2= entrada2.next();
				if (pedir2.equals("si") || pedir2.equals("Si") || pedir2.equals("SI")){
					asegurado=true; asegurarB = bet/2; chips = chips - asegurarB;
					System.out.println("Ha realizado un seguro por "+asegurarB+" fichas");}
				} 

				try {
					Thread.sleep (1000);
					} catch (Exception e) {System.out.println("Error de aplicacion");}
				}
				else {System.out.println("Sus cartas suman: "+suma);
				
				//Asegurar
				Scanner entrada2 = new Scanner(System.in);
				String pedir2=  null;
				if (randomC1 == "AS" && chips >= bet/2){ System.out.println("Asegurar?");
				pedir2= entrada2.next();
				if (pedir2.equals("si") || pedir2.equals("Si") || pedir2.equals("SI")){
					asegurado=true; asegurarB = bet/2; chips = chips - asegurarB;
					System.out.println("Ha realizado un seguro por "+asegurarB+" fichas");}
				} 

				try {
					Thread.sleep (500);
					} catch (Exception e) {System.out.println("Error de aplicacion");}
				Scanner entrada = new Scanner(System.in);// se declara e inicializa la instancia  de la clase Scanner.

				//Bucle pedir carta		
				String pedir = "pedir";
				if (chips >= bet){
					pedir = null;
					System.out.print("Doblar, pedir o plantarse? ");
					pedir= entrada.next();

					if (pedir.equals("doblar") ||pedir.equals("Doblar") || pedir.equals("DOBLAR")){
						chips = chips - bet;
						bet = 2*bet;
						
						try {
							Thread.sleep (500);
							} catch (Exception e) {System.out.println("Error de aplicacion");}
						
						System.out.println("Usted ha doblado su apuesta. Apuesta actual "+bet+" fichas.");
						int nameC31 = new Random().nextInt(cartas.length);
						String random31 = (cartas[nameC31]);
						int randomV11 = (valores[nameC31]);

						int paloC31 = new Random().nextInt(palo.length);
						String randomP31 = (palo[paloC31]);
						
						try {
							Thread.sleep (1000);
							} catch (Exception e) {System.out.println("Error de aplicacion");}
						
						System.out.println("Su carta es "+ random31 + " de "+ randomP31+".");

						if (random=="AS" && randomVal != 1 && (randomVal+randomV+randomV11>21)){randomVal = 1; suma = suma - 10;}
						 if (random2=="AS" && randomV != 1 && (randomVal+randomV+randomV11>21)){randomV = 1; suma = suma - 10;}
						if (random31=="AS" && (suma+randomV11>21)){randomV11 = 1;}

						suma = suma +randomV11;
						
						try {
							Thread.sleep (1000);
							} catch (Exception e) {System.out.println("Error de aplicacion");}
						
						System.out.println("Sus cartas suman: "+suma);
						if (suma >= 22){System.out.println("Usted se ha pasado.");}
					}


					else if (pedir.equals("pedir") ||pedir.equals("Pedir") || pedir.equals("PEDIR")) {
						int nameC31 = new Random().nextInt(cartas.length);
						String random31 = (cartas[nameC31]);
						int randomV11 = (valores[nameC31]);

						int paloC31 = new Random().nextInt(palo.length);
						String randomP31 = (palo[paloC31]);
						
						try {
							Thread.sleep (1000);
							} catch (Exception e) {System.out.println("Error de aplicacion");}
						
						System.out.println("Su carta es "+ random31 + " de "+ randomP31+".");

						if (random=="AS" && randomVal != 1 && (suma+randomV11>21)){randomVal = 1; suma = suma - 10;}
						if (random2=="AS" && randomV != 1 && (suma+randomV11>21)){randomV = 1; suma = suma - 10;}
						if (random31=="AS" && (suma+randomV11>21)){randomV11 = 1;}

						suma = suma +randomV11;
						
						try {
							Thread.sleep (1000);
							} catch (Exception e) {System.out.println("Error de aplicacion");}
						
						System.out.println("Sus cartas suman: "+suma);
						if (suma >= 22){System.out.println("Usted se ha pasado.");}
					}
				}


				while ( pedir.equals("pedir") && suma < 22 ||pedir.equals("Pedir") && suma < 22 || pedir.equals("PEDIR") && suma < 22){

					pedir = null;
					System.out.print("Pedir o plantarse? ");
					pedir= entrada.next();

					try {
						Thread.sleep (1000);
						} catch (Exception e) {System.out.println("Error de aplicacion");}
					
					if (pedir.equals("pedir") ||pedir.equals("Pedir") || pedir.equals("PEDIR")) {
						int nameC3 = new Random().nextInt(cartas.length);
						String random3 = (cartas[nameC3]);
						int randomV1 = (valores[nameC3]);

						int paloC3 = new Random().nextInt(palo.length);
						String randomP3 = (palo[paloC3]);					
						System.out.println("Su carta es "+ random3 + " de "+ randomP3+".");

						if (random=="AS" && randomVal != 1 && (suma+randomV1>21)){randomVal = 1; suma = suma - 10;}
						 if (random2=="AS" && randomV != 1 && (suma+randomV1>21)){randomV = 1; suma = suma - 10;}
						if (random3=="AS" && randomV1 != 1 && (suma+randomV1>21)){randomV1 = 1;}

						suma = suma + randomV1;
						
						try {
							Thread.sleep (1000);
							} catch (Exception e) {System.out.println("Error de aplicacion");}
						
						System.out.println("Sus cartas suman: "+suma);
						if (suma >= 22){System.out.println("Usted se ha pasado.");}
					}

				}

				//Plantarse
				if (suma <=21 && pedir.equals("plantarse")){ System.out.println("Usted se ha plantado.");}
				else if (suma <=21 && !pedir.equals("doblar") && !pedir.equals("plantarse")){ System.out.println("Usted se ha plantado.");}
				}


				//Croupier segunda carta
				int nameCC2 = new Random().nextInt(cartas.length);
				String randomC2 = (cartas[nameCC2]);
				int randomVX = (valores[nameCC2]); 

				int paloCC2 = new Random().nextInt(palo.length);
				String randomCC2 = (palo[paloCC2]);
				
				try {
					Thread.sleep (1000);
					} catch (Exception e) {System.out.println("Error de aplicacion");}
				
				System.out.println("La segunda carta del croupier es "+ randomC2 + " de "+ randomCC2+"."/*Su valor es "+randomVX*/);

				//Valor Croupier

				if (randomC1=="AS" && (randomVC+randomVX>21)){randomVC = 1;}
				else if (randomC2=="AS" && (randomVC+randomVX>21)){randomVX = 1;}
				int sumaC = randomVC+randomVX;

				try {
					Thread.sleep (1000);
					} catch (Exception e) {System.out.println("Error de aplicacion");}
				
				if (randomVC ==11 && randomVX == 10 || randomVC == 10 && randomVX == 11){ 
					sumaC=21;   
					System.out.println("Las cartas del croupier suman "+ sumaC);
					System.out.println("El croupier ha hecho BlackJack");
				}
				else if (randomVal == 10 && randomV == 1 && randomVC != 10 || randomVal == 10 && randomV == 1 && randomVC != 1  || randomVal == 1 && randomV == 10 && randomVC != 10 || randomVal == 1 && randomV == 10 && randomVC != 1)
				{System.out.println("Las cartas del croupier suman "+ sumaC);}
				else{ 
					System.out.println("Las cartas del croupier suman "+ sumaC);
					//Pedir carta croupier
					while (suma <22 && sumaC < 17 && !(randomVal == 10 && randomV == 11 && randomVC != 10 || randomVal == 10 && randomV == 11 && randomVC != 11  || randomVal == 11 && randomV == 10 && randomVC != 10 || randomVal == 11 && randomV == 10 && randomVC != 11) ){
						int nameCC3 = new Random().nextInt(cartas.length);
						String randomC3 = (cartas[nameCC3]);
						int randomVC1 = (valores[nameCC3]);

						int paloCC3 = new Random().nextInt(palo.length);
						String randomPC3 = (palo[paloCC3]);

						
						 if (randomC1=="AS" && randomVC != 1 && (randomVC+randomVX + randomVC1>21)){randomVC = 1; sumaC = sumaC - 10;}
						 if (randomC2=="AS" && randomVX != 1 && (randomVC+randomVX + randomVC1>21)){randomVX = 1; sumaC = sumaC - 10;}
						if (randomC3=="AS" && (sumaC + randomVC1>21)){randomVC1 = 1;}
					   
						try {
							Thread.sleep (1000);
							} catch (Exception e) {System.out.println("Error de aplicacion");}
						
						System.out.println("La carta pedida por el croupier es "+ randomC3 + " de "+ randomPC3+"."/*Su valor es "+randomVC1*/);
						
					    sumaC = sumaC + randomVC1; 
					   
					    try {
							Thread.sleep (1000);
							} catch (Exception e) {System.out.println("Error de aplicacion");}
					    
						System.out.println("Las cartas del croupier suman: "+sumaC);
					}
				}
				//Gana-Pierde	

				try {
					Thread.sleep (1000);
					} catch (Exception e) {System.out.println("Error de aplicacion");}
				
				if (suma > 21){System.out.println("Usted ha perdido.");}
				else if (suma <=21 && sumaC > 21){ System.out.println("El croupier se ha pasado. Usted gana!");}
				else if (suma > sumaC){System.out.println("Usted ha ganado!");}
				else if (randomVC ==1 && randomVX == 10 && randomVal != 10|| randomVC == 10 && randomVX == 1 && randomVal != 1){System.out.println("Usted ha perdido.");}
				else if (suma == sumaC && !(randomVC ==1 && randomVX == 10 || randomVC == 10 && randomVX == 1)){System.out.println("Ha empatado.");}
				else{System.out.println("Usted ha perdido");}

				//Fichas resutantes
				
				try {
					Thread.sleep (500);
					} catch (Exception e) {System.out.println("Error de aplicacion");}
				
				if (randomVC ==11 && randomVX == 10 && randomVal != 10 || randomVC == 10 && randomVX == 11 && randomVal != 11){
					//chips = chips - bet;
					System.out.println("Ha perdido "+ bet+" fichas.");}
				else if (suma > 21){
					//chips = chips - bet;
					System.out.println("Ha perdido "+ bet+" fichas.");
				}
				else if (randomVal == 11 && randomV == 10 && randomVC ==11 && randomVX == 10|| randomVal == 10 && randomV == 11 && randomVC ==11 && randomVX == 10 || randomVal == 11 && randomV == 10 && randomVC ==10 && randomVX == 11 || randomVal == 10 && randomV == 11 && randomVC ==10 && randomVX == 11 )
				{chips = chips + bet;}
				else if (randomVal == 10 && randomV == 11 && randomVC != 10 || randomVal == 10 && randomV == 11 && randomVC != 11  || randomVal == 11 && randomV == 10 && randomVC != 10 || randomVal == 11 && randomV == 10 && randomVC != 11){
					chips = chips + (2.5*bet);
					System.out.println("Ha ganado "+ 2.5*bet+" fichas.");}
				else if (suma <=21 && sumaC > 21){
					chips = chips + (2*bet);
					System.out.println("Ha ganado "+ 2*bet+" fichas.");
				}
				else if (suma > sumaC){chips = chips + 2*bet; System.out.println("Ha ganado "+ 2*bet+" fichas.");}
				else if (suma == sumaC){chips = chips + bet;}
				else{System.out.println("Ha perdido "+ bet+" fichas.");}
				//System.out.println("Fichas disponibles: "+chips);

				if( randomVC == 10 && randomVX == 1 && asegurado == true || randomVC == 1 && randomVX == 10 && asegurado == true){chips = chips + (3*asegurarB);
				System.out.println("Ha ganado "+ 3*asegurarB+" fichas por el seguro.");
				}
				if( randomVC == 10 && randomVX != 1 && asegurado == true || randomVC == 1 && randomVX != 10 && asegurado == true){chips = chips + (3*asegurarB);
				System.out.println("Ha perdido "+asegurarB+" fichas por el seguro.");
				}

				try {
					Thread.sleep (500);
					} catch (Exception e) {System.out.println("Error de aplicacion");}
				

				System.out.println("\n");
				System.out.println("   ..........");
				System.out.println("\n");
			}
			else if (bet == 0){ System.out.println("Cantidad no valida.");}
			else { System.out.println("No tiene fichas suficientes.");}
			try {
				Thread.sleep (500);
				} catch (Exception e) {System.out.println("Error de aplicacion");}

		}

		System.out.println("No le quedan fichas.");
		System.out.println("FIN DEL JUEGO");

	}
}


