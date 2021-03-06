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

package tc.tools.converter.tclass;

import totalcross.io.DataStreamLE;

public final class TCClassFlags {
  public int bits2shift;// 2; // the number of bits to shift to compute the array's size for the object/primitive type that this class represents.
  public boolean isArray;// 1;
  public boolean isObjectArray;// 1;
  public boolean isString;// 1;
  public boolean isPublic;// 1;
  public boolean isStatic;// 1;
  public boolean isFinal;// 1;
  public boolean isAbstract;// 1;
  public boolean isSynthetic;// 1;
  public boolean isInterface;// 1;
  public boolean isStrict;// 1;

  public void write(DataStreamLE ds) throws totalcross.io.IOException {
    int v = bits2shift | ((isArray ? 1 : 0) << 2) | ((isObjectArray ? 1 : 0) << 3) | ((isString ? 1 : 0) << 4)
        | ((isPublic ? 1 : 0) << 5) | ((isStatic ? 1 : 0) << 6) | ((isFinal ? 1 : 0) << 7) | ((isAbstract ? 1 : 0) << 8)
        | ((isSynthetic ? 1 : 0) << 9) | ((isInterface ? 1 : 0) << 10) | ((isStrict ? 1 : 0) << 11) | 0; // this is set by the vm
    ds.writeShort(v);
  }
}
