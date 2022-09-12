package Helper;

import io.restassured.http.ContentType;

import static Components.IdDataHelper.*;
import static Helper.GetIdClass.listId;
import static io.restassured.RestAssured.given;

public class PutClass {

    public static void putCard(String cardName, String desc, String path){

        given().log().all().queryParam("key", KEY)
                .queryParam("token", TOKEN)
                .queryParam("name", cardName)
                .queryParam("desc", cardName+" "+ desc ).contentType(ContentType.JSON)
                .queryParam("idList", listId)
                .when().put(END_POINT+path)
                .then().log().all().assertThat().extract().response().asString();
    }
}
