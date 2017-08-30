package com.party.entity;

import lombok.Data;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 * Created by guhao on 2017/8/24.
 */
@Data
@Entity
@Table(name = "MessageTable")
public class MessageInformation {
    @Id
    @Column(name = "messageId", nullable = false)
    private int messageId;
    @Column(name = "messageSendId", nullable = true, length = 10)
    private String messageSendId;
    @Column(name = "messageReceiveId", nullable = true, length = 10)
    private String messageReceiveId;
    @Column(name = "messageContent", nullable = true, length = 255)
    private String messageContent;
    @Column(name = "messageTime", nullable = true, length = 255)
    private String messageTime;
    @Column(name = "messageState", nullable = true, length = 255)
    private String messageState;
}
