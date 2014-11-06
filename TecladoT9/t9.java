package teclado;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.util.StringTokenizer;

import javax.swing.JOptionPane;


public class t9 {
	public static void  main (String [] args){
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
				for(int i = 0; i<Linea.length()-1;i++){
					if(Linea.charAt(i)=='a'){
						System.out.println("2");
					}else if(Linea.charAt(i) =='b' ){
						System.out.println("22");
					}else if(Linea.charAt(i) =='c'){
						System.out.println("222");
					}else if(Linea.charAt(i) =='d'){
						System.out.println("3");
					}else if(Linea.charAt(i) =='e'){
						System.out.println("33");
					}else if(Linea.charAt(i) =='f'){
						System.out.println("333");
					}else if(Linea.charAt(i) =='g'){
						System.out.println("4");
					}else if(Linea.charAt(i) =='h'){
						System.out.println("44");
					}else if(Linea.charAt(i) =='i'){
						System.out.println("444");
					}else if(Linea.charAt(i) =='j'){
						System.out.println("5");
					}else if(Linea.charAt(i) =='k'){
						System.out.println("55");
					}else if(Linea.charAt(i) =='l'){
						System.out.println("555");
					}else if(Linea.charAt(i) =='m'){
						System.out.println("6");
					}else if(Linea.charAt(i)=='n'){
						System.out.println("66");
					}else if(Linea.charAt(i)=='o'){
						System.out.println("666");
					}else if(Linea.charAt(i)=='p'){
						System.out.println("7");
					}else if(Linea.charAt(i)=='q'){
						System.out.println("77");
					}else if(Linea.charAt(i)=='r'){
						System.out.println("777");
					}else if(Linea.charAt(i)=='s'){
						System.out.println("7777");
					}else if(Linea.charAt(i)=='t'){
						System.out.println("8");
					}else if(Linea.charAt(i)=='u'){
						System.out.println("88");
					}else if(Linea.charAt(i)=='v'){
						System.out.println("888");
					}else if(Linea.charAt(i)=='w'){
						System.out.println("9");
					}else if(Linea.charAt(i)=='x'){
						System.out.println("99");
					}else if(Linea.charAt(i)=='y'){
						System.out.println("999");
					}else{
						System.out.println("9999");
					}
					
				}
				
				
				
			}
			bf.close();
			fr.close();
		}catch(Exception ex){
			
		}
}
}
