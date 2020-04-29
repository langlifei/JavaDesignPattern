package BridgePattern08.exercise.action;

import BridgePattern08.exercise.service.FileImp;

public abstract class File {
    protected FileImp fileImp;

    public void setFileImp(FileImp fileImp) {
        this.fileImp = fileImp;
    }

    public abstract void transform();
}
