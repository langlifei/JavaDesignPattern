package CompositePattern09.example.component;

/**
 * @Author Zeng Zhuo
 * @Date 2020/4/30 10:37
 * @Describe
 */

public interface AbstractFile {

    void add(AbstractFile file);
    void remove(AbstractFile file);
    AbstractFile getChild(int i);
    void killVirus();
}
