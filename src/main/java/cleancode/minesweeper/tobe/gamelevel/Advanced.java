package cleancode.minesweeper.tobe.gamelevel;

public class Advanced implements GameLevel{
    @Override
    public int getRowSize() {
        return 20;
    }

    @Override
    public int getColSize() {
        return 44;
    }

    @Override
    public int getLandMineCount() {
        return 99;
    }
}
