// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 


public final class kbm extends koj
{

    public Integer a;
    public kbk b[];
    public String c;

    public kbm()
    {
        a = null;
        b = kbk.a();
        c = null;
        unknownFieldData = null;
        cachedSize = -1;
    }

    protected int computeSerializedSize()
    {
        int j = super.computeSerializedSize();
        int i = j;
        if (a != null)
        {
            i = j + koh.e(1, a.intValue());
        }
        j = i;
        if (b != null)
        {
            j = i;
            if (b.length > 0)
            {
                for (j = 0; j < b.length;)
                {
                    kbk kbk1 = b[j];
                    int k = i;
                    if (kbk1 != null)
                    {
                        k = i + koh.d(2, kbk1);
                    }
                    j++;
                    i = k;
                }

                j = i;
            }
        }
        i = j;
        if (c != null)
        {
            i = j + koh.b(3, c);
        }
        return i;
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
                a = Integer.valueOf(kog1.f());
                break;

            case 18: // '\022'
                int k = kou.b(kog1, 18);
                kbk akbk[];
                int j;
                if (b == null)
                {
                    j = 0;
                } else
                {
                    j = b.length;
                }
                akbk = new kbk[k + j];
                k = j;
                if (j != 0)
                {
                    System.arraycopy(b, 0, akbk, 0, j);
                    k = j;
                }
                for (; k < akbk.length - 1; k++)
                {
                    akbk[k] = new kbk();
                    kog1.a(akbk[k]);
                    kog1.a();
                }

                akbk[k] = new kbk();
                kog1.a(akbk[k]);
                b = akbk;
                break;

            case 26: // '\032'
                c = kog1.j();
                break;
            }
        } while (true);
    }

    public void writeTo(koh koh1)
    {
        if (a != null)
        {
            koh1.a(1, a.intValue());
        }
        if (b != null && b.length > 0)
        {
            for (int i = 0; i < b.length; i++)
            {
                kbk kbk1 = b[i];
                if (kbk1 != null)
                {
                    koh1.b(2, kbk1);
                }
            }

        }
        if (c != null)
        {
            koh1.a(3, c);
        }
        super.writeTo(koh1);
    }
}
