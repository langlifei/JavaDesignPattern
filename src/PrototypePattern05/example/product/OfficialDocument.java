package PrototypePattern05.example.product;

public interface OfficialDocument extends Cloneable {

    OfficialDocument clone();
    void display();
}
