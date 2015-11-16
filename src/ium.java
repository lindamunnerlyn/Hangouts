// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 


public final class ium extends koj
{

    public Integer a;
    public Long b;
    public irv c[];

    public ium()
    {
        a = null;
        b = null;
        c = irv.a();
        unknownFieldData = null;
        cachedSize = -1;
    }

    protected int computeSerializedSize()
    {
        int i = super.computeSerializedSize();
        int j = i;
        if (a != null)
        {
            j = i + koh.f(1, a.intValue());
        }
        i = j;
        if (b != null)
        {
            i = j + koh.d(2, b.longValue());
        }
        j = i;
        if (c != null)
        {
            j = i;
            if (c.length > 0)
            {
                for (j = 0; j < c.length;)
                {
                    irv irv1 = c[j];
                    int k = i;
                    if (irv1 != null)
                    {
                        k = i + koh.d(3, irv1);
                    }
                    j++;
                    i = k;
                }

                j = i;
            }
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
                if (super.storeUnknownField(kog1, i))
                {
                    continue;
                }
                // fall through

            case 0: // '\0'
                return this;

            case 8: // '\b'
                a = Integer.valueOf(kog1.l());
                break;

            case 16: // '\020'
                b = Long.valueOf(kog1.d());
                break;

            case 26: // '\032'
                int k = kou.b(kog1, 26);
                irv airv[];
                int j;
                if (c == null)
                {
                    j = 0;
                } else
                {
                    j = c.length;
                }
                airv = new irv[k + j];
                k = j;
                if (j != 0)
                {
                    System.arraycopy(c, 0, airv, 0, j);
                    k = j;
                }
                for (; k < airv.length - 1; k++)
                {
                    airv[k] = new irv();
                    kog1.a(airv[k]);
                    kog1.a();
                }

                airv[k] = new irv();
                kog1.a(airv[k]);
                c = airv;
                break;
            }
        } while (true);
    }

    public void writeTo(koh koh1)
    {
        if (a != null)
        {
            koh1.c(1, a.intValue());
        }
        if (b != null)
        {
            koh1.a(2, b.longValue());
        }
        if (c != null && c.length > 0)
        {
            for (int i = 0; i < c.length; i++)
            {
                irv irv1 = c[i];
                if (irv1 != null)
                {
                    koh1.b(3, irv1);
                }
            }

        }
        super.writeTo(koh1);
    }
}
