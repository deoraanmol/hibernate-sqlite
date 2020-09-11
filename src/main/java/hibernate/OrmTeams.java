package hibernate;

import interfaces.ITeams;
import utils.Validators;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Entity
@Table(name = "teams")
public class OrmTeams implements ITeams {

    public static List<OrmTeams> fromSuggestedTeams(List<OrmSuggestedTeams> ormSuggestedTeamsList) {
        List<OrmTeams> ormTeams = new ArrayList<>();
        for(OrmSuggestedTeams ormSuggestedTeam: ormSuggestedTeamsList) {
            OrmTeams ormTeam = new OrmTeams();
            ormTeam.setId(ormSuggestedTeam.getId());
            ormTeam.setProject(ormSuggestedTeam.getProject());
            ormTeam.setStudent1(ormSuggestedTeam.getStudent1());
            ormTeam.setStudent2(ormSuggestedTeam.getStudent2());
            ormTeam.setStudent3(ormSuggestedTeam.getStudent3());
            ormTeam.setStudent4(ormSuggestedTeam.getStudent4());
            ormTeams.add(ormTeam);
        }
        return ormTeams;
    }

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @OneToOne(targetEntity = OrmProjects.class)
    @JoinColumn(name="project_id", unique = true)
    private OrmProjects project;

    @OneToOne(targetEntity = OrmStudents.class)
    @JoinColumn(name="student_id_1")
    private OrmStudents student1;

    @OneToOne(targetEntity = OrmStudents.class)
    @JoinColumn(name="student_id_2")
    private OrmStudents student2;

    @OneToOne(targetEntity = OrmStudents.class)
    @JoinColumn(name="student_id_3")
    private OrmStudents student3;

    @OneToOne(targetEntity = OrmStudents.class)
    @JoinColumn(name="student_id_4")
    private OrmStudents student4;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public OrmProjects getProject() {
        return project;
    }

    public void setProject(OrmProjects project) {
        this.project = project;
    }

    public OrmStudents getStudent1() {
        return student1;
    }

    public void setStudent1(OrmStudents student1) {
        this.student1 = student1;
    }

    public OrmStudents getStudent2() {
        return student2;
    }

    public void setStudent2(OrmStudents student2) {
        this.student2 = student2;
    }

    public OrmStudents getStudent3() {
        return student3;
    }

    public void setStudent3(OrmStudents student3) {
        this.student3 = student3;
    }

    public OrmStudents getStudent4() {
        return student4;
    }

    public void setStudent4(OrmStudents student4) {
        this.student4 = student4;
    }
}
