// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.graphics.RectF;

public class gzk extends guy
{

    private gzk a;
    gzg d;
    int e;
    int f;
    public int g;
    int h;
    RectF i;
    a j;
    private int k;

    public gzk()
    {
    }

    public void a(gzk gzk1)
    {
        a = gzk1;
    }

    public void b(int l, gzg gzg1, int i1, int j1, int k1)
    {
        a(l, gzg1.f());
        d = gzg1;
        e = 0;
        f = k1;
        g = i1;
        h = j1;
        i = null;
        j = null;
        k = 0;
    }

    public String c()
    {
        int i1;
        switch (e)
        {
        default:
            return "";

        case 0: // '\0'
            int l = g;
            int j1 = h;
            return (new StringBuilder(23)).append(l).append("x").append(j1).toString();

        case 2: // '\002'
            return "thumbnail";

        case 3: // '\003'
            return "large";

        case 1: // '\001'
            return "full";

        case 4: // '\004'
            return "original";

        case 5: // '\005'
            i1 = g;
            break;
        }
        int k1 = h;
        return (new StringBuilder(29)).append("auto(").append(i1).append("x").append(k1).append(")").toString();
    }

    public int d()
    {
        int l = Math.max(g, h);
        if (l == 0 || l > gzi.t())
        {
            return 6;
        }
        return l <= gzi.u() ? 8 : 7;
    }

    protected String e()
    {
        e;
        JVM INSTR tableswitch 0 0: default 24
    //                   0 27;
           goto _L1 _L2
_L1:
        return "";
_L2:
        if (f == -1) goto _L1; else goto _L3
_L3:
        f;
        JVM INSTR tableswitch 0 3: default 68
    //                   0 108
    //                   1 102
    //                   2 96
    //                   3 90;
           goto _L4 _L5 _L6 _L7 _L8
_L4:
        String s = "";
_L9:
        s = String.valueOf(s);
        if (s.length() != 0)
        {
            return "-".concat(s);
        } else
        {
            return new String("-");
        }
_L8:
        s = "H";
          goto _L9
_L7:
        s = "S";
          goto _L9
_L6:
        s = "L";
          goto _L9
_L5:
        s = "VL";
          goto _L9
    }

    public boolean equals(Object obj)
    {
        if (obj != this) goto _L2; else goto _L1
_L1:
        return true;
_L2:
        if (!(obj instanceof gzk))
        {
            return false;
        }
        obj = (gzk)obj;
        if (b != ((gzk) (obj)).b || f != ((gzk) (obj)).f || !d.equals(((gzk) (obj)).d))
        {
            break; /* Loop/switch isn't completed */
        }
        if (e == ((gzk) (obj)).e) goto _L4; else goto _L3
_L3:
        boolean flag = false;
_L9:
        if (!flag)
        {
            break; /* Loop/switch isn't completed */
        }
        a a1 = j;
        a a2 = ((gzk) (obj)).j;
        boolean flag1;
        if (a1 == null && a2 == null)
        {
            flag1 = true;
        } else
        if (a1 == null && a2 != null || a1 != null && a2 == null)
        {
            flag1 = false;
        } else
        {
            flag1 = a1.p();
        }
        if (flag1 && (i == null || i.equals(((gzk) (obj)).i))) goto _L1; else goto _L5
_L5:
        return false;
_L4:
        e;
        JVM INSTR lookupswitch 2: default 156
    //                   0: 179
    //                   5: 162;
           goto _L6 _L7 _L8
_L6:
        flag = true;
          goto _L9
_L8:
        if (d() == ((gzk) (obj)).d()) goto _L6; else goto _L10
_L10:
        flag = false;
          goto _L9
_L7:
        if (g == ((gzk) (obj)).g && h == ((gzk) (obj)).h) goto _L6; else goto _L11
_L11:
        flag = false;
          goto _L9
    }

    protected String f()
    {
        if (i != null)
        {
            float f1 = i.left;
            float f2 = i.top;
            float f3 = i.right;
            float f4 = i.bottom;
            return (new StringBuilder(74)).append(", crop(").append(f1).append(", ").append(f2).append(", ").append(f3).append(", ").append(f4).append(")").toString();
        } else
        {
            return "";
        }
    }

    protected String g()
    {
        String s = "";
        if ((b & 1) != 0)
        {
            s = String.valueOf("").concat(" no-disk-cache");
        }
        String s1 = s;
        if ((b & 2) != 0)
        {
            s1 = String.valueOf(s).concat(" download-only");
        }
        s = s1;
        if ((b & 4) != 0)
        {
            s1 = String.valueOf(s1).concat(" accept-animation");
            s = s1;
            if ((b & 0x20) != 0)
            {
                s = String.valueOf(s1).concat("-disable-webp");
            }
        }
        s1 = s;
        if ((b & 8) != 0)
        {
            s1 = String.valueOf(s).concat(" disable-decoding");
        }
        s = s1;
        if ((b & 0x10) != 0)
        {
            s = String.valueOf(s1).concat(" disable-recycling");
        }
        s1 = s;
        if ((b & 0x20) != 0)
        {
            s1 = String.valueOf(s).concat(" disable-webp");
        }
        s = s1;
        if ((b & 0x40) != 0)
        {
            s = String.valueOf(s1).concat(" accept-bitmap-container");
        }
        s1 = s;
        if ((b & 0x80) != 0)
        {
            s1 = String.valueOf(s).concat(" disable-loading");
        }
        s = s1;
        if ((b & 0x100) != 0)
        {
            s = String.valueOf(s1).concat(" disable-smart-crop");
        }
        s1 = s;
        if ((b & 0x200) != 0)
        {
            s1 = String.valueOf(s).concat(" disable-upscale");
        }
        s = s1;
        if ((b & 0x400) != 0)
        {
            s = String.valueOf(s1).concat(" long-term-cache");
        }
        s1 = s;
        if ((b & 0x800) != 0)
        {
            s1 = String.valueOf(s).concat(" keep-partial-download");
        }
        s = s1;
        if ((b & 0x1000) != 0)
        {
            s = String.valueOf(s1).concat(" disable-automatic-high-res-download");
        }
        s1 = s;
        if ((b & 0x2000) != 0)
        {
            s1 = String.valueOf(s).concat(" allow-large-file-download");
        }
        s = s1;
        if ((b & 0x4000) != 0)
        {
            s = String.valueOf(s1).concat(" for-media-sync");
        }
        s1 = s;
        if ((b & 0x8000) != 0)
        {
            s1 = String.valueOf(s).concat(" prefer-high-res-download");
        }
        s = s1;
        if ((b & 0x10000) != 0)
        {
            s = String.valueOf(s1).concat(" convert-webp-to-jpeg");
        }
        s1 = s;
        if ((b & 0x20000) != 0)
        {
            s1 = String.valueOf(s).concat(" include-exif");
        }
        return s1;
    }

    public gzk h()
    {
        return a;
    }

    public int hashCode()
    {
        if (k == 0)
        {
            k = g.a(d, e + g.a(i, b + 527) * 31);
        }
        return k;
    }

    public String toString()
    {
        String s = c();
        String s1 = e();
        String s2 = f();
        String s3 = g();
        String s4;
        boolean flag;
        if (j != null)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        s4 = String.valueOf(d);
        return (new StringBuilder(String.valueOf(s4).length() + 22 + String.valueOf(s).length() + String.valueOf(s1).length() + String.valueOf(s2).length() + String.valueOf(s3).length())).append("{").append(s4).append(" (").append(s).append(s1).append(s2).append(") hasEdits: ").append(flag).append(" ").append(s3).append("}").toString();
    }
}
