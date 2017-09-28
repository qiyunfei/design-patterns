package com.cloudfly.designpatterns.creational.singleton;

import java.util.Vector;

/**
 * @ClassName:GlobalConfig.java
 * @Description:影子实例实现 单例 属性更新
 * 采用"影子实例"的办法具体说，就是在更新属性时，直接生成另一个单例对象实例，
 * 这个新生成的单例对象实例将从数据库或文件中读取最新的配置信息；然后将这些配置信息直接赋值给旧单例对象的属性。
 * @author yunfei.qi
 * @date 2017年9月27日 下午6:26:44 
 */
public class GlobalConfig {
    private static GlobalConfig instance = null;
    private Vector<?> properties = null;
    private GlobalConfig() {
      //Load configuration information from DB or file
      //Set values for properties
    }
    private static synchronized void syncInit() {
      if (instance == null) {
        instance = new GlobalConfig();
      }
    }
    public static GlobalConfig getInstance() {
      if (instance == null) {
        syncInit();
      }
      return instance;
    }
    public Vector<?> getProperties() {
      return properties;
    }
    public void updateProperties() {
      //Load updated configuration information by new a GlobalConfig object
      GlobalConfig shadow = new GlobalConfig();
      properties = shadow.getProperties();
    }
  }
