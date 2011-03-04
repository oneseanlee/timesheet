package timeSheet.database.entity;

import javax.persistence.*;
import java.util.Date;

/**
 * User: John Lawrence
 * Date: 2/28/11
 * Time: 9:42 PM
 */
@Entity
@NamedQueries({
        @NamedQuery(name = "findHoursByEmployeeAndDate", query = "Select c from Hours c where c.employee = :employee and c.date = :date"),
        @NamedQuery(name = "findSumOfPaidHours", query = "Select sum(c.hours) from Hours c where c.date between :start and :end and c.employee = :employee and c.type.paid = true")
})
public class Hours extends BaseObject {
    @Id
    @GeneratedValue
    private int id;

    @ManyToOne(targetEntity = HourType.class)
    private HourType type;

    @ManyToOne(targetEntity = Employee.class)
    private Employee employee;

    @Temporal(TemporalType.DATE)
    private Date date;

    @Temporal(TemporalType.DATE)
    private Date dateEntered;

    @Column
    private Double hours;

    @Column
    private Boolean enteredByEmployee;

    @Column
    private Boolean employeeApproval;

    @Column
    private Boolean managerApproval;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public HourType getType() {
        return type;
    }

    public void setType(HourType type) {
        this.type = type;
    }

    public Employee getEmployee() {
        return employee;
    }

    public void setEmployee(Employee employee) {
        this.employee = employee;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public Date getDateEntered() {
        return dateEntered;
    }

    public void setDateEntered(Date dateEntered) {
        this.dateEntered = dateEntered;
    }

    public Double getHours() {
        return hours;
    }

    public void setHours(Double hours) {
        this.hours = hours;
    }

    public Boolean getEnteredByEmployee() {
        return enteredByEmployee;
    }

    public void setEnteredByEmployee(Boolean enteredByEmployee) {
        this.enteredByEmployee = enteredByEmployee;
    }

    public Boolean getEmployeeApproval() {
        return employeeApproval;
    }

    public void setEmployeeApproval(Boolean employeeApproval) {
        this.employeeApproval = employeeApproval;
    }

    public Boolean getManagerApproval() {
        return managerApproval;
    }

    public void setManagerApproval(Boolean managerApproval) {
        this.managerApproval = managerApproval;
    }
}