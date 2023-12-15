public class PhDStudent extends MasterStudent implements ArticleScoreBehaviour{
   protected int numberOfArticles;

    public PhDStudent(int id, float mid, float fin,int numberOfConf, int numberOfArticles) {
        super(id, mid, fin,numberOfConf);
        this.numberOfArticles=numberOfArticles;
    }

    @Override
    public float computeTotalScore() {
        return computeBaseScore()+articleScore();
    }

    @Override
    public float articleScore() {
        return getNumberOfArticles()*8;
    }

    public int getNumberOfArticles() {
        return numberOfArticles;
    }

    public void setNumberOfArticles(int numberOfArticles) {
        this.numberOfArticles = numberOfArticles;
    }
}
