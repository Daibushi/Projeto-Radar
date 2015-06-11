class StringSearcher {
public static void main (String [] args){
       String code = "";   //string a ser escaneada e mudada
String[] nulos = {"cl"};// String ou strings a ser procuradas  
String str = code;  
 
    for (String nulo : nulos) {
        str = str.replaceAll(nulo, ""); // String a que ira substituir palavra procurada
    }
 
    System.out.println(str); // exibe a String já alterada
}
