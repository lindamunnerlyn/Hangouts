// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 


public final class jfy extends koj
{

    public static final kok a = kok.a(jfy, 0x2e58344aL);
    private static final jfy d[] = new jfy[0];
    public koz b;
    public String c;

    public jfy()
    {
        b = null;
        c = null;
        unknownFieldData = null;
        cachedSize = -1;
    }

    protected int computeSerializedSize()
    {
        int j = super.computeSerializedSize();
        int i = j;
        if (b != null)
        {
            i = j + koh.d(1, b);
        }
        j = i;
        if (c != null)
        {
            j = i + koh.b(2, c);
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

            case 10: // '\n'
                if (b == null)
                {
                    b = new koz();
                }
                kog1.a(b);
                break;

            case 18: // '\022'
                c = kog1.j();
                break;
            }
        } while (true);
    }

    public void writeTo(koh koh1)
    {
        if (b != null)
        {
            koh1.b(1, b);
        }
        if (c != null)
        {
            koh1.a(2, c);
        }
        super.writeTo(koh1);
    }

}