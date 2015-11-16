// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 


public final class kfn extends koj
{

    public Integer a;
    public kfk b[];
    public String c;

    public kfn()
    {
        a = null;
        b = kfk.a();
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
                    kfk kfk1 = b[j];
                    int k = i;
                    if (kfk1 != null)
                    {
                        k = i + koh.d(2, kfk1);
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
                kfk akfk[];
                int j;
                if (b == null)
                {
                    j = 0;
                } else
                {
                    j = b.length;
                }
                akfk = new kfk[k + j];
                k = j;
                if (j != 0)
                {
                    System.arraycopy(b, 0, akfk, 0, j);
                    k = j;
                }
                for (; k < akfk.length - 1; k++)
                {
                    akfk[k] = new kfk();
                    kog1.a(akfk[k]);
                    kog1.a();
                }

                akfk[k] = new kfk();
                kog1.a(akfk[k]);
                b = akfk;
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
                kfk kfk1 = b[i];
                if (kfk1 != null)
                {
                    koh1.b(2, kfk1);
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
