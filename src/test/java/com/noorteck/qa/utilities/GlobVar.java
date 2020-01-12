package com.noorteck.qa.utilities;

import java.util.Properties;

import org.openqa.selenium.WebDriver;

import com.noorteck.qa.pages.Camp;
import com.noorteck.qa.pages.CampaingsPage;
import com.noorteck.qa.pages.FormsTemp;
import com.noorteck.qa.pages.HomePage;
import com.noorteck.qa.pages.Login;
import com.noorteck.qa.pages.TaskPage;

public class GlobVar {

	public static String envirementData = "/Users/iuliapopusoi/Eclipse /BDDFramework/src/test/resources/configs/EnvirementData.properties";

	public static int implisitWait = 15;

	public static WebDriver driver;
	public static Properties prop;

	public static Login loginObj;
	public static CampaingsPage campaingsObj;
	public static TaskPage taskObj;
	public static HomePage homeObj;
	public static TaskPage TaskPageObj;
	public static FormsTemp formsTempObj;
	public static Camp campObj;
	public static HomePage homePageObj;

	public static boolean controlFlag = true;

}
