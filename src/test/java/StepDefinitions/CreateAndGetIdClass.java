package StepDefinitions;
import Helper.GetIdClass;
import Helper.PostMethod;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

import static Components.IdDataHelper.*;
import static Helper.GetIdClass.*;

public class CreateAndGetIdClass {

    @Given("CREATE BOARD")
    public static void create_board(){
        PostMethod.postBoard(boardName,postBoardPath);
    }
    @When("GET BOARD ID")
    public static void get_board_id() {
        System.out.println("BOARD_ID: "+GetIdClass.getId("https://api.trello.com/1/members/me/boards?key="+KEY+"&token="+TOKEN));
    }
    @Then("GET LIST ID")
    public static void get_list_id() {
        System.out.println("LIST_ID: "+GetIdClass.getId("https://api.trello.com/1/boards/"+boardId+"/lists?key="+KEY+"&token="+TOKEN));
    }
    @When("CREATE CARD")
    public static void create_card() {
        PostMethod.postCard(cardNameOne,cardNameOneDesc,postCardPath);
        System.out.println("CARD1_ID: "+GetIdClass.getId("https://api.trello.com/1/boards/"+boardId+"/cards?key="+KEY+"&token="+TOKEN));
    }
    @When("CREATE CARD2")
    public static void create_card2() {
        PostMethod.postCard(cardNameTwo,cardNameTwoDesc,postCardPath);
        System.out.println("CARD2_ID: "+GetIdClass.getId("https://api.trello.com/1/boards/" + boardId + "/cards?key=" + KEY + "&token=" + TOKEN));
    }
 }
