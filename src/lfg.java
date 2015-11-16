// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.graphics.Matrix;
import android.graphics.Path;
import android.graphics.Picture;
import android.graphics.RectF;
import java.io.InputStream;
import java.util.ArrayList;
import javax.xml.parsers.SAXParser;
import javax.xml.parsers.SAXParserFactory;
import org.xml.sax.Attributes;
import org.xml.sax.InputSource;
import org.xml.sax.XMLReader;

public final class lfg
{

    public static float a = 72F;

    static String a(String s)
    {
        return s.replaceAll("\"", "&quot;").replaceAll("'", "&apos").replaceAll("<", "&lt;").replaceAll(">", "&gt;").replaceAll("&", "&amp;");
    }

    static String a(String s, Attributes attributes)
    {
        int j = attributes.getLength();
        for (int i = 0; i < j; i++)
        {
            if (attributes.getLocalName(i).equals(s))
            {
                return attributes.getValue(i);
            }
        }

        return null;
    }

    public static lfe a(InputStream inputstream, Integer integer, Integer integer1, float f)
    {
        long l = System.currentTimeMillis();
        try
        {
            XMLReader xmlreader = SAXParserFactory.newInstance().newSAXParser().getXMLReader();
            Picture picture = new Picture();
            lfn lfn1 = new lfn(picture);
            lfn1.a(integer, integer1);
            lfn1.a(false);
            lfn1.a(f);
            inputstream = new lfh(inputstream);
            integer = new lfj();
            xmlreader.setContentHandler(integer);
            inputstream.a();
            xmlreader.parse(new InputSource(inputstream.a()));
            lfn1.a = ((lfj) (integer)).a;
            xmlreader.setContentHandler(lfn1);
            xmlreader.parse(new InputSource(inputstream.a()));
            long l1 = System.currentTimeMillis();
            (new StringBuilder(48)).append("Parsing complete in ").append(l1 - l).append(" millis.");
            inputstream = new lfe(picture, lfn1.o);
            if (!Float.isInfinite(lfn1.p.top))
            {
                inputstream.a(lfn1.p);
            }
        }
        // Misplaced declaration of an exception variable
        catch (InputStream inputstream)
        {
            integer = String.valueOf(inputstream);
            (new StringBuilder(String.valueOf(integer).length() + 13)).append("Parse error: ").append(integer);
            throw new af(inputstream);
        }
        return inputstream;
    }

    static Matrix b(String s)
    {
        Matrix matrix = new Matrix();
_L3:
        if (!s.startsWith("matrix(")) goto _L2; else goto _L1
_L1:
        lfl lfl1 = d(s.substring(7));
        if (lfl1.a.size() == 6)
        {
            Matrix matrix1 = new Matrix();
            matrix1.setValues(new float[] {
                ((Float)lfl1.a.get(0)).floatValue(), ((Float)lfl1.a.get(2)).floatValue(), ((Float)lfl1.a.get(4)).floatValue(), ((Float)lfl1.a.get(1)).floatValue(), ((Float)lfl1.a.get(3)).floatValue(), ((Float)lfl1.a.get(5)).floatValue(), 0.0F, 0.0F, 1.0F
            });
            matrix.preConcat(matrix1);
        }
_L4:
        int i = s.indexOf(")");
        float f1;
        float f3;
        lfl lfl2;
        if (i > 0 && s.length() > i + 1)
        {
            s = s.substring(i + 1).replaceFirst("[\\s,]*", "");
        } else
        {
            return matrix;
        }
        if (true) goto _L3; else goto _L2
_L2:
        if (s.startsWith("translate("))
        {
            lfl2 = d(s.substring(10));
            if (lfl2.a.size() > 0)
            {
                f1 = ((Float)lfl2.a.get(0)).floatValue();
                float f;
                float f2;
                if (lfl2.a.size() > 1)
                {
                    f = ((Float)lfl2.a.get(1)).floatValue();
                } else
                {
                    f = 0.0F;
                }
                matrix.preTranslate(f1, f);
            }
        } else
        if (s.startsWith("scale("))
        {
            lfl2 = d(s.substring(6));
            if (lfl2.a.size() > 0)
            {
                f2 = ((Float)lfl2.a.get(0)).floatValue();
                if (lfl2.a.size() > 1)
                {
                    f = ((Float)lfl2.a.get(1)).floatValue();
                } else
                {
                    f = f2;
                }
                matrix.preScale(f2, f);
            }
        } else
        if (s.startsWith("skewX("))
        {
            lfl2 = d(s.substring(6));
            if (lfl2.a.size() > 0)
            {
                matrix.preSkew((float)Math.tan(((Float)lfl2.a.get(0)).floatValue()), 0.0F);
            }
        } else
        if (s.startsWith("skewY("))
        {
            lfl2 = d(s.substring(6));
            if (lfl2.a.size() > 0)
            {
                matrix.preSkew(0.0F, (float)Math.tan(((Float)lfl2.a.get(0)).floatValue()));
            }
        } else
        if (s.startsWith("rotate("))
        {
            lfl2 = d(s.substring(7));
            if (lfl2.a.size() > 0)
            {
                f3 = ((Float)lfl2.a.get(0)).floatValue();
                if (lfl2.a.size() > 2)
                {
                    f2 = ((Float)lfl2.a.get(1)).floatValue();
                    f = ((Float)lfl2.a.get(2)).floatValue();
                } else
                {
                    f = 0.0F;
                    f2 = 0.0F;
                }
                matrix.preTranslate(f2, f);
                matrix.preRotate(f3);
                matrix.preTranslate(-f2, -f);
            }
        } else
        {
            (new StringBuilder(String.valueOf(s).length() + 20)).append("Invalid transform (").append(s).append(")");
        }
          goto _L4
    }

    static lfl b(String s, Attributes attributes)
    {
        int j = attributes.getLength();
        for (int i = 0; i < j; i++)
        {
            if (attributes.getLocalName(i).equals(s))
            {
                return d(attributes.getValue(i));
            }
        }

        return null;
    }

    static Path c(String s)
    {
        float f;
        float f1;
        float f2;
        float f3;
        float f4;
        float f5;
        char c1;
        lfd lfd1;
        Path path;
        RectF rectf;
        int k;
        k = s.length();
        lfd1 = new lfd(s);
        lfd1.a();
        path = new Path();
        rectf = new RectF();
        f = 0.0F;
        f1 = 0.0F;
        f3 = 0.0F;
        f2 = 0.0F;
        c1 = 'x';
        f5 = 0.0F;
        f4 = 0.0F;
_L16:
        if (lfd1.a >= k) goto _L2; else goto _L1
_L1:
        int i;
        char c2 = s.charAt(lfd1.a);
        float f6;
        float f16;
        if (!Character.isDigit(c2) && c2 != '.' && c2 != '-')
        {
            lfd1.b();
            c1 = c2;
        } else
        if (c1 == 'M')
        {
            c1 = 'L';
        } else
        if (c1 == 'm')
        {
            c1 = 'l';
        }
        path.computeBounds(rectf, true);
        c1;
        JVM INSTR lookupswitch 20: default 292
    //                   65: 1242
    //                   67: 948
    //                   72: 704
    //                   76: 571
    //                   77: 434
    //                   81: 2102
    //                   83: 1106
    //                   84: 1994
    //                   86: 822
    //                   90: 528
    //                   97: 1242
    //                   99: 948
    //                   104: 704
    //                   108: 571
    //                   109: 434
    //                   113: 2102
    //                   115: 1106
    //                   116: 1994
    //                   118: 822
    //                   122: 528;
           goto _L3 _L4 _L5 _L6 _L7 _L8 _L9 _L10 _L11 _L12 _L13 _L4 _L5 _L6 _L7 _L8 _L9 _L10 _L11 _L12 _L13
_L3:
        (new StringBuilder(23)).append("Invalid path command: ").append(c1);
        lfd1.b();
        f6 = f2;
        f2 = f;
        i = 0;
        f = f5;
        f16 = f1;
        f1 = f4;
        f5 = f6;
        f4 = f3;
        f3 = f16;
_L14:
        if (i == 0)
        {
            f4 = f;
            f5 = f1;
        }
        lfd1.a();
        f6 = f4;
        f16 = f5;
        f4 = f1;
        f5 = f;
        f = f2;
        f1 = f3;
        f3 = f6;
        f2 = f16;
        continue; /* Loop/switch isn't completed */
_L8:
        f = lfd1.c();
        f1 = lfd1.c();
        float f7;
        float f17;
        if (c1 == 'm')
        {
            path.rMoveTo(f, f1);
            f1 = f5 + f1;
            f += f4;
        } else
        {
            path.moveTo(f, f1);
        }
        i = 0;
        f4 = f3;
        f5 = f2;
        f7 = f;
        f17 = f1;
        f2 = f1;
        f3 = f;
        f = f17;
        f1 = f7;
        continue; /* Loop/switch isn't completed */
_L13:
        path.close();
        float f18 = f;
        f4 = f1;
        f5 = f3;
        float f8 = f2;
        i = 0;
        f2 = f18;
        f3 = f4;
        f4 = f5;
        f5 = f8;
        continue; /* Loop/switch isn't completed */
_L7:
        float f26 = lfd1.c();
        float f30 = lfd1.c();
        if (c1 == 'l')
        {
            path.rLineTo(f26, f30);
            float f9 = f3;
            float f19 = f2;
            i = 0;
            f30 += f5;
            f26 = f4 + f26;
            f2 = f;
            f3 = f1;
            f4 = f9;
            f5 = f19;
            f = f30;
            f1 = f26;
        } else
        {
            path.lineTo(f26, f30);
            f4 = f;
            float f10 = f1;
            f5 = f2;
            i = 0;
            f = f30;
            f1 = f26;
            float f20 = f3;
            f2 = f4;
            f3 = f10;
            f4 = f20;
        }
        continue; /* Loop/switch isn't completed */
_L6:
        float f27 = lfd1.c();
        if (c1 == 'h')
        {
            path.rLineTo(f27, 0.0F);
            float f11 = f3;
            float f21 = f2;
            f27 = f4 + f27;
            f2 = f;
            i = 0;
            f = f5;
            f3 = f1;
            f4 = f11;
            f5 = f21;
            f1 = f27;
        } else
        {
            path.lineTo(f27, f5);
            float f22 = f;
            f4 = f3;
            f = f2;
            i = 0;
            float f12 = f5;
            f2 = f22;
            f3 = f1;
            f5 = f;
            f = f12;
            f1 = f27;
        }
        continue; /* Loop/switch isn't completed */
_L12:
        float f28 = lfd1.c();
        if (c1 == 'v')
        {
            path.rLineTo(0.0F, f28);
            float f13 = f3;
            float f23 = f2;
            i = 0;
            float f31 = f28 + f5;
            f28 = f4;
            f2 = f;
            f3 = f1;
            f4 = f13;
            f5 = f23;
            f = f31;
            f1 = f28;
        } else
        {
            path.lineTo(f4, f28);
            f5 = f3;
            float f14 = f2;
            i = 0;
            float f24 = f28;
            f28 = f4;
            f2 = f;
            f3 = f1;
            f4 = f5;
            f5 = f14;
            f = f24;
            f1 = f28;
        }
        continue; /* Loop/switch isn't completed */
_L5:
        float f32 = lfd1.c();
        float f33 = lfd1.c();
        float f34 = lfd1.c();
        f3 = lfd1.c();
        float f29 = lfd1.c();
        f2 = lfd1.c();
        double d1;
        double d2;
        double d3;
        double d4;
        double d5;
        double d6;
        double d7;
        double d8;
        double d9;
        double d10;
        double d11;
        double d12;
        double d13;
        double d14;
        double d15;
        float f15;
        float f25;
        float f35;
        float f36;
        int j;
        boolean flag;
        if (c1 == 'c')
        {
            f15 = f34 + f4;
            f25 = f29 + f4;
            f29 = f3 + f5;
            f2 += f5;
            f33 += f5;
            f32 += f4;
            f3 = f25;
            f4 = f29;
            f5 = f15;
            f25 = f33;
            f15 = f32;
        } else
        {
            f25 = f33;
            f15 = f32;
            f5 = f34;
            f4 = f3;
            f3 = f29;
        }
        path.cubicTo(f15, f25, f5, f4, f3, f2);
        f15 = f1;
        i = 1;
        f1 = f3;
        f25 = f2;
        f2 = f;
        f3 = f15;
        f = f25;
        continue; /* Loop/switch isn't completed */
_L10:
        f36 = lfd1.c();
        f34 = lfd1.c();
        f35 = lfd1.c();
        f33 = lfd1.c();
        f32 = f36;
        f29 = f34;
        f25 = f35;
        f15 = f33;
        if (c1 == 's')
        {
            f32 = f36 + f4;
            f25 = f35 + f4;
            f29 = f34 + f5;
            f15 = f33 + f5;
        }
        path.cubicTo(f4 * 2.0F - f2, f5 * 2.0F - f3, f32, f29, f25, f15);
        f3 = f1;
        i = 1;
        f5 = f32;
        f4 = f29;
        f1 = f25;
        f2 = f;
        f = f15;
        continue; /* Loop/switch isn't completed */
_L4:
        f33 = lfd1.c();
        f34 = lfd1.c();
        f35 = lfd1.c();
        i = (int)lfd1.c();
        j = (int)lfd1.c();
        f32 = lfd1.c();
        f29 = lfd1.c();
        f15 = f32;
        f25 = f29;
        if (c1 == 'a')
        {
            f15 = f32 + f4;
            f25 = f29 + f5;
        }
        d12 = f4;
        d9 = f5;
        d13 = f15;
        d10 = f25;
        d2 = f33;
        d1 = f34;
        d5 = f35;
        if (i == 1)
        {
            i = 1;
        } else
        {
            i = 0;
        }
        if (j == 1)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        d3 = (d12 - d13) / 2D;
        d4 = (d9 - d10) / 2D;
        d5 = Math.toRadians(d5 % 360D);
        d8 = Math.cos(d5);
        d11 = Math.sin(d5);
        d6 = d8 * d3 + d11 * d4;
        d7 = -d11 * d3 + d8 * d4;
        d3 = Math.abs(d2);
        d2 = Math.abs(d1);
        d4 = d3 * d3;
        d1 = d2 * d2;
        d14 = d6 * d6;
        d15 = d7 * d7;
        d5 = d14 / d4 + d15 / d1;
        if (d5 > 1.0D)
        {
            d4 = d3 * Math.sqrt(d5);
            d1 = d2 * Math.sqrt(d5);
            d2 = d1;
            d3 = d4;
            d1 *= d1;
            d4 *= d4;
        }
        if (i == flag)
        {
            d5 = -1D;
        } else
        {
            d5 = 1.0D;
        }
        d4 = (d4 * d1 - d4 * d15 - d1 * d14) / (d1 * d14 + d4 * d15);
        d1 = d4;
        if (d4 < 0.0D)
        {
            d1 = 0.0D;
        }
        d4 = Math.sqrt(d1) * d5;
        d1 = ((d3 * d7) / d2) * d4;
        d14 = d4 * -((d2 * d6) / d3);
        d4 = (d12 + d13) / 2D;
        d9 = (d9 + d10) / 2D;
        d5 = d4 + (d8 * d1 - d11 * d14);
        d8 = d9 + (d11 * d1 + d8 * d14);
        d4 = (d6 - d1) / d3;
        d9 = (d7 - d14) / d2;
        d6 = (-d6 - d1) / d3;
        d7 = (-d7 - d14) / d2;
        d10 = Math.sqrt(d4 * d4 + d9 * d9);
        if (d9 < 0.0D)
        {
            d1 = -1D;
        } else
        {
            d1 = 1.0D;
        }
        d10 = Math.toDegrees(d1 * Math.acos(d4 / d10));
        d11 = Math.sqrt((d4 * d4 + d9 * d9) * (d6 * d6 + d7 * d7));
        if (d4 * d7 - d6 * d9 < 0.0D)
        {
            d1 = -1D;
        } else
        {
            d1 = 1.0D;
        }
        d4 = Math.toDegrees(d1 * Math.acos((d9 * d7 + d4 * d6) / d11));
        if (!flag && d4 > 0.0D)
        {
            d1 = d4 - 360D;
        } else
        {
            d1 = d4;
            if (flag)
            {
                d1 = d4;
                if (d4 < 0.0D)
                {
                    d1 = d4 + 360D;
                }
            }
        }
        path.addArc(new RectF((float)(d5 - d3), (float)(d8 - d2), (float)(d5 + d3), (float)(d8 + d2)), (float)(d10 % 360D), (float)(d1 % 360D));
        f4 = f;
        f5 = f1;
        f29 = f3;
        i = 0;
        f = f25;
        f1 = f15;
        f15 = f2;
        f2 = f4;
        f3 = f5;
        f4 = f29;
        f5 = f15;
        continue; /* Loop/switch isn't completed */
_L11:
        f32 = lfd1.c();
        f29 = lfd1.c();
        f25 = f32;
        f15 = f29;
        if (c1 == 't')
        {
            f25 = f32 + f4;
            f15 = f29 + f5;
        }
        f2 = 2.0F * f4 - f2;
        f29 = 2.0F * f5 - f3;
        path.cubicTo(f4, f5, f2, f29, f25, f15);
        f3 = f1;
        i = 1;
        f5 = f2;
        f4 = f29;
        f1 = f25;
        f2 = f;
        f = f15;
        continue; /* Loop/switch isn't completed */
_L9:
        f32 = lfd1.c();
        f29 = lfd1.c();
        f34 = lfd1.c();
        f33 = lfd1.c();
        f25 = f32;
        f15 = f29;
        f3 = f34;
        f2 = f33;
        if (c1 == 'q')
        {
            f3 = f34 + f4;
            f2 = f33 + f5;
            f25 = f32 + f4;
            f15 = f29 + f5;
        }
        path.cubicTo(f4, f5, f25, f15, f3, f2);
        f4 = f1;
        i = 1;
        f5 = f25;
        f1 = f3;
        f25 = f2;
        f2 = f;
        f3 = f4;
        f4 = f15;
        f = f25;
        if (true) goto _L14; else goto _L2
_L2:
        return path;
        if (true) goto _L16; else goto _L15
_L15:
    }

    private static lfl d(String s)
    {
        int k = s.length();
        ArrayList arraylist = new ArrayList();
        int j = 1;
        boolean flag = false;
        int i = 0;
        while (j < k) 
        {
            if (flag)
            {
                flag = false;
            } else
            {
                char c1 = s.charAt(j);
                switch (c1)
                {
                case 9: // '\t'
                case 10: // '\n'
                case 32: // ' '
                case 44: // ','
                case 45: // '-'
                    String s1 = s.substring(i, j);
                    if (s1.trim().length() > 0)
                    {
                        arraylist.add(Float.valueOf(Float.parseFloat(s1)));
                        if (c1 == '-')
                        {
                            i = j;
                        } else
                        {
                            i = j + 1;
                            flag = true;
                        }
                    } else
                    {
                        i++;
                    }
                    break;

                case 41: // ')'
                case 65: // 'A'
                case 67: // 'C'
                case 72: // 'H'
                case 76: // 'L'
                case 77: // 'M'
                case 81: // 'Q'
                case 83: // 'S'
                case 84: // 'T'
                case 86: // 'V'
                case 90: // 'Z'
                case 97: // 'a'
                case 99: // 'c'
                case 104: // 'h'
                case 108: // 'l'
                case 109: // 'm'
                case 113: // 'q'
                case 115: // 's'
                case 116: // 't'
                case 118: // 'v'
                case 122: // 'z'
                    s = s.substring(i, j);
                    if (s.trim().length() > 0)
                    {
                        arraylist.add(Float.valueOf(Float.parseFloat(s)));
                    }
                    return new lfl(arraylist, j);
                }
            }
            j++;
        }
        String s2 = s.substring(i);
        if (s2.length() > 0)
        {
            try
            {
                arraylist.add(Float.valueOf(Float.parseFloat(s2)));
            }
            catch (NumberFormatException numberformatexception) { }
            i = s.length();
        }
        return new lfl(arraylist, i);
    }

}
