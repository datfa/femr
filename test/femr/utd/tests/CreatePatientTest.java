package femr.utd.tests;

import femr.common.models.PatientItem;
import femr.data.DataModelMapper;
import femr.data.models.core.IPatient;
import femr.data.IDataModelMapper;
import org.junit.Test;
import com.google.inject.Inject;


import static org.junit.Assert.*;

/**
 * Unit Tests for MedicationService
 */
public class CreatePatientTest extends BaseTest {

    private static IDataModelMapper dataModelMapper;

    @Inject
    public void setService(IDataModelMapper dataModelMapper) {
        this.dataModelMapper = dataModelMapper;
    }

    @Test
    public void testCreatePatient() throws Exception {
        PatientItem patient = new PatientItem();

        IPatient newPatient = dataModelMapper.createPatient(patient);
        assertNull(newPatient);
        assertTrue(true);

    }


}