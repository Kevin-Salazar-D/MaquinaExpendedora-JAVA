package tipografia;
import java.awt.Font;
import java.io.InputStream;

public class tipografias {
    private Font font = null;
    public String digital = "digital.TTF";
    public String contirno = "tipografiaC.ttf";
    public String datefruit = "datefruits.ttf";



    public Font fuente( String nombreF, int estilo, float tamanio)
    {
        try {
            //Se carga la fuente
            InputStream is =  getClass().getResourceAsStream(nombreF);
            font = Font.createFont(Font.TRUETYPE_FONT, is);
        } catch (Exception ex) {
            //Si existe un error se carga fuente por defecto ARIAL
            System.err.println(nombreF + " No se cargo la fuente");
            font = new Font("Arial", Font.PLAIN, 14);
        }
        Font tfont = font.deriveFont(estilo, tamanio);
        return tfont;
    }
    
}
