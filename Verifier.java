class Verifier {
public static void main (String [] args){
// Seletor de quadros

//Resoução de tela
int larg = 1366; // deve ser alterado de acordo com a resolução atual
int alt = 768; // também deve ser alterado

//variáveis de referência da tela 
int centerX = larg/2;
int centerY = alt/2;

// coodenadas recebidas da localização do mouse
int x = 0; // x do mouse
int y = 0 ; // y do mouse	


// Seletor de quadro 

if (x > centerX) {
            if	(y < centerY){
                System.out.println("Ir para bloco B");    
            }else{
                System.out.println("Ir para bloco D");  
            }
}else{
            if (y < centerY){
                System.out.println("Ir para bloco A");
		}else{
			System.out.println("ir para bloco C");
	    }
	}  
}
}
