# spring-cloud-study
---
[TOC]

---
## 1. 一个基本的Spring boot应用：helloboot
## 2. 分布式配置管理服务端
+ 创建分布式配置文件存放仓库：cloud-config-repo
+ 创建Spring Cloud配置服务器：cloud-config-server，将仓库中的配置文件转换为rest接口数据
+ 创建一个服务使用该远程配置
