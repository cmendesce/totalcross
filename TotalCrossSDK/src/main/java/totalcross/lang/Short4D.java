/*********************************************************************************
 *  TotalCross Software Development Kit                                          *
 *  Copyright (C) 2000-2012 SuperWaba Ltda.                                      *
 *  Copyright (C) 2012-2020 TotalCross Global Mobile Platform Ltda.   
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

package totalcross.lang;

import totalcross.sys.Convert;
import totalcross.sys.InvalidNumberException;

public class Short4D extends Number4D {
  public static final Class<Short> TYPE = Short.class;
  short v;

  public Short4D(short v) {
    this.v = v;
  }

  @Override
  public short shortValue() {
    return v;
  }

  @Override
  public boolean equals(Object o) {
    return o != null && o instanceof Short4D && ((Short4D) o).v == this.v;
  }

  @Override
  public int hashCode() {
    return v;
  }

  @Override
  public String toString() {
    return String.valueOf(v);
  }

  public static Short4D valueOf(short s) {
    return new Short4D(s);
  }

  public static Short4D valueOf(String s) throws NumberFormatException {
    try {
      return new Short4D((short) Convert.toInt(s));
    } catch (InvalidNumberException ine) {
      throw new NumberFormatException(ine.getMessage());
    }
  }

  @Override
  public int intValue() {
    return v;
  }

  @Override
  public long longValue() {
    return v;
  }

  @Override
  public double doubleValue() {
    return v;
  }
}
