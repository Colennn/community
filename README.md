# community

个人学习项目，正在学习中

## 明确需求

https://elasticsearch.cn/

## IDEA常用快捷键（录屏GIF写成文档）

Ctrl+Y：删除当前行

Ctrl+D:复制当前行

Ctrl+N：查找类文件

Ctrl+Shift+N：查找文件

*Ctrl+Alt+L：格式化代码

Alt+1：显示/隐藏侧边栏

*Ctrl+Alt+V：快速生成对象变量 --> 光标选中`new AccessTokenDTO()`--> 使用快捷键--> 生成AccessTokenDTO accessTokenDTO = new AccessTokenDTO();

Alt+insert：生成Getter&Setter

Ctrl+P：查看方法的参数

Alt+Enter：自动导包/自动生成方法

Ctrl+W：扩大选择范围

## Thymeleaf

```html
<div th:text="${session.user}"></div>
<li th:if="${session.user == null}"></li>
```

flyway更新表命令
```
mvn flyway:migrate
```



## Mybatis

下划线转驼峰命名配置（默认为false，一般需要配置）。当Java对象为驼峰命名，数据对象为下划线是配置。

```xml
mybatis.configuration.map-underscore-to-camel-case=true
```






## 实现步骤

1. 完成发布文章功能
   1. 使用flyway新建表 question
   2. questionMapper（插入）
   3. 新建model
   4. publish页面 action="/publish" methon="post"
   5. Controller
   6. 页面提示用户未登录功能

2. 添加Lombok支持
   1. flyway修改user，添加头像的字段
   2. 使用lombok来自动生成getter&setter、toString等方法
   3. 当cookie为空时会报错，要加一个判断debug

3. 完成首页问题列表功能
   1. 完成列表的布局
   2. 新建QuestionDTO
   3. 在mapper中写新方法
   4. Spring中的BeanUtil--》能快速将一类中的属性对应到另一个类中
   5. MyBatis配置--》驼峰转下划线
   6. thymleaf时间格式

4. 自动部署

   ```xml
   <dependency>
   	<groupId>org.springframework.boot</groupId>
   	<artifactId>spring-boot-devtools</artifactId>
   	<optional>true</optional>
   </dependency>
   ```

5. 实现分页功能

   1. 页面实现
   2. sql的limit语句10:30
   3. IndexController中需要加入分页功能传入页码和单页数量，13:30
   4. questionService(page,size)和questionMapper传入页码和单页数量14:50
   5. 定义一个PaginationDTO（包含问题列表，当前页、页码数组、是否展示上一页、下一页） 18:00
   6. 修改index
   7. 修改service
   8. 定义PaginationDTO的逻辑 29:00
   9. index页码编写53:00
   10. 转义字符 71:00
   11. 配置开启mybatis的sql日志

6. 完善导航栏并完成页面拆分

   1. 引入JQ
   2. span
   3. include

7. 个人资料、发布问题列表实现

   1. profile.html页面更新
   2. controller 
   3. Mapper
   4. flyway中新建profile表
   5. 页面列表传值
   6. thymeleaf路径问题60:00

8. 拦截器

   1. 判断用户是否登录，再根据逻辑跳转
   2. 对所有地址进行拦截

9. 通过源码分析不能加载资源问题

   1.   @EnableWebMvc
   2.   阅读源码，子类快捷键
   3.   ​

10. 完成问题详情页面

11. ​




## 文档编写

- [ ] IDEA Debug方法
- [ ] ThymeLeaf入门
- [ ] IDEA常用快捷键





## 插件


p23 小节中匠哥推荐的三个提高效率的插件分别是：

1. Octotree：快速以tree的方式展示github上的项目文件
2. Table of contents sidebar：快速展示文章大纲（匠哥纯手工打造）
3. OneTab：快速记录chrome打开页面，方便下次直接展开
     还没有安装的小伙伴们，可以安装起来咯