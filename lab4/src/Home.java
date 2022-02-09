public class Home extends Room implements Homeinterface{
    public void PresentDogs(Shorty shorty,Dog[] dogs) {
        System.out.print(shorty.getName() + " презентует собак госпоже Миноге\n");
        for (Dog i : dogs){
            i.Walk();
            i.Bark();
        }
    }
    public void TakeBath(Shorty shorty) {
        System.out.print(shorty.getName() + "устал после тяжелого дня и хочет спать");
    }

}

interface Homeinterface{
    void PresentDogs(Shorty shorty, Dog[] dogs);
    void TakeBath(Shorty shorty);
}
