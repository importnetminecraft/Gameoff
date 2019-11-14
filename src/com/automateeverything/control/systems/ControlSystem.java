package com.automateeverything.control.systems;

import com.automateeverything.control.Player;
import com.automateeverything.main.Window;

/**
 * ControlSystem
 */
public interface ControlSystem {
    public void run(Player player, Window window);
}