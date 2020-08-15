package Code;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class Main {
	public static void main(String[] args) throws Exception {
        String ruta1 = "C:/Users/leona/P5-Compiladores/AnalizadorSintactico5/src/Code/Lexer.flex";
        String ruta2 = "C:/Users/leona/P5-Compiladores/AnalizadorSintactico5/src/Code/LexerCup.flex";
        String[] rutaS = {"-parser", "Sintax", "C:/Users/leona/P5-Compiladores/AnalizadorSintactico5/src/Code/Sintax.cup"};
        generar(ruta1, ruta2, rutaS);
    }
    public static void generar(String ruta1, String ruta2, String[] rutaS) throws IOException, Exception{
        File archivo;
        archivo = new File(ruta1);
        JFlex.Main.generate(archivo);
        archivo = new File(ruta2);
        JFlex.Main.generate(archivo);
        java_cup.Main.main(rutaS);
        
        Path rutaSym = Paths.get("C:/Users/leona/P5-Compiladores/AnalizadorSintactico5/src/Code/sym.java");
        if (Files.exists(rutaSym)) {
            Files.delete(rutaSym);
        }
        Files.move(
                Paths.get("C:/Users/leona/P5-Compiladores/AnalizadorSintactico5/sym.java"), 
                Paths.get("C:/Users/leona/P5-Compiladores/AnalizadorSintactico5/src/Code/sym.java")
        );
        Path rutaSin = Paths.get("C:/Users/leona/P5-Compiladores/AnalizadorSintactico5/src/Code/Sintax.java");
        if (Files.exists(rutaSin)) {
            Files.delete(rutaSin);
        }
        Files.move(
                Paths.get("C:/Users/leona/P5-Compiladores/AnalizadorSintactico5/Sintax.java"), 
                Paths.get("C:/Users/leona/P5-Compiladores/AnalizadorSintactico5/src/Code/Sintax.java")
        );
    }
}
