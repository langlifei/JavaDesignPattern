package PrototypePattern05.example.product.concreteProduct;

import PrototypePattern05.example.product.OfficialDocument;

import java.util.Optional;

public class SRS implements OfficialDocument {
    @Override
    public OfficialDocument clone() {
        try {
            return (SRS)super.clone();
        } catch (CloneNotSupportedException e) {
            Optional.of("克隆失败......").ifPresent(System.out::println);
            return null;
        }
    }

    @Override
    public void display() {
        Optional.of("SRS克隆成功......."+this).ifPresent(System.out::println);
    }
}
