// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Canvas;
import android.graphics.DashPathEffect;
import android.graphics.LinearGradient;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.Picture;
import android.graphics.RadialGradient;
import android.graphics.RectF;
import android.graphics.Shader;
import android.graphics.Typeface;
import android.util.Base64;
import java.io.StringReader;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Stack;
import java.util.StringTokenizer;
import javax.xml.parsers.SAXParser;
import javax.xml.parsers.SAXParserFactory;
import org.xml.sax.Attributes;
import org.xml.sax.InputSource;
import org.xml.sax.XMLReader;
import org.xml.sax.helpers.DefaultHandler;

final class kxk extends DefaultHandler
{

    private static final Matrix D = new Matrix();
    private int A;
    private boolean B;
    private boolean C;
    HashMap a;
    Picture b;
    Canvas c;
    Paint d;
    boolean e;
    Stack f;
    Stack g;
    Paint h;
    boolean i;
    Stack j;
    Stack k;
    float l;
    Stack m;
    RectF n;
    RectF o;
    RectF p;
    Integer q;
    Integer r;
    boolean s;
    float t;
    int u;
    HashMap v;
    HashMap w;
    kxf x;
    kxl y;
    private boolean z;

    kxk(Picture picture)
    {
        a = new HashMap();
        e = false;
        f = new Stack();
        g = new Stack();
        i = false;
        j = new Stack();
        k = new Stack();
        l = 1.0F;
        m = new Stack();
        n = new RectF();
        o = null;
        p = new RectF((1.0F / 0.0F), (1.0F / 0.0F), (-1.0F / 0.0F), (-1.0F / 0.0F));
        q = null;
        r = null;
        s = false;
        t = kxd.a;
        u = 0;
        z = false;
        A = 0;
        B = false;
        v = new HashMap();
        w = new HashMap();
        x = null;
        y = null;
        C = false;
        b = picture;
        d = new Paint();
        d.setAntiAlias(true);
        d.setStyle(android.graphics.Paint.Style.STROKE);
        h = new Paint();
        h.setAntiAlias(true);
        h.setStyle(android.graphics.Paint.Style.FILL);
    }

    private static float a(String s1, float f1)
    {
        float f2;
        try
        {
            f2 = Float.parseFloat(s1);
        }
        // Misplaced declaration of an exception variable
        catch (String s1)
        {
            return f1;
        }
        return f2;
    }

    private int a(int i1)
    {
        int j1 = 0xffffff & i1;
        i1 = j1;
        if (q != null)
        {
            i1 = j1;
            if (q.intValue() == j1)
            {
                i1 = j1;
                if (r != null)
                {
                    String.format("Replacing color: 0x%x->0x%x", new Object[] {
                        Integer.valueOf(j1), r
                    });
                    i1 = r.intValue();
                }
            }
        }
        return i1;
    }

    private Float a(String s1, Attributes attributes, Float float1)
    {
        float f1 = t;
        attributes = kxd.a(s1, attributes);
        if (attributes == null)
        {
            s1 = null;
        } else
        if (attributes.endsWith("px"))
        {
            s1 = Float.valueOf(Float.parseFloat(attributes.substring(0, attributes.length() - 2)));
        } else
        if (attributes.endsWith("pt"))
        {
            s1 = Float.valueOf((f1 * Float.valueOf(attributes.substring(0, attributes.length() - 2)).floatValue()) / 72F);
        } else
        if (attributes.endsWith("pc"))
        {
            s1 = Float.valueOf((f1 * Float.valueOf(attributes.substring(0, attributes.length() - 2)).floatValue()) / 6F);
        } else
        if (attributes.endsWith("cm"))
        {
            s1 = Float.valueOf((f1 * Float.valueOf(attributes.substring(0, attributes.length() - 2)).floatValue()) / 2.54F);
        } else
        if (attributes.endsWith("mm"))
        {
            s1 = Float.valueOf((f1 * Float.valueOf(attributes.substring(0, attributes.length() - 2)).floatValue()) / 254F);
        } else
        if (attributes.endsWith("in"))
        {
            s1 = Float.valueOf(f1 * Float.valueOf(attributes.substring(0, attributes.length() - 2)).floatValue());
        } else
        if (attributes.endsWith("em"))
        {
            s1 = Float.valueOf(h.getTextSize() * Float.valueOf(attributes.substring(0, attributes.length() - 2)).floatValue());
        } else
        if (attributes.endsWith("ex"))
        {
            s1 = Float.valueOf((h.getTextSize() * Float.valueOf(attributes.substring(0, attributes.length() - 2)).floatValue()) / 2.0F);
        } else
        if (attributes.endsWith("%"))
        {
            attributes = Float.valueOf(attributes.substring(0, attributes.length() - 1));
            float f2;
            if (s1.indexOf("x") >= 0 || s1.equals("width"))
            {
                f2 = (float)c.getWidth() / 100F;
            } else
            if (s1.indexOf("y") >= 0 || s1.equals("height"))
            {
                f2 = (float)c.getHeight() / 100F;
            } else
            {
                f2 = (float)(c.getHeight() + c.getWidth()) / 2.0F;
            }
            s1 = Float.valueOf(f2 * attributes.floatValue());
        } else
        {
            s1 = Float.valueOf(attributes);
        }
        if (s1 == null)
        {
            return float1;
        } else
        {
            return s1;
        }
    }

    static Float a(kxk kxk1, String s1, Attributes attributes, Float float1)
    {
        return kxk1.a(s1, attributes, float1);
    }

    private kxf a(boolean flag, Attributes attributes)
    {
        kxf kxf1 = new kxf();
        kxf1.a = kxd.a("id", attributes);
        kxf1.c = flag;
        String s1;
        if (flag)
        {
            kxf1.d = a("x1", attributes, Float.valueOf(0.0F)).floatValue();
            kxf1.f = a("x2", attributes, Float.valueOf(0.0F)).floatValue();
            kxf1.e = a("y1", attributes, Float.valueOf(0.0F)).floatValue();
            kxf1.g = a("y2", attributes, Float.valueOf(0.0F)).floatValue();
        } else
        {
            kxf1.h = a("cx", attributes, Float.valueOf(0.0F)).floatValue();
            kxf1.i = a("cy", attributes, Float.valueOf(0.0F)).floatValue();
            kxf1.j = a("r", attributes, Float.valueOf(0.0F)).floatValue();
        }
        s1 = kxd.a("gradientTransform", attributes);
        if (s1 != null)
        {
            kxf1.m = kxd.b(s1);
        }
        s1 = kxd.a("href", attributes);
        if (s1 != null)
        {
            attributes = s1;
            if (s1.startsWith("#"))
            {
                attributes = s1.substring(1);
            }
            kxf1.b = attributes;
        }
        return kxf1;
    }

    private void a()
    {
        c.restore();
        u = u - 1;
    }

    private void a(float f1, float f2)
    {
        if (f1 < p.left)
        {
            p.left = f1;
        }
        if (f1 > p.right)
        {
            p.right = f1;
        }
        if (f2 < p.top)
        {
            p.top = f2;
        }
        if (f2 > p.bottom)
        {
            p.bottom = f2;
        }
    }

    private void a(float f1, float f2, float f3, float f4)
    {
        a(f1, f2);
        a(f1 + f3, f2 + f4);
    }

    private void a(Path path)
    {
        path.computeBounds(n, false);
        a(n.left, n.top);
        a(n.right, n.bottom);
    }

    private void a(kxj kxj1, Integer integer, boolean flag, Paint paint)
    {
        paint.setColor(a(integer.intValue()) | 0xff000000);
        Float float1 = kxj1.d("opacity");
        integer = float1;
        if (float1 == null)
        {
            if (flag)
            {
                integer = "fill-opacity";
            } else
            {
                integer = "stroke-opacity";
            }
            integer = kxj1.d(integer);
        }
        kxj1 = integer;
        if (integer == null)
        {
            kxj1 = Float.valueOf(1.0F);
        }
        paint.setAlpha((int)(kxj1.floatValue() * 255F * l));
    }

    private void a(Attributes attributes)
    {
        attributes = kxd.a("transform", attributes);
        if (attributes == null)
        {
            attributes = D;
        } else
        {
            attributes = kxd.b(attributes);
        }
        u = u + 1;
        c.save();
        c.concat(attributes);
    }

    private boolean a(kxj kxj1)
    {
        float f3;
        f3 = 0.0F;
        break MISSING_BLOCK_LABEL_3;
_L6:
        float f2;
        if (e)
        {
            if (d.getColor() != 0)
            {
                return true;
            }
        } else
        {
            d.setColor(0);
            return false;
        }
        do
        {
            do
            {
                return false;
            } while (s || "none".equals(kxj1.b("display")));
            Float float1 = kxj1.d("stroke-width");
            if (float1 != null)
            {
                d.setStrokeWidth(float1.floatValue());
            }
        } while (d.getStrokeWidth() <= 0.0F);
        s1 = kxj1.b("stroke-linecap");
        if ("round".equals(s1))
        {
            d.setStrokeCap(android.graphics.Paint.Cap.ROUND);
        } else
        if ("square".equals(s1))
        {
            d.setStrokeCap(android.graphics.Paint.Cap.SQUARE);
        } else
        if ("butt".equals(s1))
        {
            d.setStrokeCap(android.graphics.Paint.Cap.BUTT);
        }
        s1 = kxj1.b("stroke-linejoin");
        if ("miter".equals(s1))
        {
            d.setStrokeJoin(android.graphics.Paint.Join.MITER);
        } else
        if ("round".equals(s1))
        {
            d.setStrokeJoin(android.graphics.Paint.Join.ROUND);
        } else
        if ("bevel".equals(s1))
        {
            d.setStrokeJoin(android.graphics.Paint.Join.BEVEL);
        }
        obj = kxj1.b("stroke-dasharray");
        s1 = kxj1.b("stroke-dashoffset");
        if (obj == null) goto _L2; else goto _L1
_L1:
        if (!((String) (obj)).equals("none")) goto _L4; else goto _L3
_L3:
        d.setPathEffect(null);
_L2:
        s1 = kxj1.a("stroke");
        if (s1 == null) goto _L6; else goto _L5
_L4:
        stringtokenizer = new StringTokenizer(((String) (obj)), " ,");
        j1 = stringtokenizer.countTokens();
        i1 = j1;
        if ((j1 & 1) == 1)
        {
            i1 = j1 << 1;
        }
        af = new float[i1];
        f2 = 1.0F;
        f1 = 0.0F;
        for (i1 = 0; stringtokenizer.hasMoreTokens(); i1++)
        {
            f2 = a(stringtokenizer.nextToken(), f2);
            af[i1] = f2;
            f1 += f2;
        }

        flag = false;
        j1 = i1;
        for (i1 = ((flag) ? 1 : 0); j1 < af.length; i1++)
        {
            f2 = af[i1];
            af[j1] = f2;
            f1 += f2;
            j1++;
        }

        f2 = f3;
        if (s1 == null)
        {
            break MISSING_BLOCK_LABEL_457;
        }
        f2 = Float.parseFloat(s1);
        f2 %= f1;
_L7:
        d.setPathEffect(new DashPathEffect(af, f2));
          goto _L2
_L5:
        if (s1.equalsIgnoreCase("none"))
        {
            d.setColor(0);
            return false;
        }
        af = kxj1.c("stroke");
        if (af != null)
        {
            a(kxj1, ((Integer) (af)), false, d);
            return true;
        }
        kxj1 = String.valueOf(s1);
        if (kxj1.length() != 0)
        {
            "Unrecognized stroke color, using none: ".concat(kxj1);
        } else
        {
            new String("Unrecognized stroke color, using none: ");
        }
        d.setColor(0);
        return false;
        NumberFormatException numberformatexception;
        numberformatexception;
        f2 = f3;
          goto _L7
    }

    private boolean a(kxj kxj1, HashMap hashmap)
    {
        if (!"none".equals(kxj1.b("display")))
        {
            if (s)
            {
                h.setShader(null);
                h.setColor(-1);
                return true;
            }
            String s1 = kxj1.b("fill");
            if (s1 != null)
            {
                if (s1.startsWith("url(#"))
                {
                    s1 = s1.substring(5, s1.length() - 1);
                    hashmap = (Shader)hashmap.get(s1);
                    if (hashmap != null)
                    {
                        h.setShader(hashmap);
                        return true;
                    }
                    hashmap = String.valueOf(s1);
                    if (hashmap.length() != 0)
                    {
                        "Didn't find shader, using black: ".concat(hashmap);
                    } else
                    {
                        new String("Didn't find shader, using black: ");
                    }
                    h.setShader(null);
                    a(kxj1, Integer.valueOf(0xff000000), true, h);
                    return true;
                }
                if (s1.equalsIgnoreCase("none"))
                {
                    h.setShader(null);
                    h.setColor(0);
                    return true;
                }
                h.setShader(null);
                hashmap = kxj1.c("fill");
                if (hashmap != null)
                {
                    a(kxj1, ((Integer) (hashmap)), true, h);
                    return true;
                }
                hashmap = String.valueOf(s1);
                if (hashmap.length() != 0)
                {
                    "Unrecognized fill color, using black: ".concat(hashmap);
                } else
                {
                    new String("Unrecognized fill color, using black: ");
                }
                a(kxj1, Integer.valueOf(0xff000000), true, h);
                return true;
            }
            if (i)
            {
                if (h.getColor() != 0)
                {
                    return true;
                }
            } else
            {
                h.setShader(null);
                h.setColor(0xff000000);
                return true;
            }
        }
        return false;
    }

    static boolean a(kxk kxk1, kxj kxj1)
    {
        return kxk1.a(kxj1);
    }

    static boolean a(kxk kxk1, kxj kxj1, HashMap hashmap)
    {
        return kxk1.a(kxj1, hashmap);
    }

    static boolean a(kxk kxk1, Attributes attributes, Paint paint)
    {
        return kxk1.a(attributes, paint);
    }

    private boolean a(Attributes attributes, Paint paint)
    {
        byte byte0 = 0;
        if ("none".equals(attributes.getValue("display")))
        {
            return false;
        }
        if (attributes.getValue("font-size") != null)
        {
            paint.setTextSize(a("font-size", attributes, Float.valueOf(10F)).floatValue());
        }
        Object obj = kxd.a("font-family", attributes);
        String s1 = kxd.a("font-style", attributes);
        String s2 = kxd.a("font-weight", attributes);
        if (obj == null && s1 == null && s2 == null)
        {
            obj = null;
        } else
        {
            if ("italic".equals(s1))
            {
                byte0 = 2;
            }
            int i1 = byte0;
            if ("bold".equals(s2))
            {
                i1 = byte0 | 1;
            }
            obj = Typeface.create(((String) (obj)), i1);
        }
        if (obj != null)
        {
            paint.setTypeface(((Typeface) (obj)));
        }
        if (c(attributes) != null)
        {
            paint.setTextAlign(c(attributes));
        }
        return true;
    }

    private static String b(Attributes attributes)
    {
        String s1 = "";
        for (int i1 = 0; i1 < attributes.getLength(); i1++)
        {
            s1 = String.valueOf(s1);
            String s2 = String.valueOf(attributes.getLocalName(i1));
            String s3 = String.valueOf(attributes.getValue(i1));
            s1 = (new StringBuilder(String.valueOf(s1).length() + 4 + String.valueOf(s2).length() + String.valueOf(s3).length())).append(s1).append(" ").append(s2).append("='").append(s3).append("'").toString();
        }

        return s1;
    }

    private static android.graphics.Paint.Align c(Attributes attributes)
    {
        attributes = kxd.a("text-anchor", attributes);
        if (attributes == null)
        {
            return null;
        }
        if ("middle".equals(attributes))
        {
            return android.graphics.Paint.Align.CENTER;
        }
        if ("end".equals(attributes))
        {
            return android.graphics.Paint.Align.RIGHT;
        } else
        {
            return android.graphics.Paint.Align.LEFT;
        }
    }

    public void a(float f1)
    {
        t = f1;
    }

    public void a(Integer integer, Integer integer1)
    {
        q = integer;
        r = integer1;
    }

    public void a(boolean flag)
    {
        s = false;
    }

    public void characters(char ac[], int i1, int j1)
    {
        if (y != null)
        {
            y.a(ac, i1, j1);
        }
    }

    public void endDocument()
    {
    }

    public void endElement(String s1, String s2, String s3)
    {
        boolean flag;
        boolean flag1;
        flag1 = false;
        flag = false;
        if (!C) goto _L2; else goto _L1
_L1:
        if (s2.equals("defs"))
        {
            C = false;
        }
_L4:
        return;
_L2:
        if (s2.equals("svg"))
        {
            b.endRecording();
            return;
        }
        if (!z && s2.equals("text"))
        {
            if (y != null)
            {
                y.a(c);
                y.a();
            }
            a();
            return;
        }
        if (!s2.equals("linearGradient"))
        {
            break; /* Loop/switch isn't completed */
        }
        if (x.a != null)
        {
            if (x.b != null)
            {
                s1 = (kxf)w.get(x.b);
                if (s1 != null)
                {
                    x = s1.a(x);
                }
            }
            s1 = new int[x.l.size()];
            for (int i1 = 0; i1 < s1.length; i1++)
            {
                s1[i1] = ((Integer)x.l.get(i1)).intValue();
            }

            s2 = new float[x.k.size()];
            for (int j1 = ((flag) ? 1 : 0); j1 < s2.length; j1++)
            {
                s2[j1] = ((Float)x.k.get(j1)).floatValue();
            }

            s1 = new LinearGradient(x.d, x.e, x.f, x.g, s1, s2, android.graphics.Shader.TileMode.CLAMP);
            if (x.m != null)
            {
                s1.setLocalMatrix(x.m);
            }
            v.put(x.a, s1);
            w.put(x.a, x);
            return;
        }
        if (true) goto _L4; else goto _L3
_L3:
        if (!s2.equals("radialGradient"))
        {
            continue; /* Loop/switch isn't completed */
        }
        if (x.a == null) goto _L4; else goto _L5
_L5:
        if (x.b != null)
        {
            s1 = (kxf)w.get(x.b);
            if (s1 != null)
            {
                x = s1.a(x);
            }
        }
        s1 = new int[x.l.size()];
        for (int k1 = 0; k1 < s1.length; k1++)
        {
            s1[k1] = ((Integer)x.l.get(k1)).intValue();
        }

        s2 = new float[x.k.size()];
        for (int l1 = ((flag1) ? 1 : 0); l1 < s2.length; l1++)
        {
            s2[l1] = ((Float)x.k.get(l1)).floatValue();
        }

        s1 = new RadialGradient(x.h, x.i, x.j, s1, s2, android.graphics.Shader.TileMode.CLAMP);
        if (x.m != null)
        {
            s1.setLocalMatrix(x.m);
        }
        v.put(x.a, s1);
        w.put(x.a, x);
        return;
        if (!s2.equals("g")) goto _L4; else goto _L6
_L6:
        if (B)
        {
            B = false;
        }
        if (z)
        {
            A = A - 1;
            if (A == 0)
            {
                z = false;
            }
        }
        v.clear();
        a();
        h = (Paint)j.pop();
        i = ((Boolean)k.pop()).booleanValue();
        d = (Paint)f.pop();
        e = ((Boolean)g.pop()).booleanValue();
        l = ((Float)m.pop()).floatValue();
        return;
    }

    public void startDocument()
    {
    }

    public void startElement(String s1, String s2, String s3, Attributes attributes)
    {
        if (!e)
        {
            d.setAlpha(255);
        }
        if (!i)
        {
            h.setAlpha(255);
        }
        if (!B) goto _L2; else goto _L1
_L1:
        if (s2.equals("rect"))
        {
            s2 = a("x", attributes, ((Float) (null)));
            s1 = s2;
            if (s2 == null)
            {
                s1 = Float.valueOf(0.0F);
            }
            s3 = a("y", attributes, ((Float) (null)));
            s2 = s3;
            if (s3 == null)
            {
                s2 = Float.valueOf(0.0F);
            }
            s3 = a("width", attributes, ((Float) (null)));
            attributes = a("height", attributes, ((Float) (null)));
            o = new RectF(s1.floatValue(), s2.floatValue(), s1.floatValue() + s3.floatValue(), s2.floatValue() + attributes.floatValue());
        }
_L4:
        return;
_L2:
        if (C)
        {
            continue; /* Loop/switch isn't completed */
        }
        if (s2.equals("svg"))
        {
            int i1 = (int)Math.ceil(a("width", attributes, ((Float) (null))).floatValue());
            int i2 = (int)Math.ceil(a("height", attributes, ((Float) (null))).floatValue());
            c = b.beginRecording(i1, i2);
            return;
        }
        if (s2.equals("defs"))
        {
            C = true;
            return;
        }
        if (s2.equals("linearGradient"))
        {
            x = a(true, attributes);
            return;
        }
        if (s2.equals("radialGradient"))
        {
            x = a(false, attributes);
            return;
        }
        if (!s2.equals("stop"))
        {
            break; /* Loop/switch isn't completed */
        }
        if (x != null)
        {
            float f1 = a("offset", attributes, ((Float) (null))).floatValue();
            s1 = new kxm(kxd.a("style", attributes));
            s2 = s1.a("stop-color");
            int j1 = 0xff000000;
            if (s2 != null)
            {
                if (s2.startsWith("#"))
                {
                    j1 = Integer.parseInt(s2.substring(1), 16);
                } else
                {
                    j1 = Integer.parseInt(s2, 16);
                }
            }
            j1 = a(j1);
            s1 = s1.a("stop-opacity");
            if (s1 != null)
            {
                j1 |= Math.round(Float.parseFloat(s1) * 255F) << 24;
            } else
            {
                j1 |= 0xff000000;
            }
            x.k.add(Float.valueOf(f1));
            x.l.add(Integer.valueOf(j1));
            return;
        }
        if (true) goto _L4; else goto _L3
_L3:
        if (s2.equals("use"))
        {
            s2 = attributes.getValue("xlink:href");
            s1 = attributes.getValue("transform");
            String s5 = attributes.getValue("x");
            String s4 = attributes.getValue("y");
            s3 = new StringBuilder();
            s3.append("<g");
            s3.append(" xmlns='http://www.w3.org/2000/svg' xmlns:xlink='http://www.w3.org/1999/xlink' version='1.1'");
            if (s1 != null || s5 != null || s4 != null)
            {
                s3.append(" transform='");
                if (s1 != null)
                {
                    s3.append(kxd.a(s1));
                }
                if (s5 != null || s4 != null)
                {
                    s3.append("translate(");
                    int k1;
                    if (s5 != null)
                    {
                        s1 = kxd.a(s5);
                    } else
                    {
                        s1 = "0";
                    }
                    s3.append(s1);
                    s3.append(",");
                    if (s4 != null)
                    {
                        s1 = kxd.a(s4);
                    } else
                    {
                        s1 = "0";
                    }
                    s3.append(s1);
                    s3.append(")");
                }
                s3.append("'");
            }
            for (k1 = 0; k1 < attributes.getLength(); k1++)
            {
                s1 = attributes.getQName(k1);
                if (!"x".equals(s1) && !"y".equals(s1) && !"width".equals(s1) && !"height".equals(s1) && !"xlink:href".equals(s1) && !"transform".equals(s1))
                {
                    s3.append(" ");
                    s3.append(s1);
                    s3.append("='");
                    s3.append(kxd.a(attributes.getValue(k1)));
                    s3.append("'");
                }
            }

            s3.append(">");
            s3.append((String)a.get(s2.substring(1)));
            s3.append("</g>");
            s1 = new InputSource(new StringReader(s3.toString()));
            try
            {
                s2 = SAXParserFactory.newInstance().newSAXParser().getXMLReader();
                s2.setContentHandler(this);
                s2.parse(s1);
                return;
            }
            // Misplaced declaration of an exception variable
            catch (String s1)
            {
                s1.printStackTrace();
            }
            return;
        }
        if (s2.equals("g"))
        {
            if ("bounds".equalsIgnoreCase(kxd.a("id", attributes)))
            {
                B = true;
            }
            if (z)
            {
                A = A + 1;
            }
            if ("none".equals(kxd.a("display", attributes)) && !z)
            {
                z = true;
                A = 1;
            }
            a(attributes);
            s1 = new kxj(attributes);
            j.push(new Paint(h));
            f.push(new Paint(d));
            k.push(Boolean.valueOf(i));
            g.push(Boolean.valueOf(e));
            m.push(Float.valueOf(l));
            s2 = a("opacity", attributes, ((Float) (null)));
            if (s2 != null)
            {
                float f2 = l;
                l = s2.floatValue() * f2;
            }
            a(attributes, h);
            a(attributes, d);
            a(s1, v);
            a(s1);
            boolean flag1 = i;
            boolean flag;
            if (s1.b("fill") != null)
            {
                flag = true;
            } else
            {
                flag = false;
            }
            i = flag | flag1;
            flag1 = e;
            if (s1.b("stroke") != null)
            {
                flag = true;
            } else
            {
                flag = false;
            }
            e = flag | flag1;
            return;
        }
        if (!z && s2.equals("rect"))
        {
            s1 = a("x", attributes, Float.valueOf(0.0F));
            s2 = a("y", attributes, Float.valueOf(0.0F));
            s3 = a("width", attributes, ((Float) (null)));
            Float float1 = a("height", attributes, ((Float) (null)));
            Float float5 = a("rx", attributes, Float.valueOf(0.0F));
            Float float7 = a("ry", attributes, Float.valueOf(0.0F));
            a(attributes);
            attributes = new kxj(attributes);
            if (a(attributes, v))
            {
                a(s1.floatValue(), s2.floatValue(), s3.floatValue(), float1.floatValue());
                if (float5.floatValue() <= 0.0F && float7.floatValue() <= 0.0F)
                {
                    c.drawRect(s1.floatValue(), s2.floatValue(), s1.floatValue() + s3.floatValue(), s2.floatValue() + float1.floatValue(), h);
                } else
                {
                    n.set(s1.floatValue(), s2.floatValue(), s1.floatValue() + s3.floatValue(), s2.floatValue() + float1.floatValue());
                    c.drawRoundRect(n, float5.floatValue(), float7.floatValue(), h);
                }
            }
            if (a(attributes))
            {
                if (float5.floatValue() <= 0.0F && float7.floatValue() <= 0.0F)
                {
                    c.drawRect(s1.floatValue(), s2.floatValue(), s1.floatValue() + s3.floatValue(), s2.floatValue() + float1.floatValue(), d);
                } else
                {
                    n.set(s1.floatValue(), s2.floatValue(), s1.floatValue() + s3.floatValue(), s2.floatValue() + float1.floatValue());
                    c.drawRoundRect(n, float5.floatValue(), float7.floatValue(), d);
                }
            }
            a();
            return;
        }
        if (z || !s2.equals("image"))
        {
            break; /* Loop/switch isn't completed */
        }
        s1 = kxd.a("href", attributes);
        if (s1.startsWith("data") && s1.indexOf("base64") > 0)
        {
            s2 = s1.substring(s1.indexOf(",") + 1);
            s3 = a("x", attributes, Float.valueOf(0.0F));
            Float float2 = a("y", attributes, Float.valueOf(0.0F));
            Float float6 = a("width", attributes, Float.valueOf(0.0F));
            Float float8 = a("height", attributes, Float.valueOf(0.0F));
            a(attributes);
            a(s3.floatValue(), float2.floatValue(), float6.floatValue(), float8.floatValue());
            s1 = c;
            float f3 = s3.floatValue();
            float f4 = float2.floatValue();
            float f5 = float6.floatValue();
            float f6 = float8.floatValue();
            s2 = Base64.decode(s2, 0);
            s2 = BitmapFactory.decodeByteArray(s2, 0, s2.length);
            if (s2 != null)
            {
                s2.prepareToDraw();
                s3 = new Paint(3);
                attributes = new RectF(f3, f4, f5 + f3, f6 + f4);
                s1.clipRect(attributes, android.graphics.Region.Op.REPLACE);
                s1.drawBitmap(s2, null, attributes, s3);
                s2.recycle();
            }
            a();
            return;
        }
        if (true) goto _L4; else goto _L5
_L5:
        if (z || !s2.equals("line"))
        {
            break; /* Loop/switch isn't completed */
        }
        s1 = a("x1", attributes, ((Float) (null)));
        s2 = a("x2", attributes, ((Float) (null)));
        s3 = a("y1", attributes, ((Float) (null)));
        Float float3 = a("y2", attributes, ((Float) (null)));
        if (a(new kxj(attributes)))
        {
            a(attributes);
            a(s1.floatValue(), s3.floatValue());
            a(s2.floatValue(), float3.floatValue());
            c.drawLine(s1.floatValue(), s3.floatValue(), s2.floatValue(), float3.floatValue(), d);
            a();
            return;
        }
        if (true) goto _L4; else goto _L6
_L6:
        if (z || !s2.equals("circle"))
        {
            break; /* Loop/switch isn't completed */
        }
        s1 = a("cx", attributes, ((Float) (null)));
        s2 = a("cy", attributes, ((Float) (null)));
        s3 = a("r", attributes, ((Float) (null)));
        if (s1 != null && s2 != null && s3 != null)
        {
            a(attributes);
            attributes = new kxj(attributes);
            if (a(attributes, v))
            {
                a(s1.floatValue() - s3.floatValue(), s2.floatValue() - s3.floatValue());
                a(s1.floatValue() + s3.floatValue(), s2.floatValue() + s3.floatValue());
                c.drawCircle(s1.floatValue(), s2.floatValue(), s3.floatValue(), h);
            }
            if (a(attributes))
            {
                c.drawCircle(s1.floatValue(), s2.floatValue(), s3.floatValue(), d);
            }
            a();
            return;
        }
        if (true) goto _L4; else goto _L7
_L7:
        if (z || !s2.equals("ellipse"))
        {
            break; /* Loop/switch isn't completed */
        }
        s1 = a("cx", attributes, ((Float) (null)));
        s2 = a("cy", attributes, ((Float) (null)));
        s3 = a("rx", attributes, ((Float) (null)));
        Float float4 = a("ry", attributes, ((Float) (null)));
        if (s1 != null && s2 != null && s3 != null && float4 != null)
        {
            a(attributes);
            attributes = new kxj(attributes);
            n.set(s1.floatValue() - s3.floatValue(), s2.floatValue() - float4.floatValue(), s1.floatValue() + s3.floatValue(), s2.floatValue() + float4.floatValue());
            if (a(attributes, v))
            {
                a(s1.floatValue() - s3.floatValue(), s2.floatValue() - float4.floatValue());
                a(s1.floatValue() + s3.floatValue(), s2.floatValue() + float4.floatValue());
                c.drawOval(n, h);
            }
            if (a(attributes))
            {
                c.drawOval(n, d);
            }
            a();
            return;
        }
        if (true) goto _L4; else goto _L8
_L8:
        if (z || !s2.equals("polygon") && !s2.equals("polyline"))
        {
            break; /* Loop/switch isn't completed */
        }
        s3 = kxd.b("points", attributes);
        if (s3 != null)
        {
            s1 = new Path();
            s3 = ((kxi) (s3)).a;
            if (s3.size() > 1)
            {
                a(attributes);
                attributes = new kxj(attributes);
                s1.moveTo(((Float)s3.get(0)).floatValue(), ((Float)s3.get(1)).floatValue());
                for (int l1 = 2; l1 < s3.size(); l1 += 2)
                {
                    s1.lineTo(((Float)s3.get(l1)).floatValue(), ((Float)s3.get(l1 + 1)).floatValue());
                }

                if (s2.equals("polygon"))
                {
                    s1.close();
                }
                if (a(attributes, v))
                {
                    a(s1);
                    c.drawPath(s1, h);
                }
                if (a(attributes))
                {
                    c.drawPath(s1, d);
                }
                a();
                return;
            }
        }
        if (true) goto _L4; else goto _L9
_L9:
        if (!z && s2.equals("path"))
        {
            s1 = kxd.c(kxd.a("d", attributes));
            a(attributes);
            s2 = new kxj(attributes);
            if (a(s2, v))
            {
                a(s1);
                c.drawPath(s1, h);
            }
            if (a(s2))
            {
                c.drawPath(s1, d);
            }
            a();
            return;
        }
        if (!z && s2.equals("text"))
        {
            a(attributes);
            y = new kxl(this, attributes);
            return;
        }
        if (!z)
        {
            String.format("Unrecognized tag: %s (%s)", new Object[] {
                s2, b(attributes)
            });
            return;
        }
        if (true) goto _L4; else goto _L10
_L10:
    }

}
