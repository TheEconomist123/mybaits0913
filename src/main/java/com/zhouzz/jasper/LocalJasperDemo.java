package com.zhouzz.jasper;

import net.sf.jasperreports.engine.*;
import org.springframework.core.io.ClassPathResource;

import java.io.*;
import java.util.HashMap;
import java.util.Map;

/**
 * @author zzz
 * @version 1.0
 * @date 2024-09-12 15:15
 * @desc
 */
public class LocalJasperDemo {

    public static void main(String[] args) throws JRException, IOException {
        long start = System.currentTimeMillis();
        ClassPathResource cpr = new ClassPathResource("templates/head_charge_off_inform.jasper");
        Map params = new HashMap();

      /*  params.put("dealStatus","已成交");
        params.put("dealDtTm","2024-07-02 16:24:13");
        params.put("dealNo","TD20240702000507");
        params.put("buyBrchName","徽商银行股份有限公司");
        params.put("saleBrchName","中国工商银行股份有限公司北京市分行");
        params.put("buyTraderName1","杜奕");
        params.put("buyTraderName2","工行北京分行1");
        params.put("buyTraderNo1","HS0015655");
        params.put("buyTraderNo2","ghbjfh1");
        params.put("phone1","15385519575");
        params.put("phone2","010-66410055");
        params.put("custFax1","0551-62667810");
        params.put("custFax2","010-66411058");
        params.put("transCorpReg1","严琛");
        params.put("transCorpReg2","王珍军");
        params.put("address1","安徽省合肥市云谷路1699号徽银大厦");
        params.put("address2","北京市西城区复兴门南大街2号天银大厦B座");
        params.put("totalAmt","2,800.00");
        params.put("billType","银票");
        params.put("firstPayInterest","137.20");
        params.put("billClass","电票");
        params.put("firstSettleAmt","2,662.80");
        params.put("firstSettleDt","2024-07-02");
        params.put("ratePct","36.0000%");
        params.put("settleMode","票款对付（DVP）");
        params.put("yieldRatepct","37.8549%");
        params.put("clearType","全额清算");
        params.put("tenorDays","49天");
        params.put("setTm","20:32:00");
        params.put("getTotalNum","1");
        params.put("drweBrchName","徽商银行股份有限公司合肥分行");
        params.put("drweBrchCode","319361002003");
        params.put("drweFundAcctName","徽商银行股份有限公司合肥分行");
        params.put("drweFundAcctNo","319361002003");
        params.put("drweTrstAcctName","徽商银行股份有限公司合肥分行");
        params.put("drweTrstAcctNo","C221000173400000031000");
        params.put("rcvBrchName","中国工商银行股份有限公司北京市分行");
        params.put("rcvBrchCode","102100009980");
        params.put("pyeeFundAcctName","中国工商银行股份有限公司北京市分行");
        params.put("rcvFundAcctNo","102100009980");
        params.put("pyeeTrstAcctName","中国工商银行股份有限公司北京市分行");
        params.put("pyeeTrstAcctNo","C221000011100000296000");*/

        JasperPrint jasperPrint = JasperFillManager.fillReport(cpr.getInputStream(), params, new JREmptyDataSource());
        OutputStream outputStream = new FileOutputStream(new File("c://11112222.pdf"));
        JasperExportManager.exportReportToPdfStream(jasperPrint, outputStream);

        long end = System.currentTimeMillis();

        System.out.println("合成文件耗时："+(end-start)+"ms");




    }
}
