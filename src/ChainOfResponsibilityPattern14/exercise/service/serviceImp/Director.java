package ChainOfResponsibilityPattern14.exercise.service.serviceImp;

import ChainOfResponsibilityPattern14.exercise.entity.Vacation;
import ChainOfResponsibilityPattern14.exercise.service.Allover;

/**
 * @Author Zeng Zhuo
 * @Date 2020/5/4 17:08
 * @Describe
 */

public class Director extends Allover {

    public Director(String name) {
        super(name);
    }

    @Override
    public String approval(Vacation vacation) {
        if(vacation.getDays()<3){
            System.out.println("主任:" + this.name + " 审批 " + vacation.getApplicant() + " 的假条,允许请假" + vacation.getDays()+"天");
            return "主任审核通过";
        }else{
            return this.allover.approval(vacation);
        }
    }
}
