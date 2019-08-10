/*
 * Written in 2018 by Daniel Saukel
 *
 * To the extent possible under law, the author(s) have dedicated all
 * copyright and related and neighboring rights to this software
 * to the public domain worldwide.
 *
 * This software is distributed without any warranty.
 *
 * You should have received a copy of the CC0 Public Domain Dedication
 * along with this software. If not, see <http://creativecommons.org/publicdomain/zero/1.0/>.
 */
package net.skaiacraft.modules.v1_14_R1;

import net.skaiacraft.modules.ChatHandler;
import org.bukkit.command.ConsoleCommandSender;

public class ChatHandlerImpl_v1_14_R1 implements ChatHandler {

    /**
     * Invoked on startup
     *
     * @param sender Console sender
     */
    @Override
    public void send(ConsoleCommandSender sender) {
        sender.sendMessage("1.14.2 ugh");
    }
}
