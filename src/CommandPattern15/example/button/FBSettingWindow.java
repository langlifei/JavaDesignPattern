package CommandPattern15.example.button;

import java.util.ArrayList;
import java.util.List;

/**
 * @Author Zeng Zhuo
 * @Date 2020/5/5 12:56
 * @Describe
 */

public class FBSettingWindow {

    private String title;
    private List<FunctionButton> arrayList;

    public FBSettingWindow(String title) {
        this.title = title;
        this.arrayList = new ArrayList<>();
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public void addFunctionButton(FunctionButton functionButton){
        this.arrayList.add(functionButton);
    }

    public void removeFunctionButton(FunctionButton functionButton){
        this.arrayList.remove(functionButton);
    }

    public void display(){
        System.out.println("显示窗口:功能键设置");
        System.out.println(this.title);
        for (FunctionButton f:this.arrayList) {
            System.out.println(f.getName());
        }
    }
}
