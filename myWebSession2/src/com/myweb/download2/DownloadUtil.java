package com.myweb.download2;

import java.io.UnsupportedEncodingException;
import java.util.Base64;
public class DownloadUtil {
    public static String base64EncodeFileName(String fileName) {
//        Base64 base64 = new Base64();
        try {
            return "=?UTF-8?B?"
                    + Base64.getEncoder().encodeToString(fileName
                    .getBytes("UTF-8")) + "?=";
//            return Base64.getEncoder().encodeToString(fileName.getBytes("utf-8"));
        } catch (UnsupportedEncodingException e) {
            e.printStackTrace();
            throw new RuntimeException(e);
        }
    }
}
