package employeefile;

/**
 *
 * @author The Promised Lan
 */
public class Employee {

    private int empId;
    private String ipAddress;
    private String dateAdded;
    private String numRequest;

    public Employee() {
        empId = 0;
        ipAddress = "";
        dateAdded = "";
        numRequest = "";
       
    }

    public Employee(int empId, String ipAddress, String dateAdded, String numRequest) {
        this.empId = empId;
        this.ipAddress = ipAddress;
        this.dateAdded = dateAdded;
        this.numRequest = numRequest;
    }

    public String getIpAddress() {
        return ipAddress;
    }

    public void setIpAddress(String ipAddress) {
        this.ipAddress = ipAddress;
    }

    public int getEmpId() {
        return empId;
    }

    public void setEmpId(int empId) {
        this.empId = empId;
    }

    public String getDateAdded() {
        return dateAdded;
    }

    public void setDateAdded(String dateAdded) {
        this.dateAdded = dateAdded;
    }

    public String getNumRequest() {
        return numRequest;
    }

    public void setNumRequest(String numRequest) {
        this.numRequest = numRequest;
    }


    @Override
    public String toString() {
        return "Employee{" + "empId=" + empId + ", ipAddress=" + ipAddress 
                + ", dateAdded =" + dateAdded + ", numRequest=" + numRequest 
                + '}';
    }
}
