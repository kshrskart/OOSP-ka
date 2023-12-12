import java.awt.*;

class Cube {

    public int size = 50;
    Vector3D ulf, urf, llf, lrf;
    Vector3D ulb, urb, llb, lrb;



    public Cube(int width, int height) {


        int startx = width / 2 - size / 2;
        int starty = height / 2 - size / 2;


        ulf = new Vector3D(startx, starty, 0);
        urf = new Vector3D(startx + size, starty, 0);
        llf = new Vector3D(startx, starty+size, 0);
        lrf = new Vector3D(startx + size, starty + size, 0);

        ulb = new Vector3D(startx, starty, -size);
        urb = new Vector3D(startx + size, starty, -size);
        llb = new Vector3D(startx, starty+size, -size);
        lrb = new Vector3D(startx + size, starty + size, -size);
    }

    public void move(int dx, int dy)
    {
        ulf.x += dx;
        urf.x += dx;
        llf.x += dx;
        lrf.x += dx;
        ulb.x += dx;
        urb.x += dx;
        llb.x += dx;
        lrb.x += dx;

        ulf.y += dy;
        urf.y += dy;
        llf.y += dy;
        lrf.y += dy;
        ulb.y += dy;
        urb.y += dy;
        llb.y += dy;
        lrb.y += dy;

    }


    public void project(Graphics g, float distance,float rotX, float rotY, float rotZ, int width, int height) {

        Point pulf = ulf.to2D(distance,rotX,rotY,rotZ,width,height);
        Point purf = urf.to2D(distance,rotX,rotY,rotZ,width,height);
        Point pllf = llf.to2D(distance,rotX,rotY,rotZ,width,height);
        Point plrf = lrf.to2D(distance,rotX,rotY,rotZ,width,height);
        Point pulb= ulb.to2D(distance,rotX,rotY,rotZ,width,height);
        Point purb= urb.to2D(distance,rotX,rotY,rotZ,width,height);
        Point pllb= llb.to2D(distance,rotX,rotY,rotZ,width,height);
        Point plrb= lrb.to2D(distance,rotX,rotY,rotZ,width,height);

        g.setColor(Color.GREEN);
        g.drawLine(plrf.x, plrf.y, purf.x, purf.y);
        g.drawLine(plrf.x, plrf.y, pllf.x, pllf.y);
        g.drawLine(pulf.x, pulf.y, purf.x, purf.y);
        g.drawLine(pulf.x, pulf.y, pllf.x, pllf.y);
        g.setColor(Color.RED);
        g.drawLine(purb.x, purb.y, pulb.x, pulb.y);
        g.drawLine(pllb.x, pllb.y, pulb.x, pulb.y);
        g.drawLine(pllb.x, pllb.y, plrb.x, plrb.y);
        g.drawLine(purb.x,purb.y, plrb.x, plrb.y);
        g.setColor(Color.BLACK);
        g.drawLine(pllb.x, pllb.y, pllf.x, pllf.y);
        g.drawLine(pulf.x, pulf.y, pulb.x, pulb.y);
        g.drawLine(purb.x,purb.y, purf.x, purf.y);
        g.drawLine(plrf.x, plrf.y, plrb.x, plrb.y);
    }

    float zoomFactor = 5;
    public void further() {
        ulf.z -= zoomFactor;
        urf.z -= zoomFactor;
        llf.z -= zoomFactor;
        lrf.z -= zoomFactor;
        ulb.z -= zoomFactor;
        urb.z -= zoomFactor;
        llb.z -= zoomFactor;
        lrb.z -= zoomFactor;

    }

    public void closer() {
        ulf.z += zoomFactor;
        urf.z += zoomFactor;
        llf.z += zoomFactor;
        lrf.z += zoomFactor;
        ulb.z += zoomFactor;
        urb.z += zoomFactor;
        llb.z += zoomFactor;
        lrb.z += zoomFactor;

    }

}