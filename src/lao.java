// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 


public final class lao extends koj
{

    private static volatile lao j[];
    public Float a;
    public Float b;
    public String c;
    public String d;
    public String e;
    public String f;
    public String g;
    public String h;
    public Boolean i;

    public lao()
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
        unknownFieldData = null;
        cachedSize = -1;
    }

    public static lao[] a()
    {
        if (j == null)
        {
            synchronized (kon.a)
            {
                if (j == null)
                {
                    j = new lao[0];
                }
            }
        }
        return j;
        exception;
        obj;
        JVM INSTR monitorexit ;
        throw exception;
    }

    protected int computeSerializedSize()
    {
        int l = super.computeSerializedSize();
        int k = l;
        if (a != null)
        {
            a.floatValue();
            k = l + (koh.f(1) + 4);
        }
        l = k;
        if (b != null)
        {
            b.floatValue();
            l = k + (koh.f(2) + 4);
        }
        k = l;
        if (c != null)
        {
            k = l + koh.b(3, c);
        }
        l = k;
        if (d != null)
        {
            l = k + koh.b(4, d);
        }
        k = l;
        if (e != null)
        {
            k = l + koh.b(5, e);
        }
        l = k;
        if (f != null)
        {
            l = k + koh.b(7, f);
        }
        k = l;
        if (g != null)
        {
            k = l + koh.b(8, g);
        }
        l = k;
        if (h != null)
        {
            l = k + koh.b(9, h);
        }
        k = l;
        if (i != null)
        {
            i.booleanValue();
            k = l + (koh.f(10) + 1);
        }
        return k;
    }

    public kop mergeFrom(kog kog1)
    {
        do
        {
            int k = kog1.a();
            switch (k)
            {
            default:
                if (super.storeUnknownField(kog1, k))
                {
                    continue;
                }
                // fall through

            case 0: // '\0'
                return this;

            case 13: // '\r'
                a = Float.valueOf(kog1.c());
                break;

            case 21: // '\025'
                b = Float.valueOf(kog1.c());
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

            case 58: // ':'
                f = kog1.j();
                break;

            case 66: // 'B'
                g = kog1.j();
                break;

            case 74: // 'J'
                h = kog1.j();
                break;

            case 80: // 'P'
                i = Boolean.valueOf(kog1.i());
                break;
            }
        } while (true);
    }

    public void writeTo(koh koh1)
    {
        if (a != null)
        {
            koh1.a(1, a.floatValue());
        }
        if (b != null)
        {
            koh1.a(2, b.floatValue());
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
            koh1.a(7, f);
        }
        if (g != null)
        {
            koh1.a(8, g);
        }
        if (h != null)
        {
            koh1.a(9, h);
        }
        if (i != null)
        {
            koh1.a(10, i.booleanValue());
        }
        super.writeTo(koh1);
    }
}
