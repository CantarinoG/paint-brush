package cantarino.paintbrush;

import java.awt.Color;
import java.awt.Graphics;

public abstract class D2 extends Ponto {
    public Color corInterna;
    public boolean exibirArea = false;
    public boolean exibirPerimetro = false;
    
    abstract public float area();
    abstract  public float perimetro();
    
    @Override
    public void desenhar (Graphics g) {
        if(exibirArea) g.drawString("Área: " + Float.toString(area()), x, y);
        if(exibirPerimetro) g.drawString("Perímetro: " + Float.toString(perimetro()), x, y-15);
    }
}
