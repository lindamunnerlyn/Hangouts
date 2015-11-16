// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 


public final class hqk extends koj
{

    private static volatile hqk m[];
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

    public hqk()
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
        unknownFieldData = null;
        cachedSize = -1;
    }

    public static hqk[] a()
    {
        if (m == null)
        {
            synchronized (kon.a)
            {
                if (m == null)
                {
                    m = new hqk[0];
                }
            }
        }
        return m;
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
        if (h != null)
        {
            j1 = i1 + koh.b(6, h);
        }
        i1 = j1;
        if (i != null)
        {
            i1 = j1 + koh.b(7, i);
        }
        j1 = i1;
        if (j != null)
        {
            j1 = i1 + koh.b(8, j);
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
        if (c != null)
        {
            i1 = j1 + koh.b(11, c);
        }
        j1 = i1;
        if (g != null)
        {
            j1 = i1 + koh.b(12, g);
        }
        return j1;
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
                h = kog1.j();
                break;

            case 58: // ':'
                i = kog1.j();
                break;

            case 66: // 'B'
                j = kog1.j();
                break;

            case 74: // 'J'
                k = kog1.j();
                break;

            case 82: // 'R'
                l = kog1.j();
                break;

            case 90: // 'Z'
                c = kog1.j();
                break;

            case 98: // 'b'
                g = kog1.j();
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
        if (h != null)
        {
            koh1.a(6, h);
        }
        if (i != null)
        {
            koh1.a(7, i);
        }
        if (j != null)
        {
            koh1.a(8, j);
        }
        if (k != null)
        {
            koh1.a(9, k);
        }
        if (l != null)
        {
            koh1.a(10, l);
        }
        if (c != null)
        {
            koh1.a(11, c);
        }
        if (g != null)
        {
            koh1.a(12, g);
        }
        super.writeTo(koh1);
    }
}
