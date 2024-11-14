package com.cb.services;


import com.cb.models.Match;
import com.cb.models.MatchSummary;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

public class Scoreboard {
    private final List<Match> matchesInProgress;

    public Scoreboard() {
        this.matchesInProgress = new ArrayList<>();
    }

    public void startMatch(String homeClass, String awayClass) {
        matchesInProgress.add(new Match(homeClass, awayClass));
    }

    public void updateScore(String homeClass, String awayClass, int homeScore, int awayScore) {
        for (Match match : matchesInProgress) {
            if (match.getHomeClass().equals(homeClass) && match.getAwayClass().equals(awayClass)) {
                match.updateScore(homeScore, awayScore);
                break;
            }
        }
    }

    public void finishMatch(String homeClass, String awayClass) {
        matchesInProgress.removeIf(match -> match.getHomeClass().equals(homeClass) && match.getAwayClass().equals(awayClass));
    }

    public List<String> getSummary() {

        return matchesInProgress.stream()
                .map(MatchSummary::new)
                .sorted(MatchSummary.byScoreAndTime())
                .map(summary -> summary.getMatch().toString())
                .collect(Collectors.toList());


//        List<String> result = new ArrayList<>();
//
//// Step 1: Convert each match to MatchSummary and add to a temporary list
//        List<MatchSummary> matchSummaries = new ArrayList<>();
//        for (Match match : matchesInProgress) {
//            matchSummaries.add(new MatchSummary(match));
//        }
//
//// Step 2: Manually sort the matchSummaries list based on score and start time using bubble sort
//        for (int i = 0; i < matchSummaries.size() - 1; i++) {
//            for (int j = 0; j < matchSummaries.size() - i - 1; j++) {
//                MatchSummary current = matchSummaries.get(j);
//                MatchSummary next = matchSummaries.get(j + 1);
//
//                // Use the comparator logic for sorting
//                if (MatchSummary.byScoreAndTime().compare(current, next) > 0) {
//                    // Swap elements if they are in the wrong order
//                    matchSummaries.set(j, next);
//                    matchSummaries.set(j + 1, current);
//                }
//            }
//        }
//
//// Step 3: Convert each sorted match summary to string format and add to the result list
//        for (MatchSummary summary : matchSummaries) {
//            result.add(summary.getMatch().toString());
//        }
//        return result;
    }
}
