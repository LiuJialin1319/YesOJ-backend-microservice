# 项目介绍

基于 **Spring Boot + Spring Cloud 微服务 + Docker**（前端采用 **Vue 3 + Arco Design**）构建的在线编程判题系统。用户可自由选择题目、在线编写代码并提交；系统将自动对提交的代码进行评测，依据出题人预设的测试用例和标准答案，精准判定提交结果的正确性。

整个系统由三大核心部分组成：**前端界面**、**微服务后端**、**代码沙箱**。

1、https://github.com/LiuJialin1319/YesOJ-frontend-master

2、

3、https://github.com/LiuJialin1319/YesOJ-code-sandbox

---

## 功能模块

### 📝 题目模块

- **a. 创建题目**（管理员） - 支持配置题目描述、测试用例、时间/内存限制等参数
- **b. 删除题目**（管理员） - 安全移除题目，支持软删除机制
- **c. 修改题目**（管理员） - 灵活编辑题目信息及判题规则
- **d. 搜索题目**（用户） - 多维度筛选，快速定位目标题目
- **e. 在线做题**（用户） - 集成代码编辑器，支持语法高亮与智能提示
- **f. 提交代码**（用户） - 一键提交，实时获取判题反馈

### 👥 用户模块

- **a. 用户注册** - 创建个人账号，开启编程之旅
- **b. 用户登录** - 安全认证，访问个人中心与提交记录

### ⚡ 判题模块

- **a. 提交判题** - 自动评测代码正确性，返回通过/拒绝结果
- **b. 错误处理** - 精准识别并友好提示各类异常：
  - 内存溢出（Memory Limit Exceeded）
  - 超时错误（Time Limit Exceeded）
  - 安全性问题（Security Violation）
  - 编译错误、运行时错误等
- **c. 代码沙箱** - 自主研发的安全执行环境，基于 Docker 容器实现资源隔离与安全防护
- **d. 开放接口** - 提供独立的判题 RESTful API，支持第三方系统集成

---

   


## 系统流程图
![img](http://www.snowyee.cn/assets/1717643394190-d663f305-8cc0-43b4-bc16-eb17d895111a-C6wOnBQH.png)

![img](http://www.snowyee.cn/assets/1717643394266-8d528709-4094-40ed-9431-247c22d41f84-k2v63OYV.png)

## 🎨 前端技术栈

| 技术 | 版本 | 说明 |
|------|------|------|
| **Node.js** | `16.17.1` | JavaScript 运行时环境 |
| **Vue** | `3.x` | 渐进式 JavaScript 框架 |
| **TypeScript** | `Latest` | JavaScript 的超集 |
| **UI 组件库** | `Arco Design` | 字节跳动开源的企业级 UI 组件库 |
| **代码编辑器** | `Monaco Editor` | VSCode 在线代码编辑组件 |
| **Markdown 编辑器** | `@bytemd/bytemd` | 字节跳动开源的 Markdown 编辑器 |
| **API 生成** | `openapi-typescript-codegen` | OpenApi 自动生成调用后端接口的方法 |

### 🔗 相关资源

- [OpenApi TypeScript Codegen](https://github.com/ferdikoomen/openapi-typescript-codegen)
- [Arco Design](https://arco.design/)
- [ByteMD](https://github.com/bytedance/bytemd)

---

## ⚙️ 后端技术栈

### 核心框架

| 技术 | 版本 | 说明 |
|------|------|------|
| **Java** | `1.8` | Java SE 开发工具包 |
| **Spring Boot** | `2.6.13` | 应用开发框架 |
| **Spring Cloud Alibaba** | `2021.0.5.0` | 微服务全家桶 |
| **Spring Cloud Gateway** | `3.1.x` | API 网关服务 |

### 数据存储

| 技术 | 版本 | 说明 |
|------|------|------|
| **MySQL** | `5.7` / `8.x` | 关系型数据库 |
| **Redis** | `6.0.10` | 内存数据库，缓存/会话管理 |
| **MyBatis-Plus** | `3.5.2` | ORM 持久层框架 |

### 中间件

| 技术 | 版本 | 说明 |
|------|------|------|
| **Nacos** | `2.2.0` | 服务注册与配置中心 |
| **RabbitMQ** | `3.8.8` / `3.12.6` | 消息队列（异步任务处理） |
| **Sentinel** | `1.7.0` | 流量控制、熔断降级 |
| **Seata** | `1.3.0` | 分布式事务解决方案 |

### 工具库

| 技术 | 版本 | 说明 |
|------|------|------|
| **Lombok** | `Latest` | 简化 Java 代码 |
| **Hutool** | `5.8.8` | Java 工具类库 |
| **Gson** | `2.9.1` | JSON 处理 |
| **EasyExcel** | `3.1.1` | Excel 处理 |
| **Commons Lang3** | `Latest` | Apache 通用工具 |
| **Commons Collections4** | `4.4` | 集合工具类 |

---

## 🛠️ 开发工具

| 工具 | 用途 |
|------|------|
| **IntelliJ IDEA** | Java 集成开发环境 |
| **Visual Studio Code** | 前端代码编辑 |
| **Maven** | 项目构建与依赖管理 |
| **Docker & Docker Compose** | 容器化部署 |
| **Git** | 版本控制 |


## 页面展示

<img width="1920" height="895" alt="image" src="https://github.com/user-attachments/assets/d63581ea-ffd9-4116-a3f2-6896befef7ae" />

---

<img width="1920" height="900" alt="image" src="https://github.com/user-attachments/assets/9104911c-dc77-4a17-bd9d-605b2d09529a" />

---

<img width="1920" height="900" alt="image" src="https://github.com/user-attachments/assets/d83cae55-a7ad-4746-8fcc-c8c20ccecf91" />




