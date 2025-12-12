package mini_Uno;

public class GameState {
    boolean reverse = false;
    int chainedPenalties = 0;
    boolean nextMustPass = false;

    public void comutePlayOrder(){
        this.reverse = ! this.reverse;
    }

    public void addPenaltiesToChaine(int added){
        this.chainedPenalties +=added;
    }

    public void resetChainePenalties(){
        this.chainedPenalties = 0;
    }

    public void setNextMustPass(boolean nextMustPass) {
        this.nextMustPass = nextMustPass;
    }

    public boolean isReverse() {
        return reverse;
    }

    public int getChainedPenalties() {
        return chainedPenalties;
    }

    public boolean isNextMustPass() {
        return nextMustPass;
    }
}

