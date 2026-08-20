//package javaPrograms.scenarioBasedQuestions;
//
//import org.openqa.selenium.By;
//import org.openqa.selenium.WebDriver;
//import org.openqa.selenium.WebElement;
//import org.openqa.selenium.chrome.ChromeDriver;
//
//import java.util.ArrayList;
//import java.util.Collections;
//import java.util.List;
//
//public class sortWebElement {
//
//    public static boolean isSort(List<String> elements){
//        for(int i=0;i< elements.size();i++){
//            String current = elements.get(i).toLowerCase();
//            String next = elements.get(i+1).toLowerCase();
//            if(current.compareTo(next)>0){
//                return false;
//            }
//        }
//        return true;
//    }
//
//
//    public static void main(String[] args){
//        WebDriver driver = new ChromeDriver();
//        driver.get("https://www.amazon.in/");
//
//        List<WebElement> element = driver.findElements(By.xpath("//div[@id='nav-xshop-container']//a"));
//        List<String>NavElements = new ArrayList<>();
//        for(WebElement ele:element){
//            NavElements.add(ele.getText());
//        }
////        Collections.sort(NavElements);
//        System.out.println(NavElements);
//
//        sortWebElement sort = new sortWebElement();
//        boolean isSorted = sort.isSort(NavElements);
//        System.out.println(isSorted);
//    }
//}
