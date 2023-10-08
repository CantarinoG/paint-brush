package cantarino.paintbrush;

import java.awt.Color;
import java.awt.Graphics;

public class Ponto {
    public int x, y;
    public Color cor;
    
    public void desenhar (Graphics g) {
        g.setColor(cor);
        g.drawLine(x, y, x, y);
    }
}
