/**
 * 
 */
package com.maoshen.boot.disconf;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Service;

import com.baidu.disconf.client.common.annotations.DisconfFile;


/**
 * redis配置文件
 * @description <br>
 * @author <a href="mailto:wei.jiang@lifesense.com">vakin</a>
 * @date 2016年1月5日
 * @Copyright (c) 2015, lifesense.com
 */
@Service
@Scope("singleton")
@DisconfFile(filename = "mysql.properties")
public class DbMysqlConfig {}

