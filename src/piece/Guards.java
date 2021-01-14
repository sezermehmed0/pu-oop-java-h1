package piece;

import java.awt.*;

public class Guards {

    private int row;
    private int col;
    private String color;


    public  Guards(int row,int col){
        this.row = row;
        this.col = col;
    }
    public void render(Graphics g){
        if(this.row % 2 == col % 2) {
            //Yellow frog guards
            g.setColor(Color.yellow);
            g.fillOval(35,51,40,40);
            g.fillOval(140,51,40,40);
            g.fillOval(255,51,40,40);
            g.fillOval(370,51,40,40);

            //Green frog guards
            g.setColor(Color.green);
            g.fillOval(470,482,40,40);
            g.fillOval(140,482,40,40);
            g.fillOval(255,482,40,40);
            g.fillOval(370,482,40,40);

        }
        else {
            // This should look like a border...
            g.setColor(Color.green);
            g.fillRoundRect(30,50,50,44 , 45, 50);
            g.fillRoundRect(135,50,50,44 , 45, 50);
            g.fillRoundRect(250,50,50,44 , 45, 50);
            g.fillRoundRect(365,50,50,44 , 45, 50);

            g.setColor(Color.yellow);
            g.fillRoundRect(480,482,50,44 , 45, 50);
            g.fillRoundRect(135,482,50,44 , 45, 50);
            g.fillRoundRect(250,482,50,44 , 45, 50);
            g.fillRoundRect(365,482,50,44 , 45, 50);




        }









    }
}
