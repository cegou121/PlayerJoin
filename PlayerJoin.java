package org.example.ru.playerjoin;

import org.bukkit.Bukkit;
import org.bukkit.ChatColor;
import org.bukkit.boss.BarColor;
import org.bukkit.boss.BarStyle;
import org.bukkit.boss.BossBar;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerJoinEvent;
import org.bukkit.plugin.java.JavaPlugin;

public class PlayerJoin extends JavaPlugin implements Listener {

    private BossBar bossBar;

    @Override
    public void onEnable() {
        getServer().getPluginManager().registerEvents(this, this);

        // Создаем босс-бар
        bossBar = Bukkit.createBossBar(
                ChatColor.YELLOW + "Разработка от De1fy",
                BarColor.YELLOW,
                BarStyle.SOLID
        );
        bossBar.setVisible(true);

        // обновление босс-бара каждую секунду
        Bukkit.getScheduler().runTaskTimer(this, this::updateBossBar, 0, 20);
    }

    private void updateBossBar() {
        // Обновляем босс-бар для всех онлайн игроков
        for (Player player : Bukkit.getOnlinePlayers()) {
            bossBar.addPlayer(player);
        }
    }
    @Ovveride
    public void OnlineJoin
    if (Player player) = bukkit.getplayer() {
        String . getjoin() {
            Player player = Player ()
                bossbar.addPlayer(bukkit.GetLoger);

    @EventHandler
    public void onPlayerJoin(PlayerJoinEvent event) {
        Player player = event.getPlayer();
        String playerName = player.getName();

        // Отправка красивого сообщения при присоединении игрока
        player.sendMessage(ChatColor.GREEN + "Добро пожаловать, " + playerName + "!");

        // Добавляем игрока в босс-бар при присоединении
        bossBar.addPlayer(player);
    }
}
