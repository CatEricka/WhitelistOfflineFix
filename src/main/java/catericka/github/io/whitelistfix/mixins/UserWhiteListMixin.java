package catericka.github.io.whitelistfix.mixins;

import net.minecraft.server.players.UserWhiteList;
import com.mojang.authlib.GameProfile;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.Overwrite;

@Mixin(UserWhiteList.class)
public abstract class UserWhiteListMixin {
    /**
     * @author 猫
     * @reason 使白名单匹配名字而不再匹配uuid
     */
    @Overwrite
    protected String getKeyForUser(GameProfile p_11458_) {
        return p_11458_.getName();
    }
}