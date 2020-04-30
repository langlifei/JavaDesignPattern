package CompositePattern09.example.leaf;

import CompositePattern09.example.component.AbstractFile;

/**
 * @Author Zeng Zhuo
 * @Date 2020/4/30 10:52
 * @Describe
 */

public class ImageFile implements AbstractFile {
    private String name;

    public ImageFile(String name) {
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
        System.out.println("对" +this.name+ " Image文件进行消毒....");
    }
}
