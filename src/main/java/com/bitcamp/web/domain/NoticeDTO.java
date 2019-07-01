package com.bitcamp.web.domain;

import org.springframework.context.annotation.Lazy;
import org.springframework.stereotype.Component;

import lombok.Data;

@Data
@Component
@Lazy
public class NoticeDTO {
        
   private String noticeNumber, title,
   content1,content2,content3,content4,state,career,industry,start_date,last_dates,
   sysdate,tag1,tag2,tag3;
}