package BuilderPattern06.exercise;

import BuilderPattern06.example.builder.ActorBuilder;
import BuilderPattern06.example.controller.ActorController;
import BuilderPattern06.example.entity.Actor;
import BuilderPattern06.exercise.builder.VideoInterfaceBuilder;
import BuilderPattern06.exercise.controller.VideoInterfaceController;
import BuilderPattern06.exercise.entity.VideoInterface;

public class Client {

    public static void main(String[] args) {
        VideoInterfaceBuilder videoInterfaceBuilder = (VideoInterfaceBuilder) XMLUtil.getBean();
        VideoInterfaceController videoInterfaceController = new VideoInterfaceController();
        VideoInterface videoInterface = videoInterfaceController.construct(videoInterfaceBuilder);
        System.out.println(videoInterface);
    }


}
