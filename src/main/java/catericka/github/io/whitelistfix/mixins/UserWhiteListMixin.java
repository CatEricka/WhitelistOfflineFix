package catericka.github.io.whitelistfix.mixins;

import net.minecraft.server.players.UserWhiteList;
import com.mojang.authlib.GameProfile;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.Overwrite;

@Mixin(UserWhiteList.class)
public abstract class UserWhiteListMixin {
    /**
     * @author 猫
     * @reason 使白名单匹配名字而不再匹配 uuid
     */
    @Overwrite
    protected String getKeyForUser(GameProfile p_11458_) {
        // 使用全小写
        // TODO 是的 这是个妥协的解决方案
        return p_11458_.getName().toLowerCase();
    }
}