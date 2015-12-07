package resources;

/**
 * Created by M on 15-09-08.
 */
// TODO: look into enum configuration

public interface Constants {
    int BOARD_WIDTH = 1500;
    int BOARD_HEIGHT = 1000;
    int GROUND = 900;
    int BOMB_HEIGHT = 5;
    int ALIEN_HEIGHT = 12;
    int ALIEN_WIDTH = 12;
    int BORDER_RIGHT = 10;
    int BORDER_LEFT =105;
    int GO_DOWN = 50;
    int NUMBER_OF_ALIENS_TO_DESTROY = 5;
    int CHANCE = 5;
    int DELAY = 17;
    int PLAYER_WIDTH = 19;
    int PLAYER_HEIGHT = 12;
    int ARSENAL_SIZE = 10;
    CoordPair SENTRY_NORTHWEST = new CoordPair(90,90);
    CoordPair SENTRY_NORTHEAST = new CoordPair(810,90);
    CoordPair SENTRY_SOUTHWEST = new CoordPair(90,710);
    CoordPair SENTRY_SOUTHEAST = new CoordPair(810,710);

}
