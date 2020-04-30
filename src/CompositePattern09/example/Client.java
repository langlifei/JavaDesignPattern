package CompositePattern09.example;

import BridgePattern08.exercise.action.File;
import CompositePattern09.example.component.AbstractFile;
import CompositePattern09.example.composite.Folder;
import CompositePattern09.example.leaf.ImageFile;
import CompositePattern09.example.leaf.TextFile;
import CompositePattern09.example.leaf.VideoFile;

/**
 * @Author Zeng Zhuo
 * @Date 2020/4/30 10:57
 * @Describe
 */

public class Client {

    public static void main(String[] args) {
        AbstractFile folder1 = new Folder("Sunny");
        AbstractFile folder2 = new Folder("图片");
        AbstractFile folder3 = new Folder("视频");
        AbstractFile folder4 = new Folder("文本");

        AbstractFile file1 = new ImageFile("小龙女.jpg");
        AbstractFile file2 = new ImageFile("张无忌.jpg");
        AbstractFile file3 = new ImageFile("杨过.jpg");

        AbstractFile file4 = new VideoFile("笑傲江湖.RMVB");
        AbstractFile file5 = new VideoFile("鬼吹灯.MP4");

        AbstractFile file6 = new TextFile("斗罗大陆.txt");
        AbstractFile file7 = new TextFile("斗破苍穹.txt");

        folder1.add(folder2);
        folder1.add(folder3);
        folder1.add(folder4);

        folder2.add(file1);
        folder2.add(file2);
        folder2.add(file3);

        folder3.add(file4);
        folder3.add(file5);

        folder4.add(file6);
        folder4.add(file7);

        folder1.killVirus();
    }
}
