// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 


final class ecb extends he
    implements gbj
{

    public ecb()
    {
        super(1000);
    }

    public void b(int i)
    {
        switch (i)
        {
        default:
            return;

        case 15: // '\017'
        case 60: // '<'
        case 80: // 'P'
            a(-1);
            return;

        case 10: // '\n'
            a(b() / 2);
            return;
        }
    }

    public void h()
    {
        a(-1);
    }
}
