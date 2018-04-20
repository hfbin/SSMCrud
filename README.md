#### **基础环境搭建**

• 1、在idea创建一个maven工程 

• 2、引入项目依赖的jar包
>• spring
• springmvc 
• mybatis 
• 数据库连接池，驱动包 
• pageHelper分页插件
• json
• 其他（jstl，servlet-api，junit） 

• 3、引入bootstrap前端框架 

• 4、编写ssm整合的关键配置文件 
>web.xml，spring,springmvc,mybatis，使用mybatis的逆向工程生成对应的bean以 及mapper      mybatis逆向工程参考链接http://blog.csdn.net/qq_33524158/article/details/78442664


#### **功能点**

• 1、分页 

• 2、数据校验 
> jquery前端校验+JSR303后端校验 

• 3、ajax  (全程ajax)

• 4、Rest风格的URI；使用HTTP协议请求方式的动词，来表示对资 源的操作（GET（查询），POST（新增），PUT（修改），DELETE （删除））  


#### **技术点**

• 基础框架-ssm（SpringMVC+Spring+MyBatis） 

• 数据库-MySQL 

• 前端框架-bootstrap

• 项目的依赖管理-Maven 

• 分页-pagehelper 

• 逆向工程-MyBatis Generator

#### **CRUD各模块分析**
>全程居于ajax

##### **所有的URI** 

•/emps 查询所有的员工

• /emp/{id} GET 查询员工 

• /emp  POST 保存员工 

• /emp/{id}  PUT  修改员工 

• /emp/{id}  DELETE 删除员工

##### **CRUD-查询**
![这里写图片描述](http://img.blog.csdn.net/20171104154615435?watermark/2/text/aHR0cDovL2Jsb2cuY3Nkbi5uZXQvcXFfMzM1MjQxNTg=/font/5a6L5L2T/fontsize/400/fill/I0JBQkFCMA==/dissolve/70/gravity/SouthEast)

查询-逻辑

• 1、index.jsp页面直接发送ajax请求进行员工分页数据的查询 

• 2、服务器将查出的数据，以json字符串的形式返回给浏览器 

• 3、浏览器收到js字符串。可以使用js对json进行解析，使用js通过 dom增删改改变页面。 

• 4、返回json。实现客户端的无关性

##### **CRUD-添加**
![这里写图片描述](http://img.blog.csdn.net/20171104155157853?watermark/2/text/aHR0cDovL2Jsb2cuY3Nkbi5uZXQvcXFfMzM1MjQxNTg=/font/5a6L5L2T/fontsize/400/fill/I0JBQkFCMA==/dissolve/70/gravity/SouthEast)


新增-逻辑

• 1、在index.jsp页面点击”新增” 

• 2、弹出新增对话框 

• 3、去数据库查询部门列表，显示在对话框中 

• 4、用户输入数据，并进行校验 

• jquery前端校验，ajax用户名重复校验，重要数据（后端校验(JSR303)，唯一约束）； 

• 5、完成保存


##### **CRUD-修改**
![这里写图片描述](http://img.blog.csdn.net/20171104155639266?watermark/2/text/aHR0cDovL2Jsb2cuY3Nkbi5uZXQvcXFfMzM1MjQxNTg=/font/5a6L5L2T/fontsize/400/fill/I0JBQkFCMA==/dissolve/70/gravity/SouthEast)

修改-逻辑

• 1、点击编辑 

• 2、弹出用户修改的模态框（显示用户信息） 

• 3、点击更新，完成用户修改

##### **CRUD-删除**

单个删除

![这里写图片描述](http://img.blog.csdn.net/20171104155837233?watermark/2/text/aHR0cDovL2Jsb2cuY3Nkbi5uZXQvcXFfMzM1MjQxNTg=/font/5a6L5L2T/fontsize/400/fill/I0JBQkFCMA==/dissolve/70/gravity/SouthEast)

多个删除

![这里写图片描述](http://img.blog.csdn.net/20171104155847494?watermark/2/text/aHR0cDovL2Jsb2cuY3Nkbi5uZXQvcXFfMzM1MjQxNTg=/font/5a6L5L2T/fontsize/400/fill/I0JBQkFCMA==/dissolve/70/gravity/SouthEast)

多个删除与单个删除-逻辑

• 1、点击单个或多个删除 

• 2、弹出用户删除的提示框（显示姓名）

• 3、点击确定，完成用户删除




#### **已经发布有**
 SSM整合 http://blog.csdn.net/qq_33524158/article/details/78360268

MyBatis-逆向工程讲解 http://blog.csdn.net/qq_33524158/article/details/78442664

SSM实现简单的CRUD之DAO层 http://blog.csdn.net/qq_33524158/article/details/78442771

SSM实现简单的CRUD之Service层 http://blog.csdn.net/qq_33524158/article/details/78449897

SSM实现简单的CRUD之Web层http://blog.csdn.net/qq_33524158/article/details/78462932


项目源码地址：https://github.com/hfbin/SSM-crud
