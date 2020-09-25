import java.awt.Graphics;
import java.awt.Color;
import java.awt.Polygon;

public class Art {

    public static void main(String[] args) {
        jacksonPollock();
        emptySpace();
    }

    public static void jacksonPollock() {
        final int WIDTH = 1280;
        final int HEIGHT = 720;
        DrawingPanel dp = new DrawingPanel(WIDTH, HEIGHT);
        Graphics g = dp.getGraphics();
        dp.setBackground(Color.BLACK);
        for (int i=0; i < (int) (Math.random()*100000); i++ ) {
            g.setColor(Color.RED);
            g.drawLine((int) (Math.random() * WIDTH),(int) (Math.random() * HEIGHT),
                    (int) (Math.random() * WIDTH),(int) (Math.random() * HEIGHT));
        }
        for (int i=0; i < (int) (Math.random()*100000); i++ ) {
            g.setColor(Color.GREEN);
            g.drawLine((int) (Math.random() * WIDTH), (int) (Math.random() * HEIGHT),
                    (int) (Math.random() * WIDTH), (int) (Math.random() * HEIGHT));
        }
        for (int i=0; i < (int) (Math.random()*100000); i++ ) {
            g.setColor(Color.BLUE);
            g.drawLine((int) (Math.random() * WIDTH),(int) (Math.random() * HEIGHT),
                    (int) (Math.random() * WIDTH),(int) (Math.random() * HEIGHT));
        }
        for (int i=0; i < (int) (Math.random()*100000); i++ ) {
            g.setColor(Color.GRAY);
            g.fillRect((int) (Math.random() * WIDTH), (int) (Math.random() * HEIGHT),
                    13, 7);
        }
        for (int i=0; i < (int) (Math.random()*100000); i++ ) {
            g.setColor(Color.WHITE);
            int sameNum = (int) (Math.random() * 10);
            g.fillOval((int) (Math.random() * WIDTH), (int) (Math.random() * HEIGHT),
                    sameNum, sameNum);
        }
    }

    private static void emptySpace() {
        final int WIDTH = 1280;
        final int HEIGHT = 720;
        DrawingPanel dp = new DrawingPanel(WIDTH, HEIGHT);
        Graphics g = dp.getGraphics();
        dp.setBackground(Color.BLACK);
        final int MAXIMUM = 4000;
        final int MINIMUM = 2000;
        int bigRandomNumber = MINIMUM + ((int) (Math.random() * (MAXIMUM - MINIMUM)));
        System.out.println("Big random number = " + bigRandomNumber);
        for (int redLine=0; redLine < bigRandomNumber; redLine++ ) {
            g.setColor(Color.RED);
            int randomWidth = (int) (Math.random() * WIDTH);
            int randomHeight = (int) (Math.random() * HEIGHT);
            g.drawLine(randomWidth,randomHeight,randomWidth,randomHeight);
        }
        for (int greenLine=0; greenLine < bigRandomNumber; greenLine++ ) {
            g.setColor(Color.CYAN);
            int randomWidth = (int) (Math.random() * WIDTH);
            int randomHeight = (int) (Math.random() * HEIGHT);
            g.drawLine(randomWidth, randomHeight, randomWidth, randomHeight);
        }
        for (int blueLine=0; blueLine < bigRandomNumber; blueLine++ ) {
            g.setColor(Color.BLUE);
            int randomWidth = (int) (Math.random() * WIDTH);
            int randomHeight = (int) (Math.random() * HEIGHT);
            g.drawLine(randomWidth, randomHeight, randomWidth, randomHeight);
        }
        for (int circle=0; circle < bigRandomNumber; circle++ ) {
            g.setColor(Color.WHITE);
            int randomWidth = (int) (Math.random() * WIDTH);
            int randomHeight = (int) (Math.random() * HEIGHT);
            int sameNum = (int) (Math.random() * 3);
            g.fillOval(randomWidth, randomHeight, sameNum, sameNum);
        }
        g.setColor(Color.WHITE);
        Polygon starMan = new Polygon();
        starMan.addPoint(565,165);
        starMan.addPoint(565,245);
        starMan.addPoint(557,246);
        starMan.addPoint(557,269);
        starMan.addPoint(548,269);
        starMan.addPoint(548,325);
        starMan.addPoint(554,325);
        starMan.addPoint(554,323);
        starMan.addPoint(572,333);
        starMan.addPoint(572,325);
        starMan.addPoint(579,325);
        starMan.addPoint(581,380);
        starMan.addPoint(619,380);
        starMan.addPoint(619,374);
        starMan.addPoint(612,373);
        starMan.addPoint(612,325);
        starMan.addPoint(629,325);
        starMan.addPoint(629,380);
        starMan.addPoint(667,381);
        starMan.addPoint(667,375);
        starMan.addPoint(661,373);
        starMan.addPoint(660,326);
        starMan.addPoint(668,326);
        starMan.addPoint(669,330);
        starMan.addPoint(683,334);
        starMan.addPoint(685,326);
        starMan.addPoint(693,325);
        starMan.addPoint(692,270);
        starMan.addPoint(684,269);
        starMan.addPoint(684,260);
        starMan.addPoint(675,260);
        starMan.addPoint(675,250);
        starMan.addPoint(670,250);
        starMan.addPoint(670,245);
        starMan.addPoint(660,245);
        starMan.addPoint(660,190);
        starMan.addPoint(653,190);
        starMan.addPoint(652,165);
        g.fillPolygon(starMan);
        g.setColor(Color.BLACK);
        g.fillOval(598,218,55,54);
        g.setColor(Color.WHITE);
        g.fillOval(625,220,13,13);
        g.fillRect(552,320,15,15);
        g.setColor(Color.BLACK);
        g.fillRect(573,276,5,55);
        g.fillRect(660,277,6,55);
        g.setColor(Color.RED);
        g.fillRect(548,253,28,20);
        g.setColor(Color.BLUE);
        g.fillRect(548,253,14,12);
        g.setColor(Color.LIGHT_GRAY);
        g.fillRect(578,315,80,3);
        g.fillRect(580,165,70,45);
        g.fillRect(580,165,10,85);
        g.fillRect(590,210,10,10);
        g.drawRect(592,279,60,25);
        g.fillOval(631,284,5,5);
        g.setColor(Color.ORANGE);
        g.fillOval(610,284,5,5);
    }

}
