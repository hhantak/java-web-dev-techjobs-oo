package org.launchcode.techjobs_oo.JobTest;

import org.junit.Assert;
import org.junit.Test;
import org.launchcode.techjobs_oo.*;

public class testSettingJobId {

    @Test
    public final void testUniqueId() {
        Job test_job = new Job();
        Assert.assertEquals(1, test_job.getId(), .001);
    }

    @Test
    public final void testJobConstructorSetsAllFields() {
        Job full_test_job = new Job("Product Tester", new Employer("ACME"), new Location("Desert"), new PositionType("Quality Control"), new CoreCompetency("Persistence"));
        Assert.assertEquals(full_test_job.getName(), "Product Tester");
        Assert.assertEquals(full_test_job.getEmployer().getValue(), "ACME");
        Assert.assertEquals(full_test_job.getLocation().getValue(), "Desert");
        Assert.assertEquals(full_test_job.getPositionType().getValue(), "Quality Control");
        Assert.assertEquals(full_test_job.getCoreCompetency().getValue(), "Persistence");
    }

    @Test
    public final void testJobsForEquality() {
        Job first_identical_job = new Job("Opera Singer", new Employer("The Metropolitan Opera"), new Location("New York City"), new PositionType("Countertenor"), new CoreCompetency("Confidence"));
        Job second_identical_job = new Job("Opera Singer", new Employer("The Metropolitan Opera"), new Location("New York City"), new PositionType("Countertenor"), new CoreCompetency("Confidence"));
        Assert.assertNotEquals(first_identical_job.getId(), second_identical_job.getId());
    }

    @Test
    public final void testJobToString() {
        Job job_to_string = new Job("Opera Singer", new Employer("The Metropolitan Opera"), new Location("New York City"), new PositionType("Countertenor"), new CoreCompetency("Confidence"));
        Assert.assertEquals(job_to_string.getName(), "Opera Singer");
    }
}
