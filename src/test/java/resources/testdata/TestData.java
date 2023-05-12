package resources.testdata;

import org.testng.annotations.DataProvider;

/**
 * Created by Jay
 */
public class TestData {

    @DataProvider(name ="LoginInvalidCredential")
    public Object[][] getInvalidCredential() {
        Object[][] data = new Object[][]{
                {"prime123@gmail.com", "prime234"}
        };
        return data;
    }

    @DataProvider(name="LoginWithValidCredential")
    public Object[][] getValidCredential(){
        Object[][] data = new Object[][]{
                {"zara123@gmail.com","Zaral12"}
        };
        return data;
    }
    @DataProvider(name="registertoaccount")
    public Object[][] getRegisterCredential() {
        Object[][] data = new Object[][]{
                {"female","Zara","Lee","20","10","2010","zara123@gmail.com","Zaral123","Zara123"}
        };
        return data;
    }
    @DataProvider(name="buildyourowncomputer")
    public Object[][] getdataset() {
        Object[][] data = new Object[][]{
                {"2.2 GHz Intel Pentium Dual-Core E2200","2 GB","320 GB","Vista Home [+$50.00]","Microsoft Office [+$50.00]"},
                { "2.5 GHz Intel Pentium Dual-Core E2200 [+$15.00]"," 4GB [+$20.00]","400 GB [+$100.00]"," Vista Premium [+$60.00]","Acrobat Reader [+$10.00]"},
                {"2.5 GHz Intel Pentium Dual-Core E2200 [+$15.00]" , "8GB [+$60.00]" , "320 GB" , "Vista Home [+$50.00]" ,"Total Commander [+$5.00]"}
        };
        return data;
    }

}

