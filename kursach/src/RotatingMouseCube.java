import java.awt.Color;
import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.Point;
import java.awt.event.*;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class RotatingMouseCube extends JFrame implements MouseListener, MouseMotionListener,
        MouseWheelListener {

    public int width = 200;
    public int height = 200;
    public JPanel panel;
    public float distance;
    public float angle;
    Point prevMove = new Point();
    public Cube cube;

    public RotatingMouseCube() {
        super("Rotating Cube with a mouse");

        angle = (float) Math.toRadians(40);
        distance = (width / 2) / (float) (Math.tan(angle / 2));
        System.out.println("distance: " + distance);

        panel = new JPanel() {
            @Override
            protected void paintComponent(Graphics g) {
                super.paintComponent(g);
                cube.project(g, distance,rotX,rotY,rotZ,width,height);
            }
        };
        panel.setPreferredSize(new Dimension(300, 300));
        add(panel);
        pack();
        setLocationRelativeTo(null);
        setDefaultCloseOperation(EXIT_ON_CLOSE);

        this.addMouseListener(this);
        this.addMouseMotionListener(this);
        this.addMouseWheelListener(this);

        cube = new Cube(width,height);
    }



    private float rotX, rotY, rotZ = 0f;



    @Override
    public void mouseWheelMoved(MouseWheelEvent e) {
        if (e.getWheelRotation() < 0) {
            cube.closer();
            panel.repaint();
        } else {
            cube.further();
            panel.repaint();
        }

    }

    @Override
    public void mouseClicked(MouseEvent e) {

    }

    @Override
    public void mouseEntered(MouseEvent e) {
        // TODO Auto-generated method stub

    }

    @Override
    public void mouseExited(MouseEvent e) {
        // TODO Auto-generated method stub

    }

    @Override
    public void mousePressed(MouseEvent e) {

    }

    @Override
    public void mouseReleased(MouseEvent e) {

    }
    @Override
    public void mouseMoved(MouseEvent e) {
        prevMove = e.getPoint();

    }
    float ROT_FACTOR = 100;

    @Override
    public void mouseDragged(MouseEvent e) {
        int dx = e.getX()-prevMove.x;
        int dy = e.getY()-prevMove.y;

        if (e.isAltDown()) {

            if (e.isShiftDown()) {
                rotX += dx/ROT_FACTOR;
                rotY += 0;
                rotZ += dy/ROT_FACTOR;
            } else {
                rotX += dx/ROT_FACTOR;
                rotY += dy/ROT_FACTOR;
                rotZ += 0;
            }
        } else {
            cube.move(dx,dy);
        }

        panel.repaint();
        prevMove = e.getPoint();
    }
}