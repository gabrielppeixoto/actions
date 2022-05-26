package br.ufes.inf.jpalmeida.owid;
import com.github.lalyos.jfiglet.FigletFont;
import java.io.File;
import java.io.IOException;

public class App 
{
    public static void main( String[] args ) throws IOException
    {
        String art = FigletFont.convertOneLine("hello");
        System.out.println(art);
    }
}
