import java.awt.*;

class Vector3D {
    public float x, y, z;

    public Vector3D(float x, float y, float z) {
        this.x = x;
        this.y = y;
        this.z = z;
    }

    public String toString() {
        return "(" + x + "," + y + "," + z + ")";
    }

    public Point to2D(float distance,float rotX, float rotY, float rotZ, int width, int height) {

        Vector3D v = new Vector3D(x, y, z);
        rotateVector(rotY, -rotX, rotZ);

        Point p;
        float Z = distance + v.z;
        p = new Point((int) (distance * v.x / Z), (int) (distance * v.y / Z));


        p.x += width / 2;
        p.y += height / 2;

        return p;
    }
    public void rotateVector(float thetaX, float thetaY, float thetaZ) {
        float aX, aY, aZ;

        float camX = 0;
        float camY = 0;
        float camZ = 0;

        aX = x;
        aY = y;
        aZ = z;


        aY = y;
        aZ = z;

        //p[i][x] = px;
        y = (float) ((aY-camY)*Math.cos(thetaX)-(aZ-camZ)*Math.sin(thetaX));
        z = (float) ((aY-camY)*Math.sin(thetaX)+(aZ-camZ)*Math.cos(thetaX));

        aX = x;
        aZ = z;

        x = (float) ((aX-camX)*Math.cos(thetaY)+(aZ-camZ)*Math.sin(thetaY));
        //p[i][y]= py;
        z = (float) (-(aX-camX)*Math.sin(thetaY)+(aZ-camZ)*Math.cos(thetaY));

        aY = y;
        aX = x;

        x = (float) ((aX-camX)*Math.cos(thetaZ)-(aY-camY)*Math.sin(thetaZ));
        y = (float) ((aY-camY)*Math.cos(thetaZ)+(aX-camX)*Math.sin(thetaZ));

    }
}