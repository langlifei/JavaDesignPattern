package CompositePattern09.example.composite;

import CompositePattern09.example.component.AbstractFile;

import java.util.ArrayList;
import java.util.List;

/**
 * @Author Zeng Zhuo
 * @Date 2020/4/30 10:45
 * @Describe
 */

public class Folder implements AbstractFile {

    private List<AbstractFile> fileList;
    private String name;

    public Folder(String name){
        this.name = name;
        this.fileList = new ArrayList<>();
    }

    @Override
    public void add(AbstractFile file) {
        this.fileList.add(file);
    }

    @Override
    public void remove(AbstractFile file) {
        this.fileList.remove(file);
    }

    @Override
    public AbstractFile getChild(int i) {
        return this.fileList.get(i);
    }

    @Override
    public void killVirus() {
        System.out.println("对" + this.name + "文件夹进行消毒.....");
        for (AbstractFile f : this.fileList)
                f.killVirus();
    }

}
