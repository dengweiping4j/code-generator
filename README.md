# **项目说明** 
- 本项目是基于 renren-generator 二次开发的代码生成器 
<br>

[TOC]


## 不同点：

> 此项目生成的代码是基于SpringBoot + Jpa 的,如有需要，可自定义模板，mybatis暂未支持,可自行开发

## 原理分析

> 其实代码生成的原理非常简单，就是查询数据库的信息，然后通过模板引擎渲染出来


## 如何定制开发？

- 1 将写好的模板文件放入 template 目录下, 我是放到了 template/jpa 目录下
- 2 修改 GenUtils 类，getTemplates（模板资源加载的方法），getFileName（文件路径的方法，不一定要改）
- 3 关于模板的可用字段可以参考 GenUtils.generatorCode 方法
