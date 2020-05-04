package ChainOfResponsibilityPattern14.example;

import ChainOfResponsibilityPattern14.example.entity.PurchaseRequest;
import ChainOfResponsibilityPattern14.example.service.Allover;
import ChainOfResponsibilityPattern14.example.service.serviceImp.Congress;
import ChainOfResponsibilityPattern14.example.service.serviceImp.Director;
import ChainOfResponsibilityPattern14.example.service.serviceImp.President;
import ChainOfResponsibilityPattern14.example.service.serviceImp.VicePresident;

/**
 * @Author Zeng Zhuo
 * @Date 2020/5/4 16:39
 * @Describe  有客户端来负责供应链的构造
 */

public class Client {

    public static void main(String[] args) {
        Allover director,vicePresident,president,congress;
        director = new Director("张三");
        vicePresident = new VicePresident("李四");
        president = new President("王五");
        congress = new Congress("董事会");
        //构造供应链的顺序
        director.setAllover(vicePresident);
        vicePresident.setAllover(president);
        president.setAllover(congress);
        director.processRequest(new PurchaseRequest(30000,123,"采购图书...."));
    }
}
