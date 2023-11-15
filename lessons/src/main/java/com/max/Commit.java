package com.max;

public class Commit {

    String commit;
    int numberComit;

    public Commit(String commit, int numberComit) {
        this.commit = commit;
        this.numberComit = numberComit;
    }

    public String getCommit() {
        return commit;
    }

    public void setCommit(String commit) {
        this.commit = commit;
    }

    public int getNumberComit() {
        return numberComit;
    }

    @Override
    public String toString() {
        return "Commit{" +
                "commit='" + commit + '\'' +
                ", numberComit=" + numberComit +
                '}';
    }

    public void setNumberComit(int numberComit) {
        this.numberComit = numberComit;
    }
}

