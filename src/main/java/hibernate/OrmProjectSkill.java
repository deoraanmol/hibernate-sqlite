package hibernate;

import javax.persistence.*;

@Entity
@Table(name = "project_skills")
public class OrmProjectSkill {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private String id;

    @Column(name = "p")
    private int pSkill;

    @Column(name = "n")
    private int nSkill;

    @Column(name = "a")
    private int aSkill;

    @Column(name = "w")
    private int wSkill;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public int getpSkill() {
        return pSkill;
    }

    public void setpSkill(int pSkill) {
        this.pSkill = pSkill;
    }

    public int getnSkill() {
        return nSkill;
    }

    public void setnSkill(int nSkill) {
        this.nSkill = nSkill;
    }

    public int getaSkill() {
        return aSkill;
    }

    public void setaSkill(int aSkill) {
        this.aSkill = aSkill;
    }

    public int getwSkill() {
        return wSkill;
    }

    public void setwSkill(int wSkill) {
        this.wSkill = wSkill;
    }
}
