package com.kaishengit.service;

import com.kaishengit.mapper.DocumentMapper;
import com.kaishengit.pojo.Document;
import com.kaishengit.util.ShiroUtil;
import org.apache.commons.io.FileUtils;
import org.apache.commons.io.IOUtils;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.transaction.annotation.Transactional;

import javax.inject.Inject;
import javax.inject.Named;
import java.io.*;
import java.util.List;
import java.util.UUID;

@Named
public class DocumentService {
    @Value("${imagePath}")
    private String savePath;

    @Inject
    private DocumentMapper documentMapper;

    public List<Document> findDocumentByFid(Integer fid) {
        return documentMapper.findByFid(fid);
    }

    public void saveDir(String name, Integer fid) {
        Document document = new Document();
        document.setName(name);
        document.setFid(fid);
        document.setCreateuser(ShiroUtil.getCurrentRealName());
        document.setType(Document.TYPE_DIR);
        documentMapper.save(document);
    }

    @Transactional
    public void saveFile(InputStream inputStream, String originalFilename, String contentType, long size, Integer fid){
        String extName="";
        if (originalFilename.lastIndexOf(".")!=-1){
            extName = originalFilename.substring(originalFilename.lastIndexOf("."));
        }
        String newFileName = UUID.randomUUID().toString()+extName;
        try {
            FileOutputStream outputStream = new FileOutputStream(new File(savePath,newFileName));
            IOUtils.copy(inputStream,outputStream);
            outputStream.flush();
            outputStream.close();
            inputStream.close();
        }catch (Exception e){
            e.printStackTrace();
            throw new RuntimeException(e);
        }

        Document document = new Document();
        document.setName(originalFilename);
        document.setFid(fid);
        document.setType(Document.TYPE_DOC);
        document.setCreateuser(ShiroUtil.getCurrentRealName());
        document.setContexttype(contentType);
        document.setSize(FileUtils.byteCountToDisplaySize(size));
        document.setFilename(newFileName);
        documentMapper.save(document);
    }
    /**
     * 根据ID获取文件
     */
    public Document findDocumentById(Integer id) {
        return documentMapper.findById(id);
    }
}
