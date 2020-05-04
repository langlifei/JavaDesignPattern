package ProxyPattern13.example.service.serviceImp;

import ProxyPattern13.example.service.Searcher;

/**
 * @Author Zeng Zhuo
 * @Date 2020/5/4 16:14
 * @Describe
 */

public class RealSearcher implements Searcher {
    @Override
    public String doSearch(String userID, String password) {
        System.out.println("查找数据库,查找成功！");
        return "查找成功";
    }
}
