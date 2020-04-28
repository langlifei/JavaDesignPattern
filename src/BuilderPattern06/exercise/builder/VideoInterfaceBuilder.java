package BuilderPattern06.exercise.builder;

import BuilderPattern06.exercise.entity.VideoInterface;

public abstract class VideoInterfaceBuilder {
    protected VideoInterface videoInterface = new VideoInterface();

    public abstract void buildMainWindow();

    public abstract void buildMenu();

    public abstract void buildControlStrip();

    public abstract void buildCollectList();

    public abstract void buildPlayList();

    public VideoInterface create(){
        return this.videoInterface;
    }
}
