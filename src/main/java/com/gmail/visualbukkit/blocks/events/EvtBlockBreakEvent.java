package com.gmail.visualbukkit.blocks.events;

import com.gmail.visualbukkit.blocks.EventBlock;
import org.bukkit.event.block.BlockBreakEvent;

public class EvtBlockBreakEvent extends EventBlock {

    public EvtBlockBreakEvent() {
        super(BlockBreakEvent.class);
    }
}