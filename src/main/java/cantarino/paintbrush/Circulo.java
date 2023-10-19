package cantarino.paintbrush;

import java.awt.Graphics;

public class Circulo extends D2 {
    public int raio;
    public final float PI = 3.14f;
    
    @Override
    public float area() { return PI * raio * raio;}
    
    @Override
    public float perimetro() { return 2 * PI * raio;}
    
    @Override public void desenhar(Graphics g){
        if(exibirArea) g.drawString(Float.toString(area()), x - raio, y - raio);
       g.setColor(corInterna);
       g.fillOval(x - raio, y - raio, 2 * raio, 2 * raio);
       g.setColor(cor);
       g.drawOval(x - raio, y - raio, 2 * raio, 2 * raio);
    }
}
