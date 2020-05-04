package ProxyPattern13.example.Proxy;

import ProxyPattern13.example.Proxy.extend.AccessValidator;
import ProxyPattern13.example.Proxy.extend.Logger;
import ProxyPattern13.example.service.Searcher;
import ProxyPattern13.example.service.serviceImp.RealSearcher;

/**
 * @Author Zeng Zhuo
 * @Date 2020/5/4 16:15
 * @Describe
 */

public class ProxySearcher implements Searcher {
    private Searcher searcher;
    private AccessValidator validator;
    private Logger logger;

    public ProxySearcher() {
        this.searcher = new RealSearcher();
    }

    public boolean validate(String userID){
        this.validator = new AccessValidator();
        return validator.validate(userID);
    }

    public void logger(String userID){
        this.logger = new Logger();
        logger.log(userID);
    }


    //在代理类中对其添加额外的功能。。。。。
    @Override
    public String doSearch(String userID, String password) {
        if(this.validate(userID)){
            String result = searcher.doSearch(userID,password);
            this.logger(userID);
            return result;
        }else
            return null;
    }
}
