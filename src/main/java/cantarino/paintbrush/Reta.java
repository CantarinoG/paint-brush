package cantarino.paintbrush;

import java.awt.Graphics;

public class Reta extends Ponto{
    public int x1, y1;
    public boolean exibirCompr = false;
    
    public float comprimento() {
        float distanciaX = Math.abs(x1 - x);
        float distanciaY = Math.abs(y1 - y);
        float comprimento = (float) Math.sqrt(distanciaX * distanciaX + distanciaY * distanciaY);
        return comprimento;
    }
    
    @Override
    public void desenhar(Graphics g) {
        if(exibirCompr) g.drawString(Float.toString(comprimento()), x, y);
        g.setColor(cor);
        g.drawLine(x, y, x1, y1);
    }
}
