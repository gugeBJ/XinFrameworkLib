# XinFrameworkLib

 可以以Module形式引用到项目，作为基础框架。作为一个轻量级的单独配置Common基础框架。
 包括：APP配置、图片加载，网络请求（缓存处理）、数据存储、权限管理、文件管理、通用对话框和popup弹窗、Fragment工具封装等。



###### 整体结构：RxJAVA + Retrofit 2.0 + ObjectBox + MVP


###  使用方法：
##### 方法一：使用git命令

引入到项目使用：  
```
$ git subModule add git@github.com:wzx54321/XinFrameworkLib.git  

```
如果没有使用SSH方式请使用命令：  
```
$ git subModule add https://github.com/wzx54321/XinFrameworkLib.git
```
1) 在父项目中更新使用：  
```
$ git submodule foreach git pull
```
2) 在XinFrameworkLib目录下使用：  
```
$ git pull
```
3) 如果出现'XinFrameworkLib' already exists in the index使用  
```
$ git rm -r --cached XinFrameworkLib
```

#####   方法二：直接导入源码到项目

----------------------------------------------------------------------------------------------------  
  
    
    


####

该版本在旧版基础上进行重构和精简
**旧版地址：https://github.com/wzx54321/XinFramework**





#### About Me

炤鑫

个人主页：http://www.shindong.xin

网易博客：http://blog.163.com/ittfxin@126

邮    箱： Get_sugar@hotmail.com

 <div class='row'>
<img src="https://github.com/wzx54321/XinFrameworkLib/blob/master/imgs/blog.png" title="" width="25%" height="25%"/>   
  </div>

```

  Copyright  2017 [炤鑫]

  Licensed under the Apache License, Version 2.0 (the "License");
  you may not use this file except in compliance with the License.
  You may obtain a copy of the License at

      http://www.apache.org/licenses/LICENSE-2.0

  Unless required by applicable law or agreed to in writing, software
  distributed under the License is distributed on an "AS IS" BASIS,
  WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
  See the License for the specific language governing permissions
  and limitations under the License.

```
