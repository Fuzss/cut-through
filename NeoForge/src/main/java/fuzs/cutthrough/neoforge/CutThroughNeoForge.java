package fuzs.cutthrough.neoforge;

import fuzs.cutthrough.common.CutThrough;
import fuzs.puzzleslib.common.api.core.v1.ModConstructor;
import net.neoforged.fml.common.Mod;

@Mod(CutThrough.MOD_ID)
public class CutThroughNeoForge {

    public CutThroughNeoForge() {
        ModConstructor.construct(CutThrough.MOD_ID, CutThrough::new);
    }
}
