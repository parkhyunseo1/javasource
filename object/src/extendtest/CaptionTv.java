<<<<<<< HEAD
package extendtest;

public class CaptionTv extends Tv {
    private boolean caption;

    void displayCaption(String text) {
        if (caption) {
            System.out.println(text);
        }
    }

    public boolean isCaption() {
        return caption;
    }

    public void setCaption(boolean caption) {
        this.caption = caption;
    }

}
=======
package extendtest;

public class CaptionTv extends Tv {
    private boolean caption;

    void displayCaption(String text) {
        if (caption) {
            System.out.println(text);
        }
    }

    public boolean isCaption() {
        return caption;
    }

    public void setCaption(boolean caption) {
        this.caption = caption;
    }

}
>>>>>>> ce0a999417578a8be48c26f5566072d556a7963e
