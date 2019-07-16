/*
 * SPDX-License-Identifier: Apache-2.0
 */

package org.example.battleship.models;

import org.hyperledger.fabric.contract.annotation.DataType;
import org.hyperledger.fabric.contract.annotation.Property;

@DataType()
public class Square {

    @Property()
    private final char gridRow;

    @Property()
    private final int gridColumn;

    public Square(char gridRow, int gridColumn) {
        super();

        if (!"ABCDEFGHIJ".contains(String.valueOf(gridRow))) {
            throw new IllegalArgumentException("gridRow must be char between A and J");
        }

        if ((gridColumn < 1) || (gridColumn > 10)) {
            throw new IllegalArgumentException("gridCol must be number between 1 and 10");
        }

        this.gridRow = gridRow;
        this.gridColumn = gridColumn;
    }

    public char getGridRow() {
        return gridRow;
    }

    public int getGridColumn() {
        return gridColumn;
    }
}
