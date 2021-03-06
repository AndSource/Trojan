package me.ele.trojan.record;

import java.io.File;
import java.util.List;

import me.ele.trojan.listener.PrepareUploadListener;

/**
 * Created by michaelzhong on 2017/11/7.
 */

public interface ILogRecorder {

    void refreshUser(String user);

    void prepareUploadAsync(PrepareUploadListener listener);

    File prepareUploadSync(String dateTime);

    void log(String tag, int version, String msg, boolean cryptFlag);

    void log(String tag, int version, List<String> msgFieldList, boolean cryptFlag);

    void logToJson(String tag, int version, Object o, boolean encryptFlag);

}
