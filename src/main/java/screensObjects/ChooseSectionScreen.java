package screensObjects;

import org.openqa.selenium.support.PageFactory;

import io.appium.java_client.ios.IOSDriver;
import io.appium.java_client.ios.IOSElement;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;
import io.appium.java_client.pagefactory.iOSXCUITFindBy;

public class ChooseSectionScreen {

    public ChooseSectionScreen(IOSDriver<?> driver) {

        PageFactory.initElements(new AppiumFieldDecorator(driver), this);

    }


    // Main Categories

    @iOSXCUITFindBy(accessibility = "سيارات")
    public IOSElement Cars;

    @iOSXCUITFindBy(accessibility = "عقارات")
    public IOSElement RealEstates;

    @iOSXCUITFindBy(accessibility = "خدمات")
    public IOSElement Services;

    @iOSXCUITFindBy(accessibility = "محركات وأليات")
    public IOSElement EnginesAndMechanisms;

    @iOSXCUITFindBy(accessibility = "حرف ومقاولات")
    public IOSElement CraftsAndContracting;

    @iOSXCUITFindBy(accessibility = "أثاث ومفروشات")
    public IOSElement Furniture;

    @iOSXCUITFindBy(accessibility = "أجهزة وإلكترونيات")
    public IOSElement ElectronicsAndDevices;

    @iOSXCUITFindBy(accessibility = "حيوانات")
    public IOSElement Animals;

    @iOSXCUITFindBy(accessibility = "الأسرة والصحة")
    public IOSElement FamilyAndHealth;

    @iOSXCUITFindBy(accessibility = "إضافة إعلان")
    public IOSElement BackButton;

    @iOSXCUITFindBy(accessibility = "متفرقات")
    public IOSElement Miscellaneous;


    /// Cars

    @iOSXCUITFindBy(accessibility = "السيارات")
    public IOSElement TheCars;

    @iOSXCUITFindBy(accessibility = "أمريكية")
    public IOSElement American;

    @iOSXCUITFindBy(accessibility = "جي إم سي")
    public IOSElement GMC;

    @iOSXCUITFindBy(accessibility = "سفاري")
    public IOSElement Safari;


    /// Real Estates

    @iOSXCUITFindBy(accessibility = "عقارات للإيجار")
    public IOSElement RealEstateForRent;

    @iOSXCUITFindBy(accessibility = "عقارات للبيع")
    public IOSElement RealEstateForSale;

    @iOSXCUITFindBy(accessibility = "عقارات دولية")
    public IOSElement InternationalRealEstate;

    @iOSXCUITFindBy(accessibility = "عقارات قيد الإنشاء")
    public IOSElement RealEstateUnderConstruct;


    //// Real Estates -- Real Estates for sale

    @iOSXCUITFindBy(accessibility = "سكني")
    public IOSElement Residential;

    @iOSXCUITFindBy(accessibility = "تجاري واستثماري")
    public IOSElement CommercialAndInvestment;

    @iOSXCUITFindBy(accessibility = "شاليهات ومنتزهات")
    public IOSElement ChaletsAndParks;


    ///// Real Estates -- Real Estates for sale -- Resedential

    @iOSXCUITFindBy(accessibility = "بيوت / فلل")
    public IOSElement HouseAndVillas;

    ////// Territories

    @iOSXCUITFindBy(accessibility = "العاصمة")
    public IOSElement AlAsimah;

    @iOSXCUITFindBy(accessibility = "الدسمة")
    public IOSElement AlDesmeh;


    /// Services

    @iOSXCUITFindBy(accessibility = "نقل عفش")
    public IOSElement TransferAndRelocation;

    @iOSXCUITFindBy(accessibility = "ستالايت")
    public IOSElement Satellite;


    /// Engines And Mechanisms

    @iOSXCUITFindBy(accessibility = "الدراجات")
    public IOSElement Bikes;

    @iOSXCUITFindBy(accessibility = "القوارب البحرية")
    public IOSElement MarineBoats;

    @iOSXCUITFindBy(accessibility = "المحركات والمعدات الثقيلة")
    public IOSElement EnginesAndHeavyEquipment;


    /// Engines And Mechanisms -- Marine Boats

    @iOSXCUITFindBy(accessibility = "قوارب")
    public IOSElement Boats;

    @iOSXCUITFindBy(accessibility = "جت سكي")
    public IOSElement JetSki;


    // CraftsAndContracting

    @iOSXCUITFindBy(accessibility = "ألومنيوم ومطابخ")
    public IOSElement AluminumAndKitchens;


    // Furniture

    @iOSXCUITFindBy(accessibility = "أثاث منزلي")
    public IOSElement HomeFurnishings;

    @iOSXCUITFindBy(accessibility = "المفروشات")
    public IOSElement Upholstery;


    // Devices And Electronics

    @iOSXCUITFindBy(accessibility = "الأجهزة المنزلية")
    public IOSElement HouseholdAppliance;

    @iOSXCUITFindBy(accessibility = "التليفونات وملحقاتها")
    public IOSElement TelephonesAndAccessories;


    /// Devices And Electronics -- Household Appliances

    @iOSXCUITFindBy(accessibility = "ثلاجات")
    public IOSElement Refrigerators;

    @iOSXCUITFindBy(accessibility = "غسالات")
    public IOSElement Washers;


    // Animals

    @iOSXCUITFindBy(accessibility = "كلاب")
    public IOSElement Dogs;

    @iOSXCUITFindBy(accessibility = "الخيل")
    public IOSElement Horses;

    @iOSXCUITFindBy(accessibility = "قطط")
    public IOSElement Cats;


    // Health And Family

    @iOSXCUITFindBy(accessibility = "مستلزمات المرأة")
    public IOSElement WomenAccessories;

    @iOSXCUITFindBy(accessibility = "مستلزمات الرجل")
    public IOSElement MenAccessories;

    @iOSXCUITFindBy(accessibility = "مستلزمات الطفل")
    public IOSElement BabySupplies;

    @iOSXCUITFindBy(accessibility = "الصحة")
    public IOSElement TheHealth;


    // Health And Family -- Women Accessories

    @iOSXCUITFindBy(accessibility = "ملابس")
    public IOSElement Clothes;

    @iOSXCUITFindBy(accessibility = "أحذية وشنط")
    public IOSElement ShoesAndBags;


    // Miscellaneous

    @iOSXCUITFindBy(accessibility = "أشياء مطلوبة")
    public IOSElement WantedThings;

    @iOSXCUITFindBy(accessibility = "مجانية / تبرعات")
    public IOSElement FreeAndDonations;

}