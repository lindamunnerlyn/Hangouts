// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 


public final class hyu extends koj
{

    private static volatile hyu k[];
    public String a;
    public String b;
    public String c;
    public String d;
    public String e;
    public String f;
    public String g;
    public String h;
    public Integer i;
    public hyv j;

    public hyu()
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
        unknownFieldData = null;
        cachedSize = -1;
    }

    public static hyu[] a()
    {
        if (k == null)
        {
            synchronized (kon.a)
            {
                if (k == null)
                {
                    k = new hyu[0];
                }
            }
        }
        return k;
        exception;
        obj;
        JVM INSTR monitorexit ;
        throw exception;
    }

    protected int computeSerializedSize()
    {
        int i1 = super.computeSerializedSize() + koh.b(1, b);
        int l = i1;
        if (c != null)
        {
            l = i1 + koh.b(2, c);
        }
        i1 = l;
        if (d != null)
        {
            i1 = l + koh.b(3, d);
        }
        l = i1;
        if (e != null)
        {
            l = i1 + koh.b(4, e);
        }
        i1 = l;
        if (f != null)
        {
            i1 = l + koh.b(5, f);
        }
        l = i1;
        if (h != null)
        {
            l = i1 + koh.b(6, h);
        }
        i1 = l;
        if (i != null)
        {
            i1 = l + koh.e(7, i.intValue());
        }
        l = i1;
        if (g != null)
        {
            l = i1 + koh.b(8, g);
        }
        i1 = l;
        if (a != null)
        {
            i1 = l + koh.b(9, a);
        }
        l = i1;
        if (j != null)
        {
            l = i1 + koh.d(10, j);
        }
        return l;
    }

    public kop mergeFrom(kog kog1)
    {
        do
        {
            int l = kog1.a();
            switch (l)
            {
            default:
                if (super.storeUnknownField(kog1, l))
                {
                    continue;
                }
                // fall through

            case 0: // '\0'
                return this;

            case 10: // '\n'
                b = kog1.j();
                break;

            case 18: // '\022'
                c = kog1.j();
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

            case 56: // '8'
                i = Integer.valueOf(kog1.f());
                break;

            case 66: // 'B'
                g = kog1.j();
                break;

            case 74: // 'J'
                a = kog1.j();
                break;

            case 82: // 'R'
                if (j == null)
                {
                    j = new hyv();
                }
                kog1.a(j);
                break;
            }
        } while (true);
    }

    public void writeTo(koh koh1)
    {
        koh1.a(1, b);
        if (c != null)
        {
            koh1.a(2, c);
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
            koh1.a(7, i.intValue());
        }
        if (g != null)
        {
            koh1.a(8, g);
        }
        if (a != null)
        {
            koh1.a(9, a);
        }
        if (j != null)
        {
            koh1.b(10, j);
        }
        super.writeTo(koh1);
    }
}
