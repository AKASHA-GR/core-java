class TennisBallRunner {
    public static void main(String[] args) {

        TennisBall ball = new TennisBall();

        ball.bounce();
        ball.roll();
        ball.hit();
        ball.spin();
        ball.inflate();
        ball.deflate();
        ball.checkPressure();
        ball.changeColor();
        ball.clean();
        ball.displayInfo();
        ball.isNew();
        ball.isUsed();
        ball.checkWeight();
        ball.checkSize();
        ball.pack();

        TennisBall.manufacture();
        TennisBall.qualityCheck();
        TennisBall.ship();
        TennisBall.store();
        TennisBall.recycle();

        System.out.println("");

        TennisBall ball1 = new TennisBall();

        ball1.bounce();
        ball1.roll();
        ball1.hit();
        ball1.spin();
        ball1.inflate();
        ball1.deflate();
        ball1.checkPressure();
        ball1.changeColor();
        ball1.clean();
        ball1.displayInfo();
        ball1.isNew();
        ball1.isUsed();
        ball1.checkWeight();
        ball1.checkSize();
        ball1.pack();

        TennisBall.manufacture();
        TennisBall.qualityCheck();
        TennisBall.ship();
        TennisBall.store();
        TennisBall.recycle();
    }
}