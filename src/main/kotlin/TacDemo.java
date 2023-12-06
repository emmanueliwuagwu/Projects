import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class TacDemo extends Frame implements ActionListener {
Button[] b = new Button[9];
Button b1;
int k=0, x=8,y=28, z=0, z1=0, z2 =0, z3=0, z4=0, z5=0, z6=0, z7=0, z8 =0; // we use the z variable to track when a button has been pressed.
    int a =0; //we will use the "a" variable to alternate "X" and "O"
    int l = 70; // Used for positioning the winning labels
    TacDemo(){
    setLayout(null);
    setVisible(true);
    setSize(700,500);
    setLocation(200,200);
    setBackground(Color.black);
    setForeground(Color.white);

    for(int i=1; i<=3; i++){

        for(int j =1; j<=3; j++){

            b[k]= new Button();
            b[k].setSize(100,100);
            b[k].setLocation(x,y);
            b[k].setFont(new Font("",Font.BOLD,40));
            b[k].setForeground(Color.black);
            add(b[k]);

            b[k].addActionListener(this);
            b[k].setBackground(new Color(255,141,28)); //orange
            k++;
            x=x+100;
        }
        x = 8;
        y=y+100;
    }
    b1= new Button("New Game");
    b1.setSize(150, 40);
    b1.setLocation(500,300);
    b1.setFont(new Font("", Font.BOLD, 20));
    b1.setForeground(Color.black);
    add(b1);

    b1.addActionListener(this);
}


    @Override
    public void actionPerformed(ActionEvent e) {
        // for new game
if (e.getSource() == b1 ){
    for (int i =0; i<=8; i++){
        b[i].setLabel("");// resetting the labels when new game button is pressed

        z = 0; z1=0; z2 =0; z3=0; z4=0; z5=0; z6=0; z7=0; z8 =0;
    }
}
        if (e.getSource() == b[0]){
            if(a%2 == 0 && z==0){
                b[0].setLabel("O");
                z++;
                a++;
            }
            else {
                b[0].setLabel("X");
                z++;
                a++;
            }
        }

        if (e.getSource() == b[1]){
            if(a%2 == 0 && z1==0){
                b[1].setLabel("O");
                z1++;
                a++;
            }
            else {
                b[1].setLabel("X");
                z1++;
                a++;
            }
        }
        if (e.getSource() == b[2]){
            if(a%2 == 0 && z2==0){
                b[2].setLabel("O");
                z2++;
                a++;
            }
            else {
                b[2].setLabel("X");
                z2++;
                a++;
            }
        }

        if (e.getSource() == b[3]){
            if(a%2 == 0 && z3==0){
                b[3].setLabel("O");
                z3++;
                a++;
            }
            else {
                b[3].setLabel("X");
                z3++;
                a++;
            }
        }

        if (e.getSource() == b[4]){
            if(a%2 == 0 && z4==0){
                b[4].setLabel("O");
                z4++;
                a++;
            }
            else {
                b[4].setLabel("X");
                z4++;
                a++;
            }
        }

        if (e.getSource() == b[5]){
            if(a%2 == 0 && z5==0){
                b[5].setLabel("O");
                z5++;
                a++;
            }
            else {
                b[5].setLabel("X");
                z5++;
                a++;
            }
        }

        if (e.getSource() == b[6]){
            if(a%2 == 0 && z6==0){
                b[6].setLabel("O");
                z6++;
                a++;
            }
            else {
                b[6].setLabel("X");
                z6++;
                a++;
            }
        }

        if (e.getSource() == b[7]){
            if(a%2 == 0 && z7==0){
                b[7].setLabel("O");
                z7++;
                a++;
            }
            else {
                b[7].setLabel("X");
                z7++;
                a++;
            }
        }

        if (e.getSource() == b[8]){
            if(a%2 == 0 && z8==0){
                b[8].setLabel("O");
                z8++;
                a++;
            }
            else {
                b[8].setLabel("X");
                z8++;
                a++;
            }
        }
//Conditions for victory

        Font var4 = new Font("", 1, 20);
        Label var3;
        if (this.b[0].getLabel() == this.b[1].getLabel() && this.b[0].getLabel() == this.b[2].getLabel()) {
            if (this.b[0].getLabel() == "O") {
                var3 = new Label("Player 1 wins");
                var3.setSize(150, 50);
                var3.setLocation(320, this.l);
                var3.setFont(var4);
                this.add(var3);
                this.l += 50;
            }

            if (this.b[0].getLabel() == "X") {
                var3 = new Label("Player 2 wins");
                var3.setSize(150, 50);
                var3.setLocation(320, this.l);
                var3.setFont(var4);
                this.add(var3);
                this.l += 50;
            }
        } else if (this.b[3].getLabel() == this.b[4].getLabel() && this.b[4].getLabel() == this.b[5].getLabel()) {
            if (this.b[3].getLabel() == "O") {
                var3 = new Label("Player 1 wins");
                var3.setSize(150, 50);
                var3.setLocation(320, this.l);
                var3.setFont(var4);
                this.add(var3);
                this.l += 50;
            }

            if (this.b[3].getLabel() == "X") {
                var3 = new Label("Player 2 wins");
                var3.setSize(150, 50);
                var3.setLocation(320, this.l);
                var3.setFont(var4);
                this.add(var3);
                this.l += 50;
            }
        } else if (this.b[6].getLabel() == this.b[7].getLabel() && this.b[6].getLabel() == this.b[8].getLabel()) {
            if (this.b[6].getLabel() == "O") {
                var3 = new Label("Player 1 wins");
                var3.setSize(150, 50);
                var3.setLocation(320, this.l);
                var3.setFont(var4);
                this.add(var3);
                this.l += 50;
            }

            if (this.b[6].getLabel() == "X") {
                var3 = new Label("Player 2 wins");
                var3.setSize(150, 50);
                var3.setLocation(320, this.l);
                var3.setFont(var4);
                this.add(var3);
                this.l += 50;
            }
        } else if (this.b[0].getLabel() == this.b[3].getLabel() && this.b[0].getLabel() == this.b[6].getLabel()) {
            if (this.b[0].getLabel() == "O") {
                var3 = new Label("Player 1 wins");
                var3.setSize(150, 50);
                var3.setLocation(320, this.l);
                var3.setFont(var4);
                this.add(var3);
                this.l += 50;
            }

            if (this.b[0].getLabel() == "X") {
                var3 = new Label("Player 2 wins");
                var3.setSize(150, 50);
                var3.setLocation(320, this.l);
                var3.setFont(var4);
                this.add(var3);
                this.l += 50;
            }
        } else if (this.b[1].getLabel() == this.b[4].getLabel() && this.b[1].getLabel() == this.b[7].getLabel()) {
            if (this.b[1].getLabel() == "O") {
                var3 = new Label("Player 1 wins");
                var3.setSize(150, 50);
                var3.setLocation(320, this.l);
                var3.setFont(var4);
                this.add(var3);
                this.l += 50;
            }

            if (this.b[1].getLabel() == "X") {
                var3 = new Label("Player 2 wins");
                var3.setSize(150, 50);
                var3.setLocation(320, this.l);
                var3.setFont(var4);
                this.add(var3);
                this.l += 50;
            }
        } else if (this.b[2].getLabel() == this.b[5].getLabel() && this.b[5].getLabel() == this.b[8].getLabel()) {
            if (this.b[2].getLabel() == "O") {
                var3 = new Label("Player 1 wins");
                var3.setSize(150, 50);
                var3.setLocation(320, this.l);
                var3.setFont(var4);
                this.add(var3);
                this.l += 50;
            }

            if (this.b[2].getLabel() == "X") {
                var3 = new Label("Player 2 wins");
                var3.setSize(150, 50);
                var3.setLocation(320, this.l);
                var3.setFont(var4);
                this.add(var3);
                this.l += 50;
            }
        } else if (this.b[0].getLabel() == this.b[4].getLabel() && this.b[0].getLabel() == this.b[8].getLabel()) {
            if (this.b[0].getLabel() == "O") {
                var3 = new Label("Player 1 wins");
                var3.setSize(150, 50);
                var3.setLocation(320, this.l);
                var3.setFont(var4);
                this.add(var3);
                this.l += 50;
            }

            if (this.b[0].getLabel() == "X") {
                var3 = new Label("Player 2 wins");
                var3.setSize(150, 50);
                var3.setLocation(320, this.l);
                var3.setFont(var4);
                this.add(var3);
                this.l += 50;
            }
        } else if (this.b[2].getLabel() == this.b[4].getLabel() && this.b[2].getLabel() == this.b[6].getLabel()) {
            if (this.b[2].getLabel() == "O") {
                var3 = new Label("Player 1 wins");
                var3.setSize(150, 50);
                var3.setLocation(320, this.l);
                var3.setFont(var4);
                this.add(var3);
                this.l += 50;
            }

            if (this.b[2].getLabel() == "X") {
                var3 = new Label("Player 2 wins");
                var3.setSize(150, 50);
                var3.setLocation(320, this.l);
                var3.setFont(var4);
                this.add(var3);
                this.l += 50;
            }
        }

    }
}
