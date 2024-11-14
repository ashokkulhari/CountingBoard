package com.cb.models;

import java.util.Comparator;

public class MatchSummary {
    private final Match match;

    public MatchSummary(Match match) {
        this.match = match;
    }

    public Match getMatch() {
        return match;
    }

    public static Comparator<MatchSummary> byScoreAndTime() {
        return Comparator.comparingInt((MatchSummary m) -> m.getMatch().getTotalScore())
                .reversed()
                .thenComparing(m -> m.getMatch().getStartTime(), Comparator.reverseOrder());
    }
}
