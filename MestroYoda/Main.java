import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.PrintWriter;
import java.util.StringTokenizer;

import javax.swing.JOptionPane;





public class Main {
	
	public static void main (String[] args){
		extraerArchivo();
		
	}
	

	public static void extraerArchivo(){
		String Linea;
		File f;
		javax.swing.JFileChooser j= new javax.swing.JFileChooser();
		j.showOpenDialog(j);
		
		String path= j.getSelectedFile().getAbsolutePath();
		String lectura="";
		f = new File(path);


		try{
			FileReader fr = new FileReader(path);
			BufferedReader bf = new BufferedReader(fr);
			while((Linea = bf.readLine())!=null){
				 esNumero(Linea);
				
				if(esNumero(Linea)){
					
					System.out.println("los numero de casos son"+ " "+Linea);
				}else{
					String [] linea = Linea.split(" ");
					for(int i = 0; i<linea.length;i++){
						for(int j1 =i+1; j1< linea.length;j1++ ){
							String temp = linea[i];
							linea[i]= linea[j1];
							linea[j1] = temp;
						}
						System.out.println(linea[i]);
						grabarArchivo(linea[i]);
				}
					
					
			
				
					
				}
				
				
				
				
			}
			bf.close();
			fr.close();
		}catch(Exception ex){
			JOptionPane.showMessageDialog(null,"nose pudo leer");
		}
		
	}
	
	public static boolean esNumero(String linea){
		try{
			int numero = Integer.parseInt(linea);
		}
		catch(Exception ex){
			
			return false;
		}
		return true;
	}
	
	public static void grabarArchivo(String Linea){
		try{
			FileWriter fw = new FileWriter("OutputMaestroYoda.txt", true);
				PrintWriter pw= new PrintWriter(fw);
				pw.println(Linea);
				pw.close();
		}
		catch(Exception ex){
			
		}

	}
	
}

