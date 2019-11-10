package com.douglashammarstam.plantAppRestAPI.Models;

public class Quest {
    
    private boolean completed;
    private Stats stats;

    public Stats getStats() {
        return stats;
    }

    public void setStats(Stats stats) {
        this.stats = stats;
    }

    public boolean isCompleted() {
        return completed;
    }



    public void setCompleted(boolean completed) {
        this.completed = completed;
    }
}
