public class MasterStudent extends Student implements ConferenceScoreBehaviour{
   protected int numberOfConf;
    public MasterStudent(int id, float mid, float fin,int numberOfConf) {
        super(id, mid, fin);
        this.numberOfConf=numberOfConf;
    }

    @Override
    public float conferenceScore() {
        return getNumberOfConf()*5;
    }

    @Override
    public float computeTotalScore() {
        return computeBaseScore()+conferenceScore();
    }

    public int getNumberOfConf() {
        return numberOfConf;
    }

    public void setNumberOfConf(int numberOfConf) {
        this.numberOfConf = numberOfConf;
    }
}
