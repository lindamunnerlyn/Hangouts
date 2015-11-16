// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 


public final class law extends koj
{

    public String a[];

    public law()
    {
        a = kou.f;
        unknownFieldData = null;
        cachedSize = -1;
    }

    protected int computeSerializedSize()
    {
        int i = 0;
        int j1 = super.computeSerializedSize();
        if (a != null && a.length > 0)
        {
            int j = 0;
            int k;
            int l;
            for (k = 0; i < a.length; k = l)
            {
                String s = a[i];
                int i1 = j;
                l = k;
                if (s != null)
                {
                    l = k + 1;
                    i1 = j + koh.a(s);
                }
                i++;
                j = i1;
            }

            return j1 + j + k * 1;
        } else
        {
            return j1;
        }
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

            case 10: // '\n'
                int k = kou.b(kog1, 10);
                String as[];
                int j;
                if (a == null)
                {
                    j = 0;
                } else
                {
                    j = a.length;
                }
                as = new String[k + j];
                k = j;
                if (j != 0)
                {
                    System.arraycopy(a, 0, as, 0, j);
                    k = j;
                }
                for (; k < as.length - 1; k++)
                {
                    as[k] = kog1.j();
                    kog1.a();
                }

                as[k] = kog1.j();
                a = as;
                break;
            }
        } while (true);
    }

    public void writeTo(koh koh1)
    {
        if (a != null && a.length > 0)
        {
            for (int i = 0; i < a.length; i++)
            {
                String s = a[i];
                if (s != null)
                {
                    koh1.a(1, s);
                }
            }

        }
        super.writeTo(koh1);
    }
}
