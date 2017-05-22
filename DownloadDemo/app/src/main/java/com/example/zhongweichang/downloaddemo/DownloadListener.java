package com.example.zhongweichang.downloaddemo;

/**
 * Created by zhongweichang on 2017/5/19.
 */

public interface DownloadListener {
    void onProgress(int progress);
    void onSuccess();
    void onFailed();
    void onPaused();
    void onCanceled();
}
