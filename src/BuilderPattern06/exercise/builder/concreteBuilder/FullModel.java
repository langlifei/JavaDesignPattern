package BuilderPattern06.exercise.builder.concreteBuilder;

import BuilderPattern06.exercise.builder.VideoInterfaceBuilder;

public class FullModel extends VideoInterfaceBuilder {
    @Override
    public void buildMainWindow() {
        videoInterface.setMainWindow("主窗口");
    }

    @Override
    public void buildMenu() {
        videoInterface.setMenu("菜单");
    }

    @Override
    public void buildControlStrip() {
        videoInterface.setControlStrip("控制条");
    }

    @Override
    public void buildCollectList() {

    }

    @Override
    public void buildPlayList() {
        videoInterface.setPlayList("播放列表");
    }
}
