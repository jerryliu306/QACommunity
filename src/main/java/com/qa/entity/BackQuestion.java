package com.qa.entity;

import java.util.ArrayList;
import java.util.Date;

/**
 * Create by xuanhao on 2017/12/13
 */
public class BackQuestion {
    private int quesId;
    private String quesTitle;
    private String quesDetail;
    private String[] labels;
    private Date createDate;
    private int toId;
    private String topicName;
    private String account;
    private String accountName;

    public int getQuesId() {
        return quesId;
    }

    public void setQuesId(int qId) {
        this.quesId = qId;
    }

    public String getQuesTitle() {
        return quesTitle;
    }

    public void setQuesTitle(String qTitle) {
        this.quesTitle = qTitle;
    }

    public String getQuesDetail() {
        return quesDetail;
    }

    public void setQuesDetail(String qDetail) {
        this.quesDetail = qDetail;
    }

    public String[] getLabels() {
        return labels;
    }

    public void setLabels(String[] labels) {
        this.labels = labels;
    }

    public Date getCreateDate() {
        return createDate;
    }

    public void setCreateDate(Date createDate) {
        this.createDate = createDate;
    }

    public int getToId() {
        return toId;
    }

    public void setToId(int toId) {
        this.toId = toId;
    }

    public String getTopicName() {
        return topicName;
    }

    public void setTopicName(String topicName) {
        this.topicName = topicName;
    }

    public String getAccount() {
        return account;
    }

    public void setAccount(String account) {
        this.account = account;
    }

    public String getAccountName() {
        return accountName;
    }

    public void setAccountName(String accountName) {
        this.accountName = accountName;
    }

}