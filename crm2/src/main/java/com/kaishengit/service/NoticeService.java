package com.kaishengit.service;

import com.kaishengit.mapper.NoticeMapper;
import com.kaishengit.pojo.Notice;
import com.kaishengit.util.ShiroUtil;
import org.apache.commons.io.IOUtils;
import org.springframework.beans.factory.annotation.Value;

import javax.inject.Inject;
import javax.inject.Named;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.List;
import java.util.Map;
import java.util.UUID;

@Named
public class NoticeService {
    @Inject
    private NoticeMapper noticeMapper;

    @Value("${imagePath}")
    private String imageSavePath;
    /**
     * 保存公告
     * @param notice
     */
    public void saveNotice(Notice notice) {
        notice.setUserid(ShiroUtil.getCurrentUserId());
        notice.setRealname(ShiroUtil.getCurrentRealName());
        noticeMapper.save(notice);
    }

    public List<Notice> findByParam(Map<String, Object> param) {
        return noticeMapper.findByParam(param);
    }

    public Long count() {
        return noticeMapper.count();
    }

    public Notice findNoticeById(Integer id) {
        return noticeMapper.findById(id);
    }

    public String saveImage(InputStream inputStream, String fileName) throws IOException {
        String extName = fileName.substring(fileName.lastIndexOf("."));
        String newFileName = UUID.randomUUID().toString();
        FileOutputStream outputStream = new FileOutputStream(new File(imageSavePath,newFileName));
        IOUtils.copy(inputStream,outputStream);
        outputStream.flush();
        outputStream.close();
        inputStream.close();
        return "/preview/"+newFileName;
    }
}
