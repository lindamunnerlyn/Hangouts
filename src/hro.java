// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 


public final class hro extends koj
{

    private static volatile hro p[];
    public hru a;
    public String b;
    public String c;
    public String d;
    public String e;
    public String f;
    public String g;
    public String h;
    public String i;
    public String j;
    public String k;
    public String l;
    public String m;
    public String n;
    public String o;

    public hro()
    {
        a = null;
        b = null;
        c = null;
        d = null;
        e = null;
        f = null;
        g = null;
        h = null;
        i = null;
        j = null;
        k = null;
        l = null;
        m = null;
        n = null;
        o = null;
        unknownFieldData = null;
        cachedSize = -1;
    }

    public static hro[] a()
    {
        if (p == null)
        {
            synchronized (kon.a)
            {
                if (p == null)
                {
                    p = new hro[0];
                }
            }
        }
        return p;
        exception;
        obj;
        JVM INSTR monitorexit ;
        throw exception;
    }

    protected int computeSerializedSize()
    {
        int j1 = super.computeSerializedSize();
        int i1 = j1;
        if (a != null)
        {
            i1 = j1 + koh.d(1, a);
        }
        j1 = i1;
        if (b != null)
        {
            j1 = i1 + koh.b(2, b);
        }
        i1 = j1;
        if (d != null)
        {
            i1 = j1 + koh.b(3, d);
        }
        j1 = i1;
        if (e != null)
        {
            j1 = i1 + koh.b(4, e);
        }
        i1 = j1;
        if (f != null)
        {
            i1 = j1 + koh.b(5, f);
        }
        j1 = i1;
        if (g != null)
        {
            j1 = i1 + koh.b(6, g);
        }
        i1 = j1;
        if (h != null)
        {
            i1 = j1 + koh.b(7, h);
        }
        j1 = i1;
        if (i != null)
        {
            j1 = i1 + koh.b(8, i);
        }
        i1 = j1;
        if (k != null)
        {
            i1 = j1 + koh.b(9, k);
        }
        j1 = i1;
        if (l != null)
        {
            j1 = i1 + koh.b(10, l);
        }
        i1 = j1;
        if (n != null)
        {
            i1 = j1 + koh.b(11, n);
        }
        j1 = i1;
        if (o != null)
        {
            j1 = i1 + koh.b(12, o);
        }
        i1 = j1;
        if (c != null)
        {
            i1 = j1 + koh.b(13, c);
        }
        j1 = i1;
        if (j != null)
        {
            j1 = i1 + koh.b(14, j);
        }
        i1 = j1;
        if (m != null)
        {
            i1 = j1 + koh.b(15, m);
        }
        return i1;
    }

    public kop mergeFrom(kog kog1)
    {
        do
        {
            int i1 = kog1.a();
            switch (i1)
            {
            default:
                if (super.storeUnknownField(kog1, i1))
                {
                    continue;
                }
                // fall through

            case 0: // '\0'
                return this;

            case 10: // '\n'
                if (a == null)
                {
                    a = new hru();
                }
                kog1.a(a);
                break;

            case 18: // '\022'
                b = kog1.j();
                break;

            case 26: // '\032'
                d = kog1.j();
                break;

            case 34: // '"'
                e = kog1.j();
                break;

            case 42: // '*'
                f = kog1.j();
                break;

            case 50: // '2'
                g = kog1.j();
                break;

            case 58: // ':'
                h = kog1.j();
                break;

            case 66: // 'B'
                i = kog1.j();
                break;

            case 74: // 'J'
                k = kog1.j();
                break;

            case 82: // 'R'
                l = kog1.j();
                break;

            case 90: // 'Z'
                n = kog1.j();
                break;

            case 98: // 'b'
                o = kog1.j();
                break;

            case 106: // 'j'
                c = kog1.j();
                break;

            case 114: // 'r'
                j = kog1.j();
                break;

            case 122: // 'z'
                m = kog1.j();
                break;
            }
        } while (true);
    }

    public void writeTo(koh koh1)
    {
        if (a != null)
        {
            koh1.b(1, a);
        }
        if (b != null)
        {
            koh1.a(2, b);
        }
        if (d != null)
        {
            koh1.a(3, d);
        }
        if (e != null)
        {
            koh1.a(4, e);
        }
        if (f != null)
        {
            koh1.a(5, f);
        }
        if (g != null)
        {
            koh1.a(6, g);
        }
        if (h != null)
        {
            koh1.a(7, h);
        }
        if (i != null)
        {
            koh1.a(8, i);
        }
        if (k != null)
        {
            koh1.a(9, k);
        }
        if (l != null)
        {
            koh1.a(10, l);
        }
        if (n != null)
        {
            koh1.a(11, n);
        }
        if (o != null)
        {
            koh1.a(12, o);
        }
        if (c != null)
        {
            koh1.a(13, c);
        }
        if (j != null)
        {
            koh1.a(14, j);
        }
        if (m != null)
        {
            koh1.a(15, m);
        }
        super.writeTo(koh1);
    }
}
