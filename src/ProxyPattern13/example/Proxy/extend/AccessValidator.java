package ProxyPattern13.example.Proxy.extend;

/**
 * @Author Zeng Zhuo
 * @Date 2020/5/4 16:18
 * @Describe
 */

public class AccessValidator {

    public boolean validate(String userID){
        System.out.println(userID + "通过认证......");
        return true;
    }
}
