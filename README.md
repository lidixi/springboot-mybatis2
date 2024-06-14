# springboot-mybatis2
maven+mybatis
数据库表包含主键，序号、子序号、内容、开始时间、结束时间；主键，外键关联序号和子序号，项目名称、内容、规格。
URL: GET http://localhost:8080/medicalOrder/byOrderNoAndTime,参数: orderNo, time;URL: GET http://localhost:8080/prescription/byId,参数: id;URL: POST http://localhost:8080/medicalOrder(或 prescription）/saveOrUpdate;URL: GET http://localhost:8080/prescription/byOrderNoAndSubOrderNo,参数: orderNo, subOrderNo;URL: GET http://localhost:8080/medicalOrder/byContentLike,参数: content;URL: GET http://localhost:8080/medicalOrder/countActiveOrders。
