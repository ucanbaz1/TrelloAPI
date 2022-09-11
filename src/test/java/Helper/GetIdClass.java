package Helper;

import io.restassured.RestAssured;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;

import java.util.List;


public class GetIdClass {
    public static String idName = null;
    public static String boardId ;
    public static String cardId ;
    public static String cardId2 ;
    public static String listId;
    public static String getId(String url){


        RequestSpecification httpRequest = RestAssured.given();
        Response response = httpRequest.get(url);
        List<Long> idList = response.jsonPath().getList("id");
        idName = String.valueOf(idList.get(0));

        String className = Thread.currentThread().getStackTrace()[2].getMethodName();
        if ("get_board_id".equals(className)){
            boardId=idName;
        }
        else if ("get_list_id".equals(className)){
            listId=idName;
        }
        else if ("create_card".equals(className)){
            cardId=idName;
        }
        else {
            cardId2=idName;
        }
        return idName;
    }
}

