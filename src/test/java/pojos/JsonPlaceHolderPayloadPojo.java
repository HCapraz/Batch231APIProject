package pojos;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;


/*
    Olusturdugumuz pojo ile response tan gelen data tam olarak uyumlu degilse ve response datasinda
    fazladan baska fieldlar varsa bu field lari gormezden gelmek icin Pojo classimizda
    @JsonIgnoreProperties(ignoreUnknown = true) notasyonunu eklemeliyiz
 */
@JsonIgnoreProperties(ignoreUnknown = true)
public class JsonPlaceHolderPayloadPojo {
    /*
    POJO => Plain Old Java Object
    1) private variable (JSON DA KEY OLANLAR icin variable olusturacağız
    ve acces modifieri private yapacağız)
    2) Paramatreli ve Parametresiz Constructorlar olustururuz
    3) Getterlar ve setterlar
    4) toString() methodu
    bu 4 yapiyi pojo classlar icinde koymaliyiz
    Amacimiz =>
    Belli bir cerceveye bagli kalmadan kendi data typemizi olusturarak
    veri tasiyici objectler olusturmak
     */

    // 1) private variablelari olusturduk
    private Integer userId;
    private String title;
    private Boolean completed;

    //2) Paramatreli ve Parametresiz Constructorlar olustururuz
    public JsonPlaceHolderPayloadPojo() {
        //Serialization ve De-Serialization islemleri icin bu constructor a ihtiyac duyuyoruz
    }
    public JsonPlaceHolderPayloadPojo(Integer userId, String title, Boolean completed) {
        this.userId = userId;
        this.title = title;
        this.completed = completed;
    }

    // 3) Getterlar ve setterlar olustururuz
    public Integer getUserId() {
        return userId;
    }

    public void setUserId(Integer userId) {
        this.userId = userId;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public Boolean getCompleted() {
        return completed;
    }

    public void setCompleted(Boolean completed) {
        this.completed = completed;
    }

    // 4) toString() methodu olustururz

    @Override
    public String toString() {
        return "JsonPlaceHolderPayloadPojo{" +
                "userId=" + userId +
                ", title='" + title + '\'' +
                ", completed=" + completed +
                '}';
    }
}