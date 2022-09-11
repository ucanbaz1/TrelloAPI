package StepDefinitions;

import Helper.DeleteMethod;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

import static Components.IdDataHelper.*;
import static Helper.GetIdClass.*;

public class DeleteClass {

    public static String deleteBoardPath = "boards/"+boardId;
    public static String deleteCardPath1 = "cards/"+cardId;
    public static String deleteCardPath2 = "cards/"+cardId2;
    @When("DELETE CARD2")
    public static void delete_card2() {
        DeleteMethod.deleteCard(cardNameTwo,cardNameTwoDesc,deleteCardPath2);
    }
    @When("DELETE CARD1")
    public static void delete_card1() {
        DeleteMethod.deleteCard(cardNameOne,cardNameOneDesc,deleteCardPath1);
    }
    @Then("DELETE BOARD")
    public static void delete_board() {
        DeleteMethod.deleteBoard(boardName,deleteBoardPath);
    }
}
