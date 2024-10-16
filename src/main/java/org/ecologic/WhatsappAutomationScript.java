package org.ecologic;

import org.jspecify.annotations.Nullable;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;


import java.time.Duration;
import java.util.Arrays;
import java.util.List;
import java.util.Set;
import java.util.concurrent.TimeUnit;

public class WhatsappAutomationScript {
    public static void main(String[] args) {

        System.setProperty("webdriver.chrome.driver", "C:\\WhatsappMsgSendAutomationScript\\chromedriver-win64\\chromedriver.exe");

        WebDriver driver = new ChromeDriver();
//        try {
//            webDriver.get("https://web.whatsapp.com");
//            webDriver.manage().timeouts().implicitlyWait(100, TimeUnit.SECONDS);
//
//            System.out.println("You are getting logged In, Thank you.");
//            Thread.sleep(15000);
//            List<String> contacts = Arrays.asList("+91 80551 81227","+91 70203 18659");
//            String message = "We're inviting you to our event - DONGO BAZAAR";
//            for(String c:contacts ){
//                sendMessage(webDriver,c, message);
//            }
//        } catch (Exception e) {
//            e.printStackTrace();
//        }finally {
//            webDriver.quit();
//        }
        // Wait for the user to scan the QR code
//        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(200)); // Adjust the wait time as necessary
//
//        // Replace with the actual contact number and message
//        String contactNumber = "+91 80551 81227"; // Contact number to send the message
//        String messageToSend = "Hello! This is an automated message by Paryay Parisanstha"; // The message to be sent

//        try {
//            driver.get("https://web.whatsapp.com/");
//            WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(100));
//
//            // Click on the '+' icon to open a new chat
//            wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//div[@title='New chat']"))).click();
//
//            // Wait for the search box to be visible
//            WebElement searchBox = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//div[@contenteditable='true']")));
//
//            // Phone number to send message to
//            String phoneNumber = "+91 70203 18659";
//            searchBox.sendKeys(phoneNumber);
////
////            // Wait for the contact to appear and click it
////            wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//span[@title='" + phoneNumber + "']"))).click();
////
////            // Wait for the message input field to be visible
////            WebElement messageInput = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//div[@contenteditable='true'][@data-tab='1']")));
////
////            // Add your message
////            String message = "Hello, this is a test message!";
////            messageInput.sendKeys(message);
////
////            // Send the message by pressing Enter
////            messageInput.sendKeys(Keys.RETURN);
////
////            System.out.println("Message sent to: " + phoneNumber);
//            try {
//                WebElement contact = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//span[@title='" + phoneNumber + "']")));
//
//                // Use JavaScript to click the contact if standard click doesn't work
//                ((JavascriptExecutor) driver).executeScript("arguments[0].click();", contact);
//
//                // Wait for the message input field to be visible
//                WebElement messageInput = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//div[@contenteditable='true'][@data-tab='1']")));
//
//                // Add your message
//                String message = "Hello, this is a test message!";
//                messageInput.sendKeys(message); // Type the message
//
//                // Send the message by pressing Enter
//                messageInput.sendKeys(Keys.RETURN); // Press Enter to send
//
//                System.out.println("Message sent to: " + phoneNumber);
//            } catch (TimeoutException e) {
//                System.out.println("Contact not found for: " + phoneNumber);
//            }
//        } catch (Exception e) {
//            System.out.println("Failed to send message to: " );
//            e.printStackTrace();
//        } finally {
//            driver.quit();
//        }

        try {
            driver.get("https://web.whatsapp.com/");
            WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(100));

            // Click on the '+' icon to open a new chat
            wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//div[@title='New chat']"))).click();

            // Wait for the search box to be visible and enter the phone number
            WebElement searchBox = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//div[@contenteditable='true']")));
            String phoneNumber = "+91 70203 18659";
            searchBox.sendKeys(phoneNumber);

            // Wait for the contact to appear and press Enter to select it
            Thread.sleep(2000);
            searchBox.sendKeys(Keys.RETURN); // Press Enter to select

            // Wait for the message input field to be visible
            WebElement messageInput = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id='main']/footer/div[1]/div/span/div/div[2]/div[1]/div/div[1]/p")));

            // Clear the input field (if necessary)
            messageInput.clear();

            // Add your message
            String message = "Hello, this is a test message!";
            messageInput.sendKeys(message); // Type the message

            // Send the message by pressing Enter
            messageInput.sendKeys(Keys.RETURN); // Press Enter to send
            Thread.sleep(5000);
            System.out.println("Message sent to: " + phoneNumber);
        } catch (Exception e) {
            System.out.println("An error occurred:");
            e.printStackTrace();
        } finally {
            driver.quit();
        }

//
//    public static void sendMessage(WebDriver driver, String contact, String message) {
//        try {
//            WebElement searchBox = driver.findElement(By.xpath("//div[@contenteditable='true'][@data-tab='3']"));
//            searchBox.sendKeys(contact);
//
//            Thread.sleep(3000);
//            WebElement contactElement = driver.findElement(By.xpath("//span[@title='" + contact + "']"));
//            contactElement.click();
//
//            WebElement msgBox = driver.findElement(By.xpath("//div[@contenteditable='true'][@data-tab='10']"));
//            msgBox.sendKeys(message);
//
//            WebElement sendButton = driver.findElement(By.xpath("//button[@data-testid='compose-btn-send']"));
//            sendButton.click();
//
//            System.out.println("Message sent to: " + contact);
//
//        } catch (Exception e) {
//            System.err.println("Failed to send message to: " + contact);
//            e.printStackTrace();
//        }
        //   }
    }

}