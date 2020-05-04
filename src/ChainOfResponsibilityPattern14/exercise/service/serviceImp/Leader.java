package ChainOfResponsibilityPattern14.exercise.service.serviceImp;

import ChainOfResponsibilityPattern14.example.entity.PurchaseRequest;
import ChainOfResponsibilityPattern14.exercise.entity.Vacation;
import ChainOfResponsibilityPattern14.exercise.service.Allover;

/**
 * @Author Zeng Zhuo
 * @Date 2020/5/4 17:06
 * @Describe
 */

public class Leader extends Allover {

    public Leader(String name) {
        super(name);
    }

    @Override
    public String approval(Vacation vacation) {
        if(vacation.getDays()<10){
            System.out.println("经理:" + this.name + " 审批 " + vacation.getApplicant() + " 的假条,允许请假" + vacation.getDays()+"天");
            return "经理审核通过";
        }else{
            return this.allover.approval(vacation);
        }
    }
}
