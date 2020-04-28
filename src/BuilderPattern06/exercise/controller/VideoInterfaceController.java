package BuilderPattern06.exercise.controller;

import BuilderPattern06.exercise.builder.VideoInterfaceBuilder;
import BuilderPattern06.exercise.entity.VideoInterface;

public class VideoInterfaceController {

    public VideoInterface construct(VideoInterfaceBuilder VID){
        VID.buildCollectList();
        VID.buildControlStrip();
        VID.buildMainWindow();
        VID.buildMenu();
        VID.buildPlayList();
        return VID.create();
    }
}
