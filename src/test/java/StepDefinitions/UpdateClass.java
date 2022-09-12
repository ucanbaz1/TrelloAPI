package StepDefinitions;

import Helper.PutClass;
import io.cucumber.java.en.Then;

import static Components.IdDataHelper.*;
import static Helper.GetIdClass.cardId;

public class UpdateClass {

    public static String updateCardPath = "cards/"+cardId;
    @Then("UPDATE CARD1")
    public static void update_card1() {
        PutClass.putCard(cardNameOne,cardNameOneUpdateDesc,updateCardPath);
    }
}
