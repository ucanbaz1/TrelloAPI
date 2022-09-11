package Helper;

import io.restassured.RestAssured;
import io.restassured.http.ContentType;

import static Components.IdDataHelper.*;
import static Helper.GetIdClass.listId;
import static io.restassured.RestAssured.given;

public class PostMethod {

    public static void postCard(String cardName, String desc, String path){

        given().log().all().queryParam("key", KEY)
                .queryParam("token", TOKEN)
                .queryParam("name", cardName)
                .queryParam("desc", cardName+" "+ desc ).contentType(ContentType.JSON)
                .queryParam("idList", listId)
                .when().post(END_POINT+path)
                .then().log().all().assertThat().extract().response().asString();
    }

    public static void postBoard(String boardName,String path){

        RestAssured.baseURI = "https://api.trello.com";
        given().log().all().queryParam("key", KEY)
                .queryParam("token", TOKEN)
                .queryParam("name", boardName).contentType(ContentType.JSON)
                .when().post(END_POINT+path)
                .then().log().all().assertThat().extract().response().jsonPath();
    }
}
