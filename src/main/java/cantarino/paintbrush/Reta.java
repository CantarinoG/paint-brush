package cantarino.paintbrush;

import java.awt.Graphics;

public class Reta extends Ponto{
    public int x1, y1;
    
    public float comprimento() {
        float distanciaX = Math.abs(x1 - x);
        float distanciaY = Math.abs(y1 - y);
        float comprimento = (float) Math.sqrt(distanciaX * distanciaX + distanciaY * distanciaY);
        return comprimento;
    }
    
    @Override
    public void desenhar(Graphics g) {
        g.setColor(cor);
        g.drawLine(x, y, x1, y1);
    }
}
