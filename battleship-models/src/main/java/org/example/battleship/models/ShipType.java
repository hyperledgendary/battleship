/*
 * SPDX-License-Identifier: Apache-2.0
 */

package org.example.battleship.models;

import org.hyperledger.fabric.contract.annotation.DataType;

@DataType()
public enum ShipType {

    CARRIER(5), BATTLESHIP(4), CRUISER(3), SUBMARINE(3), DESTROYER(2);

    private final int size;

    private ShipType(int size) {
        this.size = size;
    }

    public int getSize() {
        return size;
    }
}
