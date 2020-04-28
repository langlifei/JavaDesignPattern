package BuilderPattern06.example.controller;

import BuilderPattern06.example.builder.ActorBuilder;
import BuilderPattern06.example.entity.Actor;

public class ActorController {

    public Actor construct(ActorBuilder ab){
        ab.buildCostume();
        ab.buildFace();
        ab.buildHairstyle();
        ab.buildSex();
        ab.buildType();
        return ab.createActor();
    }
}
