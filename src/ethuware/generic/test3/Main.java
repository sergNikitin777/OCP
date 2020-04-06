package ethuware.generic.test3;

class Game{ }
class Cricket extends Game{ }
class Instrument{ }
class Guitar extends Instrument{ }

interface Player<E>{ void play(E e); }
interface GamePlayer<E extends Game> extends Player<E>{ }
interface MusicPlayer<E extends Instrument> extends Player{ }


class Batsman implements GamePlayer<Cricket>{
    public void play(Game o){ }

    @Override
    public void play(Cricket cricket) {

    }
}

//class Bowler implements GamePlayer<Gitar>{
class Bowler implements GamePlayer<Cricket>{
    @Override
    public void play(Cricket cricket) {

    }
}

class Bowler1 implements Player<Guitar>{
    @Override
    public void play(Guitar guitar) {

    }
}

class MidiPlayer implements MusicPlayer {
    @Override
    public void play(Object o) {

    }
}

class MidiPlayer1 implements MusicPlayer<Instrument> {
    @Override
    public void play(Object o) {

    }
}

public class Main {
}
