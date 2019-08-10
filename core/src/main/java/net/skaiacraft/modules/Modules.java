/*
 * * Copyright 2019 github.com/ReflxctionDev
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package net.skaiacraft.modules;

import org.bukkit.Bukkit;
import org.bukkit.Server;
import org.bukkit.plugin.java.JavaPlugin;

/**
 * Main class
 */
public class Modules extends JavaPlugin {

    /**
     * Represents the native version, such as "v1_12_R1".
     */
    private static final String VERSION = getVersion(Bukkit.getServer());

    /**
     * An abstract interface example
     */
    private ChatHandler chatHandler;

    /**
     * Plugin startup logic
     */
    @Override
    public void onEnable() {
        try {
            chatHandler = (ChatHandler) Class.forName("net.skaiacraft.modules." + VERSION + ".ChatHandlerImpl_" + VERSION).newInstance();
            chatHandler.send(Bukkit.getConsoleSender());
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    /**
     * Plugin shutdown logic
     */
    @Override
    public void onDisable() {

    }

    /**
     * Returns the server version
     *
     * @param server Server to retrieve from
     * @return The version, e.g v1_11_R1
     */
    private static String getVersion(Server server) {
        final String packageName = server.getClass().getPackage().getName();
        return packageName.substring(packageName.lastIndexOf('.') + 1);
    }

}
