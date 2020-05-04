package ChainOfResponsibilityPattern14.example.service.serviceImp;

import ChainOfResponsibilityPattern14.example.entity.PurchaseRequest;
import ChainOfResponsibilityPattern14.example.service.Allover;

/**
 * @Author Zeng Zhuo
 * @Date 2020/5/4 16:45
 * @Describe
 */

public class Congress extends Allover {

    public Congress(String name) {
        super(name);
    }

    @Override
    public void processRequest(PurchaseRequest request) {
        System.out.println("召开董事会 审批采购单:" + request.getNumber());
    }
}
