package BuilderPattern06.example.builder;

import BuilderPattern06.example.entity.Actor;

public abstract class ActorBuilder {

    protected Actor actor = new Actor();

    public abstract void buildType();

    public abstract void buildSex();

    public abstract void buildFace();

    public abstract void buildCostume();

    public abstract void buildHairstyle();

    public Actor createActor(){
        return this.actor;
    }
}
