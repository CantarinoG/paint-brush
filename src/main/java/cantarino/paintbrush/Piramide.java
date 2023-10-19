package cantarino.paintbrush;

import java.awt.Graphics;

public class Piramide extends D3 {

    public int base;
    public int largura;
    
    @Override
    public float volume() {
        return (base * largura * altura)/3;
    }
    
    @Override
    public void desenhar(Graphics g){
        super.desenhar(g);
        g.setColor (cor);
        g.drawRect(x, y + 2*largura, base, largura);
        g.drawLine(x, y + 2*largura, x + base/2, y);
        g.drawLine(x, y + 3*largura, x + base/2, y);
        g.drawLine(x + base, y + 2*largura, x + base/2, y);
        g.drawLine(x + base, y + 3*largura, x + base/2, y);
    }
    
}
