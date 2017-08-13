package com.originalix.lix.helloandroid;

/**
 * Created by Lix on 2017/8/13.
 */

public class NewsModel {

    private boolean error;
    private NewsData[] results;

    public void setError(boolean error) {
        this.error = error;
    }

    public NewsData[] getResults() {
        return results;
    }

    public void setResults(NewsData[] results) {
        this.results = results;
    }

    public static class NewsData {
        private String _id;
        private String createdAt;
        private String desc;

        public String get_id() {
            return _id;
        }

        public void set_id(String _id) {
            this._id = _id;
        }

        public String getCreatedAt() {
            return createdAt;
        }

        public void setCreatedAt(String createdAt) {
            this.createdAt = createdAt;
        }

        public String getDesc() {
            return desc;
        }

        public void setDesc(String desc) {
            this.desc = desc;
        }
    }
}
