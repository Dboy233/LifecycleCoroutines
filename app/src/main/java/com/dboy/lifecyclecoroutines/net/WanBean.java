package com.dboy.lifecyclecoroutines.net;

import com.google.gson.annotations.SerializedName;

import java.io.Serializable;
import java.util.List;

public class WanBean implements Serializable {

    /**
     * data : {"curPage":2,"datas":[{"apkLink":"","audit":1,"author":"fmtjava","canEdit":false,"chapterId":402,"chapterName":"跨平台应用","collect":false,"courseId":13,"desc":"基于Fullter实现的一款精美的仿开眼视频(Eyepetizer )跨平台App,适合入门,快速掌握Dart语言以及上手flutter开发,希望和大家共同成长,喜欢的话，欢迎start或fork!","descMd":"","envelopePic":"https://www.wanandroid.com/blogimgs/28cc42a3-3b5a-47ea-b4f4-5cd935432a7d.png","fresh":false,"id":13210,"link":"https://www.wanandroid.com/blog/show/2750","niceDate":"2020-04-29 01:18","niceShareDate":"2020-04-29 01:18","origin":"","prefix":"","projectLink":"https://github.com/fmtjava/flutter_eyepetizer","publishTime":1588094327000,"selfVisible":0,"shareDate":1588094327000,"shareUser":"","superChapterId":294,"superChapterName":"开源项目主Tab","tags":[{"name":"项目","url":"/project/list/1?cid=402"}],"title":"一款基于Flutter实现的精美仿开眼视频跨平台App,适合新手入门，快速掌握Dart语言的基本语法以及快速上手flutter开发。","type":0,"userId":-1,"visible":1,"zan":0},{"apkLink":"","audit":1,"author":"fmtjava","canEdit":false,"chapterId":294,"chapterName":"完整项目","collect":false,"courseId":13,"desc":"基于Kotlin + Jetpack全家桶 + Coroutines(协程) 等架构实现的一款精简版Github客户端项目,望与广大小伙伴一起成长,欢迎start or fork！","descMd":"","envelopePic":"https://www.wanandroid.com/blogimgs/133a0e8e-d76c-4626-a52f-7c5a0afc9ce2.png","fresh":false,"id":13209,"link":"https://www.wanandroid.com/blog/show/2749","niceDate":"2020-04-29 01:18","niceShareDate":"2020-04-29 01:18","origin":"","prefix":"","projectLink":"https://github.com/fmtjava/Jetpack_GitHub","publishTime":1588094297000,"selfVisible":0,"shareDate":1588094297000,"shareUser":"","superChapterId":294,"superChapterName":"开源项目主Tab","tags":[{"name":"项目","url":"/project/list/1?cid=294"}],"title":"基于Kotlin + Jetpack全家桶 + Coroutines(协程) 等架构实现的一款精简版Github客户端项目。","type":0,"userId":-1,"visible":1,"zan":0},{"apkLink":"","audit":1,"author":"","canEdit":false,"chapterId":78,"chapterName":"性能优化","collect":false,"courseId":13,"desc":"","descMd":"","envelopePic":"","fresh":false,"id":13120,"link":"https://juejin.im/post/5ea25d58e51d454711412f2c","niceDate":"2020-04-29 01:16","niceShareDate":"2020-04-27 21:35","origin":"","prefix":"","projectLink":"","publishTime":1588094190000,"selfVisible":0,"shareDate":1587994547000,"shareUser":"18818486691","superChapterId":195,"superChapterName":"热门专题","tags":[],"title":"Andorid性能优化之traceview的使用（不懂揍我）","type":0,"userId":61241,"visible":1,"zan":0},{"apkLink":"","audit":1,"author":"xiaoyang","canEdit":false,"chapterId":440,"chapterName":"官方","collect":false,"courseId":13,"desc":"<pre><code>android.view.ViewRootImpl$CalledFromWrongThreadException: Only the original thread that created a view hierarchy can touch its views.\r\n        at android.view.ViewRootImpl.checkThread(ViewRootImpl.java:8066)\r\n        at android.view.ViewRootImpl.requestLayout(ViewRootImpl.java:1297)\r\n        at android.view.View.requestLayout(View.java:23147)\r\n        at android.view.View.requestLayout(View.java:23147)\r\n<\/code><\/pre><p>相信大家都见过这样的错误，而且拍大腿都知道，这个问题肯定是更新控件不在UI线程导致的。<\/p>\r\n<p>你肯定有各种方式来解决。<\/p>\r\n<p>但是我们今天就要问点你怀疑人生的问题：<\/p>\r\n<ol>\r\n<li>真的只有UI线程才能更新界面UI吗？<\/li>\r\n<li>UI 线程更新界面UI有可能报上述错误吗？<\/li>\r\n<li>请举例说明...<\/li>\r\n<li>最好能附带源码解析。<\/li>\r\n<\/ol>","descMd":"","envelopePic":"","fresh":false,"id":12922,"link":"https://wanandroid.com/wenda/show/12922","niceDate":"2020-04-29 01:14","niceShareDate":"2020-04-18 01:13","origin":"","prefix":"","projectLink":"","publishTime":1588094075000,"selfVisible":0,"shareDate":1587143623000,"shareUser":"","superChapterId":440,"superChapterName":"问答","tags":[{"name":"本站发布","url":"/article/list/0?cid=440"},{"name":"问答","url":"/wenda"}],"title":"每日一问 | &ldquo;必须在UI线程才能更新控件/界面&rdquo;  这句人人皆知的话，100%正确吗？","type":0,"userId":2,"visible":1,"zan":11},{"apkLink":"","audit":1,"author":"小编","canEdit":false,"chapterId":430,"chapterName":"Flutter","collect":false,"courseId":13,"desc":"","descMd":"","envelopePic":"","fresh":false,"id":13206,"link":"https://book.flutterchina.club/intro.html","niceDate":"2020-04-28 18:01","niceShareDate":"2020-04-28 18:01","origin":"","prefix":"","projectLink":"","publishTime":1588068108000,"selfVisible":0,"shareDate":1588068108000,"shareUser":"","superChapterId":272,"superChapterName":"导航主Tab","tags":[{"name":"导航","url":"/navi#430"}],"title":"Flutter实战","type":0,"userId":-1,"visible":1,"zan":0},{"apkLink":"","audit":1,"author":"","canEdit":false,"chapterId":502,"chapterName":"自助","collect":false,"courseId":13,"desc":"","descMd":"","envelopePic":"","fresh":false,"id":13150,"link":"https://juejin.im/post/5ea7792e5188256da0323444#heading-4","niceDate":"2020-04-28 09:23","niceShareDate":"2020-04-28 09:23","origin":"","prefix":"","projectLink":"","publishTime":1588036993000,"selfVisible":0,"shareDate":1588036993000,"shareUser":"JsonChao","superChapterId":494,"superChapterName":"广场Tab","tags":[],"title":"深度探索 Gradle 自动化构建技术（五、Gradle 插件架构实现原理剖析）","type":0,"userId":611,"visible":1,"zan":0},{"apkLink":"","audit":1,"author":"鸿洋","canEdit":false,"chapterId":408,"chapterName":"鸿洋","collect":false,"courseId":13,"desc":"","descMd":"","envelopePic":"","fresh":false,"id":13162,"link":"https://mp.weixin.qq.com/s/Ynh9-7cfs3vVMxCmEMpRxQ","niceDate":"2020-04-28 00:00","niceShareDate":"2020-04-28 12:10","origin":"","prefix":"","projectLink":"","publishTime":1588003200000,"selfVisible":0,"shareDate":1588047028000,"shareUser":"","superChapterId":408,"superChapterName":"公众号","tags":[{"name":"公众号","url":"/wxarticle/list/408/1"}],"title":"暗黑模式？安卓适配一波","type":0,"userId":-1,"visible":1,"zan":0},{"apkLink":"","audit":1,"author":"code小生","canEdit":false,"chapterId":414,"chapterName":"code小生","collect":false,"courseId":13,"desc":"","descMd":"","envelopePic":"","fresh":false,"id":13170,"link":"https://mp.weixin.qq.com/s/iogNs1Z_BJb4-ZgJXT_A0Q","niceDate":"2020-04-28 00:00","niceShareDate":"2020-04-28 12:23","origin":"","prefix":"","projectLink":"","publishTime":1588003200000,"selfVisible":0,"shareDate":1588047821000,"shareUser":"","superChapterId":408,"superChapterName":"公众号","tags":[{"name":"公众号","url":"/wxarticle/list/414/1"}],"title":"深入浅出 Android 屏幕刷新原理","type":0,"userId":-1,"visible":1,"zan":0},{"apkLink":"","audit":1,"author":"程序亦非猿","canEdit":false,"chapterId":428,"chapterName":"程序亦非猿","collect":false,"courseId":13,"desc":"","descMd":"","envelopePic":"","fresh":false,"id":13177,"link":"https://mp.weixin.qq.com/s/me8k_afGA4zl0IuCk7mxOA","niceDate":"2020-04-28 00:00","niceShareDate":"2020-04-28 12:51","origin":"","prefix":"","projectLink":"","publishTime":1588003200000,"selfVisible":0,"shareDate":1588049482000,"shareUser":"","superChapterId":408,"superChapterName":"公众号","tags":[{"name":"公众号","url":"/wxarticle/list/428/1"}],"title":"一文看懂 Java8 的 Lambda表达式！","type":0,"userId":-1,"visible":1,"zan":0},{"apkLink":"","audit":1,"author":"郭霖","canEdit":false,"chapterId":409,"chapterName":"郭霖","collect":false,"courseId":13,"desc":"","descMd":"","envelopePic":"","fresh":false,"id":13195,"link":"https://mp.weixin.qq.com/s/lP-xB5yzpvqVEiA439euVQ","niceDate":"2020-04-28 00:00","niceShareDate":"2020-04-28 12:57","origin":"","prefix":"","projectLink":"","publishTime":1588003200000,"selfVisible":0,"shareDate":1588049836000,"shareUser":"","superChapterId":408,"superChapterName":"公众号","tags":[{"name":"公众号","url":"/wxarticle/list/409/1"}],"title":"Java的值传递和引用传递，你真的搞清楚了吗？","type":0,"userId":-1,"visible":1,"zan":0},{"apkLink":"","audit":1,"author":"","canEdit":false,"chapterId":73,"chapterName":"面试相关","collect":false,"courseId":13,"desc":"","descMd":"","envelopePic":"","fresh":false,"id":13078,"link":"https://bthvi-leiqi.blog.csdn.net/article/details/80954639","niceDate":"2020-04-27 23:32","niceShareDate":"2020-04-27 14:31","origin":"","prefix":"","projectLink":"","publishTime":1588001563000,"selfVisible":0,"shareDate":1587969098000,"shareUser":"紫雾凌寒","superChapterId":195,"superChapterName":"热门专题","tags":[],"title":"Android学习&mdash;&mdash;手把手教你实现Android热修复","type":0,"userId":10853,"visible":1,"zan":0},{"apkLink":"","audit":1,"author":"","canEdit":false,"chapterId":229,"chapterName":"AOP","collect":false,"courseId":13,"desc":"","descMd":"","envelopePic":"","fresh":false,"id":13118,"link":"https://juejin.im/post/5ea66d64f265da480836d2b2","niceDate":"2020-04-27 23:32","niceShareDate":"2020-04-27 21:34","origin":"","prefix":"","projectLink":"","publishTime":1588001541000,"selfVisible":0,"shareDate":1587994471000,"shareUser":"18818486691","superChapterId":227,"superChapterName":"注解 & 反射 & AOP","tags":[],"title":"一行代码解决安卓重复点击","type":0,"userId":61241,"visible":1,"zan":0},{"apkLink":"","audit":1,"author":"","canEdit":false,"chapterId":73,"chapterName":"面试相关","collect":false,"courseId":13,"desc":"","descMd":"","envelopePic":"","fresh":false,"id":13123,"link":"https://juejin.im/post/5ea2ab266fb9a03c82234a9f","niceDate":"2020-04-27 23:31","niceShareDate":"2020-04-27 21:36","origin":"","prefix":"","projectLink":"","publishTime":1588001519000,"selfVisible":0,"shareDate":1587994604000,"shareUser":"18818486691","superChapterId":195,"superChapterName":"热门专题","tags":[],"title":"Android-Flutter面经","type":0,"userId":61241,"visible":1,"zan":0},{"apkLink":"","audit":1,"author":"","canEdit":false,"chapterId":95,"chapterName":"相机Camera","collect":false,"courseId":13,"desc":"","descMd":"","envelopePic":"","fresh":false,"id":13127,"link":"https://juejin.im/post/5ea690adf265da480469b006","niceDate":"2020-04-27 23:31","niceShareDate":"2020-04-27 21:37","origin":"","prefix":"","projectLink":"","publishTime":1588001469000,"selfVisible":0,"shareDate":1587994679000,"shareUser":"18818486691","superChapterId":97,"superChapterName":"多媒体技术","tags":[],"title":"相机小白自定义Camera实践","type":0,"userId":61241,"visible":1,"zan":0},{"apkLink":"","audit":1,"author":"","canEdit":false,"chapterId":76,"chapterName":"项目架构","collect":false,"courseId":13,"desc":"","descMd":"","envelopePic":"","fresh":false,"id":13144,"link":"https://www.jianshu.com/p/f08ed42a4e36","niceDate":"2020-04-27 23:29","niceShareDate":"2020-04-27 23:28","origin":"","prefix":"","projectLink":"","publishTime":1588001385000,"selfVisible":0,"shareDate":1588001332000,"shareUser":"鸿洋","superChapterId":195,"superChapterName":"热门专题","tags":[],"title":"也谈Android应用架构","type":0,"userId":2,"visible":1,"zan":0},{"apkLink":"","audit":1,"author":"","canEdit":false,"chapterId":502,"chapterName":"自助","collect":false,"courseId":13,"desc":"","descMd":"","envelopePic":"","fresh":false,"id":13142,"link":"https://juejin.im/post/5ea6f2475188256d6e211b09","niceDate":"2020-04-27 23:10","niceShareDate":"2020-04-27 23:10","origin":"","prefix":"","projectLink":"","publishTime":1588000228000,"selfVisible":0,"shareDate":1588000228000,"shareUser":"xll","superChapterId":494,"superChapterName":"广场Tab","tags":[],"title":"Gldie实现角图标（支持gif）不放弃ImageView的centerCrop","type":0,"userId":22903,"visible":1,"zan":0},{"apkLink":"","audit":1,"author":"","canEdit":false,"chapterId":502,"chapterName":"自助","collect":false,"courseId":13,"desc":"","descMd":"","envelopePic":"","fresh":false,"id":13069,"link":"https://juejin.im/post/5e84c202f265da47dc4cc01f","niceDate":"2020-04-27 08:58","niceShareDate":"2020-04-27 08:58","origin":"","prefix":"","projectLink":"","publishTime":1587949104000,"selfVisible":0,"shareDate":1587949104000,"shareUser":"躬行之","superChapterId":494,"superChapterName":"广场Tab","tags":[],"title":"Android Jetpack组件之Lifecycle-Aware组件使用及源码解析","type":0,"userId":23270,"visible":1,"zan":0},{"apkLink":"","audit":1,"author":"code小生","canEdit":false,"chapterId":414,"chapterName":"code小生","collect":false,"courseId":13,"desc":"","descMd":"","envelopePic":"","fresh":false,"id":13168,"link":"https://mp.weixin.qq.com/s/Akduog4J5yjbdafrKLHsEg","niceDate":"2020-04-27 00:00","niceShareDate":"2020-04-28 12:23","origin":"","prefix":"","projectLink":"","publishTime":1587916800000,"selfVisible":0,"shareDate":1588047788000,"shareUser":"","superChapterId":408,"superChapterName":"公众号","tags":[{"name":"公众号","url":"/wxarticle/list/414/1"}],"title":"探索 Android TDD 开发方法","type":0,"userId":-1,"visible":1,"zan":0},{"apkLink":"","audit":1,"author":"code小生","canEdit":false,"chapterId":414,"chapterName":"code小生","collect":false,"courseId":13,"desc":"","descMd":"","envelopePic":"","fresh":false,"id":13169,"link":"https://mp.weixin.qq.com/s/oZASKxSVUJ3dFdYHmihBkQ","niceDate":"2020-04-27 00:00","niceShareDate":"2020-04-28 12:23","origin":"","prefix":"","projectLink":"","publishTime":1587916800000,"selfVisible":0,"shareDate":1588047804000,"shareUser":"","superChapterId":408,"superChapterName":"公众号","tags":[{"name":"公众号","url":"/wxarticle/list/414/1"}],"title":"10 分钟实现 Java 发送邮件功能","type":0,"userId":-1,"visible":1,"zan":0},{"apkLink":"","audit":1,"author":"互联网侦察","canEdit":false,"chapterId":421,"chapterName":"互联网侦察","collect":false,"courseId":13,"desc":"","descMd":"","envelopePic":"","fresh":false,"id":13181,"link":"https://mp.weixin.qq.com/s/T8vHrLWqXzPRWtuuvTC6NQ","niceDate":"2020-04-27 00:00","niceShareDate":"2020-04-28 12:52","origin":"","prefix":"","projectLink":"","publishTime":1587916800000,"selfVisible":0,"shareDate":1588049564000,"shareUser":"","superChapterId":408,"superChapterName":"公众号","tags":[{"name":"公众号","url":"/wxarticle/list/421/1"}],"title":"记一次 JAVA 的内存泄露分析","type":0,"userId":-1,"visible":1,"zan":0}],"offset":20,"over":false,"pageCount":420,"size":20,"total":8400}
     * errorCode : 0
     * errorMsg :
     */

    @SerializedName("data")
    private DataBean data;
    @SerializedName("errorCode")
    private int errorCode;
    @SerializedName("errorMsg")
    private String errorMsg;

    @Override
    public String toString() {
        return "WanBean{" +
                "data=" + data +
                ", errorCode=" + errorCode +
                ", errorMsg='" + errorMsg + '\'' +
                '}';
    }

    public DataBean getData() {
        return data;
    }

    public void setData(DataBean data) {
        this.data = data;
    }

    public int getErrorCode() {
        return errorCode;
    }

    public void setErrorCode(int errorCode) {
        this.errorCode = errorCode;
    }

    public String getErrorMsg() {
        return errorMsg;
    }

    public void setErrorMsg(String errorMsg) {
        this.errorMsg = errorMsg;
    }

    public static class DataBean implements Serializable{

        @Override
        public String toString() {
            return "DataBean{" +
                    "curPage=" + curPage +
                    ", offset=" + offset +
                    ", over=" + over +
                    ", pageCount=" + pageCount +
                    ", size=" + size +
                    ", total=" + total +
                    ", datas=" + datas +
                    '}';
        }

        /**
         * curPage : 2
         * datas : [{"apkLink":"","audit":1,"author":"fmtjava","canEdit":false,"chapterId":402,"chapterName":"跨平台应用","collect":false,"courseId":13,"desc":"基于Fullter实现的一款精美的仿开眼视频(Eyepetizer )跨平台App,适合入门,快速掌握Dart语言以及上手flutter开发,希望和大家共同成长,喜欢的话，欢迎start或fork!","descMd":"","envelopePic":"https://www.wanandroid.com/blogimgs/28cc42a3-3b5a-47ea-b4f4-5cd935432a7d.png","fresh":false,"id":13210,"link":"https://www.wanandroid.com/blog/show/2750","niceDate":"2020-04-29 01:18","niceShareDate":"2020-04-29 01:18","origin":"","prefix":"","projectLink":"https://github.com/fmtjava/flutter_eyepetizer","publishTime":1588094327000,"selfVisible":0,"shareDate":1588094327000,"shareUser":"","superChapterId":294,"superChapterName":"开源项目主Tab","tags":[{"name":"项目","url":"/project/list/1?cid=402"}],"title":"一款基于Flutter实现的精美仿开眼视频跨平台App,适合新手入门，快速掌握Dart语言的基本语法以及快速上手flutter开发。","type":0,"userId":-1,"visible":1,"zan":0},{"apkLink":"","audit":1,"author":"fmtjava","canEdit":false,"chapterId":294,"chapterName":"完整项目","collect":false,"courseId":13,"desc":"基于Kotlin + Jetpack全家桶 + Coroutines(协程) 等架构实现的一款精简版Github客户端项目,望与广大小伙伴一起成长,欢迎start or fork！","descMd":"","envelopePic":"https://www.wanandroid.com/blogimgs/133a0e8e-d76c-4626-a52f-7c5a0afc9ce2.png","fresh":false,"id":13209,"link":"https://www.wanandroid.com/blog/show/2749","niceDate":"2020-04-29 01:18","niceShareDate":"2020-04-29 01:18","origin":"","prefix":"","projectLink":"https://github.com/fmtjava/Jetpack_GitHub","publishTime":1588094297000,"selfVisible":0,"shareDate":1588094297000,"shareUser":"","superChapterId":294,"superChapterName":"开源项目主Tab","tags":[{"name":"项目","url":"/project/list/1?cid=294"}],"title":"基于Kotlin + Jetpack全家桶 + Coroutines(协程) 等架构实现的一款精简版Github客户端项目。","type":0,"userId":-1,"visible":1,"zan":0},{"apkLink":"","audit":1,"author":"","canEdit":false,"chapterId":78,"chapterName":"性能优化","collect":false,"courseId":13,"desc":"","descMd":"","envelopePic":"","fresh":false,"id":13120,"link":"https://juejin.im/post/5ea25d58e51d454711412f2c","niceDate":"2020-04-29 01:16","niceShareDate":"2020-04-27 21:35","origin":"","prefix":"","projectLink":"","publishTime":1588094190000,"selfVisible":0,"shareDate":1587994547000,"shareUser":"18818486691","superChapterId":195,"superChapterName":"热门专题","tags":[],"title":"Andorid性能优化之traceview的使用（不懂揍我）","type":0,"userId":61241,"visible":1,"zan":0},{"apkLink":"","audit":1,"author":"xiaoyang","canEdit":false,"chapterId":440,"chapterName":"官方","collect":false,"courseId":13,"desc":"<pre><code>android.view.ViewRootImpl$CalledFromWrongThreadException: Only the original thread that created a view hierarchy can touch its views.\r\n        at android.view.ViewRootImpl.checkThread(ViewRootImpl.java:8066)\r\n        at android.view.ViewRootImpl.requestLayout(ViewRootImpl.java:1297)\r\n        at android.view.View.requestLayout(View.java:23147)\r\n        at android.view.View.requestLayout(View.java:23147)\r\n<\/code><\/pre><p>相信大家都见过这样的错误，而且拍大腿都知道，这个问题肯定是更新控件不在UI线程导致的。<\/p>\r\n<p>你肯定有各种方式来解决。<\/p>\r\n<p>但是我们今天就要问点你怀疑人生的问题：<\/p>\r\n<ol>\r\n<li>真的只有UI线程才能更新界面UI吗？<\/li>\r\n<li>UI 线程更新界面UI有可能报上述错误吗？<\/li>\r\n<li>请举例说明...<\/li>\r\n<li>最好能附带源码解析。<\/li>\r\n<\/ol>","descMd":"","envelopePic":"","fresh":false,"id":12922,"link":"https://wanandroid.com/wenda/show/12922","niceDate":"2020-04-29 01:14","niceShareDate":"2020-04-18 01:13","origin":"","prefix":"","projectLink":"","publishTime":1588094075000,"selfVisible":0,"shareDate":1587143623000,"shareUser":"","superChapterId":440,"superChapterName":"问答","tags":[{"name":"本站发布","url":"/article/list/0?cid=440"},{"name":"问答","url":"/wenda"}],"title":"每日一问 | &ldquo;必须在UI线程才能更新控件/界面&rdquo;  这句人人皆知的话，100%正确吗？","type":0,"userId":2,"visible":1,"zan":11},{"apkLink":"","audit":1,"author":"小编","canEdit":false,"chapterId":430,"chapterName":"Flutter","collect":false,"courseId":13,"desc":"","descMd":"","envelopePic":"","fresh":false,"id":13206,"link":"https://book.flutterchina.club/intro.html","niceDate":"2020-04-28 18:01","niceShareDate":"2020-04-28 18:01","origin":"","prefix":"","projectLink":"","publishTime":1588068108000,"selfVisible":0,"shareDate":1588068108000,"shareUser":"","superChapterId":272,"superChapterName":"导航主Tab","tags":[{"name":"导航","url":"/navi#430"}],"title":"Flutter实战","type":0,"userId":-1,"visible":1,"zan":0},{"apkLink":"","audit":1,"author":"","canEdit":false,"chapterId":502,"chapterName":"自助","collect":false,"courseId":13,"desc":"","descMd":"","envelopePic":"","fresh":false,"id":13150,"link":"https://juejin.im/post/5ea7792e5188256da0323444#heading-4","niceDate":"2020-04-28 09:23","niceShareDate":"2020-04-28 09:23","origin":"","prefix":"","projectLink":"","publishTime":1588036993000,"selfVisible":0,"shareDate":1588036993000,"shareUser":"JsonChao","superChapterId":494,"superChapterName":"广场Tab","tags":[],"title":"深度探索 Gradle 自动化构建技术（五、Gradle 插件架构实现原理剖析）","type":0,"userId":611,"visible":1,"zan":0},{"apkLink":"","audit":1,"author":"鸿洋","canEdit":false,"chapterId":408,"chapterName":"鸿洋","collect":false,"courseId":13,"desc":"","descMd":"","envelopePic":"","fresh":false,"id":13162,"link":"https://mp.weixin.qq.com/s/Ynh9-7cfs3vVMxCmEMpRxQ","niceDate":"2020-04-28 00:00","niceShareDate":"2020-04-28 12:10","origin":"","prefix":"","projectLink":"","publishTime":1588003200000,"selfVisible":0,"shareDate":1588047028000,"shareUser":"","superChapterId":408,"superChapterName":"公众号","tags":[{"name":"公众号","url":"/wxarticle/list/408/1"}],"title":"暗黑模式？安卓适配一波","type":0,"userId":-1,"visible":1,"zan":0},{"apkLink":"","audit":1,"author":"code小生","canEdit":false,"chapterId":414,"chapterName":"code小生","collect":false,"courseId":13,"desc":"","descMd":"","envelopePic":"","fresh":false,"id":13170,"link":"https://mp.weixin.qq.com/s/iogNs1Z_BJb4-ZgJXT_A0Q","niceDate":"2020-04-28 00:00","niceShareDate":"2020-04-28 12:23","origin":"","prefix":"","projectLink":"","publishTime":1588003200000,"selfVisible":0,"shareDate":1588047821000,"shareUser":"","superChapterId":408,"superChapterName":"公众号","tags":[{"name":"公众号","url":"/wxarticle/list/414/1"}],"title":"深入浅出 Android 屏幕刷新原理","type":0,"userId":-1,"visible":1,"zan":0},{"apkLink":"","audit":1,"author":"程序亦非猿","canEdit":false,"chapterId":428,"chapterName":"程序亦非猿","collect":false,"courseId":13,"desc":"","descMd":"","envelopePic":"","fresh":false,"id":13177,"link":"https://mp.weixin.qq.com/s/me8k_afGA4zl0IuCk7mxOA","niceDate":"2020-04-28 00:00","niceShareDate":"2020-04-28 12:51","origin":"","prefix":"","projectLink":"","publishTime":1588003200000,"selfVisible":0,"shareDate":1588049482000,"shareUser":"","superChapterId":408,"superChapterName":"公众号","tags":[{"name":"公众号","url":"/wxarticle/list/428/1"}],"title":"一文看懂 Java8 的 Lambda表达式！","type":0,"userId":-1,"visible":1,"zan":0},{"apkLink":"","audit":1,"author":"郭霖","canEdit":false,"chapterId":409,"chapterName":"郭霖","collect":false,"courseId":13,"desc":"","descMd":"","envelopePic":"","fresh":false,"id":13195,"link":"https://mp.weixin.qq.com/s/lP-xB5yzpvqVEiA439euVQ","niceDate":"2020-04-28 00:00","niceShareDate":"2020-04-28 12:57","origin":"","prefix":"","projectLink":"","publishTime":1588003200000,"selfVisible":0,"shareDate":1588049836000,"shareUser":"","superChapterId":408,"superChapterName":"公众号","tags":[{"name":"公众号","url":"/wxarticle/list/409/1"}],"title":"Java的值传递和引用传递，你真的搞清楚了吗？","type":0,"userId":-1,"visible":1,"zan":0},{"apkLink":"","audit":1,"author":"","canEdit":false,"chapterId":73,"chapterName":"面试相关","collect":false,"courseId":13,"desc":"","descMd":"","envelopePic":"","fresh":false,"id":13078,"link":"https://bthvi-leiqi.blog.csdn.net/article/details/80954639","niceDate":"2020-04-27 23:32","niceShareDate":"2020-04-27 14:31","origin":"","prefix":"","projectLink":"","publishTime":1588001563000,"selfVisible":0,"shareDate":1587969098000,"shareUser":"紫雾凌寒","superChapterId":195,"superChapterName":"热门专题","tags":[],"title":"Android学习&mdash;&mdash;手把手教你实现Android热修复","type":0,"userId":10853,"visible":1,"zan":0},{"apkLink":"","audit":1,"author":"","canEdit":false,"chapterId":229,"chapterName":"AOP","collect":false,"courseId":13,"desc":"","descMd":"","envelopePic":"","fresh":false,"id":13118,"link":"https://juejin.im/post/5ea66d64f265da480836d2b2","niceDate":"2020-04-27 23:32","niceShareDate":"2020-04-27 21:34","origin":"","prefix":"","projectLink":"","publishTime":1588001541000,"selfVisible":0,"shareDate":1587994471000,"shareUser":"18818486691","superChapterId":227,"superChapterName":"注解 & 反射 & AOP","tags":[],"title":"一行代码解决安卓重复点击","type":0,"userId":61241,"visible":1,"zan":0},{"apkLink":"","audit":1,"author":"","canEdit":false,"chapterId":73,"chapterName":"面试相关","collect":false,"courseId":13,"desc":"","descMd":"","envelopePic":"","fresh":false,"id":13123,"link":"https://juejin.im/post/5ea2ab266fb9a03c82234a9f","niceDate":"2020-04-27 23:31","niceShareDate":"2020-04-27 21:36","origin":"","prefix":"","projectLink":"","publishTime":1588001519000,"selfVisible":0,"shareDate":1587994604000,"shareUser":"18818486691","superChapterId":195,"superChapterName":"热门专题","tags":[],"title":"Android-Flutter面经","type":0,"userId":61241,"visible":1,"zan":0},{"apkLink":"","audit":1,"author":"","canEdit":false,"chapterId":95,"chapterName":"相机Camera","collect":false,"courseId":13,"desc":"","descMd":"","envelopePic":"","fresh":false,"id":13127,"link":"https://juejin.im/post/5ea690adf265da480469b006","niceDate":"2020-04-27 23:31","niceShareDate":"2020-04-27 21:37","origin":"","prefix":"","projectLink":"","publishTime":1588001469000,"selfVisible":0,"shareDate":1587994679000,"shareUser":"18818486691","superChapterId":97,"superChapterName":"多媒体技术","tags":[],"title":"相机小白自定义Camera实践","type":0,"userId":61241,"visible":1,"zan":0},{"apkLink":"","audit":1,"author":"","canEdit":false,"chapterId":76,"chapterName":"项目架构","collect":false,"courseId":13,"desc":"","descMd":"","envelopePic":"","fresh":false,"id":13144,"link":"https://www.jianshu.com/p/f08ed42a4e36","niceDate":"2020-04-27 23:29","niceShareDate":"2020-04-27 23:28","origin":"","prefix":"","projectLink":"","publishTime":1588001385000,"selfVisible":0,"shareDate":1588001332000,"shareUser":"鸿洋","superChapterId":195,"superChapterName":"热门专题","tags":[],"title":"也谈Android应用架构","type":0,"userId":2,"visible":1,"zan":0},{"apkLink":"","audit":1,"author":"","canEdit":false,"chapterId":502,"chapterName":"自助","collect":false,"courseId":13,"desc":"","descMd":"","envelopePic":"","fresh":false,"id":13142,"link":"https://juejin.im/post/5ea6f2475188256d6e211b09","niceDate":"2020-04-27 23:10","niceShareDate":"2020-04-27 23:10","origin":"","prefix":"","projectLink":"","publishTime":1588000228000,"selfVisible":0,"shareDate":1588000228000,"shareUser":"xll","superChapterId":494,"superChapterName":"广场Tab","tags":[],"title":"Gldie实现角图标（支持gif）不放弃ImageView的centerCrop","type":0,"userId":22903,"visible":1,"zan":0},{"apkLink":"","audit":1,"author":"","canEdit":false,"chapterId":502,"chapterName":"自助","collect":false,"courseId":13,"desc":"","descMd":"","envelopePic":"","fresh":false,"id":13069,"link":"https://juejin.im/post/5e84c202f265da47dc4cc01f","niceDate":"2020-04-27 08:58","niceShareDate":"2020-04-27 08:58","origin":"","prefix":"","projectLink":"","publishTime":1587949104000,"selfVisible":0,"shareDate":1587949104000,"shareUser":"躬行之","superChapterId":494,"superChapterName":"广场Tab","tags":[],"title":"Android Jetpack组件之Lifecycle-Aware组件使用及源码解析","type":0,"userId":23270,"visible":1,"zan":0},{"apkLink":"","audit":1,"author":"code小生","canEdit":false,"chapterId":414,"chapterName":"code小生","collect":false,"courseId":13,"desc":"","descMd":"","envelopePic":"","fresh":false,"id":13168,"link":"https://mp.weixin.qq.com/s/Akduog4J5yjbdafrKLHsEg","niceDate":"2020-04-27 00:00","niceShareDate":"2020-04-28 12:23","origin":"","prefix":"","projectLink":"","publishTime":1587916800000,"selfVisible":0,"shareDate":1588047788000,"shareUser":"","superChapterId":408,"superChapterName":"公众号","tags":[{"name":"公众号","url":"/wxarticle/list/414/1"}],"title":"探索 Android TDD 开发方法","type":0,"userId":-1,"visible":1,"zan":0},{"apkLink":"","audit":1,"author":"code小生","canEdit":false,"chapterId":414,"chapterName":"code小生","collect":false,"courseId":13,"desc":"","descMd":"","envelopePic":"","fresh":false,"id":13169,"link":"https://mp.weixin.qq.com/s/oZASKxSVUJ3dFdYHmihBkQ","niceDate":"2020-04-27 00:00","niceShareDate":"2020-04-28 12:23","origin":"","prefix":"","projectLink":"","publishTime":1587916800000,"selfVisible":0,"shareDate":1588047804000,"shareUser":"","superChapterId":408,"superChapterName":"公众号","tags":[{"name":"公众号","url":"/wxarticle/list/414/1"}],"title":"10 分钟实现 Java 发送邮件功能","type":0,"userId":-1,"visible":1,"zan":0},{"apkLink":"","audit":1,"author":"互联网侦察","canEdit":false,"chapterId":421,"chapterName":"互联网侦察","collect":false,"courseId":13,"desc":"","descMd":"","envelopePic":"","fresh":false,"id":13181,"link":"https://mp.weixin.qq.com/s/T8vHrLWqXzPRWtuuvTC6NQ","niceDate":"2020-04-27 00:00","niceShareDate":"2020-04-28 12:52","origin":"","prefix":"","projectLink":"","publishTime":1587916800000,"selfVisible":0,"shareDate":1588049564000,"shareUser":"","superChapterId":408,"superChapterName":"公众号","tags":[{"name":"公众号","url":"/wxarticle/list/421/1"}],"title":"记一次 JAVA 的内存泄露分析","type":0,"userId":-1,"visible":1,"zan":0}]
         * offset : 20
         * over : false
         * pageCount : 420
         * size : 20
         * total : 8400
         */

        @SerializedName("curPage")
        private int curPage;
        @SerializedName("offset")
        private int offset;
        @SerializedName("over")
        private boolean over;
        @SerializedName("pageCount")
        private int pageCount;
        @SerializedName("size")
        private int size;
        @SerializedName("total")
        private int total;
        @SerializedName("datas")
        private List<DatasBean> datas;

        public int getCurPage() {
            return curPage;
        }

        public void setCurPage(int curPage) {
            this.curPage = curPage;
        }

        public int getOffset() {
            return offset;
        }

        public void setOffset(int offset) {
            this.offset = offset;
        }

        public boolean isOver() {
            return over;
        }

        public void setOver(boolean over) {
            this.over = over;
        }

        public int getPageCount() {
            return pageCount;
        }

        public void setPageCount(int pageCount) {
            this.pageCount = pageCount;
        }

        public int getSize() {
            return size;
        }

        public void setSize(int size) {
            this.size = size;
        }

        public int getTotal() {
            return total;
        }

        public void setTotal(int total) {
            this.total = total;
        }

        public List<DatasBean> getDatas() {
            return datas;
        }

        public void setDatas(List<DatasBean> datas) {
            this.datas = datas;
        }

        public static class DatasBean implements Serializable{
            /**
             * apkLink :
             * audit : 1
             * author : fmtjava
             * canEdit : false
             * chapterId : 402
             * chapterName : 跨平台应用
             * collect : false
             * courseId : 13
             * desc : 基于Fullter实现的一款精美的仿开眼视频(Eyepetizer )跨平台App,适合入门,快速掌握Dart语言以及上手flutter开发,希望和大家共同成长,喜欢的话，欢迎start或fork!
             * descMd :
             * envelopePic : https://www.wanandroid.com/blogimgs/28cc42a3-3b5a-47ea-b4f4-5cd935432a7d.png
             * fresh : false
             * id : 13210
             * link : https://www.wanandroid.com/blog/show/2750
             * niceDate : 2020-04-29 01:18
             * niceShareDate : 2020-04-29 01:18
             * origin :
             * prefix :
             * projectLink : https://github.com/fmtjava/flutter_eyepetizer
             * publishTime : 1588094327000
             * selfVisible : 0
             * shareDate : 1588094327000
             * shareUser :
             * superChapterId : 294
             * superChapterName : 开源项目主Tab
             * tags : [{"name":"项目","url":"/project/list/1?cid=402"}]
             * title : 一款基于Flutter实现的精美仿开眼视频跨平台App,适合新手入门，快速掌握Dart语言的基本语法以及快速上手flutter开发。
             * type : 0
             * userId : -1
             * visible : 1
             * zan : 0
             */

            @SerializedName("apkLink")
            private String apkLink;
            @SerializedName("audit")
            private int audit;
            @SerializedName("author")
            private String author;
            @SerializedName("canEdit")
            private boolean canEdit;
            @SerializedName("chapterId")
            private int chapterId;
            @SerializedName("chapterName")
            private String chapterName;
            @SerializedName("collect")
            private boolean collect;
            @SerializedName("courseId")
            private int courseId;
            @SerializedName("desc")
            private String desc;
            @SerializedName("descMd")
            private String descMd;
            @SerializedName("envelopePic")
            private String envelopePic;
            @SerializedName("fresh")
            private boolean fresh;
            @SerializedName("id")
            private int id;
            @SerializedName("link")
            private String link;
            @SerializedName("niceDate")
            private String niceDate;
            @SerializedName("niceShareDate")
            private String niceShareDate;
            @SerializedName("origin")
            private String origin;
            @SerializedName("prefix")
            private String prefix;
            @SerializedName("projectLink")
            private String projectLink;
            @SerializedName("publishTime")
            private long publishTime;
            @SerializedName("selfVisible")
            private int selfVisible;
            @SerializedName("shareDate")
            private long shareDate;
            @SerializedName("shareUser")
            private String shareUser;
            @SerializedName("superChapterId")
            private int superChapterId;
            @SerializedName("superChapterName")
            private String superChapterName;
            @SerializedName("title")
            private String title;
            @SerializedName("type")
            private int type;
            @SerializedName("userId")
            private int userId;
            @SerializedName("visible")
            private int visible;
            @SerializedName("zan")
            private int zan;
            @SerializedName("tags")
            private List<TagsBean> tags;

            public String getApkLink() {
                return apkLink;
            }

            public void setApkLink(String apkLink) {
                this.apkLink = apkLink;
            }

            public int getAudit() {
                return audit;
            }

            public void setAudit(int audit) {
                this.audit = audit;
            }

            public String getAuthor() {
                return author;
            }

            public void setAuthor(String author) {
                this.author = author;
            }

            public boolean isCanEdit() {
                return canEdit;
            }

            public void setCanEdit(boolean canEdit) {
                this.canEdit = canEdit;
            }

            public int getChapterId() {
                return chapterId;
            }

            public void setChapterId(int chapterId) {
                this.chapterId = chapterId;
            }

            public String getChapterName() {
                return chapterName;
            }

            public void setChapterName(String chapterName) {
                this.chapterName = chapterName;
            }

            public boolean isCollect() {
                return collect;
            }

            public void setCollect(boolean collect) {
                this.collect = collect;
            }

            public int getCourseId() {
                return courseId;
            }

            public void setCourseId(int courseId) {
                this.courseId = courseId;
            }

            public String getDesc() {
                return desc;
            }

            public void setDesc(String desc) {
                this.desc = desc;
            }

            public String getDescMd() {
                return descMd;
            }

            public void setDescMd(String descMd) {
                this.descMd = descMd;
            }

            public String getEnvelopePic() {
                return envelopePic;
            }

            public void setEnvelopePic(String envelopePic) {
                this.envelopePic = envelopePic;
            }

            public boolean isFresh() {
                return fresh;
            }

            public void setFresh(boolean fresh) {
                this.fresh = fresh;
            }

            public int getId() {
                return id;
            }

            public void setId(int id) {
                this.id = id;
            }

            public String getLink() {
                return link;
            }

            public void setLink(String link) {
                this.link = link;
            }

            public String getNiceDate() {
                return niceDate;
            }

            public void setNiceDate(String niceDate) {
                this.niceDate = niceDate;
            }

            public String getNiceShareDate() {
                return niceShareDate;
            }

            public void setNiceShareDate(String niceShareDate) {
                this.niceShareDate = niceShareDate;
            }

            public String getOrigin() {
                return origin;
            }

            public void setOrigin(String origin) {
                this.origin = origin;
            }

            public String getPrefix() {
                return prefix;
            }

            public void setPrefix(String prefix) {
                this.prefix = prefix;
            }

            public String getProjectLink() {
                return projectLink;
            }

            public void setProjectLink(String projectLink) {
                this.projectLink = projectLink;
            }

            public long getPublishTime() {
                return publishTime;
            }

            public void setPublishTime(long publishTime) {
                this.publishTime = publishTime;
            }

            public int getSelfVisible() {
                return selfVisible;
            }

            public void setSelfVisible(int selfVisible) {
                this.selfVisible = selfVisible;
            }

            public long getShareDate() {
                return shareDate;
            }

            public void setShareDate(long shareDate) {
                this.shareDate = shareDate;
            }

            public String getShareUser() {
                return shareUser;
            }

            public void setShareUser(String shareUser) {
                this.shareUser = shareUser;
            }

            public int getSuperChapterId() {
                return superChapterId;
            }

            public void setSuperChapterId(int superChapterId) {
                this.superChapterId = superChapterId;
            }

            public String getSuperChapterName() {
                return superChapterName;
            }

            public void setSuperChapterName(String superChapterName) {
                this.superChapterName = superChapterName;
            }

            public String getTitle() {
                return title;
            }

            public void setTitle(String title) {
                this.title = title;
            }

            public int getType() {
                return type;
            }

            public void setType(int type) {
                this.type = type;
            }

            public int getUserId() {
                return userId;
            }

            public void setUserId(int userId) {
                this.userId = userId;
            }

            public int getVisible() {
                return visible;
            }

            public void setVisible(int visible) {
                this.visible = visible;
            }

            public int getZan() {
                return zan;
            }

            public void setZan(int zan) {
                this.zan = zan;
            }

            public List<TagsBean> getTags() {
                return tags;
            }

            public void setTags(List<TagsBean> tags) {
                this.tags = tags;
            }

            public static class TagsBean {
                /**
                 * name : 项目
                 * url : /project/list/1?cid=402
                 */

                @SerializedName("name")
                private String name;
                @SerializedName("url")
                private String url;

                public String getName() {
                    return name;
                }

                public void setName(String name) {
                    this.name = name;
                }

                public String getUrl() {
                    return url;
                }

                public void setUrl(String url) {
                    this.url = url;
                }
            }
        }
    }
}
