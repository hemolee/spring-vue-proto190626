DROP TABLE IF EXISTS notices;
CREATE TABLE notices (
wtd_seq_no INT AUTO_INCREMENT PRIMARY KEY,
wtd_title VARCHAR(40) UNIQUE NOT NULL,
wtd_content1 VARCHAR(150) NOT NULL,
wtd_content2 VARCHAR(150) NOT NULL,
wtd_content3 VARCHAR(150) NOT NULL,
wtd_content4 VARCHAR(150) NOT NULL,
wtd_state VARCHAR(10) NOT NULL,
wtd_career VARCHAR(10) UNIQUE NOT NULL,
wtd_industry VARCHAR(20) NOT NULL,
wtd_start_date VARCHAR(20) NOT NULL,
wtd_last_date VARCHAR(20) NOT NULL,
wtd_tag1 VARCHAR(10) NOT NULL,
wtd_tag2 VARCHAR(10), 
wtd_tag2 VARCHAR(10)
)DEFAULT CHARSET=utf8;
insert into Notices(wtd_seq_no,wtd_title,wtd_content1,wtd_content2,wtd_content3,wtd_content4,
wtd_state,wtd_career,wtd_industry,wtd_start_date,wtd_last_date,sysdate,wtd_tag1,wtd_tag2,wtd_tag3) 
   values ('제목','내용1','내용2','내용3','진행중','신입','마케팅','190701','190705','태그1','태그2','태그3');

commit
