package PrototypePattern05.example.product.concreteProduct;

import PrototypePattern05.example.product.OfficialDocument;

import java.util.Optional;

public class FAR implements OfficialDocument {

    /*
            调用父类方法实现浅复制....
     */
    @Override
    public OfficialDocument clone() {
        try {
            return (FAR) super.clone();
        } catch (CloneNotSupportedException e) {
            Optional.of("克隆失败......").ifPresent(System.out::println);
            return null;
        }
    }

    @Override
    public void display() {
        Optional.of("FAR克隆成功......."+this).ifPresent(System.out::println);
    }
}
