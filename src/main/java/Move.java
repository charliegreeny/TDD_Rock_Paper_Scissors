public enum Move {
    ROCK {
        @Override
        public boolean beats(Move other) {
            return other == SCISSORS;
        }

    },
    PAPER {
        @Override
        public boolean beats(Move other) {
            return other == ROCK;
        }

    },
    SCISSORS {
        @Override
        public boolean beats(Move other) {
            return other == PAPER;
        }

    };

    public abstract boolean beats(Move other);

}
