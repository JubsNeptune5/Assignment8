
import java.awt.Dimension;
import java.awt.Graphics;
import javax.swing.JComponent;
import javax.swing.JFrame;
import java.awt.Color;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

/**
 *
 * @author laveh2107
 */
public class A8Q1 extends JComponent {

    // Height and Width of our game
    static final int WIDTH = 800;
    static final int HEIGHT = 600;
    // sets the framerate and delay for our game
    // you just need to select an approproate framerate
    long desiredFPS = 60;
    long desiredTime = (1000) / desiredFPS;
    // GAME VARIABLES WOULD GO HERE
    //Create colour of my skin
    Color mySkin = new Color(242, 204, 155);
    //Set Color for lips
    Color lips = new Color(245, 179, 179);
    //Create a clour for my irises
    Color iris = new Color(104, 164, 247);
    //Variable for bang height
    int bangH = 40;
    //Variable for iris size
    int irisS = 30;
    //Variable for puple size
    int pupleS = 20;
    //Crerate variables to move bat ears up
    int baty1 = 250;
    int baty2 = 56;
    int batx1 = 30;
    int batxA1 = 330;
    int batx2 = 30;
    int batxA2 = 330;
    //create variables for batman cowl
    int browW = 0;
    int browH = 0;
    //Variables for mouth
    int smileH = 0;
    int smileW = 0;
    //Variables for triangle nose
    int nosex1 = 0;
    int nosex2 = 0;
    int nosex3 = 0;
    int nosey1 = 0;
    int nosey2 = 0;
    //Variable to move tie
    int tieY = 400;
    //Variable to move bat signal
    int simY1 = 700;
    int simY2 = 700;
    int simY3 = 700;
    int simY4 = 700;
    int simY5 = 700;
    int simY6 = 700;

    // GAME VARIABLES END HERE   
    // drawing of the game happens in here
    // we use the Graphics object, g, to perform the drawing
    // NOTE: This is already double buffered!(helps with framerate/speed)
    @Override
    public void paintComponent(Graphics g) {
        // always clear the screen first!
        g.clearRect(0, 0, WIDTH, HEIGHT);


        // GAME DRAWING GOES HERE 

        //BATMAN
        g.setColor(Color.BLACK);
        //Create Arrays for the 
        int[] xPoints = {batx2, batx2, batx1};
        int[] yPoints = {baty2, baty1, baty1};
        g.fillPolygon(xPoints, yPoints, 3);
        int[] xPoints2 = {batxA1, batxA2, batxA2};
        int[] yPoints2 = {baty1, baty2, baty1};
        g.fillPolygon(xPoints2, yPoints2, 3);
        
        //SHIRT
        //Create shirt
        g.setColor(Color.BLACK);
        g.fillRect(-100, 400, 600, 700);
        //create tie
        g.setColor(Color.RED);
        g.fillRect(200, tieY, 50, 200);
        
        //FACE
        //Set that as colour for my face
        g.setColor(mySkin);
        //Create oval for my face
        g.fillOval(50, 50, 350, 400);

        //BATSIGNAL
        //create oval
        g.setColor(Color.YELLOW);
        g.fillOval(120, simY1, 200, 100);
        g.setColor(Color.BLACK);
        g.fillRect(160, simY2, 100, 50);

        //Create ovals for the top
        g.setColor(Color.YELLOW);
        g.fillArc(195, simY3, 20, 20, 180, 180);
        g.fillArc(225, simY3, 20, 20, 180, 180);
        //create ovals fopr wings
        g.fillArc(140, simY4, 40, 40, 180, 360);
        g.fillArc(175, simY5, 45, 45, 180, 360);
        g.fillArc(255, simY4, 40, 40, 180, 360);
        g.fillArc(220, simY5, 45, 45, 180, 360);
        g.fillRect(160, simY5, 20, 30);

        //NOSE
        //Set colour for the outline of the face
        g.setColor(Color.BLACK);
        //Draw the outline of the nose
        g.drawOval(200, 200, 55, 150);
        g.drawOval(175, 301, 50, 50);
        g.drawOval(225, 301, 50, 50);
        //Set colour for filling unwanted lines
        g.setColor(mySkin);
          //Fill in the line where there shouldn't be
        g.setColor(mySkin);
        g.fillRect(200, 191, 30, 30);
        g.fillRect(200, 306, 55, 44);
        
        //Create arc for hair to turn into mask
        g.setColor(Color.BLACK);
        g.fillArc(50, 51, 350, 400, 40, bangH);
        
        //Create grey outline for nose in cowl
        g.setColor(Color.DARK_GRAY);
        int x[] = {nosex1, nosex2, nosex3};
        int y[] = {nosey1, nosey1, nosey2};
        g.drawPolygon(x, y, 3);
        //HAIR
        //set colour for hair
        g.setColor(Color.BLACK);
        g.fillOval(50, 51, 350, 100);
        //Create side of hair
        g.fillOval(350, 101, 100, 200);
        g.fillOval(1, 101, 100, 200);
        
      
        
        //EYES
        //Set colour for my eyes as white
        g.setColor(Color.WHITE);
        //Create ovals for my eyes
        g.fillOval(100, 151, 80, 50);
        g.fillOval(250, 151, 80, 50);
        //Set colour for irises
        g.setColor(iris);
        //Create Circles for irises
        g.fillOval(120, 161, irisS, irisS);
        g.fillOval(270, 161, irisS, irisS);
        //Set colour for puples
        g.setColor(Color.BLACK);
        //Create Circles for puples
        g.fillOval(125, 166, pupleS, pupleS);
        g.fillOval(275, 166, pupleS, pupleS);

        //Create skin rectangle for cowl
        g.setColor(mySkin);
        g.fillRect(150, 351, 150, 100);
        //Create rectangles for eyes
        g.setColor(Color.black);
        g.fillRect(100, 115, browW, browH);
        g.fillRect(250, 115, browW, browH);

        

        //MOUTH
        //Set color for lips
        g.setColor(lips);
        //Create oval for lips
        g.fillOval(160, 361, 130, 40);
        //Create lines for texture
        g.setColor(Color.BLACK);
        //Create line for mouth opening
        g.drawLine(170, 381, 280, 381);
        // GAME DRAWING ENDS HERE     
    }

    // This method is used to do any pre-setup you might need to do
    // This is run before the game loop begins!
    public void preSetup() {
        // Any of your pre setup before the loop starts should go here
    }

    // The main game loop
    // In here is where all the logic for my game will go
    public void run() {
        // Used to keep track of time used to draw and update the game
        // This is used to limit the framerate later on
        long startTime;
        long deltaTime;

        long animDelay = System.currentTimeMillis() + 2000;

        preSetup();

        // the main game loop section
        // game will end if you set done = false;
        boolean done = false;
        while (!done) {
            // determines when we started so we can keep a framerate
            startTime = System.currentTimeMillis();

            // all your game rules and move is done in here
            // GAME LOGIC STARTS HERE 
            //Make bangs on person turn into batman cowl
            if (startTime > animDelay && bangH < 365) {
                bangH = bangH + 5;
            }
            if(bangH >=360){
            //Move the tie down and the signal up
            if (startTime > animDelay && tieY < 1000) {
                tieY++;
            }
            //Make eyes white like cowl
            if (startTime > animDelay && pupleS > 0) {
                pupleS--;
            }

            if (startTime > animDelay && irisS > 0) {
                irisS--;
            }

            //Increase hieght on the bat ears
            if (startTime > animDelay && baty2 > 0) {
                baty2--;
            }

            if (startTime > animDelay && batx1 < 100) {
                batx1++;
            }
            if (startTime > animDelay && batx2 > 5) {
                batx2--;
            }

            if (startTime > animDelay && batxA2 < 445) {
                batxA2++;
            }
            //Animate to increase the nose on cowl
            if (startTime > animDelay && nosex1 < 190) {
                nosex1=nosex1+190;
            }
            if (startTime > animDelay && nosex2 < 265) {
                nosex2=nosex2+265;
            }
            if (startTime > animDelay && nosex3 < 230) {
                nosex3=nosex3+230;
            }
            if (startTime > animDelay && nosey1 < 325) {
                nosey1=nosey1+325;
            }
             if (startTime > animDelay && nosey2 < 100) {
                nosey2=nosey2+100;
            }
            //Add rectangles  to person to make eyes less creepy
            if (startTime > animDelay && browW < 100) {
                browW++;
            }
            if (startTime > animDelay && browH < 50) {
                browH++;
            }
            

            //Move the tie down and the signal up
            if (startTime > animDelay && tieY < 1000) {
                tieY++;
            }

            //Move bat signal to the shirt
            if (startTime > animDelay && simY1 > 475) {
                simY1--;
            }
            if (startTime > animDelay && simY2 > 505) {
                simY2--;
            }
            if (startTime > animDelay && simY3 > 495) {
                simY3--;
            }
            if (startTime > animDelay && simY4 > 500) {
                simY4--;
            }
            if (startTime > animDelay && simY5 > 525) {
                simY5--;
            }
            if (startTime > animDelay && simY6 > 530) {
                simY6--;
            }
            }
            // GAME LOGIC ENDS HERE 
            // update the drawing (calls paintComponent)
            repaint();
            // SLOWS DOWN THE GAME BASED ON THE FRAMERATE ABOVE
            // USING SOME SIMPLE MATH
            deltaTime = System.currentTimeMillis() - startTime;


            try {
                if (deltaTime > desiredTime) {
                    //took too much time, don't wait
                    Thread.sleep(1);
                } else {
                    // sleep to make up the extra time
                    Thread.sleep(desiredTime - deltaTime);
                }
            } catch (Exception e) {
            };
        }

    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // creates a windows to show my game
        JFrame frame = new JFrame("My Game");

        // creates an instance of my game
        A8Q1 game = new A8Q1();
        // sets the size of my game
        game.setPreferredSize(new Dimension(WIDTH, HEIGHT));
        // adds the game to the window
        frame.add(game);

        // sets some options and size of the window automatically
        frame.setResizable(false);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.pack();
        // shows the window to the user
        frame.setVisible(true);

        // add listeners for keyboard and mouse
        frame.addKeyListener(new Keyboard());
        game.addMouseListener(new Mouse());

        // starts the game loop
        game.run();




    }

    // Used to implement any of the Mouse Actions
    private static class Mouse extends MouseAdapter {
        // if a mouse button has been pressed down

        @Override
        public void mousePressed(MouseEvent e) {
        }

        // if a mouse button has been released
        @Override
        public void mouseReleased(MouseEvent e) {
        }

        // if the mouse has moved positions
        @Override
        public void mouseMoved(MouseEvent e) {
        }
    }

// Used to implements any of the Keyboard Actions
    private static class Keyboard extends KeyAdapter {
        // if a key has been pressed down

        @Override
        public void keyPressed(KeyEvent e) {
        }

        // if a key has been released
        @Override
        public void keyReleased(KeyEvent e) {
        }
    }
}
