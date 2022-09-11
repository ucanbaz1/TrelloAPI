package Helper;

import io.restassured.http.ContentType;

import static Components.IdDataHelper.*;
import static Helper.GetIdClass.*;
import static io.restassured.RestAssured.given;

public class DeleteMethod {

    public static void deleteCard(String cardName, String desc, String path){

        given().log().all().queryParam("key", KEY)
                .queryParam("token", TOKEN)
                .queryParam("name", cardName)
                .queryParam("desc", cardName+desc).contentType(ContentType.JSON)
                .queryParam("idList", listId)
                .when().delete(END_POINT+path)
                .then().log().all().assertThat().extract().response().asString();
    }
    public static void deleteBoard(String boardName, String path){

        given().log().all().queryParam("key", KEY)
                .queryParam("token", TOKEN)
                .queryParam("name", boardName).contentType(ContentType.JSON)
                .when().delete(END_POINT+path)
                .then().log().all().assertThat().extract().response().jsonPath();
    }
}
