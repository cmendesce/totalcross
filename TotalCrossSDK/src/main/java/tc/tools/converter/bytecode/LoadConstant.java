/*********************************************************************************
 *  TotalCross Software Development Kit                                          *
 *  Copyright (C) 2000-2012 SuperWaba Ltda.                                      *
 *  Copyright (C) 2012-2020 TotalCross Global Mobile Platform Ltda.              *
 *  All Rights Reserved                                                          *
 *                                                                               *
 *  This library and virtual machine is distributed in the hope that it will     *
 *  be useful, but WITHOUT ANY WARRANTY; without even the implied warranty of    *
 *  MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.                         *
 *                                                                               *
 *  This file is covered by the GNU LESSER GENERAL PUBLIC LICENSE VERSION 2.1    *
 *  A copy of this license is located in file license.txt at the root of this    *
 *  SDK or can be downloaded here:                                               *
 *  http://www.gnu.org/licenses/lgpl-2.1.txt                                     *
 *                                                                               *
 *********************************************************************************/

package tc.tools.converter.bytecode;

import tc.tools.converter.TCValue;

public class LoadConstant extends ByteCode {
  /** The value used in this instruction. */
  public TCValue val = new TCValue();

  public LoadConstant(int v) {
    targetType = val.type = INT;
    val.asInt = v;
  }

  public LoadConstant(long v) {
    targetType = val.type = LONG;
    val.asLong = v;
    stackInc = 2;
  }

  public LoadConstant(double v) {
    targetType = val.type = DOUBLE;
    val.asDouble = v;
    stackInc = 2;
  }

  public LoadConstant(float v) {
    targetType = val.type = DOUBLE;
    val.asDouble = v;
    stackInc = 1;
  }

  public LoadConstant(Object v) {
    targetType = val.type = OBJECT;
    val.asObj = v;
  }

  @Override
  public void exec() {
    stack[stackPtr].copyFrom(val);
    stackPtr += stackInc;
    pc += pcInc;
  }
}
