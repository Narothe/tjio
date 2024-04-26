package pl.edu.pwsztar.chess.domain;

public interface RulesOfGame {

    /**
     * Metoda zwraca true, tylko gdy przejscie z polozenia
     * source na destination w jednym ruchu jest zgodne
     * z zasadami gry w szachy
     */
    boolean isCorrectMove(Point source, Point destination);

    class Bishop implements RulesOfGame {

        @Override
        public boolean isCorrectMove(Point source, Point destination) {
            if(source.x() == destination.x() && source.y() == destination.y()) {
                return false;
            }

            return Math.abs(destination.x() - source.x()) == Math.abs(destination.y() - source.y());
        }
    }

    class Knight implements RulesOfGame {

        @Override
        public boolean isCorrectMove(Point source, Point destination) {
            // TODO: Prosze dokonczyc implementacje
            return true;
        }
    }

    class Pawn implements RulesOfGame {

        @Override
        public boolean isCorrectMove(Point source, Point destination) {
            if (source.x() == destination.x() && source.y() + 1 == destination.y()){
                return true;
            }

            return source.x() == destination.x() && source.y() == 2;
        }

    }

    class King implements RulesOfGame {

            @Override
            public boolean isCorrectMove(Point source, Point destination) {
                if (source.x() == destination.x() && source.y() == destination.y()){
                    return false;
                }

                return Math.abs(destination.x() - source.x()) <= 1 && Math.abs(destination.y() - source.y()) <= 1;
            }
    }
    // TODO: Prosze dokonczyc implementacje kolejnych figur szachowych: Knight, King, Queen, Rook, Pawn
    // TODO: Prosze stosowac zaproponowane nazwy klas !!!
    // TODO: Kazda klasa powinna implementowac interfejs RulesOfGame
}
