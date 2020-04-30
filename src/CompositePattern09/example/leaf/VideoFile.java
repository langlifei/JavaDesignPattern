package CompositePattern09.example.leaf;

import CompositePattern09.example.component.AbstractFile;

/**
 * @Author Zeng Zhuo
 * @Date 2020/4/30 10:54
 * @Describe
 */

public class VideoFile implements AbstractFile {

    private String name;

    public VideoFile(String name) {
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
        System.out.println("对" +this.name+ " Video文件进行消毒....");
    }
}
