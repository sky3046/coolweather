package com.coolweather.android.db;

import org.litepal.crud.DataSupport;

/**
 * Created by Administrator on 2017/4/22.
 */

public class County extends DataSupport{
    private int id;
    private String countName;
    private String weatherId;
    private int cityId;
    public void setId(int id){
        this.id=id;
    }
    public int getId(){
        return id;
    }
    public void setCountName(String countName){
        this.countName=countName;
    }
    public String getCountName(){
        return countName;
    }
    public void setWeatherId(String weatherId){
        this.weatherId=weatherId;
    }
    public String getWeatherId(){
        return weatherId;
    }
    public void setCityId(int cityId){
        this.cityId=cityId;
    }
    public int getCityId(){
        return cityId;
    }
}
