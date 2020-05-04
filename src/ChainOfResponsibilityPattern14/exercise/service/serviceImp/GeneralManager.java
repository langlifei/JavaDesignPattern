package ChainOfResponsibilityPattern14.exercise.service.serviceImp;

import ChainOfResponsibilityPattern14.exercise.entity.Vacation;
import ChainOfResponsibilityPattern14.exercise.service.Allover;

/**
 * @Author Zeng Zhuo
 * @Date 2020/5/4 17:16
 * @Describe
 */

public class GeneralManager extends Allover {

    public GeneralManager(String name) {
        super(name);
    }

    @Override
    public String approval(Vacation vacation) {
        if(vacation.getDays()<30){
            System.out.println("总经理:" + this.name + " 审批 " + vacation.getApplicant() + " 的假条,允许请假" + vacation.getDays()+"天");
            return "总经理审核通过";
        }else{
            return "审核不通过";
        }
    }
}
