const base = {
    get() {
        return {
            url : "http://localhost:8080/yiqingxueshengqiangjia/",
            name: "yiqingxueshengqiangjia",
            // 退出到首页链接
            indexUrl: 'http://localhost:8080/yiqingxueshengqiangjia/front/index.html'
        };
    },
    getProjectName(){
        return {
            projectName: "疫情期间学生请假与销假系统"
        } 
    }
}
export default base
