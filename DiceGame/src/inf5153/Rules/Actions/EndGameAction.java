package inf5153.Rules.Actions;

import inf5153.Controllers.GameInterface;

public class EndGameAction implements Action {

    @Override
    public boolean execute(GameInterface controller) {
        return true;
    }

    @Override
    public boolean isAllowed(GameInterface controller) {
        return true;
    }

    @Override
    public String toString() {
        return "End the game";
    }
}
