// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 


public final class ike extends koj
{

    private static volatile ike k[];
    public String a;
    public String b;
    public String c;
    public String d;
    public String e;
    public String f;
    public String g;
    public String h;
    public Integer i;
    public String j;

    public ike()
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

    public static ike[] a()
    {
        if (k == null)
        {
            synchronized (kon.a)
            {
                if (k == null)
                {
                    k = new ike[0];
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
        int i1 = super.computeSerializedSize();
        int l = i1;
        if (a != null)
        {
            l = i1 + koh.b(1, a);
        }
        i1 = l;
        if (b != null)
        {
            i1 = l + koh.b(2, b);
        }
        l = i1;
        if (c != null)
        {
            l = i1 + koh.b(3, c);
        }
        i1 = l;
        if (d != null)
        {
            i1 = l + koh.b(4, d);
        }
        l = i1;
        if (e != null)
        {
            l = i1 + koh.b(5, e);
        }
        i1 = l;
        if (f != null)
        {
            i1 = l + koh.b(6, f);
        }
        l = i1;
        if (g != null)
        {
            l = i1 + koh.b(7, g);
        }
        i1 = l;
        if (h != null)
        {
            i1 = l + koh.b(8, h);
        }
        l = i1;
        if (i != null)
        {
            l = i1 + koh.e(9, i.intValue());
        }
        i1 = l;
        if (j != null)
        {
            i1 = l + koh.b(10, j);
        }
        return i1;
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
                a = kog1.j();
                break;

            case 18: // '\022'
                b = kog1.j();
                break;

            case 26: // '\032'
                c = kog1.j();
                break;

            case 34: // '"'
                d = kog1.j();
                break;

            case 42: // '*'
                e = kog1.j();
                break;

            case 50: // '2'
                f = kog1.j();
                break;

            case 58: // ':'
                g = kog1.j();
                break;

            case 66: // 'B'
                h = kog1.j();
                break;

            case 72: // 'H'
                i = Integer.valueOf(kog1.f());
                break;

            case 82: // 'R'
                j = kog1.j();
                break;
            }
        } while (true);
    }

    public void writeTo(koh koh1)
    {
        if (a != null)
        {
            koh1.a(1, a);
        }
        if (b != null)
        {
            koh1.a(2, b);
        }
        if (c != null)
        {
            koh1.a(3, c);
        }
        if (d != null)
        {
            koh1.a(4, d);
        }
        if (e != null)
        {
            koh1.a(5, e);
        }
        if (f != null)
        {
            koh1.a(6, f);
        }
        if (g != null)
        {
            koh1.a(7, g);
        }
        if (h != null)
        {
            koh1.a(8, h);
        }
        if (i != null)
        {
            koh1.a(9, i.intValue());
        }
        if (j != null)
        {
            koh1.a(10, j);
        }
        super.writeTo(koh1);
    }
}
