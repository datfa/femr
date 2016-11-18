package femr.utd.tests;

import femr.ui.models.search.json.CitySearch;
import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.Assert.assertTrue;

/**
 * Unit Tests for CitySearch
 */
public class CitySearchTest extends BaseTest {

    CitySearch citySearch;
    @Test
    public void testCreatePatient() throws Exception {
        citySearch = new CitySearch();
        citySearch.setName("Test Name");
        List<CitySearch> citySearches = new ArrayList<>();
        assertTrue( citySearches.add(citySearch) );
    }


}