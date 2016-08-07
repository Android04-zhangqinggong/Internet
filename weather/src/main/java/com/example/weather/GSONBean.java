package com.example.weather;

import java.util.List;

/**
 * Created by Administrator on 2016/8/4.
 */
public class GSONBean {
    /**
     * reason : successed!
     * result : {"data":{"realtime":{"wind":{"windspeed":"3.0","direct":"东南风","power":"1级","offset":null},"time":"18:00:00","weather":{"humidity":"69","img":"1","info":"多云","temperature":"31"},"dataUptime":1470308749,"date":"2016-08-04","city_code":"101210701","city_name":"温州","week":4,"moon":"七月初二"},"life":{"date":"2016-8-4","info":{"kongtiao":["部分时间开启","天气热，再加上近两天的较高温天气您将感到些燥热，因此需要适当开启制冷空调来降低温度。"],"yundong":["较不宜","有降水，推荐您在室内进行健身休闲运动；若坚持户外运动，须注意携带雨具并注意避雨防滑。"],"ziwaixian":["中等","属中等强度紫外线辐射天气，外出时建议涂擦SPF高于15、PA+的防晒护肤品，戴帽子、太阳镜。"],"ganmao":["少发","各项气象条件适宜，发生感冒机率较低。但请避免长期处于空调房间中，以防感冒。"],"xiche":["不宜","不宜洗车，未来24小时内有雨，如果在此期间洗车，雨水和路上的泥水可能会再次弄脏您的爱车。"],"wuran":["良","气象条件有利于空气污染物稀释、扩散和清除，可在室外正常活动。"],"chuanyi":["炎热","天气炎热，建议着短衫、短裙、短裤、薄型T恤衫等清凉夏季服装。"]}},"weather":[{"date":"2016-08-04","info":{"night":["1","多云","26","西南风","微风","18:45"],"day":["4","雷阵雨","33","西南风","微风","05:21"]},"week":"四","nongli":"七月初二"},{"date":"2016-08-05","info":{"dawn":["1","多云","26","西南风","微风","18:45"],"night":["1","多云","26","西南风","微风","18:44"],"day":["1","多云","34","西南风","微风","05:22"]},"week":"五","nongli":"七月初三"},{"date":"2016-08-06","info":{"dawn":["1","多云","26","西南风","微风","18:44"],"night":["3","阵雨","26","西南风","微风","18:43"],"day":["3","阵雨","33","西南风","微风","05:22"]},"week":"六","nongli":"七月初四"},{"date":"2016-08-07","info":{"dawn":["3","阵雨","26","西南风","微风","18:43"],"night":["2","阴","26","西南风","微风","18:42"],"day":["3","阵雨","33","西南风","微风","05:23"]},"week":"日","nongli":"七月初五"},{"date":"2016-08-08","info":{"dawn":["2","阴","26","西南风","微风","18:42"],"night":["3","阵雨","26","西南风","微风","18:42"],"day":["3","阵雨","34","西南风","微风","05:23"]},"week":"一","nongli":"七月初六"},{"date":"2016-08-09","info":{"night":["4","雷阵雨","25","东北风","微风","19:30"],"day":["4","雷阵雨","32","东北风","微风","07:30"]},"week":"二","nongli":"七月初七"},{"date":"2016-08-10","info":{"night":["4","雷阵雨","26","","微风","19:30"],"day":["4","雷阵雨","32","","微风","07:30"]},"week":"三","nongli":"七月初八"}],"pm25":{"key":"","show_desc":0,"pm25":{"curPm":"53","pm25":"29","pm10":"53","level":2,"quality":"良","des":"今天的空气质量是可以接受的，除少数异常敏感体质的人群外，大家可在户外正常活动。"},"dateTime":"2016年08月04日19时","cityName":"温州"},"date":null,"isForeign":0}}
     * error_code : 0
     */

    private String reason;
    /**
     * data : {"realtime":{"wind":{"windspeed":"3.0","direct":"东南风","power":"1级","offset":null},"time":"18:00:00","weather":{"humidity":"69","img":"1","info":"多云","temperature":"31"},"dataUptime":1470308749,"date":"2016-08-04","city_code":"101210701","city_name":"温州","week":4,"moon":"七月初二"},"life":{"date":"2016-8-4","info":{"kongtiao":["部分时间开启","天气热，再加上近两天的较高温天气您将感到些燥热，因此需要适当开启制冷空调来降低温度。"],"yundong":["较不宜","有降水，推荐您在室内进行健身休闲运动；若坚持户外运动，须注意携带雨具并注意避雨防滑。"],"ziwaixian":["中等","属中等强度紫外线辐射天气，外出时建议涂擦SPF高于15、PA+的防晒护肤品，戴帽子、太阳镜。"],"ganmao":["少发","各项气象条件适宜，发生感冒机率较低。但请避免长期处于空调房间中，以防感冒。"],"xiche":["不宜","不宜洗车，未来24小时内有雨，如果在此期间洗车，雨水和路上的泥水可能会再次弄脏您的爱车。"],"wuran":["良","气象条件有利于空气污染物稀释、扩散和清除，可在室外正常活动。"],"chuanyi":["炎热","天气炎热，建议着短衫、短裙、短裤、薄型T恤衫等清凉夏季服装。"]}},"weather":[{"date":"2016-08-04","info":{"night":["1","多云","26","西南风","微风","18:45"],"day":["4","雷阵雨","33","西南风","微风","05:21"]},"week":"四","nongli":"七月初二"},{"date":"2016-08-05","info":{"dawn":["1","多云","26","西南风","微风","18:45"],"night":["1","多云","26","西南风","微风","18:44"],"day":["1","多云","34","西南风","微风","05:22"]},"week":"五","nongli":"七月初三"},{"date":"2016-08-06","info":{"dawn":["1","多云","26","西南风","微风","18:44"],"night":["3","阵雨","26","西南风","微风","18:43"],"day":["3","阵雨","33","西南风","微风","05:22"]},"week":"六","nongli":"七月初四"},{"date":"2016-08-07","info":{"dawn":["3","阵雨","26","西南风","微风","18:43"],"night":["2","阴","26","西南风","微风","18:42"],"day":["3","阵雨","33","西南风","微风","05:23"]},"week":"日","nongli":"七月初五"},{"date":"2016-08-08","info":{"dawn":["2","阴","26","西南风","微风","18:42"],"night":["3","阵雨","26","西南风","微风","18:42"],"day":["3","阵雨","34","西南风","微风","05:23"]},"week":"一","nongli":"七月初六"},{"date":"2016-08-09","info":{"night":["4","雷阵雨","25","东北风","微风","19:30"],"day":["4","雷阵雨","32","东北风","微风","07:30"]},"week":"二","nongli":"七月初七"},{"date":"2016-08-10","info":{"night":["4","雷阵雨","26","","微风","19:30"],"day":["4","雷阵雨","32","","微风","07:30"]},"week":"三","nongli":"七月初八"}],"pm25":{"key":"","show_desc":0,"pm25":{"curPm":"53","pm25":"29","pm10":"53","level":2,"quality":"良","des":"今天的空气质量是可以接受的，除少数异常敏感体质的人群外，大家可在户外正常活动。"},"dateTime":"2016年08月04日19时","cityName":"温州"},"date":null,"isForeign":0}
     */

    private ResultBean result;
    private int error_code;

    public String getReason() {
        return reason;
    }

    public void setReason(String reason) {
        this.reason = reason;
    }

    public ResultBean getResult() {
        return result;
    }

    public void setResult(ResultBean result) {
        this.result = result;
    }

    public int getError_code() {
        return error_code;
    }

    public void setError_code(int error_code) {
        this.error_code = error_code;
    }

    public static class ResultBean {
        /**
         * realtime : {"wind":{"windspeed":"3.0","direct":"东南风","power":"1级","offset":null},"time":"18:00:00","weather":{"humidity":"69","img":"1","info":"多云","temperature":"31"},"dataUptime":1470308749,"date":"2016-08-04","city_code":"101210701","city_name":"温州","week":4,"moon":"七月初二"}
         * life : {"date":"2016-8-4","info":{"kongtiao":["部分时间开启","天气热，再加上近两天的较高温天气您将感到些燥热，因此需要适当开启制冷空调来降低温度。"],"yundong":["较不宜","有降水，推荐您在室内进行健身休闲运动；若坚持户外运动，须注意携带雨具并注意避雨防滑。"],"ziwaixian":["中等","属中等强度紫外线辐射天气，外出时建议涂擦SPF高于15、PA+的防晒护肤品，戴帽子、太阳镜。"],"ganmao":["少发","各项气象条件适宜，发生感冒机率较低。但请避免长期处于空调房间中，以防感冒。"],"xiche":["不宜","不宜洗车，未来24小时内有雨，如果在此期间洗车，雨水和路上的泥水可能会再次弄脏您的爱车。"],"wuran":["良","气象条件有利于空气污染物稀释、扩散和清除，可在室外正常活动。"],"chuanyi":["炎热","天气炎热，建议着短衫、短裙、短裤、薄型T恤衫等清凉夏季服装。"]}}
         * weather : [{"date":"2016-08-04","info":{"night":["1","多云","26","西南风","微风","18:45"],"day":["4","雷阵雨","33","西南风","微风","05:21"]},"week":"四","nongli":"七月初二"},{"date":"2016-08-05","info":{"dawn":["1","多云","26","西南风","微风","18:45"],"night":["1","多云","26","西南风","微风","18:44"],"day":["1","多云","34","西南风","微风","05:22"]},"week":"五","nongli":"七月初三"},{"date":"2016-08-06","info":{"dawn":["1","多云","26","西南风","微风","18:44"],"night":["3","阵雨","26","西南风","微风","18:43"],"day":["3","阵雨","33","西南风","微风","05:22"]},"week":"六","nongli":"七月初四"},{"date":"2016-08-07","info":{"dawn":["3","阵雨","26","西南风","微风","18:43"],"night":["2","阴","26","西南风","微风","18:42"],"day":["3","阵雨","33","西南风","微风","05:23"]},"week":"日","nongli":"七月初五"},{"date":"2016-08-08","info":{"dawn":["2","阴","26","西南风","微风","18:42"],"night":["3","阵雨","26","西南风","微风","18:42"],"day":["3","阵雨","34","西南风","微风","05:23"]},"week":"一","nongli":"七月初六"},{"date":"2016-08-09","info":{"night":["4","雷阵雨","25","东北风","微风","19:30"],"day":["4","雷阵雨","32","东北风","微风","07:30"]},"week":"二","nongli":"七月初七"},{"date":"2016-08-10","info":{"night":["4","雷阵雨","26","","微风","19:30"],"day":["4","雷阵雨","32","","微风","07:30"]},"week":"三","nongli":"七月初八"}]
         * pm25 : {"key":"","show_desc":0,"pm25":{"curPm":"53","pm25":"29","pm10":"53","level":2,"quality":"良","des":"今天的空气质量是可以接受的，除少数异常敏感体质的人群外，大家可在户外正常活动。"},"dateTime":"2016年08月04日19时","cityName":"温州"}
         * date : null
         * isForeign : 0
         */

        private DataBean data;

        public DataBean getData() {
            return data;
        }

        public void setData(DataBean data) {
            this.data = data;
        }

        public static class DataBean {
            /**
             * wind : {"windspeed":"3.0","direct":"东南风","power":"1级","offset":null}
             * time : 18:00:00
             * weather : {"humidity":"69","img":"1","info":"多云","temperature":"31"}
             * dataUptime : 1470308749
             * date : 2016-08-04
             * city_code : 101210701
             * city_name : 温州
             * week : 4
             * moon : 七月初二
             */

            private RealtimeBean realtime;
            /**
             * date : 2016-8-4
             * info : {"kongtiao":["部分时间开启","天气热，再加上近两天的较高温天气您将感到些燥热，因此需要适当开启制冷空调来降低温度。"],"yundong":["较不宜","有降水，推荐您在室内进行健身休闲运动；若坚持户外运动，须注意携带雨具并注意避雨防滑。"],"ziwaixian":["中等","属中等强度紫外线辐射天气，外出时建议涂擦SPF高于15、PA+的防晒护肤品，戴帽子、太阳镜。"],"ganmao":["少发","各项气象条件适宜，发生感冒机率较低。但请避免长期处于空调房间中，以防感冒。"],"xiche":["不宜","不宜洗车，未来24小时内有雨，如果在此期间洗车，雨水和路上的泥水可能会再次弄脏您的爱车。"],"wuran":["良","气象条件有利于空气污染物稀释、扩散和清除，可在室外正常活动。"],"chuanyi":["炎热","天气炎热，建议着短衫、短裙、短裤、薄型T恤衫等清凉夏季服装。"]}
             */

            private LifeBean life;
            /**
             * key :
             * show_desc : 0
             * pm25 : {"curPm":"53","pm25":"29","pm10":"53","level":2,"quality":"良","des":"今天的空气质量是可以接受的，除少数异常敏感体质的人群外，大家可在户外正常活动。"}
             * dateTime : 2016年08月04日19时
             * cityName : 温州
             */


            private Object date;
            private int isForeign;
            /**
             * date : 2016-08-04
             * info : {"night":["1","多云","26","西南风","微风","18:45"],"day":["4","雷阵雨","33","西南风","微风","05:21"]}
             * week : 四
             * nongli : 七月初二
             */

            private List<WeatherBean> weather;

            public RealtimeBean getRealtime() {
                return realtime;
            }

            public void setRealtime(RealtimeBean realtime) {
                this.realtime = realtime;
            }

            public LifeBean getLife() {
                return life;
            }

            public void setLife(LifeBean life) {
                this.life = life;
            }



            public Object getDate() {
                return date;
            }

            public void setDate(Object date) {
                this.date = date;
            }

            public int getIsForeign() {
                return isForeign;
            }

            public void setIsForeign(int isForeign) {
                this.isForeign = isForeign;
            }

            public List<WeatherBean> getWeather() {
                return weather;
            }

            public void setWeather(List<WeatherBean> weather) {
                this.weather = weather;
            }

            public static class RealtimeBean {
                /**
                 * windspeed : 3.0
                 * direct : 东南风
                 * power : 1级
                 * offset : null
                 */

                private WindBean wind;
                private String time;
                /**
                 * humidity : 69
                 * img : 1
                 * info : 多云
                 * temperature : 31
                 */

                private WeatherBean weather;
                private int dataUptime;
                private String date;
                private String city_code;
                private String city_name;
                private int week;
                private String moon;

                public WindBean getWind() {
                    return wind;
                }

                public void setWind(WindBean wind) {
                    this.wind = wind;
                }

                public String getTime() {
                    return time;
                }

                public void setTime(String time) {
                    this.time = time;
                }

                public WeatherBean getWeather() {
                    return weather;
                }

                public void setWeather(WeatherBean weather) {
                    this.weather = weather;
                }

                public int getDataUptime() {
                    return dataUptime;
                }

                public void setDataUptime(int dataUptime) {
                    this.dataUptime = dataUptime;
                }

                public String getDate() {
                    return date;
                }

                public void setDate(String date) {
                    this.date = date;
                }

                public String getCity_code() {
                    return city_code;
                }

                public void setCity_code(String city_code) {
                    this.city_code = city_code;
                }

                public String getCity_name() {
                    return city_name;
                }

                public void setCity_name(String city_name) {
                    this.city_name = city_name;
                }

                public int getWeek() {
                    return week;
                }

                public void setWeek(int week) {
                    this.week = week;
                }

                public String getMoon() {
                    return moon;
                }

                public void setMoon(String moon) {
                    this.moon = moon;
                }

                public static class WindBean {
                    private String windspeed;
                    private String direct;
                    private String power;
                    private Object offset;

                    public String getWindspeed() {
                        return windspeed;
                    }

                    public void setWindspeed(String windspeed) {
                        this.windspeed = windspeed;
                    }

                    public String getDirect() {
                        return direct;
                    }

                    public void setDirect(String direct) {
                        this.direct = direct;
                    }

                    public String getPower() {
                        return power;
                    }

                    public void setPower(String power) {
                        this.power = power;
                    }

                    public Object getOffset() {
                        return offset;
                    }

                    public void setOffset(Object offset) {
                        this.offset = offset;
                    }
                }

                public static class WeatherBean {
                    private String humidity;
                    private String img;
                    private String info;
                    private String temperature;

                    public String getHumidity() {
                        return humidity;
                    }

                    public void setHumidity(String humidity) {
                        this.humidity = humidity;
                    }

                    public String getImg() {
                        return img;
                    }

                    public void setImg(String img) {
                        this.img = img;
                    }

                    public String getInfo() {
                        return info;
                    }

                    public void setInfo(String info) {
                        this.info = info;
                    }

                    public String getTemperature() {
                        return temperature;
                    }

                    public void setTemperature(String temperature) {
                        this.temperature = temperature;
                    }
                }
            }

            public static class LifeBean {
                private String date;
                private InfoBean info;

                public String getDate() {
                    return date;
                }

                public void setDate(String date) {
                    this.date = date;
                }

                public InfoBean getInfo() {
                    return info;
                }

                public void setInfo(InfoBean info) {
                    this.info = info;
                }

                public static class InfoBean {
                    private List<String> kongtiao;
                    private List<String> yundong;
                    private List<String> ziwaixian;
                    private List<String> ganmao;
                    private List<String> xiche;
                    private List<String> wuran;
                    private List<String> chuanyi;

                    public List<String> getKongtiao() {
                        return kongtiao;
                    }

                    public void setKongtiao(List<String> kongtiao) {
                        this.kongtiao = kongtiao;
                    }

                    public List<String> getYundong() {
                        return yundong;
                    }

                    public void setYundong(List<String> yundong) {
                        this.yundong = yundong;
                    }

                    public List<String> getZiwaixian() {
                        return ziwaixian;
                    }

                    public void setZiwaixian(List<String> ziwaixian) {
                        this.ziwaixian = ziwaixian;
                    }

                    public List<String> getGanmao() {
                        return ganmao;
                    }

                    public void setGanmao(List<String> ganmao) {
                        this.ganmao = ganmao;
                    }

                    public List<String> getXiche() {
                        return xiche;
                    }

                    public void setXiche(List<String> xiche) {
                        this.xiche = xiche;
                    }

                    public List<String> getWuran() {
                        return wuran;
                    }

                    public void setWuran(List<String> wuran) {
                        this.wuran = wuran;
                    }

                    public List<String> getChuanyi() {
                        return chuanyi;
                    }

                    public void setChuanyi(List<String> chuanyi) {
                        this.chuanyi = chuanyi;
                    }
                }
            }



            public static class WeatherBean {
                private String date;
                private InfoBean info;
                private String week;
                private String nongli;

                public String getDate() {
                    return date;
                }

                public void setDate(String date) {
                    this.date = date;
                }

                public InfoBean getInfo() {
                    return info;
                }

                public void setInfo(InfoBean info) {
                    this.info = info;
                }

                public String getWeek() {
                    return week;
                }

                public void setWeek(String week) {
                    this.week = week;
                }

                public String getNongli() {
                    return nongli;
                }

                public void setNongli(String nongli) {
                    this.nongli = nongli;
                }

                public static class InfoBean {
                    private List<String> night;
                    private List<String> day;

                    public List<String> getNight() {
                        return night;
                    }

                    public void setNight(List<String> night) {
                        this.night = night;
                    }

                    public List<String> getDay() {
                        return day;
                    }

                    public void setDay(List<String> day) {
                        this.day = day;
                    }
                }
            }
        }
    }
}
