package fuzs.cutthrough.neoforge.client;

import fuzs.cutthrough.common.CutThrough;
import fuzs.cutthrough.common.client.CutThroughClient;
import fuzs.puzzleslib.common.api.client.core.v1.ClientModConstructor;
import net.neoforged.api.distmarker.Dist;
import net.neoforged.fml.common.Mod;

@Mod(value = CutThrough.MOD_ID, dist = Dist.CLIENT)
public class CutThroughNeoForgeClient {

    public CutThroughNeoForgeClient() {
        ClientModConstructor.construct(CutThrough.MOD_ID, CutThroughClient::new);
    }
}
