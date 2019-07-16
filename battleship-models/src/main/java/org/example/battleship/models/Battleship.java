/*
 * SPDX-License-Identifier: Apache-2.0
 */

package org.example.battleship.models;

import org.hyperledger.fabric.contract.annotation.DataType;
import org.hyperledger.fabric.contract.annotation.Property;

@DataType()
public final class Battleship {

    @Property()
    private final Square bowLocation;

    @Property()
    private final Heading heading;

    @Property()
    private final ShipType type;

    public Battleship(Square bowLocation, Heading heading, ShipType type) {
        super();

        // TODO: validate location based on heading and type

        this.bowLocation = bowLocation;
        this.heading = heading;
        this.type = type;
    }

    public Square getBowLocation() {
        return bowLocation;
    }

    public Heading getHeading() {
        return heading;
    }

    public ShipType getType() {
        return type;
    }
}
