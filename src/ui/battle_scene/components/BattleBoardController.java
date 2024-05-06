package ui.battle_scene.components;

import logic.team.Team;
import ui.common.BaseComponentController;

/**
 * This class is the controller of the BattleBoard component of the battle scene.
 */
public class BattleBoardController extends BaseComponentController {
    private BattleTeam batTeam1 = new BattleTeam(new Team("Player")); // empty team
    private BattleTeam batTeam2 = new BattleTeam(new Team("Enemy")); // empty team
    @Override
    public void init() {}

    public BattleTeam getBatTeam1() {
        return batTeam1;
    }

    public BattleTeam getBatTeam2() {
        return batTeam2;
    }
}
