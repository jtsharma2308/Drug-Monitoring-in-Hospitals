/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.WorkQueue;

/**
 *
 * @author raunak
 */
public class PatientWorkRequest extends WorkRequest{
    
    private String workProgress;

    public String getWorkProgress() {
        return workProgress;
    }

    public void setWorkProgress(String workProgress) {
        this.workProgress = workProgress;
    }
    
    
}
