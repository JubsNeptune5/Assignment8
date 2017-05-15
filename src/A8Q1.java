
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
    // GAME VARIABLES END HERE   
    // drawing of the game happens in here
    // we use the Graphics object, g, to perform the drawing
    // NOTE: This is already double buffered!(helps with framerate/speed)
    @Override
    public void paintComponent(Graphics g) {
        // always clear the screen first!
        g.clearRect(0, 0, WIDTH, HEIGHT);

        // GAME DRAWING GOES HERE 

        //FACE
        //Create colour of my skin
        Color mySkin = new Color(242, 204, 155);
        //Set that as colour for my face
        g.setColor(mySkin);
        //Create oval for my face
        g.fillOval(50, 1, 350, 400);

        //EYES
        //Set colour for my eyes as white
        g.setColor(Color.WHITE);
        //Create ovals for my eyes
        g.fillOval(100, 100, 80, 50);
        g.fillOval(250, 100, 80, 50);
        //Create a clour for my irises
        Color iris = new Color(104, 164, 247);
        //Set colour for irises
        g.setColor(iris);
        //Create Circles for irises
        g.fillOval(120, 110, 30, 30);
        g.fillOval(270, 110, 30, 30);
        //Set colour for puples
        g.setColor(Color.BLACK);
        //Create Circles for puples
        g.fillOval(125, 115, 20, 20);
        g.fillOval(275, 115, 20, 20);

        //HAIR
        //set colour for hair
        g.setColor(Color.BLACK);
        //Create arc for hair
        g.fillArc(50, 1, 350, 400, 40, 40);
        g.fillOval(50, 1, 350, 100);
        //Create side of hair
        g.fillOval(350, 50, 100, 200);
        g.fillOval(1, 50, 100, 200);

        //NOSE
        //Set colour for the outline of the face
        g.setColor(Color.BLACK);
        //Draw the outline of the nose
        g.drawOval(200, 150, 55, 150);
        g.drawOval(175, 250, 50, 50);
        g.drawOval(225, 250, 50, 50);
        //Set colour for filling unwanted lines
        g.setColor(mySkin);
        //Fill in the line where there shouldn't be
        g.fillRect(200, 140, 30, 30);
        g.fillRect(200, 250, 55, 44);

        //MOUTH
        //Set Color for lips
        Color lips = new Color(245, 179, 179);
        g.setColor(lips);
        //Create oval for lips
        g.fillOval(160, 310, 130, 40);
        //Create lines for texture
        g.setColor(Color.BLACK);
        //Create line for mouth opening
        g.drawLine(170, 330, 280, 330);
        
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

        preSetup();

        // the main game loop section
        // game will end if you set done = false;
        boolean done = false;
        while (!done) {
            // determines when we started so we can keep a framerate
            startTime = System.currentTimeMillis();

            // all your game rules and move is done in here
            // GAME LOGIC STARTS HERE 
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