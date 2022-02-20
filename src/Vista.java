/** Clase de vista 
 * @author Maria Marta Ramirez 21342
 * Hoja de Trabajo 2
 * Universidad del Valle de Guatemala
**/

/**
* Importar BufferReader para leer las entradas del usuario
**/
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;

/**
* Creacion de la clase
**/
public class Vista {
	public static void main(String[] args) {
		CalcuPosfix calc = new CalcuPosfix();
		ArrayList<String> operaciones = new ArrayList<String>();;
		try {
			FileReader r = new FileReader("datos.txt");
			BufferedReader br = new BufferedReader(r);
			String line;
			while((line=br.readLine())!=null){
				operaciones.add(line);
			}
		}catch(IOException e) {
			System.out.println("Ha ocurrido una excepcion de tipo IO: "+e);
		}
		for(int i=0;i<operaciones.size();i++) {
			System.out.println(operaciones.get(i));
			System.out.println("Resultado: "+calc.Evaluate(operaciones.get(i))+"\n");
		}

	}

}
