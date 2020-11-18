package model.chuangjian.prototype;

import lombok.Data;

/**
 * @version 1.0
 * @Author zhugengsheng
 * @Date 2020/8/23 2:47 下午
 */
@Data
public class Project {
    private Long id;
    private String projectName;
    private Project projects;

    public static void main(String[] args) {
        Project project = new Project();
        Project project1 = new Project();
        project.setProjects(project1);
        project.setProjects(project);
        System.out.println(project.hashCode());
    }
}
