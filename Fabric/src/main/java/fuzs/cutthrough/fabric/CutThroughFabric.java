package fuzs.cutthrough.fabric;

import fuzs.cutthrough.common.CutThrough;
import fuzs.puzzleslib.common.api.core.v1.ModConstructor;
import net.fabricmc.api.ModInitializer;

public class CutThroughFabric implements ModInitializer {

    @Override
    public void onInitialize() {
        ModConstructor.construct(CutThrough.MOD_ID, CutThrough::new);
    }
}
