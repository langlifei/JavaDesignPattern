package CompositePattern09.example.leaf;

import CompositePattern09.example.component.AbstractFile;

/**
 * @Author Zeng Zhuo
 * @Date 2020/4/30 10:55
 * @Describe
 */

public class TextFile implements AbstractFile {

    private String name;

    public TextFile(String name) {
        this.name = name;
    }

    @Override
    public void add(AbstractFile file) {
        System.out.println("非法操作");
    }

    @Override
    public void remove(AbstractFile file) {
        System.out.println("非法操作");
    }

    @Override
    public AbstractFile getChild(int i) {
        return null;
    }

    @Override
    public void killVirus() {
        System.out.println("对" +this.name+ " Text文件进行消毒....");
    }
}
