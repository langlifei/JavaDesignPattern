package ChainOfResponsibilityPattern14.example.service.serviceImp;

import ChainOfResponsibilityPattern14.example.entity.PurchaseRequest;
import ChainOfResponsibilityPattern14.example.service.Allover;

/**
 * @Author Zeng Zhuo
 * @Date 2020/5/4 16:46
 * @Describe
 */

public class VicePresident extends Allover {

    public VicePresident(String name) {
        super(name);
    }

    @Override
    public void processRequest(PurchaseRequest request) {
        if(request.getAmount()<10000){
            System.out.println("副校长 " + this.name + "审批采购单:" + request.getNumber());
        }else
            this.allover.processRequest(request);
    }
}
