package com.dataman.student;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.ArrayList;

/**
 * @ClassName: StudentController
 * @Description:
 * @date 2017/12/19
 * @Copyright © 2017北京数人科技有限公司
 */
@Controller
public class BankController {

    @RequestMapping(value = "/v1/banks")
    public String getStudents(Model model){
        int totalMoney = 20000;
        int expenditure = 13000;
        ArrayList<Bank> banks = new ArrayList<>();
        Bank xm = new Bank();
        xm.setOderTime("2017/06/10");
        xm.setTotalMoney(totalMoney);
        xm.setExpenditure(expenditure);
        xm.setBalance(totalMoney-expenditure);

        Bank zs = new Bank();
        zs.setOderTime("2017/07/15");
        zs.setTotalMoney(xm.getBalance());
        zs.setExpenditure(200);
        zs.setIncome(16000);
        zs.setBalance(zs.getTotalMoney() - zs.getExpenditure() + zs.getIncome());

        Bank ls = new Bank();
        ls.setOderTime("2017/08/18");
        ls.setTotalMoney(zs.getBalance());
        ls.setExpenditure(300);
        ls.setBalance(ls.getTotalMoney() - ls.getExpenditure());

        banks.add(xm);
        banks.add(zs);
        banks.add(ls);
        model.addAttribute("banks",banks);
        return "bank";
    }
}
