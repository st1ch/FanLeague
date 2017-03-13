package com.fanleagueent.fanleague.data.entity.responses;

import android.support.annotation.Nullable;
import com.google.gson.annotations.SerializedName;
import java.util.List;
import java.util.Map;

public class BaseResponse<T> {

    @SerializedName("error")
    private boolean error;

    @SerializedName("message")
    private String message;

    @SerializedName("data")
    T data;

    @Nullable
    @SerializedName("errors") Map<String, List<String>> errorData;

    public String getMessage() {
        return message;
    }

    public boolean isError() {
        return error;
    }

    public T getData() {
        return data;
    }

    @Nullable
    public Map<String, List<String>> getErrorData() {
        return errorData;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public void setError(boolean error) {
        this.error = error;
    }

    public void setData(T data) {
        this.data = data;
    }

    @Override public String toString() {
        return "BaseResponse{"
            + "error="
            + error
            + ", message='"
            + message
            + '\''
            + ", " + data.getClass().getSimpleName() + "="
            + data
            + ", errorData="
            + errorData
            + '}';
    }
}
