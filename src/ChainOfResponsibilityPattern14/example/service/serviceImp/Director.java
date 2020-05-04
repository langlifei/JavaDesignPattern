package ChainOfResponsibilityPattern14.example.service.serviceImp;

import ChainOfResponsibilityPattern14.example.entity.PurchaseRequest;
import ChainOfResponsibilityPattern14.example.service.Allover;

/**
 * @Author Zeng Zhuo
 * @Date 2020/5/4 16:44
 * @Describe
 */

public class Director extends Allover {

    public Director(String name) {
        super(name);
    }

    @Override
    public void processRequest(PurchaseRequest request) {
        if(request.getAmount()<5000){
            System.out.println("主任 " + this.name + "审批采购单:" + request.getNumber());
        }else
            this.allover.processRequest(request);
    }
}
