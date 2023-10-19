package cantarino.paintbrush;

import java.awt.Graphics;

public abstract class D3 extends Ponto {
    public int altura;
    public boolean exibirVolume;
    
    abstract public float volume();
    
    @Override
    public void desenhar (Graphics g) {
        if(exibirVolume) g.drawString("Volume: " + Float.toString(volume()), x, y);
    }
}
