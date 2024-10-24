package org.ecologic;

import org.checkerframework.checker.units.qual.C;
import org.jspecify.annotations.Nullable;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;

import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;


import java.time.Duration;
import java.util.*;
import java.util.concurrent.TimeUnit;

public class WhatsappAutomationScript {
    public static void main(String[] args) {

        System.setProperty("webdriver.chrome.driver", "C:\\WhatsappMsgSendAutomationScript\\chromedriver-win64\\chromedriver.exe");

        WebDriver webDriver = new ChromeDriver();


        try {
            if(webDriver != null){
                webDriver.get("https://web.whatsapp.com");

                WebDriverWait wait = new WebDriverWait(webDriver, Duration.ofSeconds(100));
                System.out.println("You are getting logged In, Thank you.");
                Thread.sleep(1500);
                List<String > contacts = new ArrayList<> ( Arrays.asList("+91 7588013907","+91 9518348680","+91 7447858701","+91 9881245863","+91 8080204559","+91 9689618217","+91 8888816004","+91 9653379674","+91 9822391944","+91 9527818952","+91 7860786339","+91 9970183119","+91 9260000071","+91 8999654283","+91 9359656887","+91 9158579006","+91 8605469770","+91 9284093967","+91 8208027460","+91 9028309392","+91 7758901474","+91 9689471284","+91 8888814384","+91 9657949654","+91 9027098391","+91 9130255709","+91 9167656107","+91 9850283067","+91 9850271676","+91 8975300478","+91 8308823780","+91 9167313449","+91 7083498735","+91 9960477424","+91 9922917561","+91 9011291880","+91 8956253107","+91 9158581107","+91 8655573501","+91 8308393303","+91 9324191770","+91 9921155439","+91 8237397653","+91 9822434333","+91 9657714200","+91 7038202720","+91 9763355287","+91 9028851756","+91 8408058603","+91 9881478251","+91 9359238144","+91 9309561603","+91 9405509874","+91 9011314537","+91 9421136345","+91 7038188933","+91 9823021886","+91 9764014545","+91 9011797234","+91 7758042923","+91 7030305211","+91 9922448666","+91 9767168633","+91 7507504334","+91 7350003550","+91 9890319464","+91 8446626199","+91 8600525445","+91 8605278490","+91 9021839073","+91 9799414567","+91 8551017122","+91 9881250585","+91 8805919175","+91 9623135088","+91 8552019314","+91 9049777155","+91 9730084785","+91 9359304780","+91 7719987976","+91 9158120386","+91 9175337346","+91 7875110829","+91 8928620047","+91 7020524675","+91 7020835931","+91 9764811934","+91 9022011742","+91 9975284058","+91 9422488630","+91 9922922328","+91 7722078330","+91 9130223938","+91 9325975761","+91 9923041100","+91 9225561402","+91 9869286201","+91 9923408103","+91 9607131253","+91 9850029853","+91 9922325132","+91 8975385452","+91 9049050972","+91 9922959965","+91 9822194650","+91 9370696742","+91 9657051251","+91 7744877501","+91 8975236800","+91 8208596489","+91 7350220073","+91 9860785291","+91 9960066888","+91 7040130099","+91 8975163247","+91 9890970779","+91 9096307523","+91 9579792940","+91 9479488136","+91 9373322024","+91 9561086087","+91 9325752255","+91 9834187325","+91 9890650243","+91 9881307002","+91 9422056375","+91 9860592376","+91 7030060670","+91 9823830840","+91 9921828530","+91 9921331619","+91 9881435254","+91 9405740360","+91 9689616826","+91 9764669596","+91 8390902755","+91 7721009900","+91 9545163000","+91 9762243541","+91 9860623667","+91 9423360307","+91 8999928377","+91 9967733275","+91 7507898583","+91 9766385560","+91 8796260051","+91 9767656998","+91 9922754696","+91 7875334423","+91 7775016060","+91 8999738659","+91 9657899503","+91 7607774629","+91 9422081102","+91 9881172299","+91 9960271106","+91 9819726875","+91 7499480586","+91 7498485457","+91 9823499770","+91 9975825625","+91 9881565792","+91 9096668877","+91 9822092844","+91 9028709443","+91 9403192770","+91 9970814319","+91 9604291603","+91 9850050032","+91 9322516950","+91 9850226699","+91 9822268006","+91 9850063481","+91 9923139871","+91 9766975568","+91 9226062280","+91 8407905196","+91 9561071800","+91 9604601060","+91 9975851234","+91 8605413926","+91 8550925531","+91 9764259799","+91 7588013908","+91 7030585617","+91 9284547899","+91 7447858707","+91 9822054222","+91 9975228734","+91 9325638647","+91 9881231708","+91 9987661769","+91 7776991991","+91 9175917500","+91 9970183173","+91 9403074712","+91 8983799927","+91 9730448564","+91 9860901501","+91 9595182419","+91 9594578133","+91 9535610609","+91 9762301922","+91 9689397084","+91 9422604582","+91 9527930590","+91 7020560750","+91 9589930728","+91 9923124570","+91 9167656109","+91 9850989877","+91 9822026614","+91 9970664004","+91 8308823770","+91 9833495814","+91 9377492649","+91 9970084543","+91 7709407947","+91 9850540707","+91 8976099928","+91 9923762040","+91 9821339241","+91 9881788995","+91 9420863919","+91 8888330516","+91 9850120176","+91 9689893678","+91 8669029129","+91 9552933889","+91 9922448700","+91 9822669090","+91 8275454843","+91 9881975217","+91 9767979858","+91 7038096995","+91 9158363886","+91 9764004545","+91 9822660208","+91 9922442666","+91 9922926332","+91 7972516648","+91 7030610836","+91 8855943001","+91 9359615729","+91 9518597949","+91 9373216905","+91 7972662340","+91 7066774939","+91 7350561787","+91 9822751020","+91 9762763676","+91 9890874080","+91 9424511711","+91 9730084784","+91 8408033181","+91 9822914751","+91 9545454539","+91 8087178787","+91 9967551289","+91 9822518303","+91 9764391646","+91 7276044141","+91 9890168128","+91 9996786103","+91 9922922327","+91 7722078332","+91 9657816892","+91 9881161817","+91 9325075761","+91 9022614746","+91 9890956753","+91 9881901491","+91 9923699103","+91 9405011122","+91 8552822666","+91 8459718678"));

                List<String>  notSearchContact = new ArrayList<>();
                for (String c : contacts) {
                    if(!sendMessage(webDriver, c)) notSearchContact.add(c);



                }

//                Iterator<String> iterator = contacts.iterator();
//                while (iterator.hasNext()){
//                    String contact = iterator.next();
//                    if (!sendMessage(webDriver,contact)){
//                        notSearchContact.add(contact);
//                    }else {
//                        iterator.remove();
//                    }
//                }
                if(!notSearchContact.isEmpty()){
                    System.out.println("Message was not sent to following contact list"+notSearchContact);
                }

            }else  {
                System.out.println("WebDriver not initialized.");

            }
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            webDriver.quit();
        } }

    public static boolean sendMessage (WebDriver driver, String contact) {
        int minTme = 500 ;
        int maxTme = 1000;
        Random random = new Random();
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(30));
        try {
            //WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(30));
           WebElement newChat  = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//div[@title='New chat']")));
           Thread.sleep(random.nextInt(maxTme-minTme+1)+minTme);
            ((JavascriptExecutor) driver).executeScript("arguments[0].click();", newChat);

            WebElement searchBox = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//div[@contenteditable='true']")));

            searchBox.clear();
            Thread.sleep(100);
            searchBox.sendKeys(contact);
//            WebElement searchBox = driver.findElement(By.xpath("//div[@contenteditable='true'][@data-tab='3']"));
//            searchBox.sendKeys(contact);

            Thread.sleep(random.nextInt(maxTme-minTme+1)+minTme);
            searchBox.sendKeys(Keys.RETURN);



            try {
                WebElement result = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//span[contains(text(), 'No results found')]")));
                if(result != null){
                    WebElement clearButton = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//span[@aria-hidden='true' and @data-icon='back']")));
                    JavascriptExecutor js = (JavascriptExecutor) driver;
                    System.out.println("No results found for contact: " + contact);
                    js.executeScript("arguments[0].click();", clearButton);
                    Thread.sleep(100);
                    return false; // Skip to the next contact if not found
                }
            } catch (TimeoutException e) {
                // If no results message is not found, proceed to send the message
            }





            WebElement messageInput = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id='main']/footer/div[1]/div/span/div/div[2]/div[1]/div/div[1]/p")));

            messageInput.click();
            messageInput.clear();
            Thread.sleep(100);
            String messagePart1 = "Hi, We are gladly inviting you to \"DRONGO BAZAAR\",";
            String adnMsg2 = " An event completely managed & arranged by our DSchool & Motlee ko learners.";
            String addtnMsg = "We will appreciate your visit to our \"DRONGO BAZAAR\" ";
            String mesgPar2 = "Date: Sat,26 Oct, 02:00pm to 08:00pm";
            String megPar3 = "Sun,27 Oct, 11:00am to 06:00pm";
            String msgPar4 = "We would be delighted to have you join us and experience new things like drama, dance and display";
            String msgPar5 = "Thanks you,";
            String msgPrt6 = "Paryay Parisanstha,Dhayari, Pune, Lane A35.";
            String msgPrt7 = "Location: "+ "https://maps.app.goo.gl/p6JTTh4ztQC3vXCm9";
            String msgPrt8 = "To help us prepare, please click the link below to confirm your availability.";
            String msgPrt9 = "https://forms.gle/rhCmDkLBKy8HR4NQ7 please do visit once to experience our Drongo Bazaar";
            String msgPrt10 = "Thank you,";
            //String msgPrt11  = "visit once";
            String msgPrt12 = "Regards,";
            String msgPrt13 = "Drongo Bazaar management team";
            messageInput.sendKeys(messagePart1);
            messageInput.sendKeys(Keys.SHIFT, Keys.ENTER);
            messageInput.sendKeys(adnMsg2);// Shift + Enter
            messageInput.sendKeys(Keys.SHIFT, Keys.ENTER);
            messageInput.sendKeys(Keys.SHIFT, Keys.ENTER);
            messageInput.sendKeys(addtnMsg);// Shift + Enter again
            messageInput.sendKeys(Keys.SHIFT, Keys.ENTER); // Shift + Enter
            messageInput.sendKeys(Keys.SHIFT, Keys.ENTER);
            messageInput.sendKeys(mesgPar2);
            messageInput.sendKeys(Keys.SHIFT, Keys.ENTER); // Shift + Enter again
            messageInput.sendKeys("         ");
            messageInput.sendKeys(megPar3);
            messageInput.sendKeys(Keys.SHIFT, Keys.ENTER); // Shift + Enter again
            messageInput.sendKeys(Keys.SHIFT, Keys.ENTER); // Shift + Enter again
            messageInput.sendKeys(msgPar4);
            messageInput.sendKeys(Keys.SHIFT, Keys.ENTER); // Shift + Enter again
            messageInput.sendKeys(Keys.SHIFT, Keys.ENTER);
            messageInput.sendKeys(msgPar5);// Shift + Enter again
            messageInput.sendKeys(Keys.SHIFT, Keys.ENTER);
            messageInput.sendKeys(msgPrt6);
            messageInput.sendKeys(Keys.SHIFT, Keys.ENTER);
            messageInput.sendKeys(msgPrt7);
            messageInput.sendKeys(Keys.SHIFT, Keys.ENTER);
            messageInput.sendKeys(Keys.SHIFT, Keys.ENTER);
            messageInput.sendKeys(msgPrt8);
            messageInput.sendKeys(Keys.SHIFT, Keys.ENTER);
            messageInput.sendKeys(msgPrt9);
            messageInput.sendKeys(Keys.SHIFT, Keys.ENTER);
            messageInput.sendKeys(Keys.SHIFT, Keys.ENTER);
            messageInput.sendKeys(msgPrt10);
            messageInput.sendKeys(Keys.SHIFT, Keys.ENTER);

            messageInput.sendKeys(msgPrt12);// Press Enter to send
            messageInput.sendKeys(Keys.SHIFT, Keys.ENTER);// Press Enter to send
            messageInput.sendKeys(msgPrt13);
            messageInput.sendKeys(Keys.RETURN);

            Thread.sleep(random.nextInt(maxTme-minTme+1)+minTme);
            System.out.println("Message sent to: " + contact);

            return true;}
        catch (StaleElementReferenceException e){
            System.out.println("StaleElementReferenceException encountered while sending message, retrying...");
           return sendMessage(driver,contact); // Retry sending the message
        }catch(ElementClickInterceptedException e) {
            System.out.println("ElementNotInteractableException encountered: " + e.getMessage());
            try {
                Thread.sleep(200); // Pause before retrying
                return sendMessage(driver, contact); // Retry sending message
            } catch (InterruptedException ie) {
                Thread.currentThread().interrupt();
            }
            return sendMessage(driver, contact);

        }
        catch (TimeoutException e){
            System.out.println("retrying for"+contact);
          return   sendMessage(driver,contact);

        }
        catch (NoSuchSessionException | InterruptedException e) {
           // System.out.println("An error occurred:");
            System.out.println("Session expired. Restarting browser...");
        Thread.currentThread().interrupt();
            e.printStackTrace();
           WebDriver driver1 = new ChromeDriver();
            return false;

        }



    }

}