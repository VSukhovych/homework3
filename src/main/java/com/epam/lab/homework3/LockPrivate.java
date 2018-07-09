package com.epam.lab.homework3;

public class LockPrivate {
    private Integer keyValue;
    private boolean locked;

    public LockPrivate(Integer keyValue) {
        this.keyValue = keyValue;
        locked = true;
    }

    private boolean unlock(Integer keyValue) {
        if (this.keyValue == keyValue) {
            locked = false;
            return true;
        }
        locked = true;
        return false;
    }

    private void lock() {
        locked = true;
    }

    private boolean isLocked() {
        return locked;
    }
}
