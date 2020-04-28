package PrototypePattern05.example.product.concreteProduct;

import PrototypePattern05.example.product.OfficialDocument;

import java.util.Optional;

public class PPR implements OfficialDocument {
    @Override
    public OfficialDocument clone() {
        try {
            return (PPR)super.clone();
        } catch (CloneNotSupportedException e) {
            Optional.of("克隆失败......").ifPresent(System.out::println);
            return null;
        }
    }

    @Override
    public void display() {
        Optional.of("PPR克隆成功......."+this).ifPresent(System.out::println);
    }
}
