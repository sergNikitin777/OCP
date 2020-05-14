package ethuware.stest3.test25;

class Game{ }
class Cricket extends Game{ }
class Instrument{ }
class Guitar extends Instrument{ }

interface Player<E>{ void play(E e); }
interface GamePlayer<E extends Game> extends Player<E>{ }
interface MusicPlayer<E extends Instrument> extends Player{ }

//class Batsman implements GamePlayer<Cricket>{
//    public void play(Game o){ }
//}

//class Bowler implements GamePlayer<Guitar>{
//    public void play(Guitar o){ }
//}

class Bowler implements Player<Guitar>{
    public void play(Guitar o){ }
}

//class MidiPlayer implements MusicPlayer {
//    public void play(Guitar g){ }
//}

//class MidiPlayer implements MusicPlayer<Instrument> {
//    public void play(Guitar g){ }
//}


public class TestClass {
}
