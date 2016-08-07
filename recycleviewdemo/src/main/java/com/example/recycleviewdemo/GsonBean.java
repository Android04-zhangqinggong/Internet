package com.example.recycleviewdemo;

import java.util.List;

/**
 * Created by Administrator on 2016/8/5.
 */
public class GsonBean {

    /**
     * error : false
     * results : [{"_id":"56cc6d1d421aa95caa7075e0","createdAt":"2015-05-24T06:18:30.492Z","desc":"5.25","publishedAt":"2015-05-25T03:37:08.537Z","type":"福利","url":"http://ww4.sinaimg.cn/large/7a8aed7bgw1esfbgw6vc3j20gy0pedic.jpg","used":true,"who":"张涵宇"},{"_id":"56cc6d1d421aa95caa707692","createdAt":"2015-06-12T01:31:07.31Z","desc":"6.12","publishedAt":"2015-06-12T03:48:54.790Z","type":"福利","url":"http://ww4.sinaimg.cn/large/7a8aed7bgw1et11xp5wwij20hs0qotb2.jpg","used":true,"who":"张涵宇"},{"_id":"56cc6d1d421aa95caa70755a","createdAt":"2015-10-26T01:16:49.787Z","desc":"10.26","publishedAt":"2015-10-26T03:52:58.746Z","type":"福利","url":"http://ww1.sinaimg.cn/large/7a8aed7bjw1exe9ssy2gsj20qo0hndjr.jpg","used":true,"who":"张涵宇"},{"_id":"56cc6d1d421aa95caa7075e0","createdAt":"2015-05-24T06:18:30.492Z","desc":"5.25","publishedAt":"2015-05-25T03:37:08.537Z","type":"福利","url":"http://ww4.sinaimg.cn/large/7a8aed7bgw1esfbgw6vc3j20gy0pedic.jpg","used":true,"who":"张涵宇"},{"_id":"56cc6d1d421aa95caa707642","createdAt":"2015-07-15T03:56:42.772Z","desc":"7.15","publishedAt":"2015-07-15T04:05:29.732Z","type":"福利","url":"http://ww3.sinaimg.cn/large/610dc034gw1eu3bld296jj20df0kudhx.jpg","used":true,"who":"小贝"},{"_id":"56cc6d1d421aa95caa7075e0","createdAt":"2015-05-24T06:18:30.492Z","desc":"5.25","publishedAt":"2015-05-25T03:37:08.537Z","type":"福利","url":"http://ww4.sinaimg.cn/large/7a8aed7bgw1esfbgw6vc3j20gy0pedic.jpg","used":true,"who":"张涵宇"},{"_id":"56cc6d1d421aa95caa7075dd","createdAt":"2015-05-28T01:44:11.137Z","desc":"5.28","publishedAt":"2015-05-28T03:49:22.702Z","type":"福利","url":"http://ww4.sinaimg.cn/large/7a8aed7bgw1esjpu1vxggj20qo0hrgqw.jpg","used":true,"who":"张涵宇"},{"_id":"56cc6d1c421aa95caa70750f","createdAt":"2015-11-04T03:20:20.50Z","desc":"11.4","publishedAt":"2015-11-04T04:01:55.601Z","type":"福利","url":"http://ww4.sinaimg.cn/large/7a8aed7bgw1exory1k01ej20go0gnjv8.jpg","used":true,"who":"张涵宇"},{"_id":"56cc6d1d421aa95caa70758f","createdAt":"2015-10-30T01:54:13.811Z","desc":"10.30","publishedAt":"2015-10-30T03:50:54.394Z","type":"福利","url":"http://ww4.sinaimg.cn/large/7a8aed7bgw1exixcxfj12j20in0rsgp0.jpg","used":true,"who":"张涵宇"},{"_id":"56cc6d1d421aa95caa70762f","createdAt":"2015-06-02T12:52:59.4Z","desc":"6.3\u2014\u2014（1）","publishedAt":"2015-06-03T04:59:44.403Z","type":"福利","url":"http://ww3.sinaimg.cn/large/7a8aed7bgw1esq1f0899qj20hs0qo780.jpg","used":true,"who":"张涵宇"},{"_id":"56cc6d1d421aa95caa70755a","createdAt":"2015-10-26T01:16:49.787Z","desc":"10.26","publishedAt":"2015-10-26T03:52:58.746Z","type":"福利","url":"http://ww1.sinaimg.cn/large/7a8aed7bjw1exe9ssy2gsj20qo0hndjr.jpg","used":true,"who":"张涵宇"},{"_id":"56cc6d1d421aa95caa7076b4","createdAt":"2015-06-23T02:00:00.619Z","desc":"6.23","publishedAt":"2016-05-03T12:13:53.904Z","type":"福利","url":"http://ww4.sinaimg.cn/large/7a8aed7bgw1etdsksgctqj20hs0qowgy.jpg","used":true,"who":"张涵宇"},{"_id":"56cc6d1d421aa95caa707678","createdAt":"2015-06-05T01:05:18.878Z","desc":"6.5\u2014\u2014（1）","publishedAt":"2015-06-05T03:54:29.403Z","type":"福利","url":"http://ww2.sinaimg.cn/large/7a8aed7bgw1essxulfqxxj20hr0qo77f.jpg","used":true,"who":"张涵宇"},{"_id":"56cc6d1d421aa95caa707692","createdAt":"2015-06-12T01:31:07.31Z","desc":"6.12","publishedAt":"2015-06-12T03:48:54.790Z","type":"福利","url":"http://ww4.sinaimg.cn/large/7a8aed7bgw1et11xp5wwij20hs0qotb2.jpg","used":true,"who":"张涵宇"},{"_id":"56cc6d1d421aa95caa70758f","createdAt":"2015-10-30T01:54:13.811Z","desc":"10.30","publishedAt":"2015-10-30T03:50:54.394Z","type":"福利","url":"http://ww4.sinaimg.cn/large/7a8aed7bgw1exixcxfj12j20in0rsgp0.jpg","used":true,"who":"张涵宇"},{"_id":"56cc6d1d421aa95caa707637","createdAt":"2015-06-16T01:02:36.279Z","desc":"6.16","publishedAt":"2015-06-16T05:56:27.410Z","type":"福利","url":"http://ww3.sinaimg.cn/large/7a8aed7bgw1et5nl9mno8j20hs0qoacj.jpg","used":true,"who":"张涵宇"},{"_id":"56cc6d1d421aa95caa7075e0","createdAt":"2015-05-24T06:18:30.492Z","desc":"5.25","publishedAt":"2015-05-25T03:37:08.537Z","type":"福利","url":"http://ww4.sinaimg.cn/large/7a8aed7bgw1esfbgw6vc3j20gy0pedic.jpg","used":true,"who":"张涵宇"},{"_id":"56cc6d1c421aa95caa70752b","createdAt":"2015-11-06T01:54:17.536Z","desc":"11.6","publishedAt":"2015-11-06T04:11:25.973Z","type":"福利","url":"http://ww4.sinaimg.cn/large/7a8aed7bjw1exr0p4r0h3j20oy15445o.jpg","used":true,"who":"张涵宇"},{"_id":"56cc6d1d421aa95caa70762f","createdAt":"2015-06-02T12:52:59.4Z","desc":"6.3\u2014\u2014（1）","publishedAt":"2015-06-03T04:59:44.403Z","type":"福利","url":"http://ww3.sinaimg.cn/large/7a8aed7bgw1esq1f0899qj20hs0qo780.jpg","used":true,"who":"张涵宇"},{"_id":"56cc6d1d421aa95caa707692","createdAt":"2015-06-12T01:31:07.31Z","desc":"6.12","publishedAt":"2015-06-12T03:48:54.790Z","type":"福利","url":"http://ww4.sinaimg.cn/large/7a8aed7bgw1et11xp5wwij20hs0qotb2.jpg","used":true,"who":"张涵宇"}]
     */

    private boolean error;
    /**
     * _id : 56cc6d1d421aa95caa7075e0
     * createdAt : 2015-05-24T06:18:30.492Z
     * desc : 5.25
     * publishedAt : 2015-05-25T03:37:08.537Z
     * type : 福利
     * url : http://ww4.sinaimg.cn/large/7a8aed7bgw1esfbgw6vc3j20gy0pedic.jpg
     * used : true
     * who : 张涵宇
     */

    private List<ResultsBean> results;

    public boolean isError() {
        return error;
    }

    public void setError(boolean error) {
        this.error = error;
    }

    public List<ResultsBean> getResults() {
        return results;
    }

    public void setResults(List<ResultsBean> results) {
        this.results = results;
    }

    public static class ResultsBean {
        private String _id;
        private String createdAt;
        private String desc;
        private String publishedAt;
        private String type;
        private String url;
        private boolean used;
        private String who;

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

        public String getPublishedAt() {
            return publishedAt;
        }

        public void setPublishedAt(String publishedAt) {
            this.publishedAt = publishedAt;
        }

        public String getType() {
            return type;
        }

        public void setType(String type) {
            this.type = type;
        }

        public String getUrl() {
            return url;
        }

        public void setUrl(String url) {
            this.url = url;
        }

        public boolean isUsed() {
            return used;
        }

        public void setUsed(boolean used) {
            this.used = used;
        }

        public String getWho() {
            return who;
        }

        public void setWho(String who) {
            this.who = who;
        }
    }
}
