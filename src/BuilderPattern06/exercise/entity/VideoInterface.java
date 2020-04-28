package BuilderPattern06.exercise.entity;

public class VideoInterface {

    private String mainWindow;
    private String menu;
    private String controlStrip;
    private String collectList;
    private String playList;

    public String getMainWindow() {
        return mainWindow;
    }

    public void setMainWindow(String mainWindow) {
        this.mainWindow = mainWindow;
    }

    public String getMenu() {
        return menu;
    }

    public void setMenu(String menu) {
        this.menu = menu;
    }

    public String getControlStrip() {
        return controlStrip;
    }

    public void setControlStrip(String controlStrip) {
        this.controlStrip = controlStrip;
    }

    public String getCollectList() {
        return collectList;
    }

    public void setCollectList(String collectList) {
        this.collectList = collectList;
    }

    public String getPlayList() {
        return playList;
    }

    public void setPlayList(String playList) {
        this.playList = playList;
    }

    @Override
    public String toString() {
        return "VideoInterface{" +
                "mainWindow='" + mainWindow + '\'' +
                ", menu='" + menu + '\'' +
                ", controlStrip='" + controlStrip + '\'' +
                ", collectList='" + collectList + '\'' +
                ", playList='" + playList + '\'' +
                '}';
    }
}
