package game;

import java.awt.*;

public class GameTile {

    private int row;
    private int col;
    private int tileSize;


    public GameTile(int row, int col) {

        this.row = row;
        this.col = col;
        this.tileSize = 110;

    }
    //Rendering game tile
    public void render(Graphics g) {
        int tileX = this.col * this.tileSize;
        int tileY = this.row * this.tileSize;

        //
        if(this.row % 2 == this.col % 2 ) {
            g.setColor(Color.decode("#FF6347"));
        }
        else {
            g.setColor(Color.decode("#8A2BE2"));
        }

        g.fillRect(tileX,tileY,this.tileSize, this.tileSize);
        g.setColor(Color.blue);
        g.fillOval(255,255,40,40);

        /*
        g.setColor(Color.BLACK);
        g.drawRect(220,20,110,530);
        g.drawRect(5,220,545,110);
        g.setColor(Color.white);
        g.fillRect(220,20,110,530);
        g.fillRect(5,220,545,110);*/


    }


        }




