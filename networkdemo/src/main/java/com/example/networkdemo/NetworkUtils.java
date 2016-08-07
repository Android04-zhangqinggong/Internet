package com.example.networkdemo;

import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.InputStream;

/**
 * 和网络操作有关的工具类
 * Created by Administrator on 2016/8/1.
 */
public class NetworkUtils {
    public static String readStream(InputStream inputStream) throws IOException {
        // 定义一个输出流
        ByteArrayOutputStream bos = new ByteArrayOutputStream();

        int len;
        byte[] buffer = new byte[1024];
        while ((len = inputStream.read(buffer)) != -1) {
            bos.write(buffer,0, len);
        }

        return new String(bos.toByteArray());
    }
}
