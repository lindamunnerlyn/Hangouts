// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 


public final class iyr extends koj
{

    public iwc a;
    public Boolean b;
    public Integer c;
    public ixg responseHeader;

    public iyr()
    {
        responseHeader = null;
        a = null;
        b = null;
        c = null;
        unknownFieldData = null;
        cachedSize = -1;
    }

    protected int computeSerializedSize()
    {
        int j = super.computeSerializedSize();
        int i = j;
        if (responseHeader != null)
        {
            i = j + koh.d(1, responseHeader);
        }
        j = i;
        if (a != null)
        {
            j = i + koh.d(2, a);
        }
        i = j;
        if (b != null)
        {
            b.booleanValue();
            i = j + (koh.f(3) + 1);
        }
        j = i;
        if (c != null)
        {
            j = i + koh.f(4, c.intValue());
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
                if (responseHeader == null)
                {
                    responseHeader = new ixg();
                }
                kog1.a(responseHeader);
                break;

            case 18: // '\022'
                if (a == null)
                {
                    a = new iwc();
                }
                kog1.a(a);
                break;

            case 24: // '\030'
                b = Boolean.valueOf(kog1.i());
                break;

            case 32: // ' '
                c = Integer.valueOf(kog1.l());
                break;
            }
        } while (true);
    }

    public void writeTo(koh koh1)
    {
        if (responseHeader != null)
        {
            koh1.b(1, responseHeader);
        }
        if (a != null)
        {
            koh1.b(2, a);
        }
        if (b != null)
        {
            koh1.a(3, b.booleanValue());
        }
        if (c != null)
        {
            koh1.c(4, c.intValue());
        }
        super.writeTo(koh1);
    }
}
