package com.Yes.YesOJbackendjudgeservice.judge.codesandbox;

import com.Yes.YesOJbackendmodel.model.codesandbox.ExecuteCodeRequest;
import com.Yes.YesOJbackendmodel.model.codesandbox.ExecuteCodeResponse;

/**
 * 代码沙箱接口定义
 */
public interface CodeSandbox {

    /**
     * 执行代码
     *
     * @param executeCodeRequest
     * @return
     */
    ExecuteCodeResponse executeCode(ExecuteCodeRequest executeCodeRequest);
}
