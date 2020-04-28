package BuilderPattern06.exercise.builder.concreteBuilder;

import BuilderPattern06.exercise.builder.VideoInterfaceBuilder;

public class MemoryModel extends VideoInterfaceBuilder {
    @Override
    public void buildMainWindow() {
       videoInterface.setMainWindow("主窗口");
    }

    @Override
    public void buildMenu() {

    }

    @Override
    public void buildControlStrip() {
        videoInterface.setControlStrip("控制条");
    }

    @Override
    public void buildCollectList() {
        videoInterface.setCollectList("收藏列表");
    }

    @Override
    public void buildPlayList() {

    }
}
