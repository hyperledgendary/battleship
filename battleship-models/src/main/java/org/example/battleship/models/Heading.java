/*
 * SPDX-License-Identifier: Apache-2.0
 */

package org.example.battleship.models;

import org.hyperledger.fabric.contract.annotation.DataType;

@DataType()
public enum Heading {
    COLUMN, ROW
}
