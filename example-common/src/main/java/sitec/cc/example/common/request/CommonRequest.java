package sitec.cc.example.common.request;

import java.io.Serializable;

public class CommonRequest implements Serializable {
    private Long logId;
    private Integer currentUserId;

    public Long getLogId() {
        return logId;
    }

    public void setLogId(Long logId) {
        this.logId = logId;
    }

    public Integer getCurrentUserId() {
        return currentUserId;
    }

    public void setCurrentUserId(Integer currentUserId) {
        this.currentUserId = currentUserId;
    }
}
