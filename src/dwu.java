// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 


public final class dwu extends kop
{

    private static volatile dwu e[];
    public String a;
    public String b;
    public long c;
    public boolean d;

    public dwu()
    {
        a = "";
        b = "";
        c = 0L;
        d = false;
        cachedSize = -1;
    }

    public static dwu[] a()
    {
        if (e == null)
        {
            synchronized (kon.a)
            {
                if (e == null)
                {
                    e = new dwu[0];
                }
            }
        }
        return e;
        exception;
        obj;
        JVM INSTR monitorexit ;
        throw exception;
    }

    protected int computeSerializedSize()
    {
        int j = super.computeSerializedSize();
        int i = j;
        if (!a.equals(""))
        {
            i = j + koh.b(1, a);
        }
        j = i;
        if (!b.equals(""))
        {
            j = i + koh.b(2, b);
        }
        i = j;
        if (c != 0L)
        {
            i = j + koh.e(3, c);
        }
        j = i;
        if (d)
        {
            j = i + (koh.f(4) + 1);
        }
        return j;
    }

    public kop mergeFrom(kog kog1)
    {
        do
        {
            int i = kog1.a();
            switch (i)
            {
            default:
                if (kou.a(kog1, i))
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

            case 24: // '\030'
                c = kog1.e();
                break;

            case 32: // ' '
                d = kog1.i();
                break;
            }
        } while (true);
    }

    public void writeTo(koh koh1)
    {
        if (!a.equals(""))
        {
            koh1.a(1, a);
        }
        if (!b.equals(""))
        {
            koh1.a(2, b);
        }
        if (c != 0L)
        {
            koh1.b(3, c);
        }
        if (d)
        {
            koh1.a(4, d);
        }
        super.writeTo(koh1);
    }
}
