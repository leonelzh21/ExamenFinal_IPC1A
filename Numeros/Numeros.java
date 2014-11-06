package numeros;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;

import javax.swing.JOptionPane;

public class Numeros {
	public static void main (String []args){
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
				int n = Integer.parseInt(Linea);
					double resultado = (3+Math.sqrt(5))*n;
				String res = String.valueOf(resultado);
				if(res.charAt(1)==' '){
					System.out.print("0"+res.charAt(0)+res.charAt(1));
				}else{
					System.out.print(res.charAt(0)+res.charAt(1)+res.charAt(2));
				}
				
				
			}
			bf.close();
			fr.close();
		}catch(Exception ex){
			JOptionPane.showMessageDialog(null,"nose pudo leer");
		}
		
	}
}
