package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;

public class SearchPage extends BasePage{

    public SearchPage(WebDriver driver){
        super(driver);

    }
    //locators
    By searchInput = By.cssSelector("input[class=\"css-ukkbbr e1n2h7jb1\"]");
    By searchButton = By.cssSelector("button[type=\"submit\"]");
    By datePostedLocator = By.xpath ("//h3[@class='css-1d5tds3']//i[@class='css-1oy4qip efou2fk0']//*[name()='svg']//*[name()='path']");
    By pastWeekLocator = By.xpath("//div[@class='css-1omce3u']//div[3]//label[1]//div[1]");
    By numberOfJobsFound = By.cssSelector("span[class=\"css-xkh9ud\"]");
    By firstJobLocator = By.xpath("//div[@class=\"css-9i2afk\"]/div[2]/div[1]/div/div[1]/h2/a");
    By applyButton = By.cssSelector("button[class=\"css-1m0yk35 ezfki8j0\"]");
    By firstNameInput = By.cssSelector("input[name=\"firstname\"]");
    By lastNameInput = By.cssSelector("input[name=\"lastname\"]");
    By emailInput = By.cssSelector("input[id=\"email\"]");
    By passwordInput = By.cssSelector("div[class=\"css-sbn8kg e2hijbg0\"] input[name=\"password\"]");
    By signUpButton = By.cssSelector("button[class=\"css-6lejne ezfki8j0\"]");
    By careerLevel = By.xpath("//div[@class=\"css-12119hv exkztdf0\"]//div[@class=\"section-validation-error css-6hend0 e1v1l3u10\"][1]/div/div[2]/strong");
    By fullTimeJob = By.xpath("//div[@class='css-12119hv exkztdf0']//div[2]//div[1]//button[1]//i[1]//*[name()='svg']");
    By remoteWorkPlace = By.xpath("//div[3]//div[1]//button[2]//i[1]//*[name()='svg']//*[name()='path' and contains(@fill,'#4D6182')]");
    By softwareDevelopment = By.xpath("//div[normalize-space()='IT/Software Development']//i//*[name()='svg']//*[name()='path' and contains(@fill,'#4D6182')]");
    By minimumSalaries = By.xpath("//input[@name=\"minimumSalary\"]");
    By saveAndContinue = By.xpath("//button[@class=\"css-1wj05oe ezfki8j0\"]");
    By birthDateDay = By.cssSelector("div[class=\"css-1x21pox e6pv2vl4\"] div[class=\"col-2-lg col-12\"] div[class=\" css-1wy0on6\"] i[class=\"css-tjx49 efou2fk0\"]");
    By day5 = By.xpath("//div[@class=\"css-1x21pox e6pv2vl4\"]/div/div[1]/div/div[2]/div/div[5]");
    By birthDateMonth = By.xpath("//div[@class=\"css-1x21pox e6pv2vl4\"]//div[@class=\"col-3-lg col-12\"][1]/div/div/div[2]/i");
    By MarchMonth = By.xpath("//div[@class=\"css-1x21pox e6pv2vl4\"]/div/div[2]/div/div[2]/div/div[3]");
    By birthDateYearLocator = By.xpath("//div[@class=\"css-1x21pox e6pv2vl4\"]//div[@class=\"col-3-lg col-12\"][2]/div/div/div[2]/i");
    By birthDayYear = By.xpath("//div[@class=\"css-1x21pox e6pv2vl4\"]/div/div[3]/div/div[2]/div/div[22]");
    By femaleLocator = By.xpath ("//div[normalize-space()='Female']");
    By nationalityLocator = By.xpath("//div[@class=\"css-12119hv exkztdf0\"] //div[@class=\"section-validation-error css-6hend0 e1v1l3u10\"][1]/div[5]/div/div[2]");
    By egyptNationality = By.xpath("//div[@class=\"css-12119hv exkztdf0\"] //div[@class=\"section-validation-error css-6hend0 e1v1l3u10\"][1]/div[5]/div/div/div[2]/div/div[42]");
    By countryCityLocator =By.xpath("//div[@class=\"css-12119hv exkztdf0\"]//div[@class=\"section-validation-error css-6hend0 e1v1l3u10\"][1]/div[2]/div/div[2]/div");
    By cairoLocator = By.xpath("//div[@class=\"css-12119hv exkztdf0\"]//div[@class=\"section-validation-error css-6hend0 e1v1l3u10\"][1]/div[2]/div/div[2]/div[2]/div/div[6]");
    By areaLocator =By.xpath("//div[@class=\"css-12119hv exkztdf0\"]//div[@class=\" css-6hend0 e1v1l3u10\"][2]/div[3]/div/div[2]");
    By newCairoLocator = By.xpath("//div[@class=\"css-12119hv exkztdf0\"]//div[@class=\" css-6hend0 e1v1l3u10\"][2]/div[3]/div/div[2]/div[2]/div/div[17]");
    By mobileNumberLocator = By.xpath("//input[@name=\"primaryPhone\"]");
    By continueThirdForm = By.xpath("//button[@class=\"css-1wj05oe ezfki8j0\"]");
    By experienceYears = By.xpath("//div[@class=\"css-12119hv exkztdf0\"] //div[@class=\"section-validation-error css-1h480x3 e1v1l3u10\"]/div/div/div");
    By lessThanOneYearLocator = By.xpath("//div[@class=\"css-12119hv exkztdf0\"] //div[@class=\"section-validation-error css-1h480x3 e1v1l3u10\"]/div/div/div/div[2]/div/div[1]");
    By educationLevel = By.xpath("//div[@class=\"css-12119hv exkztdf0\"] //div[@class=\"section-validation-error css-6hend0 e1v1l3u10\"][1]/div[1]/div[1]");
    By fieldOfStudy = By.xpath("//div[@class=\"css-12119hv exkztdf0\"] //div[@class=\"section-validation-error css-6hend0 e1v1l3u10\"][1]/div[2]/div[1] //input[@class=\"css-1a96k50 ek82ord0\"]");
    By writeUniversityLocator = By.xpath("//input[@id=\"react-select-20-input\"]");
    By ainShamsUniversityLocator = By.xpath("//div[@class=\"css-12119hv exkztdf0\"] //div[@class=\"section-validation-error css-6hend0 e1v1l3u10\"][1]/div[2]/div[2]/div[1]/div/div[2]/div[2]/div/div[1]");
    By degreeYear =  By.xpath("//div[@class=\"css-12119hv exkztdf0\"] //div[@class=\"section-validation-error css-6hend0 e1v1l3u10\"][1]/div[2]/div[2]/div[3]/div/div/div");
    By year2013Locator = By.xpath("//div[@class=\"css-12119hv exkztdf0\"] //div[@class=\"section-validation-error css-6hend0 e1v1l3u10\"][1]/div[2]/div[2]/div[3]/div/div/div/div[2]/div/div[20]");
    By gradeLocator = By.xpath("//div[@class=\"css-12119hv exkztdf0\"] //div[@class=\"section-validation-error css-6hend0 e1v1l3u10\"][1]/div[2]/div[2]/div[5]/div/div");
    By veryGoodGrade = By.xpath("//div[@class=\"css-12119hv exkztdf0\"] //div[@class=\"section-validation-error css-6hend0 e1v1l3u10\"][1]/div[2]/div[2]/div[5]/div/div/div[2]/div/div[2]");
    By languageYouKnow = By.xpath("//div[@class=\"css-12119hv exkztdf0\"] //div[@class=\"css-6hend0 e1v1l3u10\"]/div[2]/div/div[1]/div/div[2]");
    By englishLocator = By.xpath("//div[@class=\"css-12119hv exkztdf0\"] //div[@class=\"css-6hend0 e1v1l3u10\"]/div[2]/div/div[1]/div/div[2]/div[2]/div/div[2]");
    By proficiency = By.xpath("//div[@class=\"css-12119hv exkztdf0\"] //div[@class=\"css-6hend0 e1v1l3u10\"]/div[2]/div/div[2]/div/div[2]");
    By advancedLocator = By.xpath("//div[@class=\"css-12119hv exkztdf0\"] //div[@class=\"css-6hend0 e1v1l3u10\"]/div[2]/div/div[2]/div/div[2]/div[2]/div/div[3]");
    By addButton = By.xpath("//button[@class=\"css-ksyb00 ezfki8j0\"]");
    By skillsLocator = By.xpath("//input[@id=\"react-select-25-input\"]");
    By getStartedButton = By.xpath("//button[@class=\"css-1wj05oe ezfki8j0\"]");
    By salaryExpectations = By.xpath("//div[@class=\"css-1vr59gf\"]/div[1]/div[3]/textarea");
    By whyShouldWeHireYou = By.xpath("//div[@class=\"css-1vr59gf\"]/div[2]/div[3]/textarea");
    By submitApplicationButton = By.xpath("//button[@class=\"css-9n63zc ezfki8j0\"]");
    By continueSubmitting = By.xpath("//button[@class=\"css-1jglikk ezfki8j0\"]");


    //Methods
    public void writeInSearchInput(){write(searchInput, "Software testing");}
    public String getSearchInput (){return returnText(searchInput);}
    public void clickOnSearchButton() {click(searchButton);}
    public String getSearchButtonText() {return returnText(searchButton);}
    //public String getDatePostedText() {return returnText(datePostedLocator);}
    public void clickOnDatePostedLocator(){click(datePostedLocator);}
    //public String getPastWeekText (){return returnText(pastWeekLocator);}
    public void clickOnPastWeekLocator (){click(pastWeekLocator);}
    public String getNumberOfJobsFound (){return returnText(numberOfJobsFound);}
    public void clickOnFirstJobLocator(){click(firstJobLocator);}
    public String getFirstJobText (){return returnText(firstJobLocator);}
    public void clickOnApplyButton (){click(applyButton);}
    public String getApplyButtonText (){return returnText(applyButton);}
    public void writeOnFirstNameInput(String firstName){write(firstNameInput, firstName);}
    public String getFirstNameText(){return returnText(firstNameInput);}
    public void writeOnLastNameInput(String lastName){write(lastNameInput, lastName);}
    public String getLastNameText(){return returnText(lastNameInput);}
    public void writeOnEmailInput (String email){write(emailInput, email);}
    public String getEmailText(){return returnText(emailInput);}
    public void writeOnPasswordInput(String password){write(passwordInput, password);}
    public String getPasswordInputText(){return returnText(passwordInput);}
    public void clickOnSignUpButton(){click(signUpButton);}
    public String getSignUpButtonText(){return returnText(signUpButton);}
    public void clickOnCareerLevel(){click(careerLevel);}
    public String getCareerLevelText(){return returnText(careerLevel);}
    public void clickOnFullTimeJob(){click(fullTimeJob);}
    public String getFullTimeJobText(){return returnText(fullTimeJob);}
    public void clickOnRemoteWorkPlace(){click(remoteWorkPlace);}
    public void clickOnSoftwareDevelopment(){click(softwareDevelopment);}
    public String getSoftwareDevelopmentText(){return returnText(softwareDevelopment);}
    public void sendMinimumSalaries(){write (minimumSalaries, "12000");}
    public String getMinimumSalariesText(){return returnText(minimumSalaries);}
    public void clickOnSaveAndContinue(){click (saveAndContinue);}
    public String getSaveAndContinueText(){return returnText(saveAndContinue);}
    public void clickOnBirthDateDay(){click(birthDateDay);}
    public void clickOnDay5(){click(day5);}
    public void clickOnBirthDateMonth(){click(birthDateMonth);}
    public void clickOnMarchMonth(){click(MarchMonth);}
    public void clickOnBirthDateYearLocator(){click(birthDateYearLocator);}
    public void clickOnBirthDayYear(){click(birthDayYear);}
    public void clickOnFemaleLocator(){click(femaleLocator);}
    public void clickOnNationalityLocator(){click(nationalityLocator);}
    public void clickOnEgyptNationality(){click(egyptNationality);}
    public void ClickOnCountryCityLocator (){click(countryCityLocator);}
    public void clickOnCairoLocator (){click(cairoLocator);}
    public void clickOnAreaLocator(){click(areaLocator);}
    public void clickOnNewCairoLocator (){click(newCairoLocator);}
    public void writeMobileNumberLocator (String randomPhoneNumber){write(mobileNumberLocator, randomPhoneNumber);}
    public void clickOnContinueThirdForm (){click(continueThirdForm);}
    public String getContinueThirdFormText (){return returnText(continueThirdForm);}
    public void clickOnExperienceYears (){click(experienceYears);}
    public void clickOnLessThanOneYearLocator (){click(lessThanOneYearLocator);}
    public void clickOnEducationLevel (){click(educationLevel);}
    public String getBachelorDegreeText (){return returnText(educationLevel);}
    public void writeOnFieldOfStudy (){write(fieldOfStudy, "Languages");}
    public void writeOnUniversityLocator (){write(writeUniversityLocator, "ain");}
    public void clickOnAinShamsUniversityLocator (){click(ainShamsUniversityLocator);}
    public void clickOnDegreeYear (){click(degreeYear);}
    public void clickOnYear2013Locator (){click(year2013Locator);}
    public void clickOnGradeLocator (){click(gradeLocator);}
    public void clickOnVeryGoodGrade (){click(veryGoodGrade);}
    public void clickOnLanguageYouKnow (){click(languageYouKnow);}
    public void clickOnEnglishLocator (){click(englishLocator);}
    public void clickOnProficiency (){click(proficiency);}
    public void clickOnAdvancedLocator (){click(advancedLocator);}
    public void clickOnAddButton (){click(addButton);}
    public String getAddButton (){return returnText(addButton);}
    public void writeOnsSkillsLocator (){write(skillsLocator, "Software Testing");}
    public void writeAgainOnsSkillsLocator (){write(skillsLocator, "Agile");}
    public String getGetStartedButtonText (){return returnText(getStartedButton);}
    public void clickOnGetStartedButton() {click(getStartedButton);}
    public void writeSalaryExpectations (){write(salaryExpectations, "12000");}
    public void writeWhyShouldWeHireYou (){write(whyShouldWeHireYou, ".................");}
    public void clickOnSubmitApplicationButton (){click(submitApplicationButton);}
    public String getSubmitApplicationButton (){return returnText(submitApplicationButton);}
    public void clickOnContinueSubmitting (){click(continueSubmitting);}
    public String getContinueSubmitting (){return returnText(continueSubmitting);}
}
