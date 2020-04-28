package BuilderPattern06.example;

import BuilderPattern06.example.builder.ActorBuilder;
import BuilderPattern06.example.controller.ActorController;
import BuilderPattern06.example.entity.Actor;

public class Client {

    public static void main(String[] args) {
        ActorBuilder actorBuilder = (ActorBuilder) XMLUtil.getBean();
        ActorController actorController = new ActorController();
        Actor actor = actorController.construct(actorBuilder);
        System.out.println(actor);
    }


}
