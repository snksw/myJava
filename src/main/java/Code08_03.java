public class Code08_03 {
    public static void main(String[] args) {
        HouseRabbit08_02 hRabbit = new HouseRabbit08_02();
        MountainRabbit08_02 mRabbit = new MountainRabbit08_02();

        hRabbit.shape = "삼각형";
        hRabbit.owner = "난생이";
        hRabbit.move(100, 100);
        hRabbit.eatFeed();

        mRabbit.shape = "네모";
        mRabbit.mountain = "설악산";
        mRabbit.move(200, 200);
        mRabbit.eatGrass();
    }
}
