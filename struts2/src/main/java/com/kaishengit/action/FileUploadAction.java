package com.kaishengit.action;

import org.apache.commons.io.IOUtils;

import java.io.*;
import java.util.List;

public class FileUploadAction extends BaseAction {

    private String name;
    private List<File> photo;
    private List<String> photoFileName;
    private List<String> photoContentType;

    private String downloadType;
    private String donwloadFileName;
    private Long downloadFileSize;

    @Override
    public String execute() throws Exception {
        return SUCCESS;
    }

    /**
     * 上传
     * @return
     * @throws IOException
     */
    public String upload() throws IOException {
        for (int i=0;i<photo.size();i++){
            System.out.println("Name:"+name);
            System.out.println("photo:"+photo.get(i).getName());
            System.out.println("PhotoFileName:" + photoFileName.get(i));
            System.out.println("PhotoContentType:" + photoContentType.get(i));
            FileInputStream inputStream = new FileInputStream(photo.get(i));
            FileOutputStream outputStream = new FileOutputStream("D:/"+photo.get(i).getName());
            IOUtils.copy(inputStream,outputStream);
            outputStream.flush();
            outputStream.close();
            inputStream.close();
        }
        return SUCCESS;
    }

    /**
     * 下载
     * @return
     */

    public String download(){
        File file = new File("D:/Windows_Insider_Anniversary-Ninjacat-800x1280-zh-CN.jpg");
        downloadType="image/jpg";
        donwloadFileName = "Windows_Insider_Anniversary-Ninjacat-800x1280-zh-CN";
        downloadFileSize = file.length();
        return SUCCESS;
    }
    public InputStream getInputStream() throws FileNotFoundException {
        return new FileInputStream(new File("D:/Windows_Insider_Anniversary-Ninjacat-800x1280-zh-CN.jpg"));
    }

    //getter and setter

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<File> getPhoto() {
        return photo;
    }

    public void setPhoto(List<File> photo) {
        this.photo = photo;
    }

    public List<String> getPhotoFileName() {
        return photoFileName;
    }

    public void setPhotoFileName(List<String> photoFileName) {
        this.photoFileName = photoFileName;
    }

    public List<String> getPhotoContentType() {
        return photoContentType;
    }

    public void setPhotoContentType(List<String> photoContentType) {
        this.photoContentType = photoContentType;
    }

    public String getDownloadType() {
        return downloadType;
    }

    public void setDownloadType(String downloadType) {
        this.downloadType = downloadType;
    }

    public String getDonwloadFileName() {
        return donwloadFileName;
    }

    public void setDonwloadFileName(String donwloadFileName) {
        this.donwloadFileName = donwloadFileName;
    }

    public Long getDownloadFileSize() {
        return downloadFileSize;
    }

    public void setDownloadFileSize(Long downloadFileSize) {
        this.downloadFileSize = downloadFileSize;
    }
}
