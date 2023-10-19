package cantarino.paintbrush;

import java.awt.Graphics;

public class Borracha extends Retangulo {
    
    public Borracha(int largura) {
        this.largura = largura;
    }
    
    @Override
    public void desenhar(Graphics g){
        g.setColor (corInterna);
        g.fillRect(super.x - largura/2, super.y - largura/2, largura, largura);
    }
    
}
