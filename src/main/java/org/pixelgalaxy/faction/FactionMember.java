package org.pixelgalaxy.faction;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.Setter;

import java.util.UUID;

@Builder
@AllArgsConstructor
public class FactionMember {

    @Getter private UUID memberUuid;
    @Getter private int factionId;
    @Getter @Setter private FactionMemberType factionMemberType;

}
