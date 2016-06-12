/**
 * Licensed to the Apache Software Foundation (ASF) under one or more
 * contributor license agreements.  See the NOTICE file distributed with
 * this work for additional information regarding copyright ownership.
 * The ASF licenses this file to You under the Apache License, Version 2.0
 * (the "License"); you may not use this file except in compliance with
 * the License.  You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package org.apache.camel.component.ibatis.springboot;

import com.ibatis.sqlmap.client.SqlMapClient;
import org.springframework.boot.context.properties.ConfigurationProperties;

/**
 * Performs a query poll insert update or delete in a relational database using
 * Apache iBATIS.
 * 
 * Generated by camel-package-maven-plugin - do not edit this file!
 */
@ConfigurationProperties(prefix = "camel.component.ibatis")
public class IBatisComponentConfiguration {

    /**
     * To use the given com.ibatis.sqlmap.client.SqlMapClient
     */
    private SqlMapClient sqlMapClient;
    /**
     * Location of iBatis xml configuration file. The default value is:
     * SqlMapConfig.xml loaded from the classpath
     */
    private String sqlMapConfig;
    /**
     * Whether to use transactions. This option is by default true.
     */
    private Boolean useTransactions = false;

    public SqlMapClient getSqlMapClient() {
        return sqlMapClient;
    }

    public void setSqlMapClient(SqlMapClient sqlMapClient) {
        this.sqlMapClient = sqlMapClient;
    }

    public String getSqlMapConfig() {
        return sqlMapConfig;
    }

    public void setSqlMapConfig(String sqlMapConfig) {
        this.sqlMapConfig = sqlMapConfig;
    }

    public Boolean getUseTransactions() {
        return useTransactions;
    }

    public void setUseTransactions(Boolean useTransactions) {
        this.useTransactions = useTransactions;
    }
}