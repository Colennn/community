# community

个人学习项目，正在学习中

## 明确需求

https://elasticsearch.cn/

## IDEA常用快捷键

Ctrl+Y：删除当前行

Ctrl+D:复制当前行

Ctrl+N：查找类文件

Ctrl+Shift+N：查找文件

*Ctrl+Alt+L：格式化代码

Alt+1：显示/隐藏侧边栏

*Ctrl+Alt+V：快速生成对象变量 -->
光标选中“new AccessTokenDTO()” --> 使用快捷键--> 生成AccessTokenDTO accessTokenDTO = new AccessTokenDTO();

Alt+insert：生成Getter&Setter

## Thymeleaf

```html
<div th:text="${session.user}"></div>
<li th:if="${session.user == null}"></li>
```